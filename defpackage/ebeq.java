package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebeq extends ebev {
    @Override // defpackage.ebev
    public final ServerSocket b(ServerSocket serverSocket) {
        return serverSocket;
    }

    @Override // defpackage.ebev
    protected final Socket c(Socket socket) {
        return socket;
    }

    @Override // defpackage.ebev
    public final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        return sSLServerSocket;
    }

    @Override // defpackage.ebev
    public final SSLSocket e(SSLSocket sSLSocket) {
        return sSLSocket;
    }
}
