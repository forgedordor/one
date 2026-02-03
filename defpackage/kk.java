package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kk extends im {
    final st a;
    final Window.Callback b;
    boolean c;
    final kj d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new kf(this);
    private final zh i;

    public kk(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        kg kgVar = new kg(this);
        this.i = kgVar;
        zm zmVar = new zm(toolbar, false);
        this.a = zmVar;
        lcg.i(callback);
        this.b = callback;
        zmVar.e = callback;
        toolbar.x = kgVar;
        zmVar.w(charSequence);
        this.d = new kj(this);
    }

    public final Menu a() {
        if (!this.e) {
            st stVar = this.a;
            kh khVar = new kh(this);
            ki kiVar = new ki(this);
            Toolbar toolbar = ((zm) stVar).a;
            toolbar.A = khVar;
            toolbar.B = kiVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.f(khVar, kiVar);
            }
            this.e = true;
        }
        return ((zm) this.a).a.h();
    }

    public final void b(int i, int i2) {
        st stVar = this.a;
        stVar.k((i & i2) | (((zm) stVar).b & (~i2)));
    }

    @Override // defpackage.im
    public final boolean closeOptionsMenu() {
        return this.a.z();
    }

    @Override // defpackage.im
    public final boolean collapseActionView() {
        st stVar = this.a;
        if (!stVar.y()) {
            return false;
        }
        stVar.f();
        return true;
    }

    @Override // defpackage.im
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((il) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.im
    public final View getCustomView() {
        return ((zm) this.a).c;
    }

    @Override // defpackage.im
    public final int getDisplayOptions() {
        return ((zm) this.a).b;
    }

    @Override // defpackage.im
    public final Context getThemedContext() {
        return this.a.b();
    }

    @Override // defpackage.im
    public final void hide() {
        this.a.u(8);
    }

    @Override // defpackage.im
    public final boolean invalidateOptionsMenu() {
        Toolbar toolbar = ((zm) this.a).a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int[] iArr = ley.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.im
    public final void onDestroy() {
        ((zm) this.a).a.removeCallbacks(this.h);
    }

    @Override // defpackage.im
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu menuA = a();
        if (menuA == null) {
            return false;
        }
        menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuA.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.im
    public final boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // defpackage.im
    public final boolean openOptionsMenu() {
        return this.a.C();
    }

    @Override // defpackage.im
    public final void setBackgroundDrawable(Drawable drawable) {
        ((zm) this.a).a.setBackground(drawable);
    }

    @Override // defpackage.im
    public final void setCustomView(int i) {
        st stVar = this.a;
        View viewInflate = LayoutInflater.from(stVar.b()).inflate(i, (ViewGroup) ((zm) stVar).a, false);
        ik ikVar = new ik();
        if (viewInflate != null) {
            viewInflate.setLayoutParams(ikVar);
        }
        stVar.j(viewInflate);
    }

    @Override // defpackage.im
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        b(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.im
    public final void setDisplayOptions(int i) {
        b(4, -1);
    }

    @Override // defpackage.im
    public final void setDisplayShowCustomEnabled(boolean z) {
        b(true != z ? 0 : 16, 16);
    }

    @Override // defpackage.im
    public final void setDisplayShowHomeEnabled(boolean z) {
        b(2, 2);
    }

    @Override // defpackage.im
    public final void setDisplayShowTitleEnabled(boolean z) {
        b(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.im
    public final void setElevation(float f) {
        Toolbar toolbar = ((zm) this.a).a;
        int[] iArr = ley.a;
        len.j(toolbar, 0.0f);
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(int i) {
        this.a.o(i);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(int i) {
        this.a.q(i);
    }

    @Override // defpackage.im
    public final void setLogo(Drawable drawable) {
        this.a.l(null);
    }

    @Override // defpackage.im
    public final void setSubtitle(CharSequence charSequence) {
        this.a.s(charSequence);
    }

    @Override // defpackage.im
    public final void setTitle(int i) {
        st stVar = this.a;
        stVar.t(stVar.b().getText(i));
    }

    @Override // defpackage.im
    public final void setWindowTitle(CharSequence charSequence) {
        this.a.w(charSequence);
    }

    @Override // defpackage.im
    public final void show() {
        this.a.u(0);
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.a.p(charSequence);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.a.r(drawable);
    }

    @Override // defpackage.im
    public final void setTitle(CharSequence charSequence) {
        this.a.t(charSequence);
    }

    @Override // defpackage.im
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.im
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // defpackage.im
    public final void setShowHideAnimationEnabled(boolean z) {
    }
}
