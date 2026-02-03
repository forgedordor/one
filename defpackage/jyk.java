package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyk {
    private final kbi a;
    private final kio b;
    private final kji c;
    private final jyg d = new jyg(null);

    public jyk(kbi kbiVar, kio kioVar, kji kjiVar) {
        this.a = kbiVar;
        this.b = kioVar;
        this.c = kjiVar;
    }

    public static /* synthetic */ jyi a(jyk jykVar, String str, jyq jyqVar, int i, int i2, long j, int i3) {
        if ((i3 & 2) != 0) {
            jyqVar = jyq.a;
        }
        return b(jykVar, new juo(str), jyqVar, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? kim.k(0, 0, 0, 15) : j, jykVar.c, jykVar.b, jykVar.a, 32);
    }

    public static /* synthetic */ jyi b(jyk jykVar, juo juoVar, jyq jyqVar, int i, boolean z, int i2, long j, kji kjiVar, kio kioVar, kbi kbiVar, int i3) {
        jyq jyqVar2 = (i3 & 2) != 0 ? jyq.a : jyqVar;
        int i4 = (i3 & 4) != 0 ? 1 : i;
        boolean z2 = (!((i3 & 8) == 0)) | z;
        int i5 = i3 & 16;
        int iB = Alert.DURATION_SHOW_INDEFINITELY;
        int i6 = i5 != 0 ? Integer.MAX_VALUE : i2;
        fcvo fcvoVar = (i3 & 32) != 0 ? fcvo.a : null;
        long jK = (i3 & 64) != 0 ? kim.k(0, 0, 0, 15) : j;
        jyh jyhVar = new jyh(juoVar, jyqVar2, fcvoVar, i6, z2, i4, (i3 & 256) != 0 ? jykVar.b : kioVar, (i3 & 128) != 0 ? jykVar.c : kjiVar, (i3 & 512) != 0 ? jykVar.a : kbiVar, jK);
        jyg jygVar = jykVar.d;
        juu juuVar = new juu(jyhVar);
        cub cubVar = jygVar.a;
        jyi jyiVar = (jyi) cubVar.c(juuVar);
        if (jyiVar == null || jyiVar.b.a.c()) {
            jyiVar = null;
        }
        if (jyiVar != null) {
            jvc jvcVar = jyiVar.b;
            return jyiVar.p(jyhVar, kim.e(jK, (jvm.a(jvcVar.e) & 4294967295L) | (jvm.a(jvcVar.d) << 32)));
        }
        jvf jvfVar = new jvf(jyhVar.a, jyr.b(jyhVar.b, jyhVar.h), jyhVar.c, jyhVar.g, jyhVar.i);
        long j2 = jyhVar.j;
        boolean z3 = jyhVar.e;
        if ((z3 || jym.a(jyhVar.f)) && kil.i(j2)) {
            iB = kil.b(j2);
        }
        int i7 = iB;
        int i8 = (z3 || !jym.a(jyhVar.f)) ? jyhVar.d : 1;
        int iD = kil.d(j2);
        if (iD != i7) {
            i7 = fddu.i(jvm.a(jvfVar.a()), iD, i7);
        }
        jvc jvcVar2 = new jvc(jvfVar, kik.b(0, i7, 0, kil.a(j2)), i8, jyhVar.f);
        float fCeil = (float) Math.ceil(jvcVar2.d);
        jyi jyiVar2 = new jyi(jyhVar, jvcVar2, kim.e(j2, (4294967295L & ((int) Math.ceil(jvcVar2.e))) | (((int) fCeil) << 32)));
        cubVar.d(new juu(jyhVar), jyiVar2);
        return jyiVar2;
    }
}
