package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeve {
    public Object a;
    public Drawable b;
    public CharSequence c;
    public CharSequence d;
    public View f;
    public TabLayout h;
    public eevh i;
    public int e = -1;
    public final int g = 1;
    public int j = -1;

    public final void a() {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.l(this);
    }

    public final void b() {
        eevh eevhVar = this.i;
        if (eevhVar != null) {
            eevhVar.b();
        }
    }

    public final boolean c() {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        int iA = tabLayout.a();
        return iA != -1 && iA == this.e;
    }

    public final void d(CharSequence charSequence) {
        this.d = charSequence;
        b();
    }

    public final void e(Drawable drawable) {
        this.b = drawable;
        TabLayout tabLayout = this.h;
        if (tabLayout.u == 1 || tabLayout.x == 2) {
            tabLayout.v(true);
        }
        b();
    }

    public final void f(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
            this.i.setContentDescription(charSequence);
        }
        this.c = charSequence;
        b();
    }

    public final void g(int i) {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        e(ku.a(tabLayout.getContext(), i));
    }

    public final void h(int i) {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        f(tabLayout.getResources().getText(i));
    }
}
