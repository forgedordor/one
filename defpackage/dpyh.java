package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpyi b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ fdae d;
    final /* synthetic */ vo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpyh(dpyi dpyiVar, RecyclerView recyclerView, fdae fdaeVar, vo voVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpyiVar;
        this.c = recyclerView;
        this.d = fdaeVar;
        this.e = voVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpyh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [fdpl, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dpyi dpyiVar = this.b;
            RecyclerView recyclerView = this.c;
            fdae fdaeVar = this.d;
            vo voVar = this.e;
            ?? Invoke = dpyiVar.c.invoke();
            dpyg dpygVar = new dpyg(dpyiVar, recyclerView, fdaeVar, voVar, null);
            this.a = 1;
            if (fdpy.b(Invoke, dpygVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpyh(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
