package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acah implements View.OnClickListener {
    private final Activity a;
    private final fcsu b;
    private final acac c;

    public acah(Activity activity, fcsu fcsuVar, acac acacVar) {
        this.a = activity;
        this.b = fcsuVar;
        this.c = acacVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.a(4);
        Activity activity = this.a;
        View viewFindViewById = activity.findViewById(R.id.selected_account_disc);
        if (viewFindViewById == null) {
            return;
        }
        oc ocVar = new oc(activity);
        ocVar.b = new vf();
        on onVar = new on(activity, ocVar, viewFindViewById, false, R.attr.popupMenuStyle);
        onVar.b = 5;
        onVar.c = new vg();
        ((cxcb) this.b.b()).d(ocVar, Optional.of(activity));
        onVar.f();
    }
}
