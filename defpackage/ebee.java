package defpackage;

import j$.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketAddress;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebee extends ebdd implements ebrr {
    private final ebrz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebee(SSLSocket sSLSocket) {
        super(sSLSocket);
        ebrv ebrvVar = ebem.o;
        this.d = ebrz.a(ebrvVar);
    }

    private final boolean f() {
        return g(ebem.AUTHENTICATING);
    }

    private final boolean g(ebem ebemVar) throws ebrq {
        ebrz ebrzVar = this.d;
        if (ebrzVar.a.a.contains(ebemVar)) {
            return false;
        }
        ebrzVar.h(ebemVar);
        return true;
    }

    @Override // defpackage.ebdd
    protected final InputStream a(InputStream inputStream) {
        ebdm ebdmVar = new ebdm(inputStream);
        this.d.e(ebdmVar, eben.a);
        return new ebec(this, ebdmVar);
    }

    @Override // defpackage.ebdd
    protected final OutputStream b(OutputStream outputStream) {
        ebdr ebdrVar = new ebdr(outputStream);
        this.d.e(ebdrVar, eben.a);
        return new ebed(this, ebdrVar);
    }

    public final /* synthetic */ void c() {
        super.close();
    }

    @Override // defpackage.ebdd, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.d(ebem.CLOSING, new ebrh(new ebri() { // from class: ebdz
            @Override // defpackage.ebri
            public final void a() {
                this.a.c();
            }
        }), ebem.CLOSED);
    }

    @Override // defpackage.ebdd, java.net.Socket
    public final void connect(final SocketAddress socketAddress) {
        this.d.d(ebem.CONNECTING, new ebrh(new ebri() { // from class: ebea
            @Override // defpackage.ebri
            public final void a() {
                this.a.a.connect(socketAddress);
            }
        }), ebem.CONNECTED);
    }

    public final synchronized void d() {
        if (f()) {
            startHandshake();
        }
    }

    @Override // defpackage.ebrr
    public final void e(ebru ebruVar) {
        this.d.f(ebruVar);
    }

    @Override // defpackage.ebdd, java.net.Socket
    public final InputStream getInputStream() {
        d();
        return (InputStream) this.d.b(new ebsa() { // from class: ebdy
            @Override // defpackage.ebsa
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.ebsa
            public final Object b() {
                ebee ebeeVar = this.a;
                return (InputStream) Map.EL.computeIfAbsent(ebeeVar.b, ebeeVar.a.getInputStream(), new ebda(ebeeVar));
            }
        });
    }

    @Override // defpackage.ebdd, java.net.Socket
    public final OutputStream getOutputStream() {
        d();
        return (OutputStream) this.d.b(new ebsa() { // from class: ebdx
            @Override // defpackage.ebsa
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.ebsa
            public final Object b() {
                ebee ebeeVar = this.a;
                return (OutputStream) Map.EL.computeIfAbsent(ebeeVar.c, ebeeVar.a.getOutputStream(), new ebdb(ebeeVar));
            }
        });
    }

    @Override // defpackage.ebdd, javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        try {
            d();
        } catch (IOException unused) {
        }
        return this.a.getSession();
    }

    @Override // defpackage.ebdd, javax.net.ssl.SSLSocket
    public final void startHandshake() throws ebrq {
        f();
        this.d.b(new ebrh(new ebri() { // from class: ebeb
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.a.startHandshake();
            }
        }));
        g(ebem.AUTHENTICATED);
    }

    @Override // defpackage.ebdd, java.net.Socket
    public final void connect(final SocketAddress socketAddress, final int i) {
        this.d.d(ebem.CONNECTING, new ebrh(new ebri() { // from class: ebdw
            @Override // defpackage.ebri
            public final void a() {
                this.a.a.connect(socketAddress, i);
            }
        }), ebem.CONNECTED);
    }
}
