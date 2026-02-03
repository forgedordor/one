package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenk extends FrameLayout implements eens {
    public eenk(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_divider, (ViewGroup) this, true);
        b();
    }

    @Override // defpackage.oq
    public final of a() {
        return null;
    }

    public final void b() {
        setVisibility(8);
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
        b();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
    }
}
