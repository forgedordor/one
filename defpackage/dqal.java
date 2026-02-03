package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqal extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqan b;
    final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqal(dqan dqanVar, Integer num, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqanVar;
        this.c = num;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdplVarD;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqan dqanVar = this.b;
            int iIntValue = ((Number) dqanVar.e.invoke(dqanVar.d)).intValue();
            RecyclerView recyclerView = dqanVar.c;
            if (iIntValue == 0) {
                ((ekrd) dqan.b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver$attach$2", "invokeSuspend", 58, "LayoutManagerSizeObserver.kt")).q("Started observing height of RecyclerView");
                fdplVarD = fdqq.a(new dphm(dphw.b(recyclerView)));
            } else {
                ((ekrd) dqan.b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver$attach$2", "invokeSuspend", 61, "LayoutManagerSizeObserver.kt")).q("Started observing width of RecyclerView");
                fdplVarD = dphw.d(recyclerView);
            }
            fdrn fdrnVar = new fdrn(fdplVarD, new dqaj(this.c, null));
            dqak dqakVar = new dqak(dqanVar);
            this.a = 1;
            if (fdrnVar.a(dqakVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqal(this.b, this.c, fcxyVar);
    }
}
