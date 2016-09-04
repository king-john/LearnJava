package yin.learn.thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class NIOInterruption {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		ServerSocket server = new ServerSocket(8080);
		InetSocketAddress isa = new InetSocketAddress("localhost",8080 );
		SocketChannel sc1 =  SocketChannel.open(isa);
		Future<?> f = exec.submit(new NIOBlocked(sc1));
		exec.shutdown();
		TimeUnit.SECONDS.sleep(1);
		f.cancel(true);//中断线程 表明了被阻塞nio通道会自动响应中断
		
		//SocketChannel sc2 =  SocketChannel.open();

	}
}
class NIOBlocked implements Runnable{
	private final SocketChannel sc;
	public NIOBlocked(SocketChannel sc){
		this.sc = sc;
	}
	@Override
	public void run() {
		try {
			System.out.println("Waiting for read() in" +this);
			sc.read(ByteBuffer.allocate(1));
		}catch(ClosedByInterruptException e){
			System.out.println("ClosedByInterruptException");
		}catch (AsynchronousCloseException e) {
			System.out.println("AsynchronousCloseException");
		}catch (IOException e) {
			throw new RuntimeException();
		}
		System.out.println("Exiting NIOBlocked.run()"+this);
	}
	
}