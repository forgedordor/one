package defpackage;

import android.content.Context;
import android.net.NetworkReleasedException;
import android.net.SocketLocalAddressChangedException;
import android.net.SocketNotBoundException;
import java.net.InetSocketAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebff {
    private final Context a;
    private final deyw b;

    public ebff(Context context, deyw deywVar) {
        this.a = context;
        this.b = deywVar;
    }

    public static final String b(InetSocketAddress inetSocketAddress) {
        return eomf.a(inetSocketAddress.getAddress().getHostAddress(), inetSocketAddress.getPort()).toString();
    }

    public static final int d(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    final void a(Exception exc) {
        int i = exc.getCause() instanceof NetworkReleasedException ? 2 : exc.getCause() instanceof SocketLocalAddressChangedException ? 5 : exc.getCause() instanceof SocketNotBoundException ? 3 : exc.getCause() instanceof UnsupportedOperationException ? 4 : 1;
        ewhm ewhmVar = (ewhm) ewhp.a.createBuilder();
        ewhmVar.copyOnWrite();
        ewhp ewhpVar = (ewhp) ewhmVar.instance;
        ewhpVar.c = i - 1;
        ewhpVar.b |= 1;
        ewhmVar.copyOnWrite();
        ewhp ewhpVar2 = (ewhp) ewhmVar.instance;
        ewhpVar2.e = 3;
        ewhpVar2.b = 4 | ewhpVar2.b;
        c((ewhp) ewhmVar.build(), 3);
    }

    public final void c(ewhp ewhpVar, int i) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 5;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = i - 1;
        ewihVar2.b |= 4;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhpVar.getClass();
        ewihVar3.d = ewhpVar;
        ewihVar3.c = 7;
        this.b.h(this.a, (ewih) ewigVar.build());
    }
}
