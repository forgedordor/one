package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfx extends fdcy {
    final /* synthetic */ dpfy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfx(dpfy dpfyVar) {
        super(null);
        this.a = dpfyVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpfw dpfwVar = (dpfw) obj2;
        dpfw dpfwVar2 = (dpfw) obj;
        if (dpfwVar2 != null) {
            dpfy dpfyVar = this.a;
            dnhm dnhmVar = dpfyVar.d;
            if (dnhmVar != null) {
                dpfyVar.e.o(dnhmVar);
            }
            List list = dpfyVar.b;
            dpfe dpfeVar = dpfyVar.e;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dpfeVar.n((dnjl) it.next());
            }
            dpfv dpfvVar = dpfyVar.c;
            if (dpfvVar != null) {
                ley.s(dpfwVar2.a, dpfvVar.a(), null);
            }
            dpfeVar.q(null);
        }
        if (dpfwVar != null) {
            dpfy dpfyVar2 = this.a;
            dnjn dnjnVar = dpfwVar.b;
            dpfe dpfeVar2 = dpfyVar2.e;
            dpfeVar2.q(dnjnVar);
            dnhm dnhmVar2 = dpfyVar2.d;
            if (dnhmVar2 != null) {
                dpfeVar2.m(dnhmVar2);
            }
            Iterator it2 = dpfyVar2.b.iterator();
            while (it2.hasNext()) {
                dpfeVar2.l((dnjl) it2.next());
            }
            final dpfv dpfvVar2 = dpfyVar2.c;
            if (dpfvVar2 != null) {
                ley.s(dpfwVar.a, dpfvVar2.a(), new ldo() { // from class: dpft
                    @Override // defpackage.ldo
                    public final lcw a(View view, lcw lcwVar) {
                        view.getClass();
                        return (lcw) dpfvVar2.b.invoke(lcwVar);
                    }
                });
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
