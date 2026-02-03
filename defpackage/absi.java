package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absi {
    private static final cqce a = cqce.g("Bugle", "SwitcherDialog");
    private final Context b;

    public absi(Context context) {
        this.b = context;
    }

    public final void a(abgx abgxVar) {
        b(abgxVar, false);
    }

    public final void b(abgx abgxVar, boolean z) {
        cqce cqceVar = a;
        cqceVar.p("Using SwitcherDialogFragment");
        eg egVar = (eg) dakl.d(this.b);
        if (egVar == null || egVar.isFinishing()) {
            cqceVar.r("Activity is null or is finishing, can not show a dialog now");
            return;
        }
        fr frVarA = egVar.a();
        if (frVarA.ag()) {
            cqceVar.r("Fragment manager has state saved, can not show a dialog now");
            return;
        }
        ea eaVarH = frVarA.h("conversation_list_root_fragment_tag");
        ea eaVarH2 = null;
        if (eaVarH != null && eaVarH.I() != null) {
            eaVarH2 = eaVarH.I().h("home_fragment_tag");
        }
        if (eaVarH2 == null) {
            eaVarH2 = frVarA.h("ditto_web_fragment_tag");
        }
        if (eaVarH2 == null) {
            cqceVar.r("Cannot find home fragment or ditto web fragment");
            return;
        }
        absm absmVar = (absm) absn.a.createBuilder();
        absmVar.copyOnWrite();
        ((absn) absmVar.instance).b = abgxVar.a();
        absmVar.copyOnWrite();
        ((absn) absmVar.instance).c = z;
        absn absnVar = (absn) absmVar.build();
        absl abslVar = new absl();
        eyhj.e(abslVar);
        ehog.a(abslVar, absnVar);
        abslVar.t(eaVarH2.I(), "switcher_dialog_fragment");
    }
}
