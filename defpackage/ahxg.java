package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxg extends fcyz implements fdap {
    int a;
    final /* synthetic */ ahxy b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxg(ahxy ahxyVar, UUID uuid, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ahxyVar;
        this.c = uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r7.s(r1, r2, r6) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[PHI: r7
      0x0078: PHI (r7v21 java.lang.Object) = (r7v20 java.lang.Object), (r7v0 java.lang.Object) binds: [B:19:0x0076, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 == r4) goto L17
            defpackage.fctl.b(r7)
            if (r1 == r3) goto L78
            if (r1 == r2) goto La0
            goto Lb8
        L17:
            defpackage.fctl.b(r7)
            goto L64
        L1b:
            defpackage.fctl.b(r7)
            goto L36
        L1f:
            defpackage.fctl.b(r7)
            ahxy r7 = r6.b
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            ahwd r7 = (defpackage.ahwd) r7
            java.util.UUID r1 = r6.c
            r6.a = r5
            java.lang.Object r7 = r7.o(r1, r6)
            if (r7 == r0) goto Ld2
        L36:
            r7.getClass()
            ahto r7 = (defpackage.ahto) r7
            aiaf r7 = r7.c
            aiaf r1 = defpackage.aiaf.CREATED
            if (r7 != r1) goto L64
            java.lang.String[] r7 = defpackage.bmkn.a
            bmkd r7 = new bmkd
            r7.<init>()
            r7.e()
            r7.d()
            ahxy r7 = r6.b
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            ahwd r7 = (defpackage.ahwd) r7
            java.util.UUID r1 = r6.c
            aiaf r5 = defpackage.aiaf.DATABASE_RESTORING
            r6.a = r4
            java.lang.Object r7 = r7.s(r1, r5, r6)
            if (r7 == r0) goto Ld2
        L64:
            ahxy r7 = r6.b
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            ahwd r7 = (defpackage.ahwd) r7
            java.util.UUID r1 = r6.c
            r6.a = r3
            java.lang.Object r7 = r7.n(r1, r6)
            if (r7 == r0) goto Ld2
        L78:
            aiad r7 = (defpackage.aiad) r7
            r1 = 0
            if (r7 == 0) goto L86
            java.lang.String r7 = r7.e
            if (r7 == 0) goto L86
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
        L86:
            if (r1 == 0) goto Lbb
            ahxy r7 = r6.b
            fcsu r3 = r7.e
            java.lang.Object r3 = r3.b()
            ayso r3 = (defpackage.ayso) r3
            r6.a = r2
            ahtq r7 = r7.k
            ahzj r7 = (defpackage.ahzj) r7
            azvv r7 = r7.a
            java.lang.Object r7 = r3.a(r1, r7, r6)
            if (r7 == r0) goto Ld2
        La0:
            ahxy r7 = r6.b
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            ahwd r7 = (defpackage.ahwd) r7
            java.util.UUID r1 = r6.c
            aiaf r2 = defpackage.aiaf.DATABASE_RESTORE_COMPLETE
            r3 = 5
            r6.a = r3
            java.lang.Object r7 = r7.s(r1, r2, r6)
            if (r7 != r0) goto Lb8
            goto Ld2
        Lb8:
            fctx r7 = defpackage.fctx.a
            return r7
        Lbb:
            ahxy r7 = r6.b
            java.util.UUID r0 = r6.c
            enzp r1 = defpackage.enzp.DO_BUGLE_DATABASE_RESTORE
            r7.k(r1, r0)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ActiveRestoreExecution found for sessionId ["
            java.lang.String r2 = "]"
            java.lang.String r0 = defpackage.a.h(r0, r1, r2)
            r7.<init>(r0)
            throw r7
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahxg(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
