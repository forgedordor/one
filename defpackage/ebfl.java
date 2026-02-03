package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebfl {
    public static final dfny a = dfod.a(175047957);
    public final SocketFactory b;
    public final ServerSocketFactory c;
    private final ebev d;
    private final ebgf e;

    public ebfl(ebgf ebgfVar, ebev ebevVar) {
        this.e = ebgfVar;
        this.d = ebevVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.b = new eber(ebevVar, socketFactory);
        ServerSocketFactory serverSocketFactory = ServerSocketFactory.getDefault();
        serverSocketFactory.getClass();
        this.c = new ebes(ebevVar, serverSocketFactory);
    }

    public final ebfw a(ebft ebftVar, String str, int i, Optional optional) {
        return new ebfw(new ebfv() { // from class: ebfg
            @Override // defpackage.ebfv
            public final Socket a() throws IOException {
                Socket socketCreateSocket = this.a.b.createSocket();
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(660000);
                return socketCreateSocket;
            }
        }, ebftVar, str, i, optional);
    }

    public final /* synthetic */ ServerSocket b(int i) throws IOException {
        try {
            dhja.c("Opening secure server socket at %d", Integer.valueOf(i));
            ebev ebevVar = this.d;
            SSLServerSocketFactory serverSocketFactory = this.e.a().getServerSocketFactory();
            serverSocketFactory.getClass();
            return (SSLServerSocket) new ebeu(ebevVar, serverSocketFactory).createServerSocket(i);
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public final /* synthetic */ Socket c(KeyStore keyStore, String str) throws IOException {
        try {
            SSLSocket sSLSocket = (SSLSocket) this.d.j(new ebge(keyStore, str).a().getSocketFactory()).createSocket();
            sSLSocket.setUseClientMode(true);
            int iA = (int) dfps.a();
            if (iA > 0) {
                sSLSocket.setSoTimeout(iA);
            }
            return sSLSocket;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public final SSLSocketFactory d() throws IOException {
        try {
            return this.d.j(this.e.a().getSocketFactory());
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }
}
