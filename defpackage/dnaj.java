package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnaj extends fcyz implements fdat {
    int a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ dnau c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnaj(RecyclerView recyclerView, dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = recyclerView;
        this.c = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            RecyclerView recyclerView = this.b;
            dnau dnauVar = this.c;
            fdpl fdplVarD = dphw.d(recyclerView);
            dnai dnaiVar = new dnai(dnauVar, null);
            this.a = 1;
            if (fdpy.b(fdplVarD, dnaiVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnaj(this.b, this.c, fcxyVar);
    }
}
