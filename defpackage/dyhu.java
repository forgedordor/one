package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyhu {
    public static dyhs h() {
        dyhw dyhwVar = new dyhw();
        dyhwVar.f(R.id.og_ai_custom_action);
        dyhwVar.i(false);
        dyhwVar.h(90541);
        dyhwVar.e(-1);
        dyhwVar.c(dyhr.CUSTOM);
        return dyhwVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Drawable d();

    public abstract View.OnClickListener e();

    public abstract lvv f();

    public abstract dyhr g();

    public abstract dyhs i();

    public final dyhu j(View.OnClickListener onClickListener) {
        dyhs dyhsVarI = i();
        ((dyhw) dyhsVarI).b = onClickListener;
        return dyhsVarI.b();
    }

    public abstract dyhv k();

    public abstract ejwi l();

    public abstract ejwi m();

    public abstract String n();

    public abstract boolean o();

    public abstract void p();
}
