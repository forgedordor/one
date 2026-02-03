package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acai implements acad {
    private final Activity a;
    private final eigp b;
    private final fcsu c;
    private final fcsu d;

    public acai(Activity activity, eigp eigpVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = activity;
        this.b = eigpVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.acad
    public final dyit a() {
        Activity activity = this.a;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(R.string.account_menu_debug));
        Drawable drawableA = ku.a(activity, R.drawable.quantum_gm_ic_bug_report_vd_theme_24);
        drawableA.getClass();
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = drawableA;
        dyijVar.e = (dyhv) this.d.b();
        dyijVar.d = new eifs(this.b, "com/google/android/apps/messaging/gaia/customactions/debug/DebugPlugin", "getSpec", 41, "Clicked debug", (View.OnClickListener) this.c.b());
        return dyisVarK.d();
    }
}
