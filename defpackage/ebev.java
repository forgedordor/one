package defpackage;

import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebev {
    public static final ebev c = new ebeq();
    public static final Optional d = Optional.empty();

    public static Socket h(Socket socket) {
        return socket instanceof ebdg ? h(((ebdg) socket).a) : socket instanceof ebdd ? h(((ebdd) socket).a) : socket;
    }

    protected abstract ServerSocket b(ServerSocket serverSocket);

    protected abstract Socket c(Socket socket);

    protected abstract SSLServerSocket d(SSLServerSocket sSLServerSocket);

    protected abstract SSLSocket e(SSLSocket sSLSocket);

    protected Optional f() {
        return d;
    }

    public final ServerSocket g(ServerSocket serverSocket) {
        serverSocket.getClass();
        Optional optionalF = f();
        if (optionalF.isPresent()) {
            serverSocket = ((ebev) optionalF.get()).g(serverSocket);
        }
        return serverSocket instanceof SSLServerSocket ? d((SSLServerSocket) serverSocket) : b(serverSocket);
    }

    public final Socket i(Socket socket) {
        socket.getClass();
        Optional optionalF = f();
        if (optionalF.isPresent()) {
            socket = ((ebev) optionalF.get()).i(socket);
        }
        return socket instanceof SSLSocket ? e((SSLSocket) socket) : c(socket);
    }

    public final SSLSocketFactory j(SSLSocketFactory sSLSocketFactory) {
        sSLSocketFactory.getClass();
        return new ebet(this, sSLSocketFactory);
    }
}
