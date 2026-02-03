package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxk extends fcyz implements fdap {
    int a;
    final /* synthetic */ ahxy b;
    final /* synthetic */ UUID c;
    final /* synthetic */ aiaf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxk(ahxy ahxyVar, UUID uuid, aiaf aiafVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ahxyVar;
        this.c = uuid;
        this.d = aiafVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r9.f(r1, r3, r8) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r9.s(r1, r3, r8) == r0) goto L12;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Lb
            goto L5f
        Lb:
            ahxy r9 = r8.b
            java.util.UUID r1 = r8.c
            enzp r3 = defpackage.enzp.DO_COMPLETE_RESTORE
            defpackage.ahxy.l(r9, r3, r1)
            ekrg r3 = defpackage.ahxy.a
            ekrw r3 = r3.h()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "BugleRestore"
            r3.X(r4, r5)
            r4 = 253(0xfd, float:3.55E-43)
            java.lang.String r5 = "BasicRestoreWorkflowSteps.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$doCompleteRestore$2"
            java.lang.String r7 = "invokeSuspend"
            ekrw r3 = r3.h(r6, r7, r4, r5)
            ekrd r3 = (defpackage.ekrd) r3
            java.lang.String r4 = "Finalizing restore execution [%s]"
            r3.t(r4, r1)
            aiaf r3 = r8.d
            boolean r4 = defpackage.ahuj.a(r3)
            if (r4 == 0) goto L4d
            fcsu r9 = r9.b
            java.lang.Object r9 = r9.b()
            ahwd r9 = (defpackage.ahwd) r9
            r8.a = r2
            java.lang.Object r9 = r9.s(r1, r3, r8)
            if (r9 != r0) goto L5f
            goto L5e
        L4d:
            fcsu r9 = r9.b
            java.lang.Object r9 = r9.b()
            ahwd r9 = (defpackage.ahwd) r9
            r2 = 2
            r8.a = r2
            java.lang.Object r9 = r9.f(r1, r3, r8)
            if (r9 != r0) goto L5f
        L5e:
            return r0
        L5f:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahxk(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
