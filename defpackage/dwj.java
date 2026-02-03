package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwj {
    public final dyk a;
    public kio b;
    public boolean d;
    public fdlr e;
    public final dse f;
    private final fdat g;
    public final fdoa c = fdod.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    private final dwk h = new dwk();

    public dwj(dyk dykVar, dse dseVar, fdat fdatVar, kio kioVar) {
        this.a = dykVar;
        this.f = dseVar;
        this.g = fdatVar;
        this.b = kioVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.dwj r7, defpackage.fdci r8, defpackage.fdcf r9, defpackage.dyk r10, defpackage.fdci r11, long r12, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.dwd
            if (r0 == 0) goto L13
            r0 = r14
            dwd r0 = (defpackage.dwd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dwd r0 = new dwd
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            fdci r11 = r0.g
            dyk r10 = r0.f
            fdcf r9 = r0.e
            fdci r8 = r0.d
            dwj r7 = r0.c
            defpackage.fctl.b(r14)
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            defpackage.fctl.b(r14)
            r5 = 0
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 >= 0) goto L48
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L48:
            dwe r14 = new dwe
            r2 = 0
            r14.<init>(r7, r2)
            r0.c = r7
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.g = r11
            r0.b = r4
            java.lang.Object r14 = defpackage.fdna.c(r12, r14, r0)
            if (r14 != r1) goto L61
            return r1
        L61:
            dvw r14 = (defpackage.dvw) r14
            if (r14 == 0) goto L9a
            java.lang.Object r12 = r8.a
            dvw r12 = (defpackage.dvw) r12
            boolean r12 = r12.c
            long r12 = r14.b
            dvw r0 = new dvw
            long r1 = r14.a
            r0.<init>(r1, r12)
            r8.a = r0
            java.lang.Object r8 = r8.a
            dvw r8 = (defpackage.dvw) r8
            long r12 = r8.a
            long r12 = r10.e(r12)
            float r8 = r10.c(r12)
            r9.a = r8
            r8 = 30
            r10 = 0
            deb r8 = defpackage.dec.b(r10, r10, r8)
            r11.a = r8
            r7.d(r14)
            float r7 = r9.a
            boolean r7 = defpackage.dvt.a(r7)
            r3 = r7 ^ 1
        L9a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwj.b(dwj, fdci, fdcf, dyk, fdci, long, fcxy):java.lang.Object");
    }

    public static final dvw g(final fdoa fdoaVar) {
        dvw dvwVarA = null;
        Iterator itA = new fdez(new dwg(new fdae() { // from class: dvu
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dvw) fdog.a(fdoaVar.m());
            }
        }, null)).a();
        while (itA.hasNext()) {
            dvw dvwVar = (dvw) itA.next();
            dvwVarA = dvwVarA == null ? dvwVar : dvwVarA.a(dvwVar);
        }
        return dvwVarA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
    
        if (r0.a(r1, r9) != r10) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dyk r17, defpackage.dvw r18, float r19, float r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwj.a(dyk, dvw, float, float, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dyk r5, defpackage.fdat r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dwh
            if (r0 == 0) goto L13
            r0 = r7
            dwh r0 = (defpackage.dwh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dwh r0 = new dwh
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            r4.d = r3
            dwi r7 = new dwi
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdmu.a(r7, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = 0
            r4.d = r5
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwj.c(dyk, fdat, fcxy):java.lang.Object");
    }

    public final void d(dvw dvwVar) {
        long j = dvwVar.a;
        dwk dwkVar = this.h;
        itr itrVar = dwkVar.a;
        long j2 = dvwVar.b;
        itrVar.b(j2, Float.intBitsToFloat((int) (j >> 32)));
        dwkVar.b.b(j2, Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final float e(dyh dyhVar, float f) {
        dyk dykVar = this.a;
        return dykVar.c(dykVar.e(dyhVar.b(dykVar.g(dykVar.b(f)))));
    }
}
