package defpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebeh extends ebcy implements ebrr {
    private final ebrz b;

    public ebeh(ServerSocket serverSocket) {
        super(serverSocket);
        this.b = ebrz.a(ebem.m);
    }

    @Override // defpackage.ebcy
    protected final Socket a(Socket socket) {
        return new ebel(socket, ebem.n);
    }

    @Override // defpackage.ebcy, java.net.ServerSocket
    public final Socket accept() {
        return (Socket) this.b.c(ebem.ACCEPTING, new ebsa() { // from class: ebef
            @Override // defpackage.ebsa
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.ebsa
            public final Object b() {
                ebeh ebehVar = this.a;
                return ebehVar.a(ebehVar.a.accept());
            }
        });
    }

    @Override // defpackage.ebcy, java.net.ServerSocket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.d(ebem.CLOSING, new ebrh(new ebri() { // from class: ebeg
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.a.close();
            }
        }), ebem.CLOSED);
    }

    @Override // defpackage.ebrr
    public final void e(ebru ebruVar) {
        this.b.f(ebruVar);
    }
}
