package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpca implements dpje {
    final /* synthetic */ dpcf a;

    public dpca(dpcf dpcfVar) {
        this.a = dpcfVar;
    }

    @Override // defpackage.dpje
    public final void a(int i) {
        ((ekrd) dpcf.b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl$keyboardStateListener$1", "onKeyboardHeightChanged", 163, "HugoManagerImpl.kt")).r("Keyboard height changed to %d", i);
        dpcf dpcfVar = this.a;
        dpcfVar.j.a(i);
        dpcf.r(dpcfVar, i, 0, 2);
    }

    @Override // defpackage.dpje
    public final void b(dpjd dpjdVar) {
        dpjdVar.getClass();
        ((ekrd) dpcf.b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl$keyboardStateListener$1", "onKeyboardStateChanged", 156, "HugoManagerImpl.kt")).t("Keyboard state switched to %s", dpjdVar);
        dpcf dpcfVar = this.a;
        dpcfVar.g.f(dpjdVar);
        dpcfVar.j.b(dpjdVar);
        dpcf.r(dpcfVar, 0, 0, 3);
    }
}
