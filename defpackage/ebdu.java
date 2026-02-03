package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebdu extends ebev {
    public final int a;
    public final dfzk b;

    public ebdu(int i, dfzk dfzkVar) {
        this.a = i;
        this.b = dfzkVar;
    }

    @Override // defpackage.ebev
    protected final ServerSocket b(ServerSocket serverSocket) {
        ekgp ekgpVar = eben.a;
        return new ebeh(serverSocket);
    }

    @Override // defpackage.ebev
    protected final Socket c(Socket socket) {
        ekgp ekgpVar = eben.a;
        final ebel ebelVar = new ebel(socket, ebem.l);
        ebelVar.e(new ebru() { // from class: ebdt
            @Override // defpackage.ebru
            public final void a(ebro ebroVar) {
                if (ebdv.a(ebroVar)) {
                    ebel ebelVar2 = ebelVar;
                    ebdu ebduVar = this.a;
                    ebduVar.b.a(ebdv.b(ebduVar.a, ebelVar2, ebroVar));
                }
            }
        });
        return ebelVar;
    }

    @Override // defpackage.ebev
    protected final SSLSocket e(SSLSocket sSLSocket) {
        ekgp ekgpVar = eben.a;
        final ebee ebeeVar = new ebee(sSLSocket);
        ebeeVar.e(new ebru() { // from class: ebds
            @Override // defpackage.ebru
            public final void a(ebro ebroVar) {
                if (ebdv.a(ebroVar)) {
                    ebee ebeeVar2 = ebeeVar;
                    ebdu ebduVar = this.a;
                    ebduVar.b.a(ebdv.b(ebduVar.a, ebeeVar2, ebroVar));
                }
            }
        });
        return ebeeVar;
    }

    @Override // defpackage.ebev
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        return sSLServerSocket;
    }
}
