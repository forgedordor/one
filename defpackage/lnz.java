package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnz extends lnw {
    public loa r;
    private float s;
    private boolean t;

    public lnz(lny lnyVar) {
        super(lnyVar);
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.t = false;
    }

    @Override // defpackage.lnw
    public final boolean c(long j) {
        float f;
        if (this.t) {
            float f2 = this.s;
            if (f2 != Float.MAX_VALUE) {
                this.r.d(f2);
                this.s = Float.MAX_VALUE;
            }
            this.h = this.r.a();
            this.g = 0.0f;
            this.t = false;
            return true;
        }
        if (this.s != Float.MAX_VALUE) {
            long j2 = j / 2;
            lnu lnuVarB = this.r.b(this.h, this.g, j2);
            this.r.d(this.s);
            this.s = Float.MAX_VALUE;
            lnu lnuVarB2 = this.r.b(lnuVarB.a, lnuVarB.b, j2);
            f = lnuVarB2.a;
            this.h = f;
            this.g = lnuVarB2.b;
        } else {
            lnu lnuVarB3 = this.r.b(this.h, this.g, j);
            f = lnuVarB3.a;
            this.h = f;
            this.g = lnuVarB3.b;
        }
        float fMax = Math.max(f, this.n);
        this.h = fMax;
        this.h = Math.min(fMax, this.m);
        float f3 = this.g;
        loa loaVar = this.r;
        if (Math.abs(f3) >= loaVar.d || Math.abs(r1 - loaVar.a()) >= loaVar.c) {
            return false;
        }
        this.h = this.r.a();
        this.g = 0.0f;
        return true;
    }

    public final void e(float f) {
        if (this.l) {
            this.s = f;
            return;
        }
        if (this.r == null) {
            this.r = new loa(f);
        }
        this.r.d(f);
        loa loaVar = this.r;
        if (loaVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = loaVar.a();
        if (dA > this.m) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.o * 0.75f);
        loaVar.c = dAbs;
        loaVar.d = dAbs * 62.5d;
        if (!lnm.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            return;
        }
        this.l = true;
        if (!this.i) {
            this.h = this.k.a(this.j);
        }
        float f2 = this.h;
        if (f2 > this.m || f2 < this.n) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        lnm lnmVarA = lnm.a();
        ArrayList arrayList = lnmVarA.b;
        if (arrayList.size() == 0) {
            lnmVarA.g.a(lnmVarA.d);
            if (Build.VERSION.SDK_INT >= 33) {
                lnmVarA.f = ValueAnimator.getDurationScale();
                if (lnmVarA.h == null) {
                    lnmVarA.h = new lnj(lnmVarA);
                }
                final lnj lnjVar = lnmVarA.h;
                if (lnjVar.a == null) {
                    lnjVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: lni
                        public final void onChanged(float f3) {
                            lnjVar.b.f = f3;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(lnjVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void f() {
        if (this.r.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!lnm.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            this.t = true;
        }
    }

    public lnz(Object obj, lnx lnxVar) {
        super(obj, lnxVar);
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.t = false;
    }
}
