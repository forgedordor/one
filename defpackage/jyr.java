package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyr {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jyq a(defpackage.jyq r36, defpackage.jyq r37, float r38) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyr.a(jyq, jyq, float):jyq");
    }

    public static final jyq b(jyq jyqVar, kji kjiVar) {
        long j;
        int i;
        khu khuVar;
        int i2;
        jxx jxxVar = jyqVar.b;
        khs khsVar = jxxVar.a;
        long j2 = jxz.a;
        khs khsVarE = khsVar.e(new fdae() { // from class: jxy
            @Override // defpackage.fdae
            public final Object invoke() {
                return jxz.d;
            }
        });
        long j3 = jxxVar.b;
        if (kjl.b(j3) == 0) {
            j3 = jxz.a;
        }
        long j4 = j3;
        kcc kccVar = jxxVar.c;
        if (kccVar == null) {
            kccVar = kcc.e;
        }
        kcc kccVar2 = kccVar;
        kbw kbwVar = jxxVar.d;
        kbw kbwVar2 = new kbw(kbwVar != null ? kbwVar.a : 0);
        kbx kbxVar = jxxVar.e;
        kbx kbxVar2 = new kbx(kbxVar != null ? kbxVar.a : 65535);
        kbj kbjVar = jxxVar.f;
        if (kbjVar == null) {
            kbjVar = kbj.a;
        }
        kbj kbjVar2 = kbjVar;
        String str = jxxVar.g;
        long j5 = jxxVar.h;
        if (kjl.b(j5) == 0) {
            j5 = jxz.b;
        }
        long j6 = j5;
        kgw kgwVar = jxxVar.i;
        kgw kgwVar2 = new kgw(kgwVar != null ? kgwVar.a : 0.0f);
        kht khtVar = jxxVar.j;
        if (khtVar == null) {
            khtVar = kht.a;
        }
        kht khtVar2 = khtVar;
        kfu kfuVarA = jxxVar.k;
        if (kfuVarA == null) {
            kfu kfuVar = kfu.a;
            kfuVarA = kft.a();
        }
        kfu kfuVar2 = kfuVarA;
        long j7 = jxxVar.l;
        if (j7 == 16) {
            j7 = jxz.c;
        }
        long j8 = j7;
        khl khlVar = jxxVar.m;
        if (khlVar == null) {
            khlVar = khl.a;
        }
        khl khlVar2 = khlVar;
        iko ikoVar = jxxVar.n;
        if (ikoVar == null) {
            ikoVar = iko.a;
        }
        iko ikoVar2 = ikoVar;
        jvs jvsVar = jxxVar.o;
        ina inaVar = jxxVar.p;
        if (inaVar == null) {
            inaVar = inc.a;
        }
        ina inaVar2 = inaVar;
        if (str == null) {
            str = "";
        }
        jxx jxxVar2 = new jxx(khsVarE, j4, kccVar2, kbwVar2, kbxVar2, kbjVar2, str, j6, kgwVar2, khtVar2, kfuVar2, j8, khlVar2, ikoVar2, jvsVar, inaVar2);
        jvn jvnVar = jyqVar.c;
        int i3 = jvnVar.a;
        long j9 = jvo.a;
        int i4 = jvnVar.b;
        if (khm.b(i4, 3)) {
            int iOrdinal = kjiVar.ordinal();
            if (iOrdinal == 0) {
                i4 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new fctg();
                }
                i4 = 5;
            }
        } else if (khm.b(i4, Integer.MIN_VALUE)) {
            int iOrdinal2 = kjiVar.ordinal();
            if (iOrdinal2 == 0) {
                i4 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new fctg();
                }
                i4 = 2;
            }
        }
        long j10 = jvnVar.c;
        if (kjl.b(j10) == 0) {
            j10 = jvo.a;
        }
        khu khuVar2 = jvnVar.d;
        if (khuVar2 == null) {
            khuVar2 = khu.a;
        }
        long j11 = j10;
        jvr jvrVar = jvnVar.e;
        khi khiVar = jvnVar.f;
        int i5 = jvnVar.g;
        if (true == khd.b(i5, 0)) {
            i5 = 66305;
        }
        int i6 = jvnVar.h;
        boolean zB = kgz.b(i6, Integer.MIN_VALUE);
        khw khwVar = jvnVar.i;
        if (khwVar == null) {
            khwVar = khw.a;
        }
        if (true == zB) {
            i6 = 1;
        }
        if (true == khk.b(i3, Integer.MIN_VALUE)) {
            j = j11;
            i = i5;
            khuVar = khuVar2;
            i2 = 5;
        } else {
            j = j11;
            i = i5;
            khuVar = khuVar2;
            i2 = i3;
        }
        return new jyq(jxxVar2, new jvn(i2, i4, j, khuVar, jvrVar, khiVar, i, i6, khwVar), jyqVar.d);
    }
}
