package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agaw implements adi {
    final /* synthetic */ fdce a;
    final /* synthetic */ fdis b;
    final /* synthetic */ fdci c;

    public agaw(fdce fdceVar, fdis fdisVar, fdci fdciVar) {
        this.a = fdceVar;
        this.b = fdisVar;
        this.c = fdciVar;
    }

    @Override // defpackage.adi
    public final void a(Object obj) {
        ((ekrd) agax.a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher$retrievePendingResult$2$1", "onActivityResult", 83, "ActivityResultLauncher.kt")).t("Activity result callback invoked for pending result. %s", obj);
        this.a.a = true;
        this.b.w(obj);
        adj adjVar = (adj) this.c.a;
        if (adjVar != null) {
            adjVar.b();
        }
    }
}
