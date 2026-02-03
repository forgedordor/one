package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenn extends fcyz implements fdat {
    int a;
    final /* synthetic */ aubq b;
    final /* synthetic */ ceno c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cenn(fcxy fcxyVar, aubq aubqVar, ceno cenoVar) {
        super(2, fcxyVar);
        this.b = aubqVar;
        this.c = cenoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cenn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        if (defpackage.fdxs.c(r10, r9) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L12
            defpackage.fctl.b(r10)
            goto Lc4
        L12:
            java.lang.Object r1 = r9.d
            java.lang.String r1 = (java.lang.String) r1
            defpackage.fctl.b(r10)
            goto L64
        L1a:
            java.lang.Object r1 = r9.d
            java.lang.String r1 = (java.lang.String) r1
            defpackage.fctl.b(r10)
            goto L54
        L22:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.d
            fdjx r10 = (defpackage.fdjx) r10
            aubq r10 = r9.b
            java.lang.String r10 = r10.d
            r10.getClass()
            int r1 = r10.length()
            if (r1 <= 0) goto Lc8
            ceno r1 = r9.c
            fcsu r1 = r1.g
            java.lang.Object r1 = r1.b()
            cejj r1 = (defpackage.cejj) r1
            eiju r1 = r1.e(r10, r2)
            r1.getClass()
            r9.d = r10
            r9.a = r4
            java.lang.Object r1 = defpackage.fdxs.c(r1, r9)
            if (r1 == r0) goto Lc7
            r8 = r1
            r1 = r10
            r10 = r8
        L54:
            cejg r10 = (defpackage.cejg) r10
            eiju r10 = r10.y()
            r9.d = r1
            r9.a = r3
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 == r0) goto Lc7
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate$bindToTachyonForPhone$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "BugleNetwork"
            java.lang.String r6 = "TachyonTachygramBindDelegate.kt"
            if (r10 != 0) goto L8f
            ekrg r10 = defpackage.ceno.a
            ekrw r10 = r10.j()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            r0 = 87
            ekrw r10 = r10.h(r4, r3, r0, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Skip Phone bind because the MSISDN is not registered for Tachyon"
            r10.q(r0)
            fctx r10 = defpackage.fctx.a
            return r10
        L8f:
            ekrg r10 = defpackage.ceno.a
            ekrw r10 = r10.h()
            ekrz r7 = defpackage.eksq.a
            r10.X(r7, r5)
            r5 = 90
            ekrw r10 = r10.h(r4, r3, r5, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r3 = "Bind to Tachyon for phone on foregrounding"
            r10.q(r3)
            ceno r10 = r9.c
            fcsu r10 = r10.h
            java.lang.Object r10 = r10.b()
            cfzf r10 = (defpackage.cfzf) r10
            eiju r10 = r10.e(r1)
            r10.getClass()
            r1 = 0
            r9.d = r1
            r9.a = r2
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 != r0) goto Lc4
            goto Lc7
        Lc4:
            fctx r10 = defpackage.fctx.a
            return r10
        Lc7:
            return r0
        Lc8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cenn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cenn cennVar = new cenn(fcxyVar, this.b, this.c);
        cennVar.d = obj;
        return cennVar;
    }
}
