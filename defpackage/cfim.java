package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfim extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfik b;
    final /* synthetic */ Object c;
    final /* synthetic */ ezol d;
    final /* synthetic */ fdap e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfim(fcxy fcxyVar, cfik cfikVar, Object obj, ezol ezolVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = cfikVar;
        this.c = obj;
        this.d = ezolVar;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfim) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
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
            r2 = 2
            r3 = 1
            java.lang.String r4 = "invokeSuspend"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl$doWorkIfChecksPassAsync$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "BugleGDitto"
            java.lang.String r7 = "GaiaDittoBindManagerImpl.kt"
            if (r1 == 0) goto L19
            defpackage.fctl.b(r9)
            if (r1 == r3) goto L30
            if (r1 == r2) goto L6c
            goto Le8
        L19:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.f
            fdjx r9 = (defpackage.fdjx) r9
            cfik r9 = r8.b
            bvll r9 = r9.d
            eiju r9 = r9.j()
            r8.a = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto Lf4
        L30:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5c
            cfik r9 = r8.b
            ekrg r9 = r9.g
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r6)
            r0 = 204(0xcc, float:2.86E-43)
            ekrw r9 = r9.h(r5, r4, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Gaia pairing not available for GDitto"
            r9.q(r0)
            java.lang.Object r9 = r8.c
            eiju r9 = defpackage.eijx.e(r9)
            r9.getClass()
            return r9
        L5c:
            cfik r9 = r8.b
            bvll r9 = r9.d
            eiju r9 = r9.e()
            r8.a = r2
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto Lf4
        L6c:
            ezol r1 = r8.d
            java.lang.String r9 = (java.lang.String) r9
            if (r1 == 0) goto L9e
            java.lang.String r2 = r1.c
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L9e
            cfik r9 = r8.b
            ekrg r9 = r9.g
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r6)
            r0 = 209(0xd1, float:2.93E-43)
            ekrw r9 = r9.h(r5, r4, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Gaia pairing email and receiver id don't match for GDitto"
            r9.q(r0)
            java.lang.Object r9 = r8.c
            eiju r9 = defpackage.eijx.e(r9)
            r9.getClass()
            return r9
        L9e:
            if (r1 != 0) goto Ld6
            cfik r1 = r8.b
            fcsu r2 = r1.f
            java.lang.Object r2 = r2.b()
            bvkr r2 = (defpackage.bvkr) r2
            j$.util.Optional r3 = j$.util.Optional.of(r9)
            boolean r2 = r2.p(r3)
            if (r2 != 0) goto Ld6
            ekrg r9 = r1.g
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r6)
            r0 = 215(0xd7, float:3.01E-43)
            ekrw r9 = r9.h(r5, r4, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "no pairings found for GDitto"
            r9.q(r0)
            java.lang.Object r9 = r8.c
            eiju r9 = defpackage.eijx.e(r9)
            r9.getClass()
            return r9
        Ld6:
            cfik r1 = r8.b
            egej r1 = r1.e
            com.google.common.util.concurrent.ListenableFuture r9 = r1.c(r9)
            r1 = 3
            r8.a = r1
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 != r0) goto Le8
            goto Lf4
        Le8:
            fdap r0 = r8.e
            efwo r9 = (defpackage.efwo) r9
            r9.getClass()
            java.lang.Object r9 = r0.invoke(r9)
            return r9
        Lf4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfim cfimVar = new cfim(fcxyVar, this.b, this.c, this.d, this.e);
        cfimVar.f = obj;
        return cfimVar;
    }
}
