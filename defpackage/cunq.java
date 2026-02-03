package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cunq implements ehay {
    final /* synthetic */ cunu a;

    public cunq(cunu cunuVar) {
        this.a = cunuVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        this.a.ag.ifPresent(new Consumer() { // from class: cunp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.a.f.e().af((SwitchPreferenceCompat) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((eksl) ((eksl) cunu.c.j()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$3", "onLoadError", 633, "ApplicationSettingsFragmentPeer.java")).q("Failed to load fast image sending setting");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final cqsz cqszVar = (cqsz) obj;
        this.a.ag.ifPresent(new Consumer() { // from class: cuno
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                switchPreferenceCompat.k(cqszVar.e);
                switchPreferenceCompat.G(true);
                switchPreferenceCompat.N(true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
