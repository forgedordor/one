package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elaw implements Serializable {
    public static final double a;
    private static final long serialVersionUID = 1;
    protected final elaa b;
    protected final List c;
    public volatile boolean d;
    private List e;
    private int f;
    private final List g;

    static {
        double d = ekxv.a + 4.996003610813204E-16d;
        a = d + d;
    }

    public elaw() {
        elaa elaaVar = new elaa();
        int i = ekgb.d;
        this.e = ekoe.a;
        this.f = 0;
        this.g = new ArrayList();
        this.d = true;
        this.b = elaaVar;
        this.c = new ArrayList();
    }

    static final List b(int i) {
        return i < 256 ? new elav(i) : new elau(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(defpackage.ekyi r26, java.util.List r27, defpackage.ekzy r28) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elaw.e(ekyi, java.util.List, ekzy):void");
    }

    private static ekzv f(ekzv ekzvVar, boolean z, double d, ekzw ekzwVar) {
        if (z ? ekzvVar.b.a.b <= d : ekzvVar.b.a.a >= d) {
            return ekzvVar;
        }
        ekzx ekzxVar = ekzvVar.a;
        ekxe ekxeVar = ekzvVar.b.b;
        double d2 = ekzxVar.d;
        double d3 = ekzxVar.f;
        double d4 = ekzxVar.e;
        double d5 = ekzxVar.g;
        return h(ekzvVar, z, d, (((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) > 0) != ((d4 > d5 ? 1 : (d4 == d5 ? 0 : -1)) > 0)) ^ z, ekxeVar.a(ekxv.b(d, d2, d3, d4, d5)), ekzwVar);
    }

    private static ekzv g(ekzv ekzvVar, boolean z, double d, ekzw ekzwVar) {
        if (z ? ekzvVar.b.b.b <= d : ekzvVar.b.b.a >= d) {
            return ekzvVar;
        }
        ekzx ekzxVar = ekzvVar.a;
        ekxe ekxeVar = ekzvVar.b.a;
        double d2 = ekzxVar.e;
        double d3 = ekzxVar.g;
        double d4 = ekzxVar.d;
        double d5 = ekzxVar.f;
        return h(ekzvVar, (((d4 > d5 ? 1 : (d4 == d5 ? 0 : -1)) > 0) != ((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) > 0)) ^ z, ekxeVar.a(ekxv.b(d, d2, d3, d4, d5)), z, d, ekzwVar);
    }

    private static ekzv h(ekzv ekzvVar, boolean z, double d, boolean z2, double d2, ekzw ekzwVar) {
        List list = ekzwVar.b;
        if (ekzwVar.a == list.size()) {
            list.add(new ekzv());
        }
        int i = ekzwVar.a;
        ekzwVar.a = i + 1;
        ekzv ekzvVar2 = (ekzv) list.get(i);
        ekzvVar2.a = ekzvVar.a;
        if (z) {
            ekzvVar2.b.a.e(ekzvVar.b.a.a, d);
        } else {
            ekzvVar2.b.a.e(d, ekzvVar.b.a.b);
        }
        if (z2) {
            ekzvVar2.b.b.e(ekzvVar.b.b.a, d2);
            return ekzvVar2;
        }
        ekzvVar2.b.b.e(d2, ekzvVar.b.b.b);
        return ekzvVar2;
    }

    private static void i(ekzv ekzvVar, ekxe ekxeVar, List list, List list2, ekzw ekzwVar) {
        ekxe ekxeVar2 = ekzvVar.b.b;
        if (ekxeVar2.b <= ekxeVar.a) {
            list.add(ekzvVar);
            return;
        }
        double d = ekxeVar2.a;
        double d2 = ekxeVar.b;
        if (d >= d2) {
            list2.add(ekzvVar);
        } else {
            list.add(g(ekzvVar, true, d2, ekzwVar));
            list2.add(g(ekzvVar, false, ekxeVar.a, ekzwVar));
        }
    }

    private static void j(ekxp ekxpVar, ekxp ekxpVar2, ekzy ekzyVar) {
        if (ekzyVar.b.e > 0) {
            ekxq ekxqVar = new ekxq();
            ekxqVar.a.clear();
            while (ekxpVar.compareTo(ekxpVar2) < 0) {
                long j = ekxpVar.d;
                long jN = j;
                while (!ekxp.F(jN) && ekxp.p(ekxp.n(jN)) == j && ekxp.M(ekxp.o(ekxp.n(jN)), ekxpVar2.d)) {
                    jN = ekxp.n(jN);
                }
                ekxp ekxpVar3 = new ekxp(jN);
                ekxqVar.a.add(ekxpVar3);
                ekxpVar = ekxpVar3.x().v();
            }
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            for (int i2 = 0; i2 < ekxqVar.b(); i2++) {
                e(new ekyi((ekxp) ekxqVar.a.get(i2), a), ekgbVar, ekzyVar);
            }
        }
    }

    private static void k(List list, ekzy ekzyVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ekzx ekzxVar = ((ekzv) it.next()).a;
            List list2 = ekzyVar.e;
            int i = ekzxVar.a;
            ((ekzq) list2.get(i)).p();
            ekzyVar.b.b(i, ekzxVar.h, ekzxVar.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122 A[Catch: all -> 0x0167, TryCatch #1 {all -> 0x0167, blocks: (B:25:0x0082, B:28:0x0096, B:30:0x00ac, B:32:0x00c4, B:34:0x00de, B:36:0x00e8, B:38:0x00f2, B:40:0x00fc, B:50:0x0155, B:44:0x0122, B:46:0x0138, B:48:0x0151, B:51:0x015f, B:56:0x0171, B:57:0x0183, B:63:0x01a0, B:100:0x0329, B:69:0x01b8, B:75:0x0211, B:99:0x0326, B:78:0x0220, B:91:0x0273, B:93:0x02e0, B:96:0x02f5, B:98:0x02ff, B:94:0x02e3, B:86:0x023f, B:88:0x025b, B:95:0x02f2, B:101:0x0338), top: B:113:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3 A[Catch: all -> 0x0349, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0349, blocks: (B:59:0x0189, B:65:0x01ac, B:72:0x01c3, B:80:0x0228, B:82:0x0232, B:84:0x023a), top: B:115:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #1 {all -> 0x0167, blocks: (B:25:0x0082, B:28:0x0096, B:30:0x00ac, B:32:0x00c4, B:34:0x00de, B:36:0x00e8, B:38:0x00f2, B:40:0x00fc, B:50:0x0155, B:44:0x0122, B:46:0x0138, B:48:0x0151, B:51:0x015f, B:56:0x0171, B:57:0x0183, B:63:0x01a0, B:100:0x0329, B:69:0x01b8, B:75:0x0211, B:99:0x0326, B:78:0x0220, B:91:0x0273, B:93:0x02e0, B:96:0x02f5, B:98:0x02ff, B:94:0x02e3, B:86:0x023f, B:88:0x025b, B:95:0x02f2, B:101:0x0338), top: B:113:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e0 A[Catch: all -> 0x0167, TryCatch #1 {all -> 0x0167, blocks: (B:25:0x0082, B:28:0x0096, B:30:0x00ac, B:32:0x00c4, B:34:0x00de, B:36:0x00e8, B:38:0x00f2, B:40:0x00fc, B:50:0x0155, B:44:0x0122, B:46:0x0138, B:48:0x0151, B:51:0x015f, B:56:0x0171, B:57:0x0183, B:63:0x01a0, B:100:0x0329, B:69:0x01b8, B:75:0x0211, B:99:0x0326, B:78:0x0220, B:91:0x0273, B:93:0x02e0, B:96:0x02f5, B:98:0x02ff, B:94:0x02e3, B:86:0x023f, B:88:0x025b, B:95:0x02f2, B:101:0x0338), top: B:113:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e3 A[Catch: all -> 0x0167, TryCatch #1 {all -> 0x0167, blocks: (B:25:0x0082, B:28:0x0096, B:30:0x00ac, B:32:0x00c4, B:34:0x00de, B:36:0x00e8, B:38:0x00f2, B:40:0x00fc, B:50:0x0155, B:44:0x0122, B:46:0x0138, B:48:0x0151, B:51:0x015f, B:56:0x0171, B:57:0x0183, B:63:0x01a0, B:100:0x0329, B:69:0x01b8, B:75:0x0211, B:99:0x0326, B:78:0x0220, B:91:0x0273, B:93:0x02e0, B:96:0x02f5, B:98:0x02ff, B:94:0x02e3, B:86:0x023f, B:88:0x025b, B:95:0x02f2, B:101:0x0338), top: B:113:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ff A[Catch: all -> 0x0167, TryCatch #1 {all -> 0x0167, blocks: (B:25:0x0082, B:28:0x0096, B:30:0x00ac, B:32:0x00c4, B:34:0x00de, B:36:0x00e8, B:38:0x00f2, B:40:0x00fc, B:50:0x0155, B:44:0x0122, B:46:0x0138, B:48:0x0151, B:51:0x015f, B:56:0x0171, B:57:0x0183, B:63:0x01a0, B:100:0x0329, B:69:0x01b8, B:75:0x0211, B:99:0x0326, B:78:0x0220, B:91:0x0273, B:93:0x02e0, B:96:0x02f5, B:98:0x02ff, B:94:0x02e3, B:86:0x023f, B:88:0x025b, B:95:0x02f2, B:101:0x0338), top: B:113:0x0082 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekya a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elaw.a():ekya");
    }

    public final void c(ekzq ekzqVar) {
        this.c.add(ekzqVar);
        this.d = false;
    }

    public final void d() {
        int i = ekgb.d;
        this.e = ekoe.a;
        this.g.clear();
        this.c.clear();
        this.d = false;
        this.f = 0;
    }
}
