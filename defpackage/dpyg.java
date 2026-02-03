package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpyg extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ dpyi b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ fdae d;
    final /* synthetic */ vo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpyg(dpyi dpyiVar, RecyclerView recyclerView, fdae fdaeVar, vo voVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpyiVar;
        this.c = recyclerView;
        this.d = fdaeVar;
        this.e = voVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpyg) c((List) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        List list = (List) this.a;
        dpyi dpyiVar = this.b;
        mv.a(new dpyf(dpyiVar, list)).b(new dpye(list, dpyiVar, this.c, this.d, this.e));
        dpyiVar.d = list;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dpyg dpygVar = new dpyg(this.b, this.c, this.d, this.e, fcxyVar);
        dpygVar.a = obj;
        return dpygVar;
    }
}
