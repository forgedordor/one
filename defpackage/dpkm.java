package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkm extends fdcy {
    final /* synthetic */ dpkn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkm(Object obj, dpkn dpknVar) {
        super(obj);
        this.a = dpknVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpkl dpklVar = (dpkl) obj2;
        dpkl dpklVar2 = (dpkl) obj;
        if (dpklVar2 instanceof dpkj) {
            dpkj dpkjVar = (dpkj) dpklVar2;
            dpkjVar.b.d(dpkd.a);
            dpkn dpknVar = this.a;
            dpknVar.c().removeView(dpkjVar.a);
        }
        if (dpklVar instanceof dpkj) {
            dpkn dpknVar2 = this.a;
            ViewGroup viewGroupC = dpknVar2.c();
            viewGroupC.getClass();
            dpkj dpkjVar2 = (dpkj) dpklVar;
            dpku dpkuVar = dpkjVar2.a;
            if (viewGroupC.getChildCount() > 0) {
                viewGroupC.addView(dpkuVar);
            } else {
                viewGroupC.setOnHierarchyChangeListener(new dphy(viewGroupC, viewGroupC, dpkuVar));
            }
            dpkjVar2.b.d(new dpkc(dpknVar2.b, dpkjVar2.c));
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
