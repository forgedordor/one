package defpackage;

import android.telephony.SmsMessage;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aokb implements aokl {
    private final eygg a;
    private final eygg b;
    private final ajlj c;
    private final boolean d;
    private final boolean e;
    private final aokm f;

    public aokb(eygg eyggVar, eygg eyggVar2, ajlj ajljVar, boolean z, aokm aokmVar) {
        this.a = eyggVar;
        this.b = eyggVar2;
        this.c = ajljVar;
        this.d = z;
        this.e = ajljVar == ajlj.GROUP ? aokmVar.h() : aokmVar.i();
        this.f = aokmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aokk e(java.lang.String r8, defpackage.aojz r9) {
        /*
            r7 = this;
            defpackage.ecem.b()
            eygg r0 = r7.a
            java.lang.Object r0 = r0.b()
            cmtv r0 = (defpackage.cmtv) r0
            boolean r0 = r0.c(r8)
            aokj r1 = defpackage.aokj.SMS
            r9.h(r1)
            r1 = 0
            r9.e(r1)
            r2 = 4
            int[] r2 = new int[r2]
            r2[r1] = r1
            r3 = 1
            r2[r3] = r1
            r4 = 2
            r2[r4] = r1
            r5 = 3
            r2[r5] = r1
            eygg r5 = r7.b     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L3f
            aoki r5 = (defpackage.aoki) r5     // Catch: java.lang.Throwable -> L3f
            aokm r5 = r7.f     // Catch: java.lang.Throwable -> L3f
            boolean r5 = r5.j()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L3a
            if (r0 == 0) goto L3a
            r0 = r3
            goto L3b
        L3a:
            r0 = r1
        L3b:
            int[] r2 = android.telephony.SmsMessage.calculateLength(r8, r0)     // Catch: java.lang.Throwable -> L3f
        L3f:
            r8 = r2[r1]
            r0 = r2[r3]
            r2 = r2[r4]
            r9.d(r8)
            r9.c(r0)
            r9.b(r2)
            aokm r4 = r7.f
            boolean r5 = r7.d
            int r6 = r4.e()
            int r4 = r4.f()
            if (r5 == 0) goto L65
            boolean r5 = r7.f(r8)
            if (r5 != 0) goto L67
            if (r8 <= r6) goto L68
            goto L67
        L65:
            if (r8 <= r6) goto L68
        L67:
            r1 = r3
        L68:
            r9.f(r6)
            if (r4 <= 0) goto L77
            int r2 = r2 + r0
            r8 = 140(0x8c, float:1.96E-43)
            if (r2 >= r8) goto L74
            int r4 = r4 >> 1
        L74:
            if (r0 <= r4) goto L77
            goto L79
        L77:
            if (r1 == 0) goto L81
        L79:
            r9.e(r3)
            aokj r8 = defpackage.aokj.MMS
            r9.h(r8)
        L81:
            aoka r8 = r9.i()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aokb.e(java.lang.String, aojz):aokk");
    }

    private final boolean f(int i) {
        ejwl.l(this.d);
        aokm aokmVar = this.f;
        if (TextUtils.isEmpty(aokmVar.g())) {
            return true;
        }
        int iA = aokmVar.a();
        return iA >= 0 && i > iA;
    }

    @Override // defpackage.aokl
    public final aokk a(String str) {
        aokm aokmVar = this.f;
        aojz aojzVarD = d(str);
        aojzVarD.g(aokmVar.c());
        aojzVarD.j(aokj.SMS);
        return aojzVarD.i();
    }

    @Override // defpackage.aokl
    public final aokk b(amwf amwfVar, boolean z) {
        boolean z2 = (amwfVar instanceof amwi) || (this.c != ajlj.GROUP ? z && this.e : this.e);
        aojx aojxVar = new aojx();
        aokj aokjVar = aokj.SMS;
        aojxVar.h(aokjVar);
        aojxVar.j(aokjVar);
        aojxVar.g(this.f.c());
        if (this.e) {
            aojxVar.j(aokj.MMS);
        }
        if (!z2) {
            return e(amwfVar == null ? "" : amwfVar.c(), aojxVar);
        }
        aojxVar.d(0);
        aojxVar.c(0);
        aojxVar.b(0);
        aojxVar.f(0);
        aojxVar.e(true);
        aojxVar.h(aokj.MMS);
        return aojxVar.i();
    }

    @Override // defpackage.aokl
    public final aokm c() {
        return this.f;
    }

    @Deprecated
    public final aojz d(String str) {
        ecem.b();
        boolean zC = ((cmtv) this.a.b()).c(str);
        int[] iArrCalculateLength = {0, 0, 0, 0};
        try {
            iArrCalculateLength = SmsMessage.calculateLength(str, this.f.j() && zC);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
        }
        aojx aojxVar = new aojx();
        aojxVar.h(aokj.SMS);
        int i = iArrCalculateLength[0];
        int i2 = iArrCalculateLength[1];
        int i3 = iArrCalculateLength[2];
        aojxVar.d(i);
        aojxVar.c(i2);
        aojxVar.b(i3);
        aokm aokmVar = this.f;
        boolean z = this.d;
        int iE = aokmVar.e();
        int iF = aokmVar.f();
        if (z) {
            aojxVar.e(f(i) || i > iE);
        } else {
            aojxVar.e(i > iE);
        }
        aojxVar.f(iE);
        if (iF > 0) {
            if (i3 + i2 < 140) {
                iF >>= 1;
            }
            if (i2 > iF) {
                aojxVar.e(true);
            }
        }
        return aojxVar;
    }
}
