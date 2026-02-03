package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jz extends je implements LayoutInflater.Factory2, oa {
    private static final cvw N = new cvw();
    private static final int[] O = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    public jx E;
    public boolean F;
    boolean G;
    public Configuration H;
    public int I;
    boolean J;
    int K;
    public Rect L;
    public Rect M;
    private CharSequence P;
    private jm Q;
    private jy R;
    private TextView S;
    private boolean T;
    private boolean U;
    private boolean V;
    private jx[] W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private boolean ab;
    private ju ac;
    private ju ad;
    private boolean af;
    private AppCompatViewInflater ag;
    private OnBackInvokedDispatcher ah;
    private OnBackInvokedCallback ai;
    final Object j;
    final Context k;
    public Window l;
    public jr m;
    final iz n;
    im o;
    MenuInflater p;
    public ss q;
    nb r;
    ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public boolean x;
    ViewGroup y;
    boolean z;
    lfn v = null;
    public boolean w = true;
    private final Runnable ae = new jf(this);

    public jz(Context context, Window window, iz izVar, Object obj) {
        iy iyVar = null;
        this.Z = -100;
        this.k = context;
        this.n = izVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof iy)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        iyVar = (iy) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iyVar != null) {
                this.Z = ((jz) iyVar.l()).Z;
            }
        }
        if (this.Z == -100) {
            cvw cvwVar = N;
            Integer num = (Integer) cvwVar.get(this.j.getClass().getName());
            if (num != null) {
                this.Z = num.intValue();
                cvwVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            U(window);
        }
        qu.f();
    }

    private final ju S(Context context) {
        if (this.ad == null) {
            this.ad = new js(this, context);
        }
        return this.ad;
    }

    private final ju T(Context context) {
        if (this.ac == null) {
            if (kn.a == null) {
                Context applicationContext = context.getApplicationContext();
                kn.a = new kn(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ac = new jv(this, kn.a);
        }
        return this.ac;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void U(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L5b
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof defpackage.jr
            if (r2 != 0) goto L55
            jr r1 = new jr
            r1.<init>(r3, r0)
            r3.m = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.k
            int[] r1 = defpackage.jz.O
            r2 = 0
            yx r0 = defpackage.yx.k(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.i(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.o()
            r3.l = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L54
            android.window.OnBackInvokedDispatcher r4 = r3.ah
            if (r4 != 0) goto L54
            java.lang.Object r4 = r3.j
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L4f
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedDispatcher r4 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r4)
            r3.ah = r4
            goto L51
        L4f:
            r3.ah = r2
        L51:
            r3.I()
        L54:
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L5b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.U(android.view.Window):void");
    }

    private final void V() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                U(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void W(int i2) {
        this.K = (1 << i2) | this.K;
        if (this.J) {
            return;
        }
        View decorView = this.l.getDecorView();
        Runnable runnable = this.ae;
        int[] iArr = ley.a;
        decorView.postOnAnimation(runnable);
        this.J = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(defpackage.jx r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.X(jx, android.view.KeyEvent):void");
    }

    private final void Y() {
        if (this.x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final void Z(boolean z) throws PackageManager.NameNotFoundException {
        R(z, true);
    }

    final void A(int i2, jx jxVar, Menu menu) {
        if (menu == null) {
            menu = jxVar.h;
        }
        if (jxVar.m && !this.G) {
            jr jrVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                jrVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                jrVar.b = false;
            }
        }
    }

    final void B(oc ocVar) {
        if (this.V) {
            return;
        }
        this.V = true;
        this.q.a();
        Window.Callback callbackX = x();
        if (callbackX != null && !this.G) {
            callbackX.onPanelClosed(108, ocVar);
        }
        this.V = false;
    }

    final void C(jx jxVar, boolean z) {
        ViewGroup viewGroup;
        ss ssVar;
        if (z && jxVar.a == 0 && (ssVar = this.q) != null && ssVar.s()) {
            B(jxVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && jxVar.m && (viewGroup = jxVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                A(jxVar.a, jxVar, null);
            }
        }
        jxVar.k = false;
        jxVar.l = false;
        jxVar.m = false;
        jxVar.f = null;
        jxVar.n = true;
        if (this.E == jxVar) {
            this.E = null;
        }
        if (jxVar.a == 0) {
            I();
        }
    }

    final void D(int i2) {
        jx jxVarP = P(i2);
        if (jxVarP.h != null) {
            Bundle bundle = new Bundle();
            jxVarP.h.o(bundle);
            if (bundle.size() > 0) {
                jxVarP.p = bundle;
            }
            jxVarP.h.s();
            jxVarP.h.clear();
        }
        jxVarP.o = true;
        jxVarP.n = true;
        if ((i2 == 108 || i2 == 0) && this.q != null) {
            jx jxVarP2 = P(0);
            jxVarP2.k = false;
            M(jxVarP2, null);
        }
    }

    public final void E() {
        lfn lfnVar = this.v;
        if (lfnVar != null) {
            lfnVar.a();
        }
    }

    public final void F() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.x) {
            return;
        }
        Context aerVar = this.k;
        TypedArray typedArrayObtainStyledAttributes = aerVar.obtainStyledAttributes(kt.k);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            r(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            r(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            r(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            r(10);
        }
        this.C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        V();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(aerVar);
        if (this.D) {
            viewGroup = this.B ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.apps.messaging.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.apps.messaging.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.C) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.apps.messaging.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.A = false;
            this.z = false;
        } else if (this.z) {
            TypedValue typedValue = new TypedValue();
            aerVar.getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                aerVar = new aer(aerVar, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(aerVar).inflate(com.google.android.apps.messaging.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ss ssVar = (ss) viewGroup.findViewById(com.google.android.apps.messaging.R.id.decor_content_parent);
            this.q = ssVar;
            ssVar.n(x());
            if (this.A) {
                this.q.c(109);
            }
            if (this.T) {
                this.q.c(2);
            }
            if (this.U) {
                this.q.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.z + ", windowActionBarOverlay: " + this.A + ", android:windowIsFloating: " + this.C + ", windowActionModeOverlay: " + this.B + ", windowNoTitle: " + this.D + " }");
        }
        jg jgVar = new jg(this);
        int[] iArr = ley.a;
        len.k(viewGroup, jgVar);
        if (this.q == null) {
            this.S = (TextView) viewGroup.findViewById(com.google.android.apps.messaging.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.apps.messaging.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.i = new jh(this);
        this.y = viewGroup;
        CharSequence charSequenceZ = z();
        if (!TextUtils.isEmpty(charSequenceZ)) {
            ss ssVar2 = this.q;
            if (ssVar2 != null) {
                ssVar2.o(charSequenceZ);
            } else {
                im imVar = this.o;
                if (imVar != null) {
                    imVar.setWindowTitle(charSequenceZ);
                } else {
                    TextView textView = this.S;
                    if (textView != null) {
                        textView.setText(charSequenceZ);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.y.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.k.obtainStyledAttributes(kt.k);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.x = true;
        jx jxVarP = P(0);
        if (this.G || jxVarP.h != null) {
            return;
        }
        W(108);
    }

    public final void G() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F();
        if (this.z && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new ks((Activity) obj, this.A);
            } else if (obj instanceof Dialog) {
                this.o = new ks((Dialog) obj);
            }
            im imVar = this.o;
            if (imVar != null) {
                imVar.setDefaultDisplayHomeAsUpEnabled(this.af);
            }
        }
    }

    @Override // defpackage.oa
    public final void H(oc ocVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ss ssVar = this.q;
        if (ssVar == null || !ssVar.p() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.q.r())) {
            jx jxVarP = P(0);
            jxVarP.n = true;
            C(jxVarP, false);
            X(jxVarP, null);
            return;
        }
        Window.Callback callbackX = x();
        if (this.q.s()) {
            this.q.q();
            if (this.G) {
                return;
            }
            callbackX.onPanelClosed(108, P(0).h);
            return;
        }
        if (callbackX == null || this.G) {
            return;
        }
        if (this.J && (1 & this.K) != 0) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ae;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        jx jxVarP2 = P(0);
        oc ocVar2 = jxVarP2.h;
        if (ocVar2 == null || jxVarP2.o || !callbackX.onPreparePanel(0, jxVarP2.g, ocVar2)) {
            return;
        }
        callbackX.onMenuOpened(108, jxVarP2.h);
        this.q.u();
    }

    final void I() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ah == null || (!P(0).m && this.r == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.ai;
                if (onBackInvokedCallback != null) {
                    this.ah.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.ai = null;
                    return;
                }
                return;
            }
            if (this.ai == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.ah;
                OnBackInvokedCallback onBackInvokedCallback2 = new OnBackInvokedCallback() { // from class: jq
                    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                        this.a.K();
                    }
                };
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback2);
                this.ai = onBackInvokedCallback2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean J(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.J(android.view.KeyEvent):boolean");
    }

    final boolean K() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = this.X;
        this.X = false;
        jx jxVarP = P(0);
        if (jxVarP.m) {
            if (!z) {
                C(jxVarP, true);
            }
            return true;
        }
        nb nbVar = this.r;
        if (nbVar != null) {
            nbVar.f();
            return true;
        }
        im imVarB = b();
        return imVarB != null && imVarB.collapseActionView();
    }

    @Override // defpackage.oa
    public final boolean L(oc ocVar, MenuItem menuItem) {
        jx jxVarW;
        Window.Callback callbackX = x();
        if (callbackX == null || this.G || (jxVarW = w(ocVar.a())) == null) {
            return false;
        }
        return callbackX.onMenuItemSelected(jxVarW.a, menuItem);
    }

    public final boolean M(jx jxVar, KeyEvent keyEvent) {
        ss ssVar;
        ss ssVar2;
        Resources.Theme themeNewTheme;
        ss ssVar3;
        ss ssVar4;
        if (this.G) {
            return false;
        }
        if (jxVar.k) {
            return true;
        }
        jx jxVar2 = this.E;
        if (jxVar2 != null && jxVar2 != jxVar) {
            C(jxVar2, false);
        }
        Window.Callback callbackX = x();
        if (callbackX != null) {
            jxVar.g = callbackX.onCreatePanelView(jxVar.a);
        }
        int i2 = jxVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (ssVar4 = this.q) != null) {
            ssVar4.m();
        }
        if (jxVar.g == null && (!z || !(this.o instanceof kk))) {
            oc ocVar = jxVar.h;
            if (ocVar == null || jxVar.o) {
                if (ocVar == null) {
                    Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            aer aerVar = new aer(context, 0);
                            aerVar.getTheme().setTo(themeNewTheme);
                            context = aerVar;
                        }
                    }
                    oc ocVar2 = new oc(context);
                    ocVar2.b = this;
                    jxVar.a(ocVar2);
                    if (jxVar.h == null) {
                        return false;
                    }
                }
                if (z && (ssVar2 = this.q) != null) {
                    if (this.Q == null) {
                        this.Q = new jm(this);
                    }
                    ssVar2.l(jxVar.h, this.Q);
                }
                jxVar.h.s();
                if (!callbackX.onCreatePanelMenu(i2, jxVar.h)) {
                    jxVar.a(null);
                    if (z && (ssVar = this.q) != null) {
                        ssVar.l(null, this.Q);
                    }
                    return false;
                }
                jxVar.o = false;
            }
            jxVar.h.s();
            Bundle bundle = jxVar.p;
            if (bundle != null) {
                jxVar.h.n(bundle);
                jxVar.p = null;
            }
            if (!callbackX.onPreparePanel(0, jxVar.g, jxVar.h)) {
                if (z && (ssVar3 = this.q) != null) {
                    ssVar3.l(null, this.Q);
                }
                jxVar.h.r();
                return false;
            }
            jxVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            jxVar.h.r();
        }
        jxVar.k = true;
        jxVar.l = false;
        this.E = jxVar;
        return true;
    }

    final boolean N() {
        ViewGroup viewGroup;
        return this.x && (viewGroup = this.y) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View O(java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.O(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final jx P(int i2) {
        jx[] jxVarArr = this.W;
        if (jxVarArr == null || jxVarArr.length <= i2) {
            jx[] jxVarArr2 = new jx[i2 + 1];
            if (jxVarArr != null) {
                System.arraycopy(jxVarArr, 0, jxVarArr2, 0, jxVarArr.length);
            }
            this.W = jxVarArr2;
            jxVarArr = jxVarArr2;
        }
        jx jxVar = jxVarArr[i2];
        if (jxVar != null) {
            return jxVar;
        }
        jx jxVar2 = new jx(i2);
        jxVarArr[i2] = jxVar2;
        return jxVar2;
    }

    public final boolean Q(jx jxVar, int i2, KeyEvent keyEvent) {
        oc ocVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jxVar.k || M(jxVar, keyEvent)) && (ocVar = jxVar.h) != null) {
            return ocVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(boolean r12, boolean r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.R(boolean, boolean):void");
    }

    @Override // defpackage.je
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.je
    public final im b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        G();
        return this.o;
    }

    @Override // defpackage.je
    public final View c(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.je
    public final void d(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F();
        ((ViewGroup) this.y.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof jz) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.je
    public final void f() {
        if (this.o == null || b().invalidateOptionsMenu()) {
            return;
        }
        W(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // defpackage.je
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.je.g
            monitor-enter(r0)
            defpackage.je.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.J
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ae
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.G = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L4c
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L4c
            cvw r1 = defpackage.jz.N
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5b
        L4c:
            java.lang.Object r0 = r3.j
            cvw r1 = defpackage.jz.N
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5b:
            im r0 = r3.o
            if (r0 == 0) goto L62
            r0.onDestroy()
        L62:
            ju r0 = r3.ac
            if (r0 == 0) goto L69
            r0.c()
        L69:
            ju r0 = r3.ad
            if (r0 == 0) goto L70
            r0.c()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.g():void");
    }

    @Override // defpackage.je
    public final void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        im imVarB = b();
        if (imVarB != null) {
            imVarB.setShowHideAnimationEnabled(false);
        }
    }

    @Override // defpackage.je
    public final void j(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void k(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void l(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void m(int i2) throws PackageManager.NameNotFoundException {
        if (this.Z != i2) {
            this.Z = i2;
            if (this.F) {
                p();
            }
        }
    }

    @Override // defpackage.je
    public final void n(CharSequence charSequence) {
        this.P = charSequence;
        ss ssVar = this.q;
        if (ssVar != null) {
            ssVar.o(charSequence);
            return;
        }
        im imVar = this.o;
        if (imVar != null) {
            imVar.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }

    @Override // defpackage.je
    public final void p() throws PackageManager.NameNotFoundException {
        Z(true);
    }

    @Override // defpackage.je
    public final void q() throws PackageManager.NameNotFoundException {
        String strC;
        this.F = true;
        Z(false);
        V();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                strC = kuw.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                im imVar = this.o;
                if (imVar == null) {
                    this.af = true;
                } else {
                    imVar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized (je.g) {
                je.i(this);
                je.f.add(new WeakReference(this));
            }
        }
        this.H = new Configuration(this.k.getResources().getConfiguration());
        this.Y = true;
    }

    @Override // defpackage.je
    public final void r(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.D && i2 == 108) {
            return;
        }
        if (this.z && i2 == 1) {
            this.z = false;
        }
        if (i2 == 1) {
            Y();
            this.D = true;
            return;
        }
        if (i2 == 2) {
            Y();
            this.T = true;
            return;
        }
        if (i2 == 5) {
            Y();
            this.U = true;
            return;
        }
        if (i2 == 10) {
            Y();
            this.B = true;
        } else if (i2 == 108) {
            Y();
            this.z = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            Y();
            this.A = true;
        }
    }

    public final int s() {
        int i2 = this.Z;
        return i2 != -100 ? i2 : je.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int t(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.t(android.content.Context, int):int");
    }

    public final Context u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        im imVarB = b();
        Context themedContext = imVarB != null ? imVarB.getThemedContext() : null;
        return themedContext == null ? this.k : themedContext;
    }

    public final Configuration v(Context context, int i2, lah lahVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (lahVar != null) {
            jp.b(configuration2, lahVar);
        }
        return configuration2;
    }

    final jx w(Menu menu) {
        jx[] jxVarArr = this.W;
        int length = jxVarArr != null ? jxVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            jx jxVar = jxVarArr[i2];
            if (jxVar != null && jxVar.h == menu) {
                return jxVar;
            }
        }
        return null;
    }

    final Window.Callback x() {
        return this.l.getCallback();
    }

    final lah y(Context context) {
        lah lahVar;
        lah lahVarB;
        if (Build.VERSION.SDK_INT >= 33 || (lahVar = je.c) == null) {
            return null;
        }
        lah lahVarA = jp.a(context.getApplicationContext().getResources().getConfiguration());
        if (lahVar.g()) {
            lahVarB = lah.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < lahVar.a() + lahVarA.a()) {
                Locale localeF = i2 < lahVar.a() ? lahVar.f(i2) : lahVarA.f(i2 - lahVar.a());
                if (localeF != null) {
                    linkedHashSet.add(localeF);
                }
                i2++;
            }
            lahVarB = lah.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return lahVarB.g() ? lahVarA : lahVarB;
    }

    final CharSequence z() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.P;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }
}
