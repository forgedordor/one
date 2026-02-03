package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxj extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ doxo c;
    final /* synthetic */ RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doxj(doxo doxoVar, RecyclerView recyclerView, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = doxoVar;
        this.d = recyclerView;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        doxj doxjVar = new doxj(this.c, this.d, (fcxy) obj3);
        doxjVar.a = (Size) obj;
        doxjVar.b = (doxc) obj2;
        return doxjVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        obj3.getClass();
        doxo doxoVar = this.c;
        doxoVar.bh(this.d, (Size) obj2, (doxc) obj3);
        return fctx.a;
    }
}
