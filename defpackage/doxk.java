package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxk extends fcyz implements fdau {
    /* synthetic */ Object a;
    final /* synthetic */ doxo b;
    final /* synthetic */ RecyclerView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doxk(doxo doxoVar, RecyclerView recyclerView, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = doxoVar;
        this.c = recyclerView;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        doxk doxkVar = new doxk(this.b, this.c, (fcxy) obj3);
        doxkVar.a = (Size) obj;
        return doxkVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        doxo doxoVar = this.b;
        doxc doxcVarE = doxo.e(doxoVar);
        doxcVarE.getClass();
        doxoVar.bh(this.c, (Size) obj2, doxcVarE);
        return fctx.a;
    }
}
