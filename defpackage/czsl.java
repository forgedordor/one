package defpackage;

import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czsl implements ehay {
    final /* synthetic */ czsh a;

    public czsl(czsh czshVar) {
        this.a = czshVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ekrw ekrwVarJ = czsh.a.j();
        ekrwVarJ.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer$TermsAndConditionsDataCallback", "onLoadError", (char) 145, "CarrierTosPopupBottomSheetDialogFragmentPeer.java")).q("Failed to load terms and conditions data");
        czsk czskVar = this.a.b;
        if (czskVar != null) {
            czskVar.d();
        }
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cjzg cjzgVar = (cjzg) ((Optional) obj).orElse(null);
        if (cjzgVar == null) {
            ekrw ekrwVarJ = czsh.a.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer$TermsAndConditionsDataCallback", "onLoaded", 118, "CarrierTosPopupBottomSheetDialogFragmentPeer.java")).q("TermsAndConditionsData is null");
            czsk czskVar = this.a.b;
            if (czskVar != null) {
                czskVar.d();
                return;
            }
            return;
        }
        czse czseVar = this.a.d;
        ((TextView) czseVar.N().findViewById(R.id.carrier_tos_popup_title)).setText(cjzgVar.d);
        TextView textView = (TextView) czseVar.N().findViewById(R.id.carrier_tos_popup_text_paragraph);
        textView.setText(cjzgVar.e);
        eebt.b(textView);
        eebt.c(textView);
        if (cjzgVar.a >= 2) {
            TextView textView2 = (TextView) czseVar.N().findViewById(R.id.carrier_tos_popup_text_sim_info);
            textView2.setText(czseVar.Z(R.string.carrier_tos_popup_sim_info_text, Integer.valueOf(cjzgVar.b), cjzgVar.c));
            textView2.setVisibility(0);
        }
    }
}
