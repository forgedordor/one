package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kck implements kcj {
    private static final Typeface d(String str, kcc kccVar, int i) {
        if (kbw.b(i, 0) && fdbq.f(kccVar, kcc.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kccVar.i, kbw.b(i, 1));
    }

    @Override // defpackage.kcj
    public final Typeface a(kcc kccVar, int i) {
        return d(null, kccVar, i);
    }

    @Override // defpackage.kcj
    public final Typeface b(kce kceVar, kcc kccVar, int i) {
        return d(kceVar.f, kccVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // defpackage.kcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface c(java.lang.String r6, defpackage.kcc r7, defpackage.kca r8, android.content.Context r9) {
        /*
            r5 = this;
            kce r0 = defpackage.kbj.b
            java.lang.String r1 = r0.f
            boolean r1 = defpackage.fdbq.f(r6, r1)
            r2 = 0
            if (r1 == 0) goto L10
            android.graphics.Typeface r6 = r5.b(r0, r7, r2)
            goto L68
        L10:
            kce r0 = defpackage.kbj.c
            java.lang.String r1 = r0.f
            boolean r1 = defpackage.fdbq.f(r6, r1)
            if (r1 == 0) goto L1f
            android.graphics.Typeface r6 = r5.b(r0, r7, r2)
            goto L68
        L1f:
            kce r0 = defpackage.kbj.d
            java.lang.String r1 = r0.f
            boolean r1 = defpackage.fdbq.f(r6, r1)
            if (r1 == 0) goto L2e
            android.graphics.Typeface r6 = r5.b(r0, r7, r2)
            goto L68
        L2e:
            kce r0 = defpackage.kbj.e
            java.lang.String r1 = r0.f
            boolean r1 = defpackage.fdbq.f(r6, r1)
            if (r1 == 0) goto L3d
            android.graphics.Typeface r6 = r5.b(r0, r7, r2)
            goto L68
        L3d:
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L46
        L44:
            r6 = r1
            goto L68
        L46:
            android.graphics.Typeface r6 = d(r6, r7, r2)
            r0 = 1
            boolean r0 = defpackage.kbw.b(r2, r0)
            int r3 = r7.i
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r0 = defpackage.abn$$ExternalSyntheticApiModelOutline0.m(r4, r3, r0)
            boolean r0 = defpackage.fdbq.f(r6, r0)
            if (r0 != 0) goto L44
            android.graphics.Typeface r7 = d(r1, r7, r2)
            boolean r7 = defpackage.fdbq.f(r6, r7)
            if (r7 == 0) goto L68
            goto L44
        L68:
            android.graphics.Typeface r6 = defpackage.kcm.a(r6, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kck.c(java.lang.String, kcc, kca, android.content.Context):android.graphics.Typeface");
    }
}
