package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agav implements adi {
    final /* synthetic */ fdce a;
    final /* synthetic */ fdis b;
    final /* synthetic */ fdci c;

    public agav(fdce fdceVar, fdis fdisVar, fdci fdciVar) {
        this.a = fdceVar;
        this.b = fdisVar;
        this.c = fdciVar;
    }

    @Override // defpackage.adi
    public final void a(Object obj) {
        ((ekrd) agax.a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher$launch$2$1", "onActivityResult", 43, "ActivityResultLauncher.kt")).t("Activity result callback invoked. %s", obj);
        this.a.a = true;
        this.b.w(obj);
        adj adjVar = (adj) this.c.a;
        if (adjVar != null) {
            adjVar.b();
        }
    }
}
