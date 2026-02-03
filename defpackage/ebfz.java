package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebfz extends ebev {
    static final dfny a = dfod.a(174303680);
    private final Optional b;

    public ebfz(Optional optional) {
        this.b = optional;
    }

    private static final String[] a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            throw new IllegalArgumentException("At least one protocol needs to be available.");
        }
        HashSet hashSetF = ekpg.f(strArr);
        int i = dfps.b;
        List listI = ejxk.b(',').f().a().i((CharSequence) dfps.c().a.b.a());
        if (!listI.isEmpty()) {
            hashSetF.retainAll(listI);
        }
        List listI2 = ejxk.b(',').f().a().i((CharSequence) dfps.c().a.c.a());
        hashSetF.removeAll(listI2);
        if (hashSetF.isEmpty()) {
            throw new IllegalStateException(String.format("No protocols enabled after filtering: (\"%s\" ∩ \"%s\") - \"%s\" = ∅", TextUtils.join(",", strArr), TextUtils.join(",", listI), TextUtils.join(",", listI2)));
        }
        return (String[]) hashSetF.toArray(new String[0]);
    }

    @Override // defpackage.ebev
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            sSLServerSocket.setEnabledProtocols(a(sSLServerSocket.getEnabledProtocols()));
        }
        return sSLServerSocket;
    }

    @Override // defpackage.ebev
    protected final SSLSocket e(SSLSocket sSLSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            sSLSocket.setEnabledProtocols(a(sSLSocket.getEnabledProtocols()));
        }
        return sSLSocket;
    }

    @Override // defpackage.ebev
    protected final Optional f() {
        return this.b;
    }

    @Override // defpackage.ebev
    protected final ServerSocket b(ServerSocket serverSocket) {
        return serverSocket;
    }

    @Override // defpackage.ebev
    protected final Socket c(Socket socket) {
        return socket;
    }
}
