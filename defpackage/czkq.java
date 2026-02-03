package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czkq extends czki implements czke {
    private final Paint A;
    private final int B;
    private final int C;
    private final int D;
    private final RectF E;
    private final RectF F;
    private final Point G;
    private final Point H;
    private final int I;
    private final int J;
    private final int K;
    private final Point L;
    public volatile int g;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public czko p;
    public volatile boolean q;
    private final Point t;
    private final int u;
    private final int v;
    private final int w;
    private final List x;
    private final Paint y;
    private final Paint z;
    private final czkp r = new czkp(this);
    public final Runnable h = new czkm(this);
    private final Animation.AnimationListener s = new czkn(this);
    private final Handler M = new czkk();

    public czkq(Context context) throws Resources.NotFoundException {
        g(false);
        this.x = new ArrayList();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pie_radius_start);
        this.u = dimensionPixelSize;
        this.D = dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.focus_radius_offset);
        this.v = resources.getDimensionPixelSize(R.dimen.pie_radius_increment);
        this.w = resources.getDimensionPixelSize(R.dimen.pie_touch_offset);
        this.t = new Point(0, 0);
        Paint paint = new Paint();
        this.y = paint;
        paint.setColor(Color.argb(255, 51, 181, 229));
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.z = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(Color.argb(BasePaymentResult.ERROR_REQUEST_FAILED, 250, 230, 128));
        Paint paint3 = new Paint();
        this.A = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        this.B = -16711936;
        this.C = -65536;
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Point();
        this.H = new Point();
        this.I = resources.getDimensionPixelSize(R.dimen.focus_inner_offset);
        this.J = resources.getDimensionPixelSize(R.dimen.focus_outer_stroke);
        this.K = resources.getDimensionPixelSize(R.dimen.focus_inner_stroke);
        this.g = 0;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.L = new Point();
    }

    private static float n(double d) {
        return (float) (360.0d - ((d * 180.0d) / 3.141592653589793d));
    }

    private final void o() {
        this.q = true;
        this.a.removeCallbacks(this.h);
        czkp czkpVar = this.r;
        if (czkpVar != null) {
            czkpVar.cancel();
        }
        this.q = false;
        this.o = false;
        this.g = 0;
    }

    private static void p(int i, int i2, Point point) {
        double d = ((i % 360) * 6.283185307179586d) / 360.0d;
        double d2 = i2;
        point.x = (int) ((Math.cos(d) * d2) + 0.5d);
        point.y = (int) ((d2 * Math.sin(d)) + 0.5d);
    }

    private final void q(Canvas canvas, int i, Paint paint) {
        int i2 = this.D;
        int i3 = this.I;
        int i4 = i2 - i3;
        p(i, i4, this.G);
        p(i, i4 + (i3 / 3), this.H);
        canvas.drawLine(r2.x + this.i, r2.y + this.j, r1.x + this.i, r1.y + this.j, paint);
    }

    private final void r() {
        List list = this.x;
        float size = list.size();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        int i = this.v;
        int i2 = this.u;
        float f = 1.8325958f / size;
        Point point = this.t;
        int i3 = (i + i2) - 2;
        RectF rectF = new RectF(point.x - i3, point.y - i3, point.x + i3, point.y + i3);
        int i4 = i2 + 2;
        RectF rectF2 = new RectF(point.x - i4, point.y - i4, point.x + i4, point.y + i4);
        Path path = new Path();
        float fN = n(0.0d) - 1.0f;
        float fN2 = n(f) + 1.0f;
        path.arcTo(rectF, fN, fN2 - fN, true);
        path.arcTo(rectF2, fN2, fN - fN2);
        path.close();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw null;
        }
    }

    private final void s(int i, int i2) {
        Point point = this.t;
        point.x = i;
        point.y = i2;
        this.a.removeCallbacks(this.h);
        czkp czkpVar = this.r;
        czkpVar.cancel();
        czkpVar.reset();
        this.i = i;
        this.j = i2;
        this.m = 157;
        k(i, i2);
        this.o = false;
    }

    private final void t(long j, boolean z, float f, float f2) {
        g(true);
        czkp czkpVar = this.r;
        czkpVar.reset();
        czkpVar.setDuration(j);
        czkpVar.a = f;
        czkpVar.b = f2;
        czkpVar.setAnimationListener(z ? this.s : null);
        this.a.startAnimation(czkpVar);
        h();
    }

    @Override // defpackage.czke
    public final void a() {
        if (this.g == 8) {
            return;
        }
        o();
        this.a.post(this.h);
    }

    @Override // defpackage.czke
    public final void b() {
        if (this.g == 8) {
            return;
        }
        o();
        this.n = 67;
        double dRandom = Math.random() * 120.0d;
        t(600L, false, this.n, r2 + ((int) (dRandom - 60.0d)));
        this.g = 1;
    }

    @Override // defpackage.czke
    public final void c(boolean z) {
        if (this.g == 1) {
            m(z, this.n);
            this.g = 2;
            this.o = true;
        }
    }

    @Override // defpackage.czki, defpackage.czks
    public final void e(int i, int i2, int i3, int i4) {
        this.b = i;
        this.d = i3;
        this.c = i2;
        this.e = i4;
        int i5 = (i3 - i) / 2;
        this.k = i5;
        int i6 = (i4 - i2) / 2;
        this.l = i6;
        this.i = i5;
        this.j = i6;
        k(i5, i6);
        if (this.f && this.g == 8) {
            s(this.k, this.l);
            r();
        }
    }

    @Override // defpackage.czki
    public final void f(Canvas canvas) {
        Canvas canvas2;
        czko czkoVar = this.p;
        float f = czkoVar != null ? czkoVar.a : 1.0f;
        int iSave = canvas.save();
        if (this.p != null) {
            Point point = this.t;
            float f2 = (f * 0.1f) + 0.9f;
            canvas.scale(f2, f2, point.x, point.y);
        }
        Paint paint = this.A;
        paint.setStrokeWidth(this.J);
        canvas.drawCircle(this.i, this.j, this.D, paint);
        if (this.g == 8) {
            canvas2 = canvas;
        } else {
            int color = paint.getColor();
            if (this.g == 2) {
                paint.setColor(this.o ? this.B : this.C);
            }
            paint.setStrokeWidth(this.K);
            q(canvas, this.m, paint);
            q(canvas, this.m + 45, paint);
            q(canvas, this.m + 180, paint);
            q(canvas, this.m + 225, paint);
            canvas.save();
            canvas.rotate(this.m, this.i, this.j);
            RectF rectF = this.F;
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 45.0f, false, paint);
            canvas2.drawArc(rectF, 180.0f, 45.0f, false, paint);
            canvas2.restore();
            paint.setColor(color);
        }
        if (this.g == 2) {
            canvas2.restoreToCount(iSave);
            return;
        }
        for (czkj czkjVar : this.x) {
            if (this.g == 8) {
                throw null;
            }
        }
        canvas2.restoreToCount(iSave);
    }

    @Override // defpackage.czki, defpackage.czks
    public final boolean i(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        PointF pointF = new PointF();
        pointF.x = 1.5707964f;
        Point point = this.t;
        float f = x - point.x;
        double d = f;
        double d2 = point.y - y;
        pointF.y = (float) Math.hypot(d, d2);
        if (f != 0.0f) {
            pointF.x = (float) Math.atan2(d2, d);
            if (pointF.x < 0.0f) {
                pointF.x = (float) (pointF.x + 6.283185307179586d);
            }
        }
        pointF.y += this.w;
        if (actionMasked == 0) {
            Point point2 = this.L;
            point2.x = (int) motionEvent.getX();
            point2.y = (int) motionEvent.getY();
            s((int) x, (int) y);
            l(true);
            return true;
        }
        if (actionMasked == 1) {
            if (this.f) {
                l(false);
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f) {
                l(false);
            }
        } else if (actionMasked == 2 && pointF.y >= this.u) {
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw null;
            }
            motionEvent.getX();
            Point point3 = this.L;
            int i = point3.x;
            motionEvent.getX();
            int i2 = point3.x;
            motionEvent.getY();
            int i3 = point3.y;
            motionEvent.getY();
            int i4 = point3.y;
        }
        return false;
    }

    public final int j() {
        int i = this.D;
        return i + i;
    }

    public final void k(int i, int i2) {
        int i3 = this.D;
        int i4 = i2 + i3;
        int i5 = i + i3;
        int i6 = i2 - i3;
        int i7 = i - i3;
        this.E.set(i7, i6, i5, i4);
        int i8 = this.I;
        int i9 = i6 + i8;
        int i10 = i7 + i8;
        this.F.set(i10, i9, i5 - i8, i4 - i8);
    }

    public final void l(boolean z) {
        if (z) {
            this.g = 8;
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw null;
            }
            r();
            czko czkoVar = new czko();
            this.p = czkoVar;
            czkoVar.setDuration(200L);
            this.p.setAnimationListener(new czkl(this));
            this.p.startNow();
            this.a.startAnimation(this.p);
        } else {
            this.g = 0;
        }
        g(z);
        this.M.sendEmptyMessage(!z ? 1 : 0);
    }

    public final void m(boolean z, float f) {
        t(100L, z, this.m, f);
    }
}
