package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knx extends jgl {
    private static final fdap j = knr.a;
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public koa d;
    public kji e;
    public final hox f;
    public final hox g;
    public final hsf h;
    public final int[] i;
    private fdae k;
    private koc l;
    private kjd m;
    private final float n;
    private final Rect o;
    private final iao p;
    private Object q;
    private final hox r;
    private boolean s;
    private final knz t;

    public knx(fdae fdaeVar, koc kocVar, View view, kio kioVar, koa koaVar, UUID uuid, knz knzVar) {
        super(view.getContext(), null, 0, 6, null);
        this.k = fdaeVar;
        this.l = kocVar;
        this.a = view;
        this.t = knzVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.b = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = kna.a(this.l, kna.d(view));
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.c = layoutParams;
        this.d = koaVar;
        this.e = kji.a;
        hsi hsiVar = hsi.a;
        this.f = new hpl(null, hsiVar);
        this.g = new hpl(null, hsiVar);
        knt kntVar = new knt(this);
        hxn hxnVar = hrp.a;
        this.h = new hnt(kntVar, null);
        this.n = 8.0f;
        this.o = new Rect();
        this.p = new iao(new knv(this));
        setId(android.R.id.content);
        lxr.b(this, lxr.a(view));
        lxs.b(this, lxs.a(view));
        pje.b(this, pje.a(view));
        Objects.toString(uuid);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:".concat(String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(kioVar.en(8.0f));
        setOutlineProvider(new knq());
        this.r = new hpl(kng.a, hsiVar);
        this.i = new int[2];
    }

    private final kjd o() {
        View view = this.a;
        Rect rect = this.o;
        view.getWindowVisibleDisplayFrame(rect);
        int i = kna.a;
        return new kjd(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final ivy a() {
        return (ivy) this.g.a();
    }

    @Override // defpackage.jgl
    public final void b(hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-857613600);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            ((fdat) this.r.a()).a(hmlVarC, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new kns(this, i);
        }
    }

    public final kjg c() {
        return (kjg) this.f.a();
    }

    @Override // defpackage.jgl
    protected final boolean d() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.l.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                fdae fdaeVar = this.k;
                if (fdaeVar != null) {
                    fdaeVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.jgl
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        knz.b(this.b, this, layoutParams);
    }

    @Override // defpackage.jgl
    public final void h(int i, int i2) {
        kjd kjdVarO = o();
        super.h(View.MeasureSpec.makeMeasureSpec(kjdVarO.b(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(kjdVarO.a(), Integer.MIN_VALUE));
    }

    public final void k(hnb hnbVar, fdat fdatVar) {
        super.i(hnbVar);
        this.r.b(fdatVar);
        this.s = true;
    }

    public final void l() {
        ivy ivyVarA = a();
        if (ivyVarA != null) {
            if (true != ivyVarA.u()) {
                ivyVarA = null;
            }
            if (ivyVarA == null) {
                return;
            }
            long jG = ivyVarA.g();
            long jB = ivz.b(ivyVarA);
            kjd kjdVarA = kje.a((Math.round(Float.intBitsToFloat((int) (jB >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jB & 4294967295L)))), jG);
            if (fdbq.f(kjdVarA, this.m)) {
                return;
            }
            this.m = kjdVarA;
            m();
        }
    }

    public final void m() {
        kjg kjgVarC;
        kjd kjdVar = this.m;
        if (kjdVar == null || (kjgVarC = c()) == null) {
            return;
        }
        kjd kjdVarO = o();
        int iB = kjdVarO.b();
        long jA = kjdVarO.a();
        fdch fdchVar = new fdch();
        fdchVar.a = 0L;
        long j2 = (iB << 32) | (jA & 4294967295L);
        this.p.c(this, j, new knw(fdchVar, this, kjdVar, j2, kjgVarC.a));
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.x = kjb.a(fdchVar.a);
        layoutParams.y = kjb.b(fdchVar.a);
        this.t.a(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        knz.b(this.b, this, layoutParams);
    }

    public final void n(fdae fdaeVar, koc kocVar, kji kjiVar) {
        int i;
        this.k = fdaeVar;
        if (!fdbq.f(this.l, kocVar)) {
            this.l = kocVar;
            WindowManager.LayoutParams layoutParams = this.c;
            layoutParams.flags = kna.a(kocVar, kna.d(this.a));
            knz.b(this.b, this, layoutParams);
        }
        int iOrdinal = kjiVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new fctg();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.jgl, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onAttachedToWindow();
        this.p.d();
        if (!this.l.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.q == null) {
            final fdae fdaeVar = this.k;
            this.q = new OnBackInvokedCallback() { // from class: knc
                public final void onBackInvoked() {
                    fdae fdaeVar2 = fdaeVar;
                    if (fdaeVar2 != null) {
                        fdaeVar2.invoke();
                    }
                }
            };
        }
        ?? r0 = this.q;
        if (!ja$$ExternalSyntheticApiModelOutline0.m560m((Object) r0) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, r0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onDetachedFromWindow();
        iao iaoVar = this.p;
        iaoVar.e();
        iaoVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            ?? r0 = this.q;
            if (ja$$ExternalSyntheticApiModelOutline0.m560m((Object) r0) && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(r0);
            }
        }
        this.q = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            fdae fdaeVar = this.k;
            if (fdaeVar == null) {
                return true;
            }
            fdaeVar.invoke();
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        fdae fdaeVar2 = this.k;
        if (fdaeVar2 == null) {
            return true;
        }
        fdaeVar2.invoke();
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}
