package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cunn implements ehay {
    final /* synthetic */ cunu a;

    public cunn(cunu cunuVar) {
        this.a = cunuVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        this.a.ah.ifPresent(new Consumer() { // from class: cunl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.a.f.e().af((SwitchPreferenceCompat) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((eksl) ((eksl) cunu.c.j()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$2", "onLoadError", 583, "ApplicationSettingsFragmentPeer.java")).q("Failed to load expressive animations settings");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final culp culpVar = (culp) obj;
        this.a.ah.ifPresent(new Consumer() { // from class: cunm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                switchPreferenceCompat.k(culpVar.c);
                switchPreferenceCompat.G(true);
                switchPreferenceCompat.N(true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
