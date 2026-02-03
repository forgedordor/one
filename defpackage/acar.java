package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acar implements acad {
    private final Activity a;
    private final eigp b;
    private final fcsu c;

    public acar(Activity activity, eigp eigpVar, fcsu fcsuVar) {
        this.a = activity;
        this.b = eigpVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.acad
    public final dyit a() {
        Activity activity = this.a;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(R.string.account_menu_spam_and_blocked));
        Drawable drawableA = ku.a(activity, R.drawable.quantum_gm_ic_gshield_vd_theme_24);
        drawableA.getClass();
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = drawableA;
        dyijVar.d = new eifs(this.b, "com/google/android/apps/messaging/gaia/customactions/spamandblocked/SpamAndBlockedPlugin", "getSpec", 38, "Clicked Spam & blocked", (View.OnClickListener) this.c.b());
        return dyisVarK.d();
    }
}
