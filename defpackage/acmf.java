package defpackage;

import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acmf implements crmf {
    final /* synthetic */ acme a;

    public acmf(acme acmeVar) {
        this.a = acmeVar;
    }

    @Override // defpackage.crmf
    public final void a() {
        acme acmeVar = this.a;
        ((eksl) acmeVar.l.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$2", "onDenied", 598, "AdvancedFeedbackFragmentPeer.java")).q("Location permission denied");
        for (AdvancedFeedbackDataView advancedFeedbackDataView : acmeVar.k) {
            Optional optionalF = advancedFeedbackDataView.f();
            if (optionalF.isPresent()) {
                if (optionalF.get().getClass() == acmeVar.o.getClass()) {
                    advancedFeedbackDataView.g.setChecked(false);
                }
            }
        }
    }

    @Override // defpackage.crmf
    public final void b() {
        acme acmeVar = this.a;
        ((eksl) acmeVar.l.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$2", "onGranted", 592, "AdvancedFeedbackFragmentPeer.java")).q("Location permission granted");
        acmeVar.b();
    }

    @Override // defpackage.crmf
    public final /* synthetic */ boolean c() {
        return true;
    }
}
