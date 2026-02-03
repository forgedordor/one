package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daac extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ daae f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daac(daae daaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = daaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daac) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0085 -> B:11:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.e
            if (r1 == 0) goto L13
            java.lang.Object r1 = r7.d
            java.lang.Object r2 = r7.c
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            defpackage.fctl.b(r8)
            goto L88
        L13:
            defpackage.fctl.b(r8)
            daae r8 = r7.f
            fcww r1 = new fcww
            r2 = 0
            r1.<init>(r2)
            dach r2 = r8.c
            r3 = 0
            com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem r3 = r2.f(r3)
            r1.add(r3)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r3 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r4 = 2
            r3.<init>(r4)
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r3 = r2.b(r3)
            r1.add(r3)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r3 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r4 = 3
            r3.<init>(r4)
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r3 = r2.b(r3)
            r1.add(r3)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r3 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r4 = 5
            r3.<init>(r4)
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r3 = r2.b(r3)
            r1.add(r3)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r3 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r4 = 4
            r3.<init>(r4)
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r2 = r2.b(r3)
            r1.add(r2)
            java.util.Set r2 = r8.d
            java.util.Iterator r2 = r2.iterator()
            r4 = r8
            r3 = r1
            r1 = r2
            r2 = r3
        L66:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto La3
            java.lang.Object r8 = r1.next()
            daaw r8 = (defpackage.daaw) r8
            eiju r8 = r8.a()
            r7.a = r4
            r7.b = r3
            r7.c = r2
            r7.d = r1
            r5 = 1
            r7.e = r5
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L88
            return r0
        L88:
            byar r8 = (defpackage.byar) r8
            boolean r5 = r8.d
            if (r5 == 0) goto L66
            r8.getClass()
            r5 = r4
            daae r5 = (defpackage.daae) r5
            dach r5 = r5.c
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationListSearchFilter r6 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationListSearchFilter
            r6.<init>(r8)
            com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem r8 = r5.d(r6)
            r2.add(r8)
            goto L66
        La3:
            java.util.List r8 = defpackage.fcva.a(r3)
            daab r0 = new daab
            r0.<init>()
            java.util.List r8 = defpackage.fcva.al(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daac.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daac(this.f, fcxyVar);
    }
}
