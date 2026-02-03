package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwi implements ehay {
    final /* synthetic */ agwh a;

    public agwi(agwh agwhVar) {
        this.a = agwhVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ehax.a(th);
        ((ekrd) ((ekrd) agwh.a.j()).g(th).h("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl$settingReadSubscriptionMixinCallback$1", "onLoadError", 83, "PenpalEntryPointImpl.kt")).q("Failed to get the Penpal entrypoint setting");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            agwh agwhVar = this.a;
            agwhVar.f = zBooleanValue;
            agwhVar.d.invoke();
        }
    }
}
