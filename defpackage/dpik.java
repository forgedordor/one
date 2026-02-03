package defpackage;

import android.view.View;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpik extends fdcy {
    final /* synthetic */ dpil a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpik(Object obj, dpil dpilVar) {
        super(obj);
        this.a = dpilVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((Boolean) obj).booleanValue();
        dpil dpilVar = this.a;
        Instant instantA = dpilVar.bE().a();
        instantA.getClass();
        dpilVar.aT = instantA;
        ekrd ekrdVar = (ekrd) dpil.aJ.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$2", "afterChange", 141, "HugoFragment.kt");
        int i = fdcj.a;
        ekrdVar.C("%s loaded in %dms", new fdbi(dpilVar.getClass()).c(), dpilVar.bF().toMillis());
        fdae fdaeVar = dpilVar.aS;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
        View view = dpilVar.Q;
        if (view != null) {
            view.post(new dpii(dpilVar));
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
