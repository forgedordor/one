package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnai extends fcyz implements fdat {
    /* synthetic */ int a;
    final /* synthetic */ dnau b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnai(dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnai) c(Integer.valueOf(((Number) obj).intValue()), (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            defpackage.fctl.b(r6)
            dnau r6 = r5.b
            int r0 = r5.a
            dmys r1 = r6.b()
            android.support.v7.widget.RecyclerView r6 = r6.b
            r2 = 0
            if (r6 != 0) goto L16
            java.lang.String r6 = "recyclerView"
            defpackage.fdbq.c(r6)
            r6 = r2
        L16:
            r6.getClass()
            dmyg r3 = r1.c
            if (r3 == 0) goto L34
            fctc r4 = r1.e
            java.lang.Object r4 = r4.a()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r0 < r4) goto L2c
            r3 = r2
        L2c:
            if (r3 == 0) goto L34
            dmyp r4 = new dmyp
            r4.<init>(r3)
            goto L36
        L34:
            dmyo r4 = defpackage.dmyo.a
        L36:
            r1.f = r4
            dmyq r3 = r1.f
            if (r3 != 0) goto L42
            java.lang.String r3 = "gridState"
            defpackage.fdbq.c(r3)
            goto L43
        L42:
            r2 = r3
        L43:
            dmyo r3 = defpackage.dmyo.a
            boolean r3 = defpackage.fdbq.f(r2, r3)
            if (r3 == 0) goto L87
            android.content.Context r0 = r1.a
            android.content.res.Resources r0 = r0.getResources()
            dmyw r2 = r1.d
            int r2 = r2.c
            int r0 = r0.getDimensionPixelSize(r2)
            wb r2 = r6.o
            boolean r2 = r2 instanceof android.support.v7.widget.GridLayoutManager
            if (r2 != 0) goto Ld9
            dqai r2 = r1.c()
            r2.b(r6)
            dqav r1 = r1.b
            dqay r2 = new dqay
            dqbf r3 = new dqbf
            r3.<init>(r0)
            dmyh r0 = new dmyh
            r0.<init>()
            r2.<init>(r3, r0)
            com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager r0 = r1.a(r2)
            r6.ao(r0)
            dmyi r0 = new dmyi
            r0.<init>()
            r6.post(r0)
            goto Ld9
        L87:
            boolean r3 = r2 instanceof defpackage.dmyp
            if (r3 == 0) goto Ldc
            dmyp r2 = (defpackage.dmyp) r2
            dmyg r2 = r2.a
            dmyw r3 = r1.d
            boolean r3 = r3.j
            wb r4 = r6.o
            boolean r4 = r4 instanceof com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager
            if (r4 != 0) goto Lb0
            com.google.android.libraries.compose.cameragallery.ui.grid.CameraGalleryGridStateController$setUpSpannedGrid$1$1 r4 = new com.google.android.libraries.compose.cameragallery.ui.grid.CameraGalleryGridStateController$setUpSpannedGrid$1$1
            r4.<init>(r2, r3)
            r6.ao(r4)
            dqai r3 = r1.c()
            r3.a(r6)
            dmyj r3 = new dmyj
            r3.<init>()
            r6.post(r3)
        Lb0:
            dqai r1 = r1.c()
            r1.getClass()
            int r1 = r1.a
            int r0 = r0 - r1
            android.util.Size r1 = new android.util.Size
            int r3 = r0 / 6
            int r3 = r3 + r3
            r1.<init>(r3, r3)
            r2.b = r1
            int r0 = r0 / 2
            r2.c = r0
            dmir r1 = r2.a
            dofn r1 = r1.a
            int r0 = r1.a(r0)
            r2.d = r0
            vo r6 = r6.n
            if (r6 == 0) goto Ld9
            r6.p()
        Ld9:
            fctx r6 = defpackage.fctx.a
            return r6
        Ldc:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnai.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnai dnaiVar = new dnai(this.b, fcxyVar);
        dnaiVar.a = ((Number) obj).intValue();
        return dnaiVar;
    }
}
