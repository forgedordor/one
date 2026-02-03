package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class of implements kzw {
    private View B;
    private MenuItem.OnActionExpandListener C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public Intent f;
    public char g;
    public char i;
    public final oc k;
    public ox l;
    public CharSequence m;
    public CharSequence n;
    public int o;
    public lco p;
    private CharSequence r;
    private Drawable s;
    private MenuItem.OnMenuItemClickListener u;
    public int h = 4096;
    public int j = 4096;
    private int t = 0;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 16;
    public boolean q = false;

    public of(oc ocVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.k = ocVar;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.o = i5;
    }

    public static void g(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private final Drawable v(Drawable drawable) {
        if (drawable != null && this.z && (this.x || this.y)) {
            drawable = drawable.mutate();
            if (this.x) {
                drawable.setTintList(this.v);
            }
            if (this.y) {
                drawable.setTintMode(this.w);
            }
            this.z = false;
        }
        return drawable;
    }

    @Override // defpackage.kzw
    public final lco a() {
        return this.p;
    }

    @Override // defpackage.kzw
    public final void b(CharSequence charSequence) {
        this.m = charSequence;
        this.k.l(false);
    }

    @Override // defpackage.kzw
    public final void c(lco lcoVar) {
        lco lcoVar2 = this.p;
        if (lcoVar2 != null) {
            lcoVar2.reset();
        }
        this.B = null;
        this.p = lcoVar;
        this.k.l(true);
        lco lcoVar3 = this.p;
        if (lcoVar3 != null) {
            lcoVar3.setVisibilityListener(new oe(this));
        }
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.o & 8) == 0) {
            return false;
        }
        if (this.B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.k.t(this);
        }
        return false;
    }

    @Override // defpackage.kzw
    public final void d(CharSequence charSequence) {
        this.n = charSequence;
        this.k.l(false);
    }

    public final char e() {
        return this.k.x() ? this.i : this.g;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.k.v(this);
        }
        return false;
    }

    public final CharSequence f(oq oqVar) {
        return oqVar.e() ? getTitleCondensed() : this.e;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final View getActionView() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        lco lcoVar = this.p;
        if (lcoVar == null) {
            return null;
        }
        View viewOnCreateActionView = lcoVar.onCreateActionView(this);
        this.B = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return v(drawable);
        }
        int i = this.t;
        if (i == 0) {
            return null;
        }
        Drawable drawableA = ku.a(this.k.a, i);
        this.t = 0;
        this.s = drawableA;
        return v(drawableA);
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.l;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.n;
    }

    public final void h(boolean z) {
        this.q = z;
        this.k.l(false);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.l != null;
    }

    final void i(boolean z) {
        int i = this.A;
        int i2 = (true != z ? 0 : 2) | (i & (-3));
        this.A = i2;
        if (i != i2) {
            this.k.l(false);
        }
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        lco lcoVar = this.p;
        return (lcoVar == null || !lcoVar.overridesItemVisibility()) ? (this.A & 8) == 0 : (this.A & 8) == 0 && this.p.isVisible();
    }

    public final void j(boolean z) {
        this.A = (true != z ? 0 : 4) | (this.A & (-5));
    }

    public final void k(boolean z) {
        this.A = z ? this.A | 32 : this.A & (-33);
    }

    public final void l(ox oxVar) {
        this.l = oxVar;
        oxVar.setHeaderTitle(this.e);
    }

    public final boolean m() {
        lco lcoVar;
        if ((this.o & 8) != 0) {
            if (this.B == null && (lcoVar = this.p) != null) {
                this.B = lcoVar.onCreateActionView(this);
            }
            if (this.B != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        oc ocVar = this.k;
        if (ocVar.u(ocVar, this)) {
            return true;
        }
        Intent intent = this.f;
        if (intent != null) {
            try {
                ocVar.a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        lco lcoVar = this.p;
        return lcoVar != null && lcoVar.onPerformDefaultAction();
    }

    public final boolean o() {
        return (this.A & 32) == 32;
    }

    public final boolean p() {
        return (this.A & 4) != 0;
    }

    public final boolean q() {
        return (this.o & 1) == 1;
    }

    public final boolean r() {
        return (this.o & 2) == 2;
    }

    final boolean s(boolean z) {
        int i = this.A;
        int i2 = (true != z ? 8 : 0) | (i & (-9));
        this.A = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.k.a;
        u(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.i == c) {
            return this;
        }
        this.i = Character.toLowerCase(c);
        this.k.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.A;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A = i2;
        if (i != i2) {
            this.k.l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.A & 4) == 0) {
            i(z);
            return this;
        }
        oc ocVar = this.k;
        int i = this.b;
        ArrayList arrayList = ocVar.c;
        int size = arrayList.size();
        ocVar.s();
        for (int i2 = 0; i2 < size; i2++) {
            of ofVar = (of) arrayList.get(i2);
            if (ofVar.b == i && ofVar.p() && ofVar.isCheckable()) {
                ofVar.i(ofVar == this);
            }
        }
        ocVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.A = z ? this.A | 16 : this.A & (-17);
        this.k.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.s = null;
        this.t = i;
        this.z = true;
        this.k.l(false);
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        this.z = true;
        this.k.l(false);
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        this.z = true;
        this.k.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.g == c) {
            return this;
        }
        this.g = c;
        this.k.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.u = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.g = c;
        this.i = Character.toLowerCase(c2);
        this.k.l(false);
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.o = i;
        this.k.B();
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.k.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r = charSequence;
        this.k.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        d(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (s(z)) {
            this.k.C();
        }
        return this;
    }

    public final boolean t() {
        return this.k.y() && e() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void u(View view) {
        int i;
        this.B = view;
        this.p = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.k.B();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.t = 0;
        this.s = drawable;
        this.z = true;
        this.k.l(false);
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.g == c && this.h == i) {
            return this;
        }
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(i);
        this.k.l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.k.l(false);
        ox oxVar = this.l;
        if (oxVar != null) {
            oxVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        u(view);
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.i == c && this.j == i) {
            return this;
        }
        this.i = Character.toLowerCase(c);
        this.j = KeyEvent.normalizeMetaState(i);
        this.k.l(false);
        return this;
    }

    @Override // defpackage.kzw, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(i);
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        this.k.l(false);
        return this;
    }
}
