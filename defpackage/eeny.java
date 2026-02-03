package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeny extends FrameLayout implements eens {
    public final TextView a;
    boolean b;
    public ColorStateList c;
    private of d;

    public eeny(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    @Override // defpackage.oq
    public final of a() {
        return this.d;
    }

    public final void b() {
        of ofVar = this.d;
        if (ofVar != null) {
            int i = 8;
            if (ofVar.isVisible() && !this.b) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    @Override // defpackage.eens
    public final void c() {
        b();
    }

    @Override // defpackage.oq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.oq
    public final void f(of ofVar) {
        this.d = ofVar;
        ofVar.setCheckable(false);
        this.a.setText(ofVar.e);
        b();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
    }
}
