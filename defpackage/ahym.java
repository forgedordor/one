package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahym extends fcyz implements fdap {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;
    final /* synthetic */ aiaf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahym(ahzi ahziVar, UUID uuid, aiaf aiafVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
        this.d = aiafVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r8.g(r7) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L14
            if (r1 == r2) goto L14
            defpackage.fctl.b(r8)
            goto L84
        L14:
            defpackage.fctl.b(r8)
            goto L68
        L18:
            defpackage.fctl.b(r8)
            goto L2d
        L1c:
            defpackage.fctl.b(r8)
            ahzi r8 = r7.b
            java.util.UUID r1 = r7.c
            enzp r5 = defpackage.enzp.DO_COMPLETE_RESTORE
            r7.a = r4
            java.lang.Object r8 = defpackage.ahzi.r(r8, r5, r1, r7)
            if (r8 == r0) goto L87
        L2d:
            ahzi r8 = r7.b
            java.lang.Integer r1 = new java.lang.Integer
            r4 = 5
            r1.<init>(r4)
            java.util.UUID r4 = r7.c
            ahzu r5 = r8.o
            java.lang.String r6 = "Finalizing restore execution: workflowVersion: [%s] sessionId: [%s]"
            r5.i(r6, r1, r4)
            aiaf r1 = r7.d
            boolean r5 = defpackage.ahuj.a(r1)
            if (r5 == 0) goto L57
            fcsu r8 = r8.b
            java.lang.Object r8 = r8.b()
            ahwd r8 = (defpackage.ahwd) r8
            r7.a = r3
            java.lang.Object r8 = r8.s(r4, r1, r7)
            if (r8 == r0) goto L87
            goto L68
        L57:
            fcsu r8 = r8.b
            java.lang.Object r8 = r8.b()
            ahwd r8 = (defpackage.ahwd) r8
            r7.a = r2
            java.lang.Object r8 = r8.f(r4, r1, r7)
            if (r8 != r0) goto L68
            goto L87
        L68:
            ahzi r8 = r7.b
            arjj r1 = r8.m
            boolean r1 = r1.a()
            if (r1 == 0) goto L84
            fcsu r8 = r8.n
            java.lang.Object r8 = r8.b()
            cobl r8 = (defpackage.cobl) r8
            r1 = 4
            r7.a = r1
            java.lang.Object r8 = r8.g(r7)
            if (r8 != r0) goto L84
            goto L87
        L84:
            fctx r8 = defpackage.fctx.a
            return r8
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahym.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahym(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
