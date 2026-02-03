package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.io.IOException;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czuf implements acth {
    public final eg a;
    public final cjtk b;
    public final fcsu c;
    public final czug d;
    public final fcsu e;
    private final cjsd f;
    private final eosc g;
    private String h;

    public czuf(eg egVar, cjsd cjsdVar, cjtk cjtkVar, fcsu fcsuVar, eosc eoscVar, czug czugVar, fcsu fcsuVar2) {
        this.a = egVar;
        this.f = cjsdVar;
        this.b = cjtkVar;
        this.c = fcsuVar;
        this.g = eoscVar;
        this.d = czugVar;
        this.e = fcsuVar2;
    }

    @Override // defpackage.acth
    public final eiju a() {
        final String str = (String) this.b.h().orElseThrow(new Supplier() { // from class: czuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("repromptingSimId is empty");
            }
        });
        this.h = str;
        actk actkVarL = actn.l();
        acte acteVar = (acte) actkVarL;
        acteVar.a = "phone_number_promo_banner";
        actkVarL.c(R.drawable.gs_android_messages_vd_theme_24);
        eg egVar = this.a;
        acteVar.b = egVar.getString(R.string.phone_number_promo_banner_title_text);
        acteVar.c = egVar.getString(R.string.phone_number_promo_banner_body_text);
        acteVar.d = egVar.getString(R.string.phone_number_promo_banner_positive_button_text);
        actkVarL.e(egVar.getString(R.string.phone_number_promo_banner_negative_button_text));
        acteVar.f = new actm() { // from class: czua
            @Override // defpackage.actm
            public final void a(egpr egprVar, View view) {
                czuf czufVar = this.a;
                ((czty) czufVar.e.b()).a(str, emfc.RCS_PROVISIONING_PHONE_NUMBER_PROMO_ACCEPTED);
                czufVar.d.a(egprVar, view);
            }
        };
        acteVar.e = new actm() { // from class: czub
            @Override // defpackage.actm
            public final void a(egpr egprVar, View view) {
                final czuf czufVar = this.a;
                String str2 = str;
                czufVar.e(str2, 9);
                ((czty) czufVar.e.b()).a(str2, emfc.RCS_PROVISIONING_PHONE_NUMBER_PROMO_DISMISSED);
                final eg egVar2 = czufVar.a;
                adci.a(egVar2, egVar2.getString(R.string.phone_number_ui_dismissed_snackbar_text_v2), egVar2.getString(R.string.phone_number_ui_dismissed_snackbar_action_text), new View.OnClickListener() { // from class: czud
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws IOException {
                        aijh aijhVar = (aijh) czufVar.c.b();
                        Activity activity = egVar2;
                        eiid.o(activity, aijhVar.n(activity));
                    }
                });
                czufVar.b.k();
            }
        };
        actkVarL.d(new czue(this, str));
        return eijx.e(actkVarL.a());
    }

    @Override // defpackage.acth
    public final eiju b() {
        final cjtk cjtkVar = this.b;
        final String str = this.h;
        return cjtkVar.e().h(new ejvr() { // from class: cjsz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjtj cjtjVar = (cjtj) ((Optional) obj).orElse(null);
                if (cjtjVar == null) {
                    ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 297, "PhoneNumberInputUIPresenter.java")).q("shouldPromptPromoBannerForAnySim: phoneNumberInputRequest is empty");
                    return false;
                }
                String strB = cjtjVar.b();
                cjsa cjsaVarA = cjtjVar.a();
                if (strB.isEmpty() || !cjsaVarA.equals(cjsa.PROMO_BANNER)) {
                    ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 305, "PhoneNumberInputUIPresenter.java")).D("shouldPromptPromoBannerForAnySim: simId empty or uiVariant not banner. simId: %s, uiVariant: %s: ", dhiz.SIM_ID.c(strB), cjsaVarA);
                    return false;
                }
                String str2 = str;
                if (str2 == null || strB.equals(str2)) {
                    cjtk cjtkVar2 = cjtkVar;
                    ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 322, "PhoneNumberInputUIPresenter.java")).t("shouldPromptPromoBannerForAnySim: eligible to reprompt banner for simId: %s", dhiz.SIM_ID.c(strB));
                    cjtkVar2.l(strB);
                    return true;
                }
                ekrd ekrdVar = (ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 314, "PhoneNumberInputUIPresenter.java");
                dhiz dhizVar = dhiz.SIM_ID;
                ekrdVar.D("shouldPromptPromoBannerForAnySim: suppressing banner request for requestedSimId: %s. Banner has already been shown for previousSimId: %s", dhizVar.c(strB), dhizVar.c(str2));
                return false;
            }
        }, cjtkVar.i);
    }

    @Override // defpackage.acth
    public final /* synthetic */ Set c() {
        return new ekph(cdpg.HOME);
    }

    @Override // defpackage.acth
    public final int d() {
        return 3;
    }

    public final void e(String str, int i) {
        cjsd cjsdVar = this.f;
        cjrw cjrwVarB = cjsdVar.b(3, i);
        cjsa cjsaVar = cjsa.PROMO_BANNER;
        cjrwVarB.copyOnWrite();
        cjsb cjsbVar = (cjsb) cjrwVarB.instance;
        cjsb cjsbVar2 = cjsb.a;
        cjsbVar.h = cjsaVar.a();
        cjsbVar.b |= 64;
        cjsdVar.a(str, cjrwVarB.build()).k(auvh.b(), this.g);
    }
}
