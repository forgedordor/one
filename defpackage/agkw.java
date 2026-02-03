package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkw extends fcyz implements fdat {
    int a;
    final /* synthetic */ agkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkw(agkx agkxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agkxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agkw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
    
        if (r10 != r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L11
            defpackage.fctl.b(r10)
            if (r1 == r3) goto L22
            if (r1 == r2) goto L49
            goto Lbb
        L11:
            defpackage.fctl.b(r10)
            agkx r10 = r9.b
            agkv r1 = defpackage.agkx.a
            r9.a = r3
            fcsu r10 = r10.f
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 == r0) goto Lc3
        L22:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L30
            qao r10 = new qao
            r10.<init>()
            return r10
        L30:
            eksp r10 = defpackage.agkx.b
            ekrw r10 = r10.f()
            eksl r10 = (defpackage.eksl) r10
            java.lang.String r1 = "Birthday Nudge Sync worker triggered"
            r10.q(r1)
            agkx r10 = r9.b
            r9.a = r2
            aglb r10 = r10.g
            java.lang.Object r10 = r10.a(r9)
            if (r10 == r0) goto Lc3
        L49:
            agkx r10 = r9.b
            pzy r1 = defpackage.pzy.c
            ejxr r2 = defpackage.agkx.d
            java.lang.Object r2 = r2.get()
            cczi r2 = (defpackage.cczi) r2
            java.lang.Object r2 = r2.e()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            ejxr r4 = defpackage.agkx.c
            java.lang.Object r4 = r4.get()
            cczi r4 = (defpackage.cczi) r4
            java.lang.Object r4 = r4.e()
            r4.getClass()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r1.getClass()
            java.lang.Class<agkx> r6 = defpackage.agkx.class
            egsj r6 = defpackage.egsn.n(r6)
            egsb r7 = new egsb
            java.lang.String r8 = "BIRTHDAY_NUDGE_SYNC_WORKER"
            r7.<init>(r8, r1)
            r6.g(r7)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            egsa r7 = new egsa
            r7.<init>(r2, r1)
            r1 = r6
            egrx r1 = (defpackage.egrx) r1
            r1.c = r7
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            egsa r2 = new egsa
            r2.<init>(r4, r1)
            egrz r1 = new egrz
            ejud r3 = defpackage.ejud.a
            r1.<init>(r2, r3)
            r6.e(r1)
            egsn r1 = r6.h()
            egsh r10 = r10.h
            com.google.common.util.concurrent.ListenableFuture r10 = r10.c(r1)
            r1 = 3
            r9.a = r1
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 != r0) goto Lbb
            goto Lc3
        Lbb:
            java.util.UUID r10 = (java.util.UUID) r10
            qao r10 = new qao
            r10.<init>()
            return r10
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agkw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agkw(this.b, fcxyVar);
    }
}
