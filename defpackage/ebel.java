package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebel extends ebdg implements ebrr {
    private final ebrz b;

    public ebel(Socket socket, ebrv ebrvVar) {
        super(socket);
        this.b = ebrz.a(ebrvVar);
    }

    @Override // defpackage.ebdg
    protected final InputStream a(InputStream inputStream) {
        ebdm ebdmVar = new ebdm(inputStream);
        this.b.e(ebdmVar, eben.a);
        return ebdmVar;
    }

    @Override // defpackage.ebdg
    protected final OutputStream b(OutputStream outputStream) {
        ebdr ebdrVar = new ebdr(outputStream);
        this.b.e(ebdrVar, eben.a);
        return ebdrVar;
    }

    public final /* synthetic */ void c() {
        super.close();
    }

    @Override // defpackage.ebdg, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.d(ebem.CLOSING, new ebrh(new ebri() { // from class: ebek
            @Override // defpackage.ebri
            public final void a() {
                this.a.c();
            }
        }), ebem.CLOSED);
    }

    @Override // defpackage.ebdg, java.net.Socket
    public final void connect(final SocketAddress socketAddress) {
        this.b.d(ebem.CONNECTING, new ebrh(new ebri() { // from class: ebei
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.a.connect(socketAddress);
            }
        }), ebem.CONNECTED);
    }

    @Override // defpackage.ebrr
    public final void e(ebru ebruVar) {
        this.b.f(ebruVar);
    }

    @Override // defpackage.ebdg, java.net.Socket
    public final void connect(final SocketAddress socketAddress, final int i) {
        this.b.d(ebem.CONNECTING, new ebrh(new ebri() { // from class: ebej
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.a.connect(socketAddress, i);
            }
        }), ebem.CONNECTED);
    }
}
