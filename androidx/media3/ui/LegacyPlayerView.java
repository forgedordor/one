package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.maw;
import defpackage.mcg;
import defpackage.mde;
import defpackage.mee;
import defpackage.mrn;
import defpackage.ofm;
import defpackage.ofn;
import defpackage.ofo;
import java.util.Iterator;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class LegacyPlayerView extends FrameLayout {
    public final ofo a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final SubtitleView e;
    public final ofn f;
    public mcg g;
    public boolean h;
    public ofm i;
    public boolean j;
    private final boolean k;
    private final ImageView l;
    private final View m;
    private final TextView n;
    private boolean o;
    private Drawable p;
    private int q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;

    public LegacyPlayerView(Context context) {
        this(context, null);
    }

    protected static final void m(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a(f);
        }
    }

    private final void n() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private final void o() {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    private final void p(boolean z) {
        if (l()) {
            ofn ofnVar = this.f;
            ofnVar.q = z ? 0 : this.s;
            if (ofnVar.n()) {
                ofnVar.c();
            }
            if (!ofnVar.n()) {
                ofnVar.setVisibility(0);
                Iterator it = ofnVar.b.iterator();
                while (it.hasNext()) {
                    ((ofm) it.next()).E(ofnVar.getVisibility());
                }
                ofnVar.f();
                ofnVar.e();
                ofnVar.d();
            }
            ofnVar.c();
        }
    }

    private final boolean q(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m(this.b, intrinsicWidth / intrinsicHeight);
                ImageView imageView = this.l;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private final boolean r() {
        mcg mcgVar = this.g;
        if (mcgVar == null) {
            return true;
        }
        int iT = mcgVar.t();
        if (this.t) {
            return iT == 1 || iT == 4 || !this.g.W();
        }
        return false;
    }

    public final void a() {
        ofn ofnVar = this.f;
        if (ofnVar != null) {
            ofnVar.b();
        }
    }

    public final void b(boolean z) {
        if (!(k() && this.j) && l()) {
            ofn ofnVar = this.f;
            boolean z2 = true;
            boolean z3 = false;
            if (ofnVar.n() && ofnVar.q <= 0) {
                z3 = true;
            }
            boolean zR = r();
            if (z || z3) {
                z2 = zR;
            } else if (!zR) {
                return;
            }
            p(z2);
        }
    }

    public final void c(int i) {
        ofn ofnVar = this.f;
        mee.g(ofnVar);
        this.s = i;
        if (ofnVar.n()) {
            p(r());
        }
    }

    public final void d() {
        if (!l() || this.g == null) {
            return;
        }
        ofn ofnVar = this.f;
        if (!ofnVar.n()) {
            b(true);
        } else if (this.u) {
            ofnVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        mcg mcgVar = this.g;
        if (mcgVar != null && mcgVar.Y()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && l() && !this.f.n()) {
            b(true);
            return true;
        }
        if ((l() && this.f.m(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            b(true);
            return true;
        }
        if (!z || !l()) {
            return false;
        }
        b(true);
        return false;
    }

    public final void e() {
        mcg mcgVar = this.g;
        mde mdeVarK = mcgVar != null ? ((maw) mcgVar).a.K() : mde.a;
        int i = mdeVarK.b;
        int i2 = mdeVarK.c;
        m(this.b, true != this.k ? (i2 == 0 || i == 0) ? 0.0f : (i * mdeVarK.d) / i2 : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            android.view.View r0 = r4.m
            if (r0 == 0) goto L25
            mcg r1 = r4.g
            if (r1 == 0) goto L20
            int r1 = r1.t()
            r2 = 2
            if (r1 != r2) goto L20
            int r1 = r4.q
            r3 = 0
            if (r1 == r2) goto L22
            r2 = 1
            if (r1 != r2) goto L20
            mcg r1 = r4.g
            boolean r1 = r1.W()
            if (r1 == 0) goto L20
            goto L22
        L20:
            r3 = 8
        L22:
            r0.setVisibility(r3)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerView.f():void");
    }

    public final void g() {
        ofn ofnVar = this.f;
        if (ofnVar == null || !this.h) {
            setContentDescription(null);
        } else if (ofnVar.getVisibility() == 0) {
            setContentDescription(this.u ? getResources().getString(com.google.android.apps.messaging.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.google.android.apps.messaging.R.string.exo_controls_show));
        }
    }

    public final void h() {
        if (k() && this.j) {
            a();
        } else {
            b(false);
        }
    }

    public final void i() {
        TextView textView = this.n;
        if (textView != null) {
            mcg mcgVar = this.g;
            if (mcgVar != null) {
                ((mrn) ((maw) mcgVar).a).ad();
            }
            textView.setVisibility(8);
        }
    }

    public final void j(boolean z) {
        mcg mcgVar = this.g;
        if (mcgVar == null || !mcgVar.m(30) || mcgVar.J().a()) {
            if (this.r) {
                return;
            }
            o();
            n();
            return;
        }
        if (z && !this.r) {
            n();
        }
        if (mcgVar.J().b(2)) {
            o();
            return;
        }
        n();
        if (this.o) {
            mee.g(this.l);
            byte[] bArr = ((maw) mcgVar).a.E().g;
            if (bArr != null) {
                if (q(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                    return;
                }
            }
            if (q(this.p)) {
                return;
            }
        }
        o();
    }

    public final boolean k() {
        mcg mcgVar = this.g;
        return mcgVar != null && mcgVar.Y() && this.g.W();
    }

    public final boolean l() {
        if (!this.h) {
            return false;
        }
        mee.g(this.f);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!l() || this.g == null) {
            return false;
        }
        b(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        d();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public LegacyPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LegacyPlayerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
