package defpackage;

import android.content.Context;
import android.net.Network;
import java.net.Inet4Address;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebrc implements ebqx {
    private static final ekgb a = ekgb.u("8.8.8.8", "8.8.4.4", "2001:4860:4860:0:0:0:0:8888", "2001:4860:4860:0:0:0:0:8844");
    private final ebfl b;
    private final deym c;
    private final Context d;
    private final dhip e;
    private final boolean f;
    private final boolean g;
    private final ebhe h;

    public ebrc(Context context, deym deymVar, ebfl ebflVar, dhip dhipVar, ebhe ebheVar, boolean z, boolean z2) {
        this.d = context;
        this.c = deymVar;
        this.b = ebflVar;
        this.e = dhipVar;
        this.f = z;
        this.g = z2;
        this.h = ebheVar;
    }

    private final List c(ebid ebidVar, String str, ebmr ebmrVar, boolean z, String str2, int i) throws ebqz {
        ebnc ebnhVar;
        if (i > 0) {
            return ekgb.r(new ebmt(str2, str2, i, ebmrVar));
        }
        dhip dhipVar = this.e;
        dhja.l(dhipVar, "Discovering sip proxies for pcscf:[%s] over protocol:[%s]", str2, ebmrVar);
        if (this.f) {
            ebnhVar = new ebna(ebidVar, new ebms(((Boolean) dfog.o().a.e.a()).booleanValue() || z, this.g, ebmrVar, ejud.a));
        } else {
            ebnhVar = new ebnh(ebidVar, new ebms(false, this.g, ebmrVar, ejwi.j(dhipVar)));
        }
        List listB = ebnhVar.b(str2);
        listB.getClass();
        if (listB.isEmpty()) {
            dhja.h(dhipVar, "DNS lookup of %s failed! No results from discovery over %s network[%s]", str2, true != z ? "IPv6" : "IPv4", str);
            throw new ebqz(dhipVar.a);
        }
        dhja.k("SIP discovery results: %s", listB);
        return listB;
    }

    private static boolean d(String str) {
        return eomh.a(str) instanceof Inet4Address;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #2 {all -> 0x01fa, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:13:0x0042, B:15:0x0048, B:17:0x0081, B:19:0x00c2, B:21:0x00cb, B:23:0x00ea, B:25:0x0133, B:28:0x0154, B:32:0x0166, B:34:0x016a, B:40:0x0194, B:43:0x01aa, B:44:0x01ba, B:45:0x01c5, B:54:0x01fb, B:48:0x01ca, B:30:0x015e, B:24:0x0111, B:20:0x00c7, B:16:0x0065, B:12:0x0029, B:51:0x01f4, B:52:0x01f9), top: B:60:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #2 {all -> 0x01fa, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:13:0x0042, B:15:0x0048, B:17:0x0081, B:19:0x00c2, B:21:0x00cb, B:23:0x00ea, B:25:0x0133, B:28:0x0154, B:32:0x0166, B:34:0x016a, B:40:0x0194, B:43:0x01aa, B:44:0x01ba, B:45:0x01c5, B:54:0x01fb, B:48:0x01ca, B:30:0x015e, B:24:0x0111, B:20:0x00c7, B:16:0x0065, B:12:0x0029, B:51:0x01f4, B:52:0x01f9), top: B:60:0x0003, inners: #1 }] */
    @Override // defpackage.ebqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.ebqv a(defpackage.ebmr r20, android.net.Network r21, java.lang.String r22, java.lang.String r23, java.util.List r24, java.lang.String r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebrc.a(ebmr, android.net.Network, java.lang.String, java.lang.String, java.util.List, java.lang.String, int):ebqv");
    }

    final ebqv b(String str, ebnj ebnjVar, Network network, String str2, ebmr ebmrVar) {
        int iA = ebfo.a();
        Object[] objArr = {dhiz.IP_ADDRESS.c(str2), Integer.valueOf(iA)};
        dhip dhipVar = this.e;
        dhja.d(dhipVar, "Local IP address is %s:%d", objArr);
        str2.getClass();
        String strD = ebnjVar.d();
        strD.getClass();
        return new ebrf(this.d, network, str2, iA, strD, ebnjVar.a(), str, this.c, dhipVar, this.b, ebmrVar);
    }
}
