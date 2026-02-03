package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztt implements agzt {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2");
    public final fcsu a;
    public czts b;
    private final fcsu d;
    private final fcsu e;
    private final fr f;
    private agzy g;

    public cztt(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.f = eaVar.I();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.a = fcsuVar3;
    }

    private final czts i() {
        ea eaVarH = this.f.h("phone_number_input_bottom_sheet_fragment_tag");
        if (eaVarH instanceof czsw) {
            return ((czsw) eaVarH).H();
        }
        return null;
    }

    private final void j() {
        czts cztsVar = this.b;
        if (cztsVar != null) {
            ((czte) cztsVar).z = new cztr(this);
        }
    }

    @Override // defpackage.agzt
    public final eiju b() {
        final cjtk cjtkVar = (cjtk) this.d.b();
        return cjtkVar.e().h(new ejvr() { // from class: cjsp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjtj cjtjVar = (cjtj) ((Optional) obj).orElse(null);
                if (cjtjVar == null) {
                    ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 266, "PhoneNumberInputUIPresenter.java")).q("shouldPromptBottomsheetForAnySim: phoneNumberInputRequest is empty");
                    return false;
                }
                String strB = cjtjVar.b();
                cjsa cjsaVarA = cjtjVar.a();
                if (strB.isEmpty() || !cjsaVarA.equals(cjsa.INPUT_BOTTOMSHEET)) {
                    ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 273, "PhoneNumberInputUIPresenter.java")).D("shouldPromptBottomsheetForAnySim: simId empty or uiVariant not bottomsheet. requestedSimId: %s, uiVariant: %s:", dhiz.SIM_ID.c(strB), cjsaVarA);
                    return false;
                }
                cjtk cjtkVar2 = cjtkVar;
                ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 279, "PhoneNumberInputUIPresenter.java")).t("shouldPromptBottomsheetForAnySim: eligible to reprompt with bottomsheet for simId: %s", dhiz.SIM_ID.c(strB));
                cjtkVar2.l(strB);
                return true;
            }
        }, cjtkVar.i);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.g = agzyVar;
        if (this.b == null) {
            this.b = i();
        }
        j();
    }

    @Override // defpackage.agzt
    public final void d() {
        h();
        this.g.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (this.b == null) {
            this.b = i();
        }
        czts cztsVar = this.b;
        if (cztsVar == null || !cztsVar.n()) {
            czto cztoVar = (czto) cztp.a.createBuilder();
            String string = Integer.toString(1);
            cztoVar.copyOnWrite();
            cztp cztpVar = (cztp) cztoVar.instance;
            string.getClass();
            cztpVar.b |= 2;
            cztpVar.d = string;
            czte czteVarH = null;
            String str = (String) ((cjtk) this.d.b()).h().orElse(null);
            if (str == null) {
                ((ekrd) ((ekrd) c.e()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2", "createAndShowBottomSheetFragment", 138, "PhoneNumberInputPopupPresenterV2.java")).q("createAndShowBottomSheetFragment: simId is null");
            } else {
                cztoVar.copyOnWrite();
                cztp cztpVar2 = (cztp) cztoVar.instance;
                cztpVar2.b |= 1;
                cztpVar2.c = str;
                ((cjsd) this.e.b()).c(str, cjsa.INPUT_BOTTOMSHEET, 3);
                ((ekrd) ((ekrd) c.e()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2", "createAndShowBottomSheetFragment", 146, "PhoneNumberInputPopupPresenterV2.java")).t("createAndShowBottomSheetFragment: creating bottomsheet fragment with simId: %s", dhiz.SIM_ID.c(str));
                czsw czswVarAY = czsw.aY((cztp) cztoVar.build());
                czswVarAY.t(this.f, "phone_number_input_bottom_sheet_fragment_tag");
                czteVarH = czswVarAY.H();
            }
            this.b = czteVarH;
        }
        j();
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 6;
    }

    public final void h() {
        czts cztsVar = this.b;
        if (cztsVar != null && cztsVar.n()) {
            ((czte) cztsVar).d.hh();
        }
        agzy agzyVar = this.g;
        if (agzyVar != null) {
            agzyVar.b();
            agzy agzyVar2 = this.g;
            agzyVar2.i = -100;
            agzyVar2.f.a(eijx.e(null), "POPUP_KEY");
        }
        this.b = null;
        ((cjtk) this.d.b()).k();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
