package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acag implements acad {
    public final acac a;
    public final fcsu b;
    private final Activity c;
    private final eigp d;

    public acag(Activity activity, eigp eigpVar, acac acacVar, fcsu fcsuVar) {
        this.c = activity;
        this.d = eigpVar;
        this.a = acacVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.acad
    public final dyit a() {
        Activity activity = this.c;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(R.string.account_menu_archived_messages));
        Drawable drawableA = ku.a(activity, R.drawable.quantum_gm_ic_archive_vd_theme_24);
        drawableA.getClass();
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = drawableA;
        dyijVar.d = new eifs(this.d, "com/google/android/apps/messaging/gaia/customactions/archived/ArchivedPlugin", "getSpec", 45, "Clicked Archived messages", new View.OnClickListener() { // from class: acaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acag acagVar = this.a;
                ((abwy) acagVar.b.b()).a(new abww(abwv.ARCHIVED));
                acagVar.a.a(1);
            }
        });
        return dyisVarK.d();
    }
}
