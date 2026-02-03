package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acef implements acad {
    public final acac a;
    public final fcsu b;
    private final Activity c;
    private final eigp d;
    private final aceg e;

    public acef(Activity activity, eigp eigpVar, acac acacVar, aceg acegVar, fcsu fcsuVar) {
        activity.getClass();
        eigpVar.getClass();
        acegVar.getClass();
        this.c = activity;
        this.d = eigpVar;
        this.a = acacVar;
        this.e = acegVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.acad
    public final dyit a() {
        Activity activity = this.c;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(R.string.account_menu_sign_out_label));
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = ku.a(activity, R.drawable.gs_account_circle_off_vd_theme_24);
        dyijVar.e = this.e;
        dyijVar.d = new eifs(this.d, "", "", 0, "Clicked sign out account plugin", new View.OnClickListener() { // from class: acee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acef acefVar = this.a;
                ((abwy) acefVar.b.b()).a(new abww(abwv.SIGN_OUT_ACCOUNT));
                acefVar.a.a(7);
            }
        });
        return dyisVarK.d();
    }
}
