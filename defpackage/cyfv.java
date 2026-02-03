package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfv {
    public final Activity a;
    public final Optional b;

    public cyfv(Activity activity, Optional optional) {
        this.a = activity;
        this.b = optional;
    }

    public final EditText a(int i) {
        qx qxVar = new qx(this.a);
        qxVar.setInputType(i);
        qxVar.setSingleLine(false);
        return qxVar;
    }

    public final TextView b(String str) {
        return cyfx.a(this.a, str);
    }

    public final View c() {
        Activity activity = this.a;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 10.0f, activity.getResources().getDisplayMetrics());
        View view = new View(activity);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, iApplyDimension));
        return view;
    }
}
