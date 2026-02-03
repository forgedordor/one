package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyx extends fcyz implements fdap {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;
    final /* synthetic */ aiba d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyx(ahzi ahziVar, UUID uuid, aiba aibaVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
        this.d = aibaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r7.r(r1, r2, r6) == r0) goto L13;
     */
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
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L28
            goto L40
        Ld:
            ahzi r7 = r6.b
            java.lang.Integer r1 = new java.lang.Integer
            r3 = 5
            r1.<init>(r3)
            java.util.UUID r3 = r6.c
            ahzu r4 = r7.o
            java.lang.String r5 = "Starting new Restore Execution: workflowVersion: [%s] sessionId: [%s]"
            r4.i(r5, r1, r3)
            enzp r1 = defpackage.enzp.INITIALIZE_RESTORE_WORKFLOW
            r6.a = r2
            java.lang.Object r7 = defpackage.ahzi.q(r7, r1, r3, r6)
            if (r7 == r0) goto L43
        L28:
            ahzi r7 = r6.b
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            ahwd r7 = (defpackage.ahwd) r7
            java.util.UUID r1 = r6.c
            aiba r2 = r6.d
            r3 = 2
            r6.a = r3
            java.lang.Object r7 = r7.r(r1, r2, r6)
            if (r7 != r0) goto L40
            goto L43
        L40:
            fctx r7 = defpackage.fctx.a
            return r7
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahyx(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
