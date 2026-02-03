package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acap implements acad {
    public final acac a;
    public final fcsu b;
    private final Activity c;
    private final eigp d;

    public acap(Activity activity, eigp eigpVar, acac acacVar, fcsu fcsuVar) {
        this.c = activity;
        this.d = eigpVar;
        this.a = acacVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.acad
    public final dyit a() {
        Activity activity = this.c;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(R.string.account_menu_mark_all_as_read));
        Drawable drawableA = ku.a(activity, R.drawable.mark_messages_read_icon);
        drawableA.getClass();
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = drawableA;
        dyijVar.d = new eifs(this.d, "com/google/android/apps/messaging/gaia/customactions/markasread/MarkAsReadPlugin", "getSpec", 44, "Clicked mark all as read", new View.OnClickListener() { // from class: acao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acap acapVar = this.a;
                ((abwy) acapVar.b.b()).a(new abww(abwv.MARK_ALL_AS_READ));
                acapVar.a.a(3);
            }
        });
        return dyisVarK.d();
    }
}
