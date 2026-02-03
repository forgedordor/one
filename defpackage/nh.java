package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nh {
    lco A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    final /* synthetic */ ni F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public nh(ni niVar, Menu menu) {
        this.F = niVar;
        this.a = menu;
        c();
    }

    public static final char e(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    public final SubMenu a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h = true;
        SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        d(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    public final Object b(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.z != null) {
            ni niVar = this.F;
            Context context = niVar.e;
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (niVar.f == null) {
                niVar.f = niVar.a(context);
            }
            menuItem.setOnMenuItemClickListener(new ng(niVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof of) {
                ((of) menuItem).j(true);
            } else if (menuItem instanceof ok) {
                ok okVar = (ok) menuItem;
                try {
                    if (okVar.e == null) {
                        okVar.e = okVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    okVar.e.invoke(okVar.d, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) b(str, ni.a, this.F.c));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        lco lcoVar = this.A;
        if (lcoVar != null) {
            if (menuItem instanceof kzw) {
                ((kzw) menuItem).c(lcoVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        ldg.a(menuItem, this.B);
        CharSequence charSequence = this.C;
        boolean z2 = menuItem instanceof kzw;
        if (z2) {
            ((kzw) menuItem).d(charSequence);
        } else {
            menuItem.setTooltipText(charSequence);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((kzw) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((kzw) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (z2) {
                ((kzw) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            ldg.b(menuItem, colorStateList);
        }
    }
}
