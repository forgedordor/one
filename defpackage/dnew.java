package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnew extends fcyz implements fdap {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ dnfa f;
    final /* synthetic */ Iterable g;
    final /* synthetic */ Instant h;
    final /* synthetic */ dnce i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnew(dnfa dnfaVar, Iterable iterable, Instant instant, dnce dnceVar, int i, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.f = dnfaVar;
        this.g = iterable;
        this.h = instant;
        this.i = dnceVar;
        this.j = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:8:0x0060, B:10:0x0064, B:12:0x0068, B:15:0x0070, B:17:0x007c, B:18:0x0082, B:14:0x006c), top: B:25:0x0060 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.e
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/core/data/usage/FrecencyProcessor$computeFrecent$2"
            java.lang.String r4 = "FrecencyProcessor.kt"
            if (r1 == 0) goto L18
            int r0 = r8.d
            java.lang.Object r1 = r8.c
            java.lang.Object r5 = r8.b
            java.lang.Object r6 = r8.a
            defpackage.fctl.b(r9)
            goto L60
        L18:
            defpackage.fctl.b(r9)
            dnfa r1 = r8.f
            java.lang.Iterable r9 = r8.g
            j$.time.Instant r5 = r8.h
            dnce r6 = r8.i
            dneu r7 = new dneu
            r7.<init>()
            dngc r9 = r1.c
            java.lang.String r5 = "FrecencyProcessor#computeFrecencyScores"
            java.lang.Object r9 = r9.d(r5, r7)
            r6 = r9
            java.util.Map r6 = (java.util.Map) r6
            ekrg r9 = defpackage.dnfa.a
            ekrw r9 = r9.f()
            r5 = 55
            ekrw r9 = r9.h(r3, r2, r5, r4)
            ekrd r9 = (defpackage.ekrd) r9
            int r5 = r6.size()
            java.lang.String r7 = "Number of scores: %x"
            r9.r(r7, r5)
            int r9 = r8.j
            r8.a = r6
            feav r5 = r1.e
            r8.b = r5
            r8.c = r1
            r8.d = r9
            r7 = 1
            r8.e = r7
            java.lang.Object r7 = r5.b(r8)
            if (r7 == r0) goto Lb0
            r0 = r9
        L60:
            boolean r9 = r6 instanceof java.util.Map     // Catch: java.lang.Throwable -> Lab
            if (r9 == 0) goto L6c
            boolean r9 = r6 instanceof defpackage.fdcn     // Catch: java.lang.Throwable -> Lab
            if (r9 == 0) goto L70
            boolean r9 = r6 instanceof defpackage.fdcr     // Catch: java.lang.Throwable -> Lab
            if (r9 != 0) goto L70
        L6c:
            java.util.Map r6 = defpackage.fcwa.m(r6)     // Catch: java.lang.Throwable -> Lab
        L70:
            r9 = r1
            dnfa r9 = (defpackage.dnfa) r9     // Catch: java.lang.Throwable -> Lab
            r9.f = r6     // Catch: java.lang.Throwable -> Lab
            r9 = r1
            dnfa r9 = (defpackage.dnfa) r9     // Catch: java.lang.Throwable -> Lab
            java.util.Map r9 = r9.f     // Catch: java.lang.Throwable -> Lab
            if (r9 != 0) goto L82
            java.lang.String r9 = "scores"
            defpackage.fdbq.c(r9)     // Catch: java.lang.Throwable -> Lab
            r9 = 0
        L82:
            dnfa r1 = (defpackage.dnfa) r1     // Catch: java.lang.Throwable -> Lab
            fdev r9 = r1.e(r9, r0)     // Catch: java.lang.Throwable -> Lab
            r5.d()
            ekrg r0 = defpackage.dnfa.a
            ekrw r0 = r0.f()
            r1 = 62
            ekrw r0 = r0.h(r3, r2, r1, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.util.Iterator r1 = r9.a()
            boolean r1 = r1.hasNext()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "Has computed frecents: %b"
            r0.t(r2, r1)
            return r9
        Lab:
            r9 = move-exception
            r5.d()
            throw r9
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnew.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnew(this.f, this.g, this.h, this.i, this.j, (fcxy) obj).b(fctx.a);
    }
}
