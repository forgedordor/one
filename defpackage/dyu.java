package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyu extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ fdau d;
    final /* synthetic */ fdap e;
    final /* synthetic */ dwr f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyu(fdjx fdjxVar, fdau fdauVar, fdap fdapVar, dwr dwrVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdjxVar;
        this.d = fdauVar;
        this.e = fdapVar;
        this.f = dwrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyu) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L12
            java.lang.Object r0 = r9.g
            fdlr r0 = (defpackage.fdlr) r0
            defpackage.fctl.b(r10)
            goto L69
        L12:
            java.lang.Object r1 = r9.a
            java.lang.Object r2 = r9.g
            ire r2 = (defpackage.ire) r2
            defpackage.fctl.b(r10)
            goto L44
        L1c:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.g
            ire r10 = (defpackage.ire) r10
            fdjx r1 = r9.c
            fdau r4 = defpackage.dzm.a
            dwr r4 = r9.f
            fdjz r5 = defpackage.fdjz.d
            dyt r6 = new dyt
            r6.<init>(r4, r3)
            fdlr r1 = defpackage.fdil.d(r1, r3, r5, r6, r2)
            r9.g = r10
            r9.a = r1
            r9.b = r2
            r2 = 3
            java.lang.Object r2 = defpackage.dzm.g(r10, r3, r9, r2)
            if (r2 == r0) goto L98
            r8 = r2
            r2 = r10
            r10 = r8
        L44:
            ise r10 = (defpackage.ise) r10
            r10.b()
            fdau r4 = r9.d
            fdau r5 = defpackage.dzm.a
            if (r4 == r5) goto L5b
            fdjx r5 = r9.c
            dwr r6 = r9.f
            dyq r7 = new dyq
            r7.<init>(r4, r6, r10, r3)
            defpackage.dzm.j(r5, r1, r7)
        L5b:
            r9.g = r1
            r9.a = r3
            r10 = 2
            r9.b = r10
            java.lang.Object r10 = defpackage.dzm.l(r2, r9)
            if (r10 == r0) goto L98
            r0 = r1
        L69:
            ise r10 = (defpackage.ise) r10
            if (r10 != 0) goto L7a
            fdjx r10 = r9.c
            dwr r1 = r9.f
            dyr r2 = new dyr
            r2.<init>(r1, r3)
            defpackage.dzm.j(r10, r0, r2)
            goto L95
        L7a:
            r10.b()
            fdjx r1 = r9.c
            dwr r2 = r9.f
            dys r4 = new dys
            r4.<init>(r2, r3)
            defpackage.dzm.j(r1, r0, r4)
            fdap r0 = r9.e
            ihs r1 = new ihs
            long r2 = r10.c
            r1.<init>(r2)
            r0.invoke(r1)
        L95:
            fctx r10 = defpackage.fctx.a
            return r10
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dyu dyuVar = new dyu(this.c, this.d, this.e, this.f, fcxyVar);
        dyuVar.g = obj;
        return dyuVar;
    }
}
