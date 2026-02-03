package defpackage;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.android.vcard.VCardConfig;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efrl extends TemplateLayout {
    public static final efte a = new efte("PartnerCustomizationLayout");
    public Activity b;
    fi c;
    final ViewTreeObserver.OnWindowFocusChangeListener d;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;

    public efrl(Context context) {
        this(context, 0, 0);
    }

    private void l(AttributeSet attributeSet, int i) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, efrm.d, i, 0);
        boolean z = true;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, efrm.a, i, 0);
        this.j = typedArrayObtainStyledAttributes2.getDimensionPixelSize(13, typedArrayObtainStyledAttributes2.getDimensionPixelSize(17, 0));
        typedArrayObtainStyledAttributes2.recycle();
        if (z2) {
            setSystemUiVisibility(1024);
        }
        k(efsz.class, new efsz(this, this.b.getWindow(), attributeSet, i));
        k(efta.class, new efta(this, this.b.getWindow()));
        k(efss.class, new efss(this, attributeSet, i));
        efta eftaVar = (efta) i(efta.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TemplateLayout templateLayout = eftaVar.a;
            TypedArray typedArrayObtainStyledAttributes3 = templateLayout.getContext().obtainStyledAttributes(attributeSet, efrm.f, i, 0);
            int color = typedArrayObtainStyledAttributes3.getColor(1, 0);
            eftaVar.e = color;
            eftaVar.a(color);
            Window window = eftaVar.b;
            if (window != null && (window.getDecorView().getSystemUiVisibility() & 16) != 16) {
                z = false;
            }
            boolean zL = typedArrayObtainStyledAttributes3.getBoolean(0, z);
            if (window != null) {
                if (eftaVar.c) {
                    Context context = templateLayout.getContext();
                    zL = efsj.h(context).l(context, efsh.CONFIG_LIGHT_NAVIGATION_BAR, false);
                }
                if (zL) {
                    window.getDecorView().setSystemUiVisibility(16 | window.getDecorView().getSystemUiVisibility());
                } else {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-17));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = templateLayout.getContext().obtainStyledAttributes(new int[]{R.attr.navigationBarDividerColor});
                int color2 = typedArrayObtainStyledAttributes3.getColor(2, typedArrayObtainStyledAttributes4.getColor(0, 0));
                if (Build.VERSION.SDK_INT >= 28 && window != null) {
                    if (eftaVar.c) {
                        Context context2 = templateLayout.getContext();
                        efsj efsjVarH = efsj.h(context2);
                        efsh efshVar = efsh.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR;
                        if (efsjVarH.t(efshVar)) {
                            color2 = efsj.h(context2).c(context2, efshVar);
                        }
                    }
                    window.setNavigationBarDividerColor(color2);
                }
                typedArrayObtainStyledAttributes4.recycle();
            }
            typedArrayObtainStyledAttributes3.recycle();
        }
        this.b.getWindow().addFlags(Integer.MIN_VALUE);
        this.b.getWindow().clearFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        this.b.getWindow().clearFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = com.google.android.apps.messaging.R.layout.partner_customization_layout;
        }
        return h(layoutInflater, 0, i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected ViewGroup b(int i) {
        if (i == 0) {
            i = com.google.android.apps.messaging.R.id.suc_layout_content;
        }
        return super.b(i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void c(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.g = true;
        this.b = efsj.e(getContext());
        efte efteVar = a;
        efteVar.a(a.r(efsj.o(getContext()), "Flag of isEnhancedSetupDesignMetricsEnabled="));
        if (efsj.o(getContext())) {
            Activity activity = this.b;
            if (activity instanceof eg) {
                this.c = new efrk(this);
                fr frVarA = ((eg) activity).a();
                fi fiVar = this.c;
                er erVar = frVarA.l;
                fiVar.getClass();
                erVar.a.add(new eq(fiVar));
                efteVar.a("Register the onFragmentAttached lifecycle callbacks to ".concat(String.valueOf(activity.getClass().getSimpleName())));
            }
        }
        boolean zA = eftj.a(this.b.getIntent());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, efrm.d, i, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            efteVar.d("Attribute sucUsePartnerResource not found in ".concat(String.valueOf(String.valueOf(this.b.getComponentName()))));
        }
        if (!zA && !typedArrayObtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.g = z;
        this.i = typedArrayObtainStyledAttributes.hasValue(0);
        this.h = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        efteVar.a("activity=" + this.b.getClass().getSimpleName() + " isSetupFlow=" + zA + " enablePartnerResourceLoading=true usePartnerResourceAttr=" + this.g + " useDynamicColor=" + this.i + " useFullDynamicColorAttr=" + this.h);
    }

    public final boolean d() {
        Bundle bundle;
        if (!eftb.a() || !efsj.h(getContext()).m()) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Context context = getContext();
        if (efsj.e == null) {
            try {
                efsj.e = context.getContentResolver().call(efsj.g(), "isDynamicColorEnabled", (String) null, (Bundle) null);
                bundle = efsj.e;
                if (bundle == null && bundle.getBoolean("isDynamicColorEnabled", false)) {
                    return true;
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(efsj.a, "SetupWizard dynamic color supporting status unknown; return as false.");
                efsj.e = null;
            }
        } else {
            bundle = efsj.e;
            if (bundle == null) {
            }
        }
        return false;
    }

    public final boolean e() {
        return this.g && Build.VERSION.SDK_INT >= 29 && efsj.h(getContext()).m();
    }

    public final boolean f() {
        if (d()) {
            return this.h || efsj.v(getContext());
        }
        return false;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        LinearLayout linearLayout;
        if (efsj.r(getContext()) && windowInsets.getSystemWindowInsetBottom() > 0) {
            a.a("NavigationBarHeight: " + windowInsets.getSystemWindowInsetBottom());
            efss efssVar = (efss) i(efss.class);
            LinearLayout linearLayout2 = efssVar.g;
            View viewFindViewById = findViewById(com.google.android.apps.messaging.R.id.suc_layout_status);
            efsj efsjVarH = efsj.h(getContext());
            efsh efshVar = efsh.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM;
            if (efsjVarH.t(efshVar)) {
                this.j = (int) efsj.h(getContext()).a(getContext(), efshVar);
            }
            if (efssVar == null || (linearLayout = efssVar.g) == null || linearLayout.getVisibility() == 8) {
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), this.j + windowInsets.getSystemWindowInsetBottom());
            } else {
                linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), this.j + windowInsets.getSystemWindowInsetBottom());
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), 0);
            }
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        FragmentManager fragmentManager;
        super.onAttachedToWindow();
        Activity activity = this.b;
        efrj efrjVar = new efrj(this);
        String str = efrr.a;
        efrr efrrVar = null;
        if (!eftj.a(activity.getIntent()) || (fragmentManager = activity.getFragmentManager()) == null || fragmentManager.isDestroyed()) {
            efrr.b.a("Skip attach " + activity.getClass().getSimpleName() + " because it's not in SUW flow.");
        } else {
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
            if (fragmentFindFragmentByTag == null) {
                efrr efrrVar2 = new efrr();
                efrrVar2.c = efrjVar;
                try {
                    fragmentManager.beginTransaction().add(efrrVar2, "lifecycle_monitor").commitNow();
                    fragmentFindFragmentByTag = efrrVar2;
                } catch (IllegalStateException e) {
                    efrr.b.e("Error occurred when attach to Activity:".concat(String.valueOf(String.valueOf(activity.getComponentName()))), e);
                }
            } else if (fragmentFindFragmentByTag instanceof efrr) {
                efrr.b.a("Find an existing fragment that belongs to ".concat(String.valueOf(activity.getClass().getSimpleName())));
            } else {
                Log.wtf(efrr.a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
            }
            efrrVar = (efrr) fragmentFindFragmentByTag;
        }
        if (efrrVar == null) {
            efte efteVar = a;
            Activity activity2 = this.b;
            efteVar.a("Unable to attach lifecycle fragment to the host activity. Activity=".concat(String.valueOf(activity2 != null ? activity2.getClass().getSimpleName() : "null")));
        }
        if (eftj.a(this.b.getIntent())) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.d);
        }
        efss efssVar = (efss) i(efss.class);
        efsg efsgVar = efssVar.r;
        efsgVar.b(efssVar.i(), false);
        efsgVar.c(efssVar.j(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        r0.remove(r2);
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDetachedFromWindow() {
        /*
            r8 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L9c
            android.app.Activity r0 = r8.b
            android.content.Intent r0 = r0.getIntent()
            boolean r0 = defpackage.eftj.a(r0)
            if (r0 == 0) goto L9c
            java.lang.Class<efss> r0 = defpackage.efss.class
            efsy r0 = r8.i(r0)
            efss r0 = (defpackage.efss) r0
            if (r0 == 0) goto L74
            r0.e()
            efst r1 = r0.h
            efst r3 = r0.i
            if (r1 == 0) goto L30
            java.lang.String r4 = "PrimaryFooterButton"
            android.os.PersistableBundle r1 = r1.a(r4)
            goto L32
        L30:
            android.os.PersistableBundle r1 = android.os.PersistableBundle.EMPTY
        L32:
            if (r3 == 0) goto L3b
            java.lang.String r4 = "SecondaryFooterButton"
            android.os.PersistableBundle r3 = r3.a(r4)
            goto L3d
        L3b:
            android.os.PersistableBundle r3 = android.os.PersistableBundle.EMPTY
        L3d:
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r5 = "onDetachedFromWindow"
            long r6 = java.lang.System.nanoTime()
            r4.putLong(r5, r6)
            android.os.PersistableBundle r0 = r0.a()
            r5 = 3
            android.os.PersistableBundle[] r5 = new android.os.PersistableBundle[r5]
            r5[r2] = r3
            android.os.PersistableBundle r3 = android.os.PersistableBundle.EMPTY
            r6 = 1
            r5[r6] = r3
            r3 = 2
            r5[r3] = r4
            android.os.PersistableBundle r0 = defpackage.efrs.b(r0, r1, r5)
            android.content.Context r1 = r8.getContext()
            android.app.Activity r3 = r8.b
            java.lang.String r4 = "SetupCompatMetrics"
            com.google.android.setupcompat.logging.MetricKey r3 = com.google.android.setupcompat.logging.MetricKey.b(r4, r3)
            com.google.android.setupcompat.logging.CustomEvent r0 = com.google.android.setupcompat.logging.CustomEvent.b(r3, r0)
            defpackage.efsf.a(r1, r0)
            goto L9c
        L74:
            efte r0 = defpackage.efrl.a
            java.lang.String r1 = "FooterBarMixin is null"
            r0.f(r1)
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>()
            java.lang.String r1 = "onDetachedFromWindow"
            long r3 = java.lang.System.nanoTime()
            r0.putLong(r1, r3)
            android.content.Context r1 = r8.getContext()
            android.app.Activity r3 = r8.b
            java.lang.String r4 = "SetupCompatMetrics"
            com.google.android.setupcompat.logging.MetricKey r3 = com.google.android.setupcompat.logging.MetricKey.b(r4, r3)
            com.google.android.setupcompat.logging.CustomEvent r0 = com.google.android.setupcompat.logging.CustomEvent.b(r3, r0)
            defpackage.efsf.a(r1, r0)
        L9c:
            android.view.ViewTreeObserver r0 = r8.getViewTreeObserver()
            android.view.ViewTreeObserver$OnWindowFocusChangeListener r1 = r8.d
            r0.removeOnWindowFocusChangeListener(r1)
            android.content.Context r0 = r8.getContext()
            boolean r0 = defpackage.efsj.o(r0)
            if (r0 == 0) goto Le1
            android.app.Activity r0 = r8.b
            boolean r1 = r0 instanceof defpackage.eg
            if (r1 == 0) goto Le1
            eg r0 = (defpackage.eg) r0
            fr r0 = r0.a()
            fi r1 = r8.c
            er r0 = r0.l
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.a
            monitor-enter(r0)
            int r3 = r0.size()     // Catch: java.lang.Throwable -> Lde
        Lc9:
            if (r2 >= r3) goto Ldc
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.Throwable -> Lde
            eq r4 = (defpackage.eq) r4     // Catch: java.lang.Throwable -> Lde
            fi r4 = r4.a     // Catch: java.lang.Throwable -> Lde
            if (r4 != r1) goto Ld9
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lde
            goto Ldc
        Ld9:
            int r2 = r2 + 1
            goto Lc9
        Ldc:
            monitor-exit(r0)
            return
        Lde:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efrl.onDetachedFromWindow():void");
    }

    public efrl(Context context, int i) {
        this(context, i, 0);
    }

    public efrl(Context context, int i, int i2) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        super(context, i, i2);
        this.d = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: efri
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                efrl efrlVar = this.a;
                efrw efrwVarA = efrw.a(efrlVar.getContext());
                String shortString = efrlVar.b.getComponentName().toShortString();
                Activity activity = efrlVar.b;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", activity.getComponentName().getPackageName());
                bundle.putString("screenName", activity.getComponentName().getShortClassName());
                bundle.putInt("hash", efrlVar.hashCode());
                bundle.putBoolean("focus", z);
                bundle.putLong("timeInMillis", System.currentTimeMillis());
                efrwVarA.e(shortString, bundle);
            }
        };
        l(null, com.google.android.apps.messaging.R.attr.sucLayoutTheme);
    }

    public efrl(Context context, AttributeSet attributeSet) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        super(context, attributeSet);
        this.d = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: efri
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                efrl efrlVar = this.a;
                efrw efrwVarA = efrw.a(efrlVar.getContext());
                String shortString = efrlVar.b.getComponentName().toShortString();
                Activity activity = efrlVar.b;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", activity.getComponentName().getPackageName());
                bundle.putString("screenName", activity.getComponentName().getShortClassName());
                bundle.putInt("hash", efrlVar.hashCode());
                bundle.putBoolean("focus", z);
                bundle.putLong("timeInMillis", System.currentTimeMillis());
                efrwVarA.e(shortString, bundle);
            }
        };
        l(attributeSet, com.google.android.apps.messaging.R.attr.sucLayoutTheme);
    }

    public efrl(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        super(context, attributeSet, i);
        this.d = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: efri
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                efrl efrlVar = this.a;
                efrw efrwVarA = efrw.a(efrlVar.getContext());
                String shortString = efrlVar.b.getComponentName().toShortString();
                Activity activity = efrlVar.b;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", activity.getComponentName().getPackageName());
                bundle.putString("screenName", activity.getComponentName().getShortClassName());
                bundle.putInt("hash", efrlVar.hashCode());
                bundle.putBoolean("focus", z);
                bundle.putLong("timeInMillis", System.currentTimeMillis());
                efrwVarA.e(shortString, bundle);
            }
        };
        l(attributeSet, i);
    }
}
