package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cztm implements ehay {
    final /* synthetic */ czte a;

    public cztm(czte czteVar) {
        this.a = czteVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) czte.a.j()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$GetPhoneNumberInputDataCallback", "onLoadError", (char) 242, "PhoneNumberInputBottomSheetFragmentPeer.java")).q("Failed to get PhoneNumberInputUiSimInfo");
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Optional) obj).ifPresent(new Consumer() { // from class: cztl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) throws Resources.NotFoundException {
                cjrr cjrrVar = (cjrr) obj2;
                czte czteVar = this.a.a;
                if (czteVar.q()) {
                    czsw czswVar = czteVar.d;
                    TextView textView = (TextView) czswVar.N().findViewById(R.id.title);
                    Integer numValueOf = Integer.valueOf(cjrrVar.a + 1);
                    textView.setText(czswVar.Z(R.string.phone_number_input_title_text_multi_sim, numValueOf));
                    String str = cjrrVar.b;
                    if (str.isEmpty()) {
                        czswVar.N().findViewById(R.id.multi_sim_subtitle).setVisibility(8);
                        return;
                    }
                    Context contextA = czswVar.A();
                    TextView textView2 = (TextView) czswVar.N().findViewById(R.id.multi_sim_subtitle);
                    String string = contextA.getString(R.string.phone_number_input_multisim_text, numValueOf, str);
                    if (cjrrVar.c) {
                        string = cjrrVar.d ? contextA.getString(R.string.phone_number_input_multisim_text_default_call_sms, numValueOf, str) : contextA.getString(R.string.phone_number_input_multisim_text_default_call, numValueOf, str);
                    } else if (cjrrVar.d) {
                        string = contextA.getString(R.string.phone_number_input_multisim_text_default_sms, numValueOf, str);
                    }
                    textView2.setText(string);
                    czqx.e(contextA, textView2);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
