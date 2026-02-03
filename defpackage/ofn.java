package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofn extends FrameLayout {
    private final Drawable A;
    private final String B;
    private final String C;
    private final String D;
    private final Drawable E;
    private final Drawable F;
    private final float G;
    private final float H;
    private final String I;
    private final String J;
    private boolean K;
    private final boolean L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private long S;
    private long[] T;
    private boolean[] U;
    private long[] V;
    private boolean[] W;
    public final ofl a;
    private long aa;
    private long ab;
    public final CopyOnWriteArrayList b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;
    public final TextView k;
    public final StringBuilder l;
    public final Formatter m;
    public final mck n;
    public mcg o;
    public boolean p;
    public int q;
    public int r;
    private final View s;
    private final TextView t;
    private final ohq u;
    private final mcj v;
    private final Runnable w;
    private final Runnable x;
    private final Drawable y;
    private final Drawable z;

    static {
        mbp.b("media3.ui");
    }

    public ofn(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.L = true;
        this.q = 5000;
        this.r = 0;
        this.M = BasePaymentResult.ERROR_REQUEST_FAILED;
        this.S = -9223372036854775807L;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = false;
        int resourceId = R.layout.exo_legacy_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ohj.c, 0, 0);
            try {
                this.q = typedArrayObtainStyledAttributes.getInt(19, this.q);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.exo_legacy_player_control_view);
                this.r = typedArrayObtainStyledAttributes.getInt(8, this.r);
                this.N = typedArrayObtainStyledAttributes.getBoolean(17, this.N);
                this.O = typedArrayObtainStyledAttributes.getBoolean(14, this.O);
                this.P = typedArrayObtainStyledAttributes.getBoolean(16, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(15, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(18, this.R);
                this.M = mgb.d(typedArrayObtainStyledAttributes.getInt(20, this.M), 16, 1000);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.b = new CopyOnWriteArrayList();
        this.v = new mcj();
        this.n = new mck();
        StringBuilder sb = new StringBuilder();
        this.l = sb;
        this.m = new Formatter(sb, Locale.getDefault());
        this.T = new long[0];
        this.U = new boolean[0];
        this.V = new long[0];
        this.W = new boolean[0];
        ofl oflVar = new ofl(this);
        this.a = oflVar;
        this.w = new Runnable() { // from class: ofj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        };
        this.x = new Runnable() { // from class: ofk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        ohq ohqVar = (ohq) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (ohqVar != null) {
            this.u = ohqVar;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.u = defaultTimeBar;
        } else {
            this.u = null;
        }
        this.t = (TextView) findViewById(R.id.exo_duration);
        this.k = (TextView) findViewById(R.id.exo_position);
        ohq ohqVar2 = this.u;
        if (ohqVar2 != null) {
            ohqVar2.b(oflVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oflVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oflVar);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(oflVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oflVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oflVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oflVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oflVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(oflVar);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.s = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setVisibility(8);
        }
        o(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.G = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.H = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.y = mgb.C(context, resources, R.drawable.exo_legacy_controls_repeat_off);
        this.z = mgb.C(context, resources, R.drawable.exo_legacy_controls_repeat_one);
        this.A = mgb.C(context, resources, R.drawable.exo_legacy_controls_repeat_all);
        this.E = mgb.C(context, resources, R.drawable.exo_legacy_controls_shuffle_on);
        this.F = mgb.C(context, resources, R.drawable.exo_legacy_controls_shuffle_off);
        this.B = resources.getString(R.string.exo_controls_repeat_off_description);
        this.C = resources.getString(R.string.exo_controls_repeat_one_description);
        this.D = resources.getString(R.string.exo_controls_repeat_all_description);
        this.I = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.J = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.ab = -9223372036854775807L;
    }

    private final void o(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.G : this.H);
        view.setVisibility(true != z ? 8 : 0);
    }

    public final void a(ofm ofmVar) {
        mee.f(ofmVar);
        this.b.add(ofmVar);
    }

    public final void b() {
        if (n()) {
            setVisibility(8);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ofm) it.next()).E(getVisibility());
            }
            removeCallbacks(this.w);
            removeCallbacks(this.x);
            this.S = -9223372036854775807L;
        }
    }

    public final void c() {
        Runnable runnable = this.x;
        removeCallbacks(runnable);
        if (this.q <= 0) {
            this.S = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.q;
        this.S = jUptimeMillis + j;
        if (this.K) {
            postDelayed(runnable, j);
        }
    }

    public final void d() {
        if (mgb.ae(this.o, this.L)) {
            View view = this.e;
            if (view != null) {
                view.sendAccessibilityEvent(8);
                return;
            }
            return;
        }
        View view2 = this.f;
        if (view2 != null) {
            view2.sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.x);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        if (mgb.ae(this.o, this.L)) {
            View view = this.e;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        View view2 = this.f;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    public final void f() {
        h();
        g();
        j();
        k();
        l();
    }

    public final void g() {
        boolean zM;
        boolean zM2;
        boolean zM3;
        boolean zM4;
        boolean zM5;
        if (n() && this.K) {
            mcg mcgVar = this.o;
            if (mcgVar != null) {
                zM = mcgVar.m(5);
                zM3 = mcgVar.m(7);
                zM4 = mcgVar.m(11);
                zM5 = mcgVar.m(12);
                zM2 = mcgVar.m(9);
            } else {
                zM = false;
                zM2 = false;
                zM3 = false;
                zM4 = false;
                zM5 = false;
            }
            o(this.P, zM3, this.c);
            o(this.N, zM4, this.h);
            o(this.O, zM5, this.g);
            o(this.Q, zM2, this.d);
            ohq ohqVar = this.u;
            if (ohqVar != null) {
                ohqVar.setEnabled(zM);
            }
        }
    }

    public final void h() {
        boolean z;
        boolean z2;
        if (n() && this.K) {
            boolean zAe = mgb.ae(this.o, this.L);
            View view = this.e;
            if (view != null) {
                z = !zAe && view.isFocused();
                z2 = !zAe && view.isAccessibilityFocused();
                view.setVisibility(true != zAe ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= zAe && view2.isFocused();
                z2 |= zAe && view2.isAccessibilityFocused();
                view2.setVisibility(true != zAe ? 0 : 8);
            }
            if (z) {
                e();
            }
            if (z2) {
                d();
            }
        }
    }

    public final void i() {
        long jX;
        long jW;
        if (n() && this.K) {
            mcg mcgVar = this.o;
            if (mcgVar != null) {
                long j = this.aa;
                mcg mcgVar2 = ((maw) mcgVar).a;
                jX = j + mcgVar2.x();
                jW = this.aa + mcgVar2.w();
            } else {
                jX = 0;
                jW = 0;
            }
            long j2 = this.ab;
            this.ab = jX;
            TextView textView = this.k;
            if (textView != null && !this.p && jX != j2) {
                textView.setText(mgb.L(this.l, this.m, jX));
            }
            ohq ohqVar = this.u;
            if (ohqVar != null) {
                ohqVar.g(jX);
                ohqVar.e(jW);
            }
            Runnable runnable = this.w;
            removeCallbacks(runnable);
            int iT = mcgVar == null ? 1 : mcgVar.t();
            if (mcgVar != null) {
                mcg mcgVar3 = ((maw) mcgVar).a;
                if (mcgVar3.q()) {
                    long jMin = Math.min(ohqVar != null ? ohqVar.a() : 1000L, 1000 - (jX % 1000));
                    float f = mcgVar3.F().b;
                    postDelayed(runnable, mgb.s(f > 0.0f ? (long) (jMin / f) : 1000L, this.M, 1000L));
                    return;
                }
            }
            if (iT == 4 || iT == 1) {
                return;
            }
            postDelayed(runnable, 1000L);
        }
    }

    public final void j() {
        ImageView imageView;
        if (n() && this.K && (imageView = this.i) != null) {
            if (this.r == 0) {
                o(false, false, imageView);
                return;
            }
            mcg mcgVar = this.o;
            if (mcgVar == null) {
                o(true, false, imageView);
                imageView.setImageDrawable(this.y);
                imageView.setContentDescription(this.B);
                return;
            }
            o(true, true, imageView);
            int iV = mcgVar.v();
            if (iV == 0) {
                imageView.setImageDrawable(this.y);
                imageView.setContentDescription(this.B);
            } else if (iV == 1) {
                imageView.setImageDrawable(this.z);
                imageView.setContentDescription(this.C);
            } else if (iV == 2) {
                imageView.setImageDrawable(this.A);
                imageView.setContentDescription(this.D);
            }
            imageView.setVisibility(0);
        }
    }

    public final void k() {
        ImageView imageView;
        if (n() && this.K && (imageView = this.j) != null) {
            mcg mcgVar = this.o;
            if (!this.R) {
                o(false, false, imageView);
                return;
            }
            if (mcgVar == null) {
                o(true, false, imageView);
                imageView.setImageDrawable(this.F);
                imageView.setContentDescription(this.J);
            } else {
                o(true, true, imageView);
                imageView.setImageDrawable(mcgVar.X() ? this.E : this.F);
                imageView.setContentDescription(mcgVar.X() ? this.I : this.J);
            }
        }
    }

    public final void l() {
        mcg mcgVar = this.o;
        if (mcgVar == null) {
            return;
        }
        long j = 0;
        this.aa = 0L;
        mcl mclVarH = mcgVar.H();
        if (!mclVarH.q()) {
            int iAE = mcgVar.aE();
            int i = iAE;
            while (true) {
                if (i > iAE) {
                    break;
                }
                if (i == iAE) {
                    this.aa = mgb.B(j);
                }
                mck mckVar = this.n;
                mclVarH.p(i, mckVar);
                if (mckVar.m == -9223372036854775807L) {
                    mee.c(true);
                    break;
                }
                for (int i2 = mckVar.n; i2 <= mckVar.o; i2++) {
                    mcj mcjVar = this.v;
                    mclVarH.n(i2, mcjVar);
                    mcjVar.j();
                    mcjVar.m();
                }
                j += mckVar.m;
                i++;
            }
        }
        TextView textView = this.t;
        long jB = mgb.B(j);
        if (textView != null) {
            textView.setText(mgb.L(this.l, this.m, jB));
        }
        ohq ohqVar = this.u;
        if (ohqVar != null) {
            ohqVar.f(jB);
            int length = this.V.length;
            long[] jArr = this.T;
            if (jArr.length < 0) {
                this.T = Arrays.copyOf(jArr, 0);
                this.U = Arrays.copyOf(this.U, 0);
            }
            System.arraycopy(this.V, 0, this.T, 0, 0);
            System.arraycopy(this.W, 0, this.U, 0, 0);
            ohqVar.d(this.T, this.U, 0);
        }
        i();
    }

    public final boolean m(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        mcg mcgVar = this.o;
        if (mcgVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87) {
            if (keyCode != 88) {
                return false;
            }
            keyCode = 88;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (mcgVar.t() == 4) {
                return true;
            }
            mcgVar.g();
            return true;
        }
        if (keyCode == 89) {
            mcgVar.f();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            mgb.am(mcgVar, this.L);
            return true;
        }
        if (keyCode == 87) {
            mcgVar.i();
            return true;
        }
        if (keyCode == 88) {
            mcgVar.j();
            return true;
        }
        if (keyCode == 126) {
            mgb.aq(mcgVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        mgb.ap(mcgVar);
        return true;
    }

    public final boolean n() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        long j = this.S;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.x, jUptimeMillis);
            }
        } else if (n()) {
            c();
        }
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        removeCallbacks(this.w);
        removeCallbacks(this.x);
    }
}
