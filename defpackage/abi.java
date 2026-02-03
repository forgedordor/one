package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abi extends hl implements lvj, lxq, luv, pjb, ach, adr, kxy, kxz, gx, gy, ldd {
    private final pja a;
    private lxp b;
    private final fctc c;
    private final AtomicInteger d;
    private final CopyOnWriteArrayList e;
    public final ade f = new ade();
    public final ldf g = new ldf(new Runnable() { // from class: aaq
        @Override // java.lang.Runnable
        public final void run() {
            this.a.invalidateOptionsMenu();
        }
    });
    public final adq h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final abe m;
    private final fctc q;
    private final fctc r;
    private final CopyOnWriteArrayList sv;
    private boolean sw;
    private boolean sx;

    public abi() {
        pja pjaVarA = piz.a(this);
        this.a = pjaVarA;
        this.m = new abe(this);
        this.c = fctd.a(new fdae() { // from class: aas
            @Override // defpackage.fdae
            public final Object invoke() {
                return new abr(this.a.m);
            }
        });
        this.d = new AtomicInteger();
        this.h = new abh(this);
        this.e = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.sv = new CopyOnWriteArrayList();
        if (P() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        P().c(new lvh() { // from class: aat
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar, lva lvaVar) {
                Window window;
                View viewPeekDecorView;
                if (lvaVar != lva.ON_STOP || (window = this.a.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                viewPeekDecorView.cancelPendingInputEvents();
            }
        });
        P().c(new lvh() { // from class: aau
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar, lva lvaVar) {
                if (lvaVar == lva.ON_DESTROY) {
                    abi abiVar = this.a;
                    abiVar.f.b = null;
                    if (!abiVar.isChangingConfigurations()) {
                        abiVar.S().c();
                    }
                    abe abeVar = abiVar.m;
                    abi abiVar2 = abeVar.b;
                    abiVar2.getWindow().getDecorView().removeCallbacks(abeVar);
                    abiVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(abeVar);
                }
            }
        });
        P().c(new abb(this));
        pjaVarA.a();
        lwu.c(this);
        U().b("android:support:activity-result", new piw() { // from class: aav
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle = new Bundle();
                adq adqVar = this.a.h;
                Map map = adqVar.c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(adqVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(adqVar.g));
                return bundle;
            }
        });
        x(new adf() { // from class: aaw
            @Override // defpackage.adf
            public final void a() {
                abi abiVar = this.a;
                Bundle bundleA = abiVar.U().a("android:support:activity-result");
                if (bundleA != null) {
                    adq adqVar = abiVar.h;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        adqVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle != null) {
                        adqVar.g.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        Map map = adqVar.c;
                        if (map.containsKey(str)) {
                            Integer num = (Integer) map.remove(str);
                            if (!adqVar.g.containsKey(str)) {
                                Map map2 = adqVar.b;
                                fdcm.g(map2);
                                map2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.getClass();
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        str2.getClass();
                        adqVar.d(iIntValue, str2);
                    }
                }
            }
        });
        this.q = fctd.a(new fdae() { // from class: aax
            @Override // defpackage.fdae
            public final Object invoke() {
                abi abiVar = this.a;
                return new lwy(abiVar.getApplication(), abiVar, abiVar.getIntent() != null ? abiVar.getIntent().getExtras() : null);
            }
        });
        this.r = fctd.a(new fdae() { // from class: aay
            @Override // defpackage.fdae
            public final Object invoke() {
                final abi abiVar = this.a;
                final ace aceVar = new ace(new Runnable() { // from class: aaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        abi.A(abiVar);
                    }
                });
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!fdbq.f(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: aba
                            @Override // java.lang.Runnable
                            public final void run() {
                                abiVar.w(aceVar);
                            }
                        });
                        return aceVar;
                    }
                    abiVar.w(aceVar);
                }
                return aceVar;
            }
        });
    }

    public static final void A(abi abiVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!fdbq.f(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!fdbq.f(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.luv
    public lxk R() {
        return (lxk) this.q.a();
    }

    @Override // defpackage.lxq
    public final lxp S() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        y();
        lxp lxpVar = this.b;
        lxpVar.getClass();
        return lxpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.luv
    public lyp T() {
        lys lysVar = new lys((byte[]) (0 == true ? 1 : 0));
        if (getApplication() != null) {
            lysVar.b(lxh.b, getApplication());
        }
        lysVar.b(lwu.a, this);
        lysVar.b(lwu.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            lysVar.b(lwu.c, extras);
        }
        return lysVar;
    }

    @Override // defpackage.pjb
    public final pix U() {
        return this.a.a;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ach
    public final ace c() {
        return (ace) this.r.a();
    }

    @Override // defpackage.adr
    public final adq d() {
        return this.h;
    }

    @Override // defpackage.kxy
    public final void g(lbz lbzVar) {
        lbzVar.getClass();
        this.e.remove(lbzVar);
    }

    @Override // defpackage.kxy
    public final void hg(lbz lbzVar) {
        lbzVar.getClass();
        this.e.add(lbzVar);
    }

    @Override // android.app.Activity
    @fcsv
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.f(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @fcsv
    public void onBackPressed() {
        c().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lbz) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.a.b(bundle);
        ade adeVar = this.f;
        adeVar.b = this;
        Iterator it = adeVar.a.iterator();
        while (it.hasNext()) {
            ((adf) it.next()).a();
        }
        super.onCreate(bundle);
        int i = lwk.a;
        lwh.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.g.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.g.c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @fcsv
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.sw) {
            return;
        }
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lbz) it.next()).accept(new gw(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lbz) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.g.b.iterator();
        while (it.hasNext()) {
            ((fa) it.next()).a.C(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @fcsv
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.sx) {
            return;
        }
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lbz) it.next()).accept(new gz(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.g.b(menu);
        return true;
    }

    @Override // android.app.Activity
    @fcsv
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.h.f(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        abc abcVar;
        lxp lxpVar = this.b;
        if (lxpVar == null && (abcVar = (abc) getLastNonConfigurationInstance()) != null) {
            lxpVar = abcVar.a;
        }
        if (lxpVar == null) {
            return null;
        }
        abc abcVar2 = new abc();
        abcVar2.a = lxpVar;
        return abcVar2;
    }

    @Override // defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (P() instanceof lvn) {
            lvc lvcVarP = P();
            lvcVarP.getClass();
            ((lvn) lvcVarP).f(lvb.c);
        }
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lbz) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.sv.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (plm.c()) {
                plm.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            abr abrVarU = u();
            synchronized (abrVarU.a) {
                abrVarU.b = true;
                List list = abrVarU.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((fdae) it.next()).invoke();
                }
                list.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        z();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @fcsv
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @fcsv
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final abr u() {
        return (abr) this.c.a();
    }

    public final adj v(adx adxVar, adi adiVar) {
        adq adqVar = this.h;
        adqVar.getClass();
        return adqVar.c("activity_rq#" + this.d.getAndIncrement(), this, adxVar, adiVar);
    }

    public final void w(final ace aceVar) {
        P().c(new lvh() { // from class: aar
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar, lva lvaVar) {
                if (lvaVar == lva.ON_CREATE) {
                    abi abiVar = this;
                    ace aceVar2 = aceVar;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = abiVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    aceVar2.e(onBackInvokedDispatcher);
                }
            }
        });
    }

    public final void x(adf adfVar) {
        ade adeVar = this.f;
        if (adeVar.b != null) {
            adfVar.a();
        }
        adeVar.a.add(adfVar);
    }

    public final void y() {
        if (this.b == null) {
            abc abcVar = (abc) getLastNonConfigurationInstance();
            if (abcVar != null) {
                this.b = abcVar.a;
            }
            if (this.b == null) {
                this.b = new lxp();
            }
        }
    }

    public final void z() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        lxr.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        lxs.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        pje.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        acl.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    @fcsv
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @fcsv
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.sw = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.sw = false;
            Iterator it = this.k.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((lbz) it.next()).accept(new gw(z));
            }
        } catch (Throwable th) {
            this.sw = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.sx = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.sx = false;
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((lbz) it.next()).accept(new gz(z));
            }
        } catch (Throwable th) {
            this.sx = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        z();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
