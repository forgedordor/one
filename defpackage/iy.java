package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iy extends eg implements iz, kxf {
    private je su;

    public iy() {
        U().b("androidx:appcompat", new iw(this));
        x(new ix(this));
    }

    private final void fd() {
        lxr.b(getWindow().getDecorView(), this);
        lxs.b(getWindow().getDecorView(), this);
        pje.b(getWindow().getDecorView(), this);
        acl.a(getWindow().getDecorView(), this);
    }

    @Override // defpackage.abi, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fd();
        l().d(view, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [org.xmlpull.v1.XmlSerializer] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void attachBaseContext(final android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        im imVarK = k();
        if (getWindow().hasFeature(0)) {
            if (imVarK == null || !imVarK.closeOptionsMenu()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.hl, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        im imVarK = k();
        if (keyCode == 82 && imVarK != null && imVarK.onMenuKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return l().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        jz jzVar = (jz) l();
        if (jzVar.p == null) {
            jzVar.G();
            im imVar = jzVar.o;
            jzVar.p = new ni(imVar != null ? imVar.getThemedContext() : jzVar.k);
        }
        return jzVar.p;
    }

    public boolean hb() {
        Intent intentA = kuw.a(this);
        if (intentA == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentA)) {
            navigateUpTo(intentA);
            return true;
        }
        kxg kxgVar = new kxg(this);
        Intent intentJ = j();
        if (intentJ == null) {
            intentJ = kuw.a(this);
        }
        if (intentJ != null) {
            ComponentName component = intentJ.getComponent();
            if (component == null) {
                component = intentJ.resolveActivity(kxgVar.a.getPackageManager());
            }
            kxgVar.f(component);
            kxgVar.d(intentJ);
        }
        kxgVar.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final jl hc() {
        return new jl((jz) l());
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l().f();
    }

    @Override // defpackage.kxf
    public final Intent j() {
        return kuw.a(this);
    }

    public im k() {
        return l().b();
    }

    public final je l() {
        if (this.su == null) {
            int i = je.b;
            this.su = new jz(this, null, this, this);
        }
        return this.su;
    }

    public void n(Toolbar toolbar) {
        jz jzVar = (jz) l();
        if (jzVar.j instanceof Activity) {
            im imVarB = jzVar.b();
            if (imVarB instanceof ks) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            jzVar.p = null;
            if (imVarB != null) {
                imVarB.onDestroy();
            }
            jzVar.o = null;
            if (toolbar != null) {
                kk kkVar = new kk(toolbar, jzVar.z(), jzVar.m);
                jzVar.o = kkVar;
                jzVar.m.d = kkVar.d;
                if (!toolbar.C) {
                    toolbar.C = true;
                    toolbar.z();
                }
            } else {
                jzVar.m.d = null;
            }
            jzVar.f();
        }
    }

    public final void o() {
        l().f();
    }

    @Override // defpackage.abi, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        im imVarB;
        super.onConfigurationChanged(configuration);
        jz jzVar = (jz) l();
        if (jzVar.z && jzVar.x && (imVarB = jzVar.b()) != null) {
            imVarB.onConfigurationChanged(configuration);
        }
        Context context = jzVar.k;
        qu.d().e(context);
        jzVar.H = new Configuration(context.getResources().getConfiguration());
        jzVar.R(false, false);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        l().g();
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        im imVarK = k();
        if (menuItem.getItemId() != 16908332 || imVarK == null || (imVarK.getDisplayOptions() & 4) == 0) {
            return false;
        }
        return hb();
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((jz) l()).F();
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        im imVarB = ((jz) l()).b();
        if (imVarB != null) {
            imVarB.setShowHideAnimationEnabled(true);
        }
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((jz) l()).R(true, false);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onStop() {
        super.onStop();
        l().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().n(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        im imVarK = k();
        if (getWindow().hasFeature(0)) {
            if (imVarK == null || !imVarK.openOptionsMenu()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.abi, android.app.Activity
    public void setContentView(int i) {
        fd();
        l().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((jz) l()).I = i;
    }

    @Override // defpackage.abi, android.app.Activity
    public final void setContentView(View view) {
        fd();
        l().k(view);
    }

    @Override // defpackage.abi, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fd();
        l().l(view, layoutParams);
    }

    public void hd() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    protected void r() {
    }

    protected void s() {
    }

    public void m(nb nbVar) {
    }
}
