package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqj implements caar {
    private final cpsn a;
    private final bveg b;
    private final aypg c;

    public caqj(cpsn cpsnVar, bveg bvegVar, aypg aypgVar) {
        bvegVar.getClass();
        aypgVar.getClass();
        this.a = cpsnVar;
        this.b = bvegVar;
        this.c = aypgVar;
    }

    @Override // defpackage.caas
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((capz) obj).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (defpackage.fdxs.c(r1, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.caqk r19, defpackage.capz r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.caqi
            if (r2 == 0) goto L17
            r2 = r1
            caqi r2 = (defpackage.caqi) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            caqi r2 = new caqi
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            defpackage.fctl.b(r1)
            goto L96
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            defpackage.fctl.b(r1)
            goto L51
        L3a:
            defpackage.fctl.b(r1)
            cpmc r1 = r19.fr()
            r4 = r20
            java.lang.String r4 = r4.c
            eiju r1 = r1.q(r4)
            r2.c = r6
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto L9b
        L51:
            cpsn r4 = r0.a
            eqnd r1 = (defpackage.eqnd) r1
            cptg r4 = r4.a(r1)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r6 = r4.a()
            java.util.List r4 = r4.c()
            bveg r7 = r0.b
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9 = r7.c(r6, r4)
            cpyi r4 = defpackage.cpyi.CMS_RESTORE_IN_PROGRESS
            r9.br(r4)
            aypg r8 = r0.c
            evvp r1 = r1.n
            if (r1 != 0) goto L74
            evvp r1 = defpackage.evvp.a
        L74:
            long r15 = defpackage.evxc.a(r1)
            j$.util.Optional r14 = j$.util.Optional.empty()
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = -1
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r1 = r8.a(r9, r10, r11, r12, r13, r14, r15, r17)
            eiju r1 = r1.p()
            r1.getClass()
            r2.c = r5
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 != r3) goto L96
            goto L9b
        L96:
            cbcw r1 = defpackage.cbcw.i()
            return r1
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caqj.b(caqk, capz, fcxy):java.lang.Object");
    }

    @Override // defpackage.caar
    public final /* bridge */ /* synthetic */ Object d(Object obj, cayy cayyVar, Object obj2, fcxy fcxyVar) {
        return b((caqk) obj, (capz) obj2, fcxyVar);
    }
}
