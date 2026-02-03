package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eas {
    public static final float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? fddu.d(f, f2) : fddu.c(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(final defpackage.dwy r9, float r10, final float r11, defpackage.deb r12, defpackage.ddz r13, final defpackage.fdap r14, defpackage.fcxy r15) {
        /*
            boolean r0 = r15 instanceof defpackage.ear
            if (r0 == 0) goto L13
            r0 = r15
            ear r0 = (defpackage.ear) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ear r0 = new ear
            r0.<init>(r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            float r9 = r6.b
            float r10 = r6.a
            fdcf r11 = r6.f
            deb r12 = r6.e
            defpackage.fctl.b(r15)
            goto L7d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r15)
            fdcf r15 = new fdcf
            r15.<init>()
            java.lang.Object r1 = r12.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            r1 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            java.lang.Object r3 = r12.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L62
            r3 = 0
            r4 = r3
            goto L63
        L62:
            r4 = r1
        L63:
            eap r5 = new eap
            r5.<init>()
            r6.e = r12
            r6.f = r15
            r6.a = r10
            r6.b = r8
            r6.d = r1
            r1 = r12
            r3 = r13
            java.lang.Object r9 = defpackage.dgv.d(r1, r2, r3, r4, r5, r6)
            if (r9 == r0) goto L9f
            r11 = r15
            r12 = r1
            r9 = r8
        L7d:
            java.lang.Object r13 = r12.b()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = a(r13, r9)
            dzy r13 = new dzy
            float r11 = r11.a
            float r10 = r10 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            r10 = 29
            deb r9 = defpackage.dec.c(r12, r7, r9, r10)
            r13.<init>(r11, r9)
            return r13
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eas.b(dwy, float, float, deb, ddz, fdap, fcxy):java.lang.Object");
    }

    public static final fctx c(float f, fdcf fdcfVar, dwy dwyVar, fdap fdapVar, ddy ddyVar) {
        float fA;
        float fA2 = a(((Number) ddyVar.a()).floatValue(), f);
        float f2 = fA2 - fdcfVar.a;
        try {
            fA = dwyVar.a(f2);
        } catch (CancellationException unused) {
            ddyVar.c();
            fA = 0.0f;
        }
        fdapVar.invoke(Float.valueOf(fA));
        if (Math.abs(f2 - fA) > 0.5f || fA2 != ((Number) ddyVar.a()).floatValue()) {
            ddyVar.c();
        }
        fdcfVar.a += fA;
        return fctx.a;
    }

    public static final void d(ddy ddyVar, dwy dwyVar, fdap fdapVar, float f) {
        float fA;
        try {
            fA = dwyVar.a(f);
        } catch (CancellationException unused) {
            ddyVar.c();
            fA = 0.0f;
        }
        fdapVar.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            ddyVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(final defpackage.dwy r5, final float r6, defpackage.deb r7, defpackage.dep r8, final defpackage.fdap r9, defpackage.fcxy r10) {
        /*
            boolean r0 = r10 instanceof defpackage.eaq
            if (r0 == 0) goto L13
            r0 = r10
            eaq r0 = (defpackage.eaq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eaq r0 = new eaq
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r6 = r0.a
            fdcf r5 = r0.e
            deb r7 = r0.d
            defpackage.fctl.b(r10)
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r10)
            fdcf r10 = new fdcf
            r10.<init>()
            java.lang.Object r2 = r7.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = 0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            eao r4 = new eao
            r4.<init>()
            r0.d = r7
            r0.e = r10
            r0.a = r6
            r0.c = r3
            java.lang.Object r5 = defpackage.dgv.g(r7, r8, r2, r4, r0)
            if (r5 == r1) goto L71
            r5 = r10
        L63:
            dzy r8 = new dzy
            float r5 = r5.a
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eas.e(dwy, float, deb, dep, fdap, fcxy):java.lang.Object");
    }
}
