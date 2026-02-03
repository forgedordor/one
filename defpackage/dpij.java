package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpij extends fdcy {
    final /* synthetic */ dpil a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpij(dpil dpilVar) {
        super(null);
        this.a = dpilVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpim dpimVar = (dpim) obj2;
        dpil dpilVar = this.a;
        fctc fctcVar = dpilVar.aR;
        if (fctcVar.b()) {
            ekrd ekrdVar = (ekrd) dpil.aJ.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 73, "HugoFragment.kt");
            Class<?> cls = dpilVar.getClass();
            int i = fdcj.a;
            ekrdVar.t("%s configuration changed, updating flow", new fdbi(cls).c());
            ((fduf) fctcVar.a()).f(dpimVar == null ? dpilVar.bB() : dpimVar);
        } else {
            ekrd ekrdVar2 = (ekrd) dpil.aJ.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 78, "HugoFragment.kt");
            Class<?> cls2 = dpilVar.getClass();
            int i2 = fdcj.a;
            ekrdVar2.t("%s configuration changed, but flow is not initialized", new fdbi(cls2).c());
        }
        if (!dpilVar.bK() || !dpilVar.gC()) {
            ((ekrd) dpil.aJ.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 86, "HugoFragment.kt")).t("%s configuration changed but screen does not support using updated configuration", new fdbi(dpilVar.getClass()).c());
        } else {
            ((ekrd) dpil.aJ.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 81, "HugoFragment.kt")).t("%s configuration changed, notifying screen", new fdbi(dpilVar.getClass()).c());
            dpilVar.gB(dpimVar);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
