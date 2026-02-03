package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahdu implements acad {
    public final acac a;
    public final fcsu b;
    private final Activity c;
    private final eigp d;
    private final ahdv e;

    public ahdu(Activity activity, eigp eigpVar, acac acacVar, ahdv ahdvVar, fcsu fcsuVar) {
        activity.getClass();
        eigpVar.getClass();
        ahdvVar.getClass();
        this.c = activity;
        this.d = eigpVar;
        this.a = acacVar;
        this.e = ahdvVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.acad
    public final dyit a() {
        Activity activity = this.c;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(R.string.account_menu_profile_label));
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = ku.a(activity, R.drawable.gs_person_vd_theme_24);
        dyijVar.e = this.e;
        dyisVarK.c(235749);
        dyijVar.d = new eifs(this.d, "", "", 0, "Clicked profile plugin", new View.OnClickListener() { // from class: ahdt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ahdu ahduVar = this.a;
                ((abwy) ahduVar.b.b()).a(new abww(abwv.EDIT_PROFILE));
                ahduVar.a.a(8);
            }
        });
        return dyisVarK.d();
    }
}
