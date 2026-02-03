package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ox extends oc implements SubMenu {
    public final oc l;
    public final of m;

    public ox(Context context, oc ocVar, of ofVar) {
        super(context);
        this.l = ocVar;
        this.m = ofVar;
    }

    @Override // defpackage.oc
    public final oc a() {
        return this.l.a();
    }

    @Override // defpackage.oc
    public final String d() {
        int i = this.m.a;
        if (i == 0) {
            return null;
        }
        return a.g(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override // defpackage.oc
    public final void p(oa oaVar) {
        this.l.p(oaVar);
    }

    @Override // defpackage.oc, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // defpackage.oc, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // defpackage.oc
    public final boolean t(of ofVar) {
        return this.l.t(ofVar);
    }

    @Override // defpackage.oc
    public final boolean u(oc ocVar, MenuItem menuItem) {
        return super.u(ocVar, menuItem) || this.l.u(ocVar, menuItem);
    }

    @Override // defpackage.oc
    public final boolean v(of ofVar) {
        return this.l.v(ofVar);
    }

    @Override // defpackage.oc
    public final boolean w() {
        return this.l.w();
    }

    @Override // defpackage.oc
    public final boolean x() {
        return this.l.x();
    }

    @Override // defpackage.oc
    public final boolean y() {
        return this.l.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }
}
