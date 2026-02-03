package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ks extends im implements pg {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    st d;
    ActionBarContextView e;
    View f;
    kr g;
    nb h;
    na i;
    public int j;
    public boolean k;
    boolean l;
    public boolean m;
    public nk n;
    boolean o;
    final lfo p;
    final lfo q;
    final kq r;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;

    public ks(Activity activity, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ko(this);
        this.q = new kp(this);
        this.r = new kq(this);
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    static boolean d(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private final void e(View view) {
        st stVarG;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.apps.messaging.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((ks) actionBarOverlayLayout.h).j = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = ley.a;
                    lel.c(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.google.android.apps.messaging.R.id.action_bar);
        if (callbackFindViewById instanceof st) {
            stVarG = (st) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
                sb.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sb.toString());
            }
            stVarG = ((Toolbar) callbackFindViewById).g();
        }
        this.d = stVarG;
        this.e = (ActionBarContextView) view.findViewById(com.google.android.apps.messaging.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.apps.messaging.R.id.action_bar_container);
        this.c = actionBarContainer;
        st stVar = this.d;
        if (stVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = stVar.b();
        if ((this.d.a() & 4) != 0) {
            this.v = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.d.F();
        f(mz.b(context));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, kt.a, com.google.android.apps.messaging.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.o = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void f(boolean z) {
        if (z) {
            this.d.E();
        } else {
            this.d.E();
        }
        this.d.D();
        this.d.G();
        this.b.e = false;
    }

    public final void a(boolean z) {
        lfn lfnVarE;
        lfn lfnVarB;
        if (z) {
            if (!this.y) {
                this.y = true;
                c(false);
            }
        } else if (this.y) {
            this.y = false;
            c(false);
        }
        if (!this.c.isLaidOut()) {
            if (z) {
                this.d.u(4);
                this.e.setVisibility(0);
                return;
            } else {
                this.d.u(0);
                this.e.setVisibility(8);
                return;
            }
        }
        if (z) {
            lfnVarB = this.d.e(4, 100L);
            lfnVarE = this.e.b(0, 200L);
        } else {
            lfnVarE = this.d.e(0, 200L);
            lfnVarB = this.e.b(8, 100L);
        }
        nk nkVar = new nk();
        ArrayList arrayList = nkVar.a;
        arrayList.add(lfnVarB);
        View view = (View) lfnVarB.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) lfnVarE.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(lfnVarE);
        nkVar.b();
    }

    public final void b(int i, int i2) {
        int iA = this.d.a();
        if ((i2 & 4) != 0) {
            this.v = true;
        }
        this.d.k((i & i2) | ((~i2) & iA));
    }

    public final void c(boolean z) {
        View view;
        View view2;
        View view3;
        if (!d(this.l, this.m, this.y)) {
            if (this.z) {
                this.z = false;
                nk nkVar = this.n;
                if (nkVar != null) {
                    nkVar.a();
                }
                if (this.j == 0) {
                    if (!this.A) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    nk nkVar2 = new nk();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    lfn lfnVarE = ley.e(this.c);
                    lfnVarE.f(f);
                    lfnVarE.e(this.r);
                    nkVar2.c(lfnVarE);
                    if (this.k && (view = this.f) != null) {
                        lfn lfnVarE2 = ley.e(view);
                        lfnVarE2.f(f);
                        nkVar2.c(lfnVarE2);
                    }
                    nkVar2.e(s);
                    nkVar2.d();
                    nkVar2.f(this.p);
                    this.n = nkVar2;
                    nkVar2.b();
                    return;
                }
                this.p.a();
                return;
            }
            return;
        }
        if (this.z) {
            return;
        }
        this.z = true;
        nk nkVar3 = this.n;
        if (nkVar3 != null) {
            nkVar3.a();
        }
        this.c.setVisibility(0);
        if (this.j != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.k && (view2 = this.f) != null) {
                view2.setTranslationY(0.0f);
            }
            this.q.a();
        } else {
            if (!this.A) {
                if (z) {
                    z = true;
                }
                this.c.setAlpha(1.0f);
                this.c.setTranslationY(0.0f);
                if (this.k) {
                    view2.setTranslationY(0.0f);
                }
                this.q.a();
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f2 -= r6[1];
            }
            this.c.setTranslationY(f2);
            nk nkVar4 = new nk();
            lfn lfnVarE3 = ley.e(this.c);
            lfnVarE3.f(0.0f);
            lfnVarE3.e(this.r);
            nkVar4.c(lfnVarE3);
            if (this.k && (view3 = this.f) != null) {
                view3.setTranslationY(f2);
                lfn lfnVarE4 = ley.e(this.f);
                lfnVarE4.f(0.0f);
                nkVar4.c(lfnVarE4);
            }
            nkVar4.e(t);
            nkVar4.d();
            nkVar4.f(this.q);
            this.n = nkVar4;
            nkVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ley.a;
            lel.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.im
    public final boolean collapseActionView() {
        st stVar = this.d;
        if (stVar == null || !stVar.y()) {
            return false;
        }
        stVar.f();
        return true;
    }

    @Override // defpackage.im
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.w) {
            return;
        }
        this.w = z;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((il) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.im
    public final View getCustomView() {
        return this.d.c();
    }

    @Override // defpackage.im
    public final int getDisplayOptions() {
        return this.d.a();
    }

    @Override // defpackage.im
    public final Context getThemedContext() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.u = new ContextThemeWrapper(this.a, i);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    @Override // defpackage.im
    public final void hide() {
        if (this.l) {
            return;
        }
        this.l = true;
        c(false);
    }

    @Override // defpackage.im
    public final void onConfigurationChanged(Configuration configuration) {
        f(mz.b(this.a));
    }

    @Override // defpackage.im
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        kr krVar = this.g;
        if (krVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        oc ocVar = krVar.a;
        ocVar.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return ocVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.im
    public final void setBackgroundDrawable(Drawable drawable) {
        ActionBarContainer actionBarContainer = this.c;
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.b);
        }
        actionBarContainer.b = drawable;
        drawable.setCallback(actionBarContainer);
        boolean z = false;
        if (actionBarContainer.a != null) {
            drawable.setBounds(0, 0, actionBarContainer.getMeasuredWidth(), actionBarContainer.getMeasuredHeight());
        }
        if (!actionBarContainer.e ? !(actionBarContainer.b != null || actionBarContainer.c != null) : actionBarContainer.d == null) {
            z = true;
        }
        actionBarContainer.setWillNotDraw(z);
        actionBarContainer.invalidate();
        actionBarContainer.invalidateOutline();
    }

    @Override // defpackage.im
    public final void setCustomView(int i) {
        this.d.j(LayoutInflater.from(getThemedContext()).inflate(i, this.d.d(), false));
    }

    @Override // defpackage.im
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.v) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // defpackage.im
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        b(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.im
    public final void setDisplayOptions(int i) {
        this.v = true;
        this.d.k(4);
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
        ActionBarContainer actionBarContainer = this.c;
        int[] iArr = ley.a;
        len.j(actionBarContainer, f);
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(int i) {
        this.d.o(i);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(int i) {
        this.d.q(i);
    }

    @Override // defpackage.im
    public final void setLogo(Drawable drawable) {
        this.d.l(null);
    }

    @Override // defpackage.im
    public final void setShowHideAnimationEnabled(boolean z) {
        nk nkVar;
        this.A = z;
        if (z || (nkVar = this.n) == null) {
            return;
        }
        nkVar.a();
    }

    @Override // defpackage.im
    public final void setSubtitle(CharSequence charSequence) {
        this.d.s(charSequence);
    }

    @Override // defpackage.im
    public final void setTitle(int i) {
        setTitle(this.a.getString(i));
    }

    @Override // defpackage.im
    public final void setWindowTitle(CharSequence charSequence) {
        this.d.w(charSequence);
    }

    @Override // defpackage.im
    public final void show() {
        if (this.l) {
            this.l = false;
            c(false);
        }
    }

    @Override // defpackage.im
    public final nb startActionMode(na naVar) {
        kr krVar = this.g;
        if (krVar != null) {
            krVar.f();
        }
        this.b.k(false);
        this.e.i();
        kr krVar2 = new kr(this, this.e.getContext(), naVar);
        oc ocVar = krVar2.a;
        ocVar.s();
        try {
            if (!krVar2.b.c(krVar2, ocVar)) {
                return null;
            }
            this.g = krVar2;
            krVar2.g();
            this.e.h(krVar2);
            a(true);
            return krVar2;
        } finally {
            krVar2.a.r();
        }
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.d.p(charSequence);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.d.r(drawable);
    }

    @Override // defpackage.im
    public final void setTitle(CharSequence charSequence) {
        this.d.t(charSequence);
    }

    public ks(Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ko(this);
        this.q = new kp(this);
        this.r = new kq(this);
        e(dialog.getWindow().getDecorView());
    }
}
