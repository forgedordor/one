package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qof extends Drawable implements Drawable.Callback, Animatable {
    private RectF A;
    private Matrix B;
    private Matrix C;
    private int D;
    public qnm a;
    public final qwt b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public qso f;
    public String g;
    public String h;
    public boolean i;
    public qui j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private qsn p;
    private boolean q;
    private final Matrix r;
    private Bitmap s;
    private Canvas t;
    private Rect u;
    private RectF v;
    private Paint w;
    private Rect x;
    private Rect y;
    private RectF z;

    public qof() {
        qwt qwtVar = new qwt();
        this.b = qwtVar;
        this.c = true;
        this.d = false;
        this.n = 1;
        this.e = new ArrayList();
        qod qodVar = new qod(this);
        this.o = qodVar;
        this.q = true;
        this.k = 255;
        this.D = 1;
        this.l = false;
        this.r = new Matrix();
        this.m = false;
        qwtVar.addUpdateListener(qodVar);
    }

    private static final void A(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private final void x() {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            return;
        }
        int i = qvs.a;
        Rect rect = qnmVar.i;
        qui quiVar = new qui(this, new qul(Collections.EMPTY_LIST, qnmVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new qtj(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null), qnmVar.h, qnmVar);
        this.j = quiVar;
        quiVar.j = this.q;
    }

    private final void y() {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            return;
        }
        int i = this.D - 1;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = qnmVar.m;
        int i3 = qnmVar.n;
        boolean z2 = false;
        if (i != 1 && (i == 2 || ((z && i2 < 28) || i3 > 4))) {
            z2 = true;
        }
        this.l = z2;
    }

    private final boolean z() {
        return this.c || this.d;
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws Throwable {
        if (this.l) {
            l(canvas, this.j);
        } else {
            qui quiVar = this.j;
            qnm qnmVar = this.a;
            if (quiVar != null && qnmVar != null) {
                Matrix matrix = this.r;
                matrix.reset();
                if (!getBounds().isEmpty()) {
                    matrix.preScale(r3.width() / qnmVar.i.width(), r3.height() / qnmVar.i.height());
                    matrix.preTranslate(r3.left, r3.top);
                }
                quiVar.b(canvas, matrix, this.k);
            }
        }
        this.m = false;
        qnc.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final qsn f() {
        if (getCallback() == null) {
            return null;
        }
        if (this.p == null) {
            qsn qsnVar = new qsn(getCallback());
            this.p = qsnVar;
            String str = this.h;
            if (str != null) {
                qsnVar.e = str;
            }
        }
        return this.p;
    }

    public final void g(final qst qstVar, final Object obj, final qxc qxcVar) {
        qui quiVar = this.j;
        if (quiVar == null) {
            this.e.add(new qoe() { // from class: qnw
                @Override // defpackage.qoe
                public final void a() {
                    this.a.g(qstVar, obj, qxcVar);
                }
            });
            return;
        }
        if (qstVar == qst.a) {
            quiVar.a(obj, qxcVar);
        } else {
            qsu qsuVar = qstVar.b;
            if (qsuVar != null) {
                qsuVar.a(obj, qxcVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.j.e(qstVar, 0, arrayList, new qst(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((qst) arrayList.get(i)).b.a(obj, qxcVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == qok.E) {
            s(c());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            return -1;
        }
        return qnmVar.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            return -1;
        }
        return qnmVar.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        qwt qwtVar = this.b;
        if (qwtVar.k) {
            qwtVar.cancel();
            if (!isVisible()) {
                this.n = 1;
            }
        }
        this.a = null;
        this.j = null;
        this.f = null;
        qwtVar.j = null;
        qwtVar.h = -2.14748365E9f;
        qwtVar.i = 2.14748365E9f;
        invalidateSelf();
    }

    public final void i(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (this.a != null) {
            x();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.m) {
            return;
        }
        this.m = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return u();
    }

    public final void j() {
        this.e.clear();
        qwt qwtVar = this.b;
        qwtVar.h();
        Iterator it = qwtVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(qwtVar);
        }
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void k() {
        if (this.j == null) {
            this.e.add(new qoe() { // from class: qnz
                @Override // defpackage.qoe
                public final void a() {
                    this.a.k();
                }
            });
            return;
        }
        y();
        if (z() || e() == 0) {
            if (isVisible()) {
                qwt qwtVar = this.b;
                qwtVar.k = true;
                Set set = qwtVar.a;
                boolean zM = qwtVar.m();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(qwtVar, zM);
                }
                qwtVar.k((int) (qwtVar.m() ? qwtVar.d() : qwtVar.e()));
                qwtVar.d = 0L;
                qwtVar.g = 0;
                qwtVar.g();
                this.n = 1;
            } else {
                this.n = 2;
            }
        }
        if (z()) {
            return;
        }
        o((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r9, defpackage.qui r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qof.l(android.graphics.Canvas, qui):void");
    }

    public final void m() {
        if (this.j == null) {
            this.e.add(new qoe() { // from class: qny
                @Override // defpackage.qoe
                public final void a() {
                    this.a.m();
                }
            });
            return;
        }
        y();
        if (z() || e() == 0) {
            if (isVisible()) {
                qwt qwtVar = this.b;
                qwtVar.k = true;
                qwtVar.g();
                qwtVar.d = 0L;
                if (qwtVar.m() && qwtVar.f == qwtVar.e()) {
                    qwtVar.k(qwtVar.d());
                } else if (!qwtVar.m() && qwtVar.f == qwtVar.d()) {
                    qwtVar.k(qwtVar.e());
                }
                Iterator it = qwtVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(qwtVar);
                }
                this.n = 1;
            } else {
                this.n = 3;
            }
        }
        if (z()) {
            return;
        }
        o((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void n(boolean z) {
        if (z != this.q) {
            this.q = z;
            qui quiVar = this.j;
            if (quiVar != null) {
                quiVar.j = z;
            }
            invalidateSelf();
        }
    }

    public final void o(final int i) {
        if (this.a == null) {
            this.e.add(new qoe() { // from class: qoc
                @Override // defpackage.qoe
                public final void a() {
                    this.a.o(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void p(final float f) {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            this.e.add(new qoe() { // from class: qnx
                @Override // defpackage.qoe
                public final void a() {
                    this.a.p(f);
                }
            });
            return;
        }
        qwt qwtVar = this.b;
        float f2 = qnmVar.j;
        float f3 = qnmVar.k;
        PointF pointF = qwu.a;
        qwtVar.l(qwtVar.h, f2 + (f * (f3 - f2)));
    }

    public final void q(final int i) {
        if (this.a == null) {
            this.e.add(new qoe() { // from class: qnv
                @Override // defpackage.qoe
                public final void a() {
                    this.a.q(i);
                }
            });
        } else {
            this.b.l(i, (int) r0.i);
        }
    }

    public final void r(final float f) {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            this.e.add(new qoe() { // from class: qoa
                @Override // defpackage.qoe
                public final void a() {
                    this.a.r(f);
                }
            });
            return;
        }
        float f2 = qnmVar.j;
        float f3 = qnmVar.k;
        PointF pointF = qwu.a;
        q((int) (f2 + (f * (f3 - f2))));
    }

    public final void s(final float f) {
        qnm qnmVar = this.a;
        if (qnmVar == null) {
            this.e.add(new qoe() { // from class: qob
                @Override // defpackage.qoe
                public final void a() {
                    this.a.s(f);
                }
            });
            return;
        }
        qwt qwtVar = this.b;
        float f2 = qnmVar.j;
        float f3 = qnmVar.k;
        PointF pointF = qwu.a;
        qwtVar.k(f2 + (f * (f3 - f2)));
        qnc.a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        qws.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.n;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                m();
                return visible;
            }
        } else {
            if (this.b.k) {
                j();
                this.n = 3;
                return visible;
            }
            if (zIsVisible) {
                this.n = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.n = 1;
    }

    public final void t(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean u() {
        qwt qwtVar = this.b;
        if (qwtVar == null) {
            return false;
        }
        return qwtVar.k;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final boolean v(qnm qnmVar) {
        if (this.a == qnmVar) {
            return false;
        }
        this.m = true;
        h();
        this.a = qnmVar;
        x();
        qwt qwtVar = this.b;
        qnm qnmVar2 = qwtVar.j;
        qwtVar.j = qnmVar;
        if (qnmVar2 == null) {
            qwtVar.l(Math.max(qwtVar.h, qnmVar.j), Math.min(qwtVar.i, qnmVar.k));
        } else {
            qwtVar.l((int) qnmVar.j, (int) qnmVar.k);
        }
        float f = qwtVar.f;
        qwtVar.f = 0.0f;
        qwtVar.e = 0.0f;
        qwtVar.k((int) f);
        qwtVar.b();
        s(qwtVar.getAnimatedFraction());
        ArrayList arrayList = this.e;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            qoe qoeVar = (qoe) it.next();
            if (qoeVar != null) {
                qoeVar.a();
            }
            it.remove();
        }
        arrayList.clear();
        qoq qoqVar = qnmVar.a;
        y();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void w(int i) {
        this.D = i;
        y();
    }
}
