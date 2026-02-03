package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxn extends fcyz implements fdat {
    int a;
    final /* synthetic */ doxo b;
    final /* synthetic */ doxa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doxn(doxo doxoVar, doxa doxaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doxoVar;
        this.c = doxaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doxn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            doxo doxoVar = this.b;
            doxa doxaVar = this.c;
            doyh doyhVarF = doxoVar.f();
            View view = doxoVar.d;
            if (view == null) {
                fdbq.c("rootView");
                view = null;
            }
            this.a = 1;
            if (doyhVarF.G(doxaVar, view, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doxn(this.b, this.c, fcxyVar);
    }
}
