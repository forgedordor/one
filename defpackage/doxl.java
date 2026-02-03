package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxl implements fdpm {
    final /* synthetic */ doxo a;
    final /* synthetic */ RecyclerView b;

    public doxl(doxo doxoVar, RecyclerView recyclerView) {
        this.a = doxoVar;
        this.b = recyclerView;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        doxo doxoVar = this.a;
        doxc doxcVarE = doxo.e(doxoVar);
        doxcVarE.getClass();
        doxoVar.bh(this.b, (Size) obj, doxcVarE);
        return fctx.a;
    }
}
