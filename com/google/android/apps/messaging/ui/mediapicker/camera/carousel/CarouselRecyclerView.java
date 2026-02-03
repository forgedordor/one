package com.google.android.apps.messaging.ui.mediapicker.camera.carousel;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.car.app.model.Alert;
import defpackage.cqaz;
import defpackage.czla;
import defpackage.czlb;
import defpackage.czlc;
import defpackage.va;
import defpackage.vc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CarouselRecyclerView extends RecyclerView implements czla {
    public boolean ab;
    public int ac;
    public int ad;
    public int ae;
    private CarouselLayoutManager af;
    private vc ag;
    private DecelerateInterpolator ah;
    private int ai;

    public CarouselRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ab = false;
        this.ac = -1;
        this.ad = -1;
        this.ai = 0;
    }

    private final int aQ(int i) {
        View viewAE = this.af.aE(i);
        if (viewAE != null) {
            return (viewAE.getLeft() + (viewAE.getWidth() / 2)) - (getWidth() / 2);
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void Y(int i) {
        if (i == 1) {
            this.ac = -1;
            this.ad = -1;
        }
    }

    public final int a() {
        int iAbs;
        int iAs = this.af.as();
        vc vcVar = this.ag;
        if (vcVar == null || iAs == 0) {
            return -1;
        }
        int iJ = this.af.bj() ? vcVar.j() + (vcVar.k() / 2) : vcVar.e() / 2;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        View view = null;
        for (int i2 = 0; i2 < iAs; i2++) {
            View viewAE = this.af.aE(i2);
            if (viewAE != null && (iAbs = Math.abs((viewAE.getLeft() + (viewAE.getWidth() / 2)) - iJ)) < i) {
                view = viewAE;
                i = iAbs;
            }
        }
        if (view != null) {
            return c(view);
        }
        return -1;
    }

    public final int aO(int i) {
        View viewAE = this.af.aE(0);
        View viewAE2 = this.af.aE(r1.as() - 1);
        if (viewAE != null && viewAE2 != null) {
            int iC = c(viewAE);
            int iC2 = c(viewAE2);
            if (i >= iC && i <= iC2) {
                return i - iC;
            }
        }
        return -1;
    }

    public final void aP(boolean z) {
        this.af.a = z;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void aj(int i) {
        if (i < 0) {
            return;
        }
        if (aO(i) != -1) {
            this.ad = -1;
            ar(aQ(aO(i)), 0);
            return;
        }
        this.ad = i;
        czlb czlbVar = new czlb(getContext(), 1.0f);
        czlbVar.g = i;
        czlbVar.a = this;
        this.af.bi(czlbVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void as(int i, int i2, Interpolator interpolator) {
        if (cqaz.n()) {
            super.scrollBy(i, i2);
        } else {
            aL(i, i2, interpolator);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void at(int i) {
        if (i < 0) {
            return;
        }
        if (aO(i) != -1) {
            this.ac = -1;
            as(aQ(aO(i)), 0, this.ah);
            return;
        }
        this.ac = i;
        czlb czlbVar = new czlb(getContext(), 150.0f);
        czlbVar.g = i;
        czlbVar.a = this;
        this.af.bi(czlbVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        this.ah = new DecelerateInterpolator();
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager();
        this.af = carouselLayoutManager;
        ao(carouselLayoutManager);
        this.ag = new va(this.af);
        new czlc().f(this);
        post(new Runnable() { // from class: czky
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v(new czkz());
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.ai == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096 || i == 8192) {
            return false;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        this.ai += true == z ? -1 : 1;
        super.setEnabled(z);
    }
}
