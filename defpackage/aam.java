package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aam extends vx implements wd {
    private aah A;
    float c;
    float d;
    float e;
    float f;
    public float g;
    public float h;
    final aag j;
    int k;
    RecyclerView m;
    VelocityTracker o;
    GestureDetector q;
    public Rect r;
    public long s;
    private float u;
    private float v;
    private int x;
    private List y;
    private List z;
    final List a = new ArrayList();
    private final float[] t = new float[2];
    wv b = null;
    int i = -1;
    private int w = 0;
    final List l = new ArrayList();
    final Runnable n = new aaa(this);
    View p = null;
    private final wf B = new aab(this);

    public aam(aag aagVar) {
        this.j = aagVar;
    }

    private final void p(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void q() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private static boolean r(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int s(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.e > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.v);
            float xVelocity = this.o.getXVelocity(this.i);
            float yVelocity = this.o.getYVelocity(this.i);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.j.a(this.u) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.m.getWidth();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.e) > width * 0.5f) {
            return i2;
        }
        return 0;
    }

    private final int t(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.v);
            float xVelocity = this.o.getXVelocity(this.i);
            float yVelocity = this.o.getYVelocity(this.i);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.j.a(this.u) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.m.getHeight();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.f) > height * 0.5f) {
            return i2;
        }
        return 0;
    }

    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        rect.setEmpty();
    }

    @Override // defpackage.vx
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            float[] fArr = this.t;
            p(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        aag aagVar = this.j;
        wv wvVar = this.b;
        List list = this.l;
        int i = this.w;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aaj aajVar = (aaj) list.get(i2);
            float f4 = aajVar.d;
            float f5 = aajVar.f;
            if (f4 == f5) {
                aajVar.l = aajVar.h.a.getTranslationX();
            } else {
                aajVar.l = f4 + (aajVar.p * (f5 - f4));
            }
            float f6 = aajVar.e;
            float f7 = aajVar.g;
            if (f6 == f7) {
                aajVar.m = aajVar.h.a.getTranslationY();
            } else {
                aajVar.m = f6 + (aajVar.p * (f7 - f6));
            }
            int iSave = canvas.save();
            aagVar.h(canvas, recyclerView, aajVar.h, aajVar.l, aajVar.m, aajVar.i, false);
            canvas.restoreToCount(iSave);
        }
        if (wvVar != null) {
            int iSave2 = canvas.save();
            aagVar.h(canvas, recyclerView, wvVar, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // defpackage.wd
    public final void d(View view) {
        l(view);
        wv wvVarJ = this.m.j(view);
        if (wvVarJ == null) {
            return;
        }
        wv wvVar = this.b;
        if (wvVar != null && wvVarJ == wvVar) {
            m(null, 0);
            return;
        }
        h(wvVarJ, false);
        if (this.a.remove(wvVarJ.a)) {
            this.j.n(wvVarJ);
        }
    }

    final View e(MotionEvent motionEvent) {
        aaj aajVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        wv wvVar = this.b;
        if (wvVar != null) {
            float f = this.g + this.e;
            float f2 = this.h + this.f;
            View view2 = wvVar.a;
            if (r(view2, x, y, f, f2)) {
                return view2;
            }
        }
        List list = this.l;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return this.m.m(x, y);
            }
            aajVar = (aaj) list.get(size);
            view = aajVar.h.a;
        } while (!r(view, x, y, aajVar.l, aajVar.m));
        return view;
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.ad(this);
            this.m.ag(this.B);
            this.m.af(this);
            List list = this.l;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                aaj aajVar = (aaj) list.get(0);
                aajVar.a();
                this.j.n(aajVar.h);
            }
            list.clear();
            this.p = null;
            q();
            aah aahVar = this.A;
            if (aahVar != null) {
                aahVar.a = false;
                this.A = null;
            }
            if (this.q != null) {
                this.q = null;
            }
        }
        this.m = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.u = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.x = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
            this.m.v(this);
            this.m.x(this.B);
            this.m.w(this);
            this.A = new aah(this);
            this.q = new GestureDetector(this.m.getContext(), this.A);
        }
    }

    final void g(int i, MotionEvent motionEvent, int i2) {
        View viewE;
        if (this.b == null && i == 2 && this.w != 2) {
            aag aagVar = this.j;
            if (aagVar.k()) {
                RecyclerView recyclerView = this.m;
                if (recyclerView.F != 1) {
                    wb wbVar = recyclerView.o;
                    int i3 = this.i;
                    wv wvVarJ = null;
                    if (i3 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                        float x = motionEvent.getX(iFindPointerIndex) - this.c;
                        float y = motionEvent.getY(iFindPointerIndex) - this.d;
                        float fAbs = Math.abs(x);
                        float fAbs2 = Math.abs(y);
                        float f = this.x;
                        if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !wbVar.ae()) && ((fAbs2 <= fAbs || !wbVar.af()) && (viewE = e(motionEvent)) != null))) {
                            wvVarJ = this.m.j(viewE);
                        }
                    }
                    if (wvVarJ != null) {
                        int iD = aagVar.d(this.m, wvVarJ) >> 8;
                        if ((iD & 255) != 0) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f2 = x2 - this.c;
                            float f3 = y2 - this.d;
                            float fAbs3 = Math.abs(f2);
                            float fAbs4 = Math.abs(f3);
                            float f4 = this.x;
                            if (fAbs3 >= f4 || fAbs4 >= f4) {
                                if (fAbs3 > fAbs4) {
                                    if (f2 < 0.0f && (iD & 4) == 0) {
                                        return;
                                    }
                                    if (f2 > 0.0f && (iD & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    if (f3 < 0.0f && (iD & 1) == 0) {
                                        return;
                                    }
                                    if (f3 > 0.0f && (iD & 2) == 0) {
                                        return;
                                    }
                                }
                                this.f = 0.0f;
                                this.e = 0.0f;
                                this.i = motionEvent.getPointerId(0);
                                m(wvVarJ, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    final void h(wv wvVar, boolean z) {
        aaj aajVar;
        List list = this.l;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                aajVar = (aaj) list.get(size);
            }
        } while (aajVar.h != wvVar);
        aajVar.n |= z;
        if (!aajVar.o) {
            aajVar.a();
        }
        list.remove(size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void i(wv wvVar) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.m.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.w == 2) {
            float f = this.g + this.e;
            float f2 = this.h + this.f;
            View view = wvVar.a;
            int i5 = (int) f2;
            int i6 = (int) f;
            if (Math.abs(i5 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i6 - view.getLeft()) >= view.getWidth() * 0.5f) {
                List list = this.y;
                if (list == null) {
                    this.y = new ArrayList();
                    this.z = new ArrayList();
                } else {
                    list.clear();
                    this.z.clear();
                }
                int iRound = Math.round(this.g + this.e);
                int iRound2 = Math.round(this.h + this.f);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i7 = (iRound + width) / 2;
                int i8 = (iRound2 + height) / 2;
                wb wbVar = this.m.o;
                int iAs = wbVar.as();
                int i9 = 0;
                while (i9 < iAs) {
                    char c2 = c;
                    View viewAE = wbVar.aE(i9);
                    if (viewAE != view && viewAE.getBottom() >= iRound2 && viewAE.getTop() <= height && viewAE.getRight() >= iRound && viewAE.getLeft() <= width) {
                        wv wvVarJ = this.m.j(viewAE);
                        int iAbs5 = Math.abs(i7 - ((viewAE.getLeft() + viewAE.getRight()) / 2));
                        int i10 = iAbs5 * iAbs5;
                        int iAbs6 = Math.abs(i8 - ((viewAE.getTop() + viewAE.getBottom()) / 2));
                        int i11 = iAbs6 * iAbs6;
                        i = i6;
                        int size = this.y.size();
                        i2 = i5;
                        i3 = iRound;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i4 = i10 + i11;
                            if (i12 >= size) {
                                break;
                            }
                            int i14 = size;
                            if (i4 <= ((Integer) this.z.get(i12)).intValue()) {
                                break;
                            }
                            i13++;
                            i12++;
                            size = i14;
                        }
                        this.y.add(i13, wvVarJ);
                        this.z.add(i13, Integer.valueOf(i4));
                    } else {
                        i = i6;
                        i2 = i5;
                        i3 = iRound;
                    }
                    i9++;
                    c = c2;
                    i6 = i;
                    i5 = i2;
                    iRound = i3;
                }
                int i15 = i6;
                int i16 = i5;
                List list2 = this.y;
                if (list2.size() != 0) {
                    int width2 = i15 + view.getWidth();
                    int height2 = i16 + view.getHeight();
                    int left = i15 - view.getLeft();
                    int top = i16 - view.getTop();
                    int size2 = list2.size();
                    int i17 = -1;
                    wv wvVar2 = null;
                    for (int i18 = 0; i18 < size2; i18++) {
                        wv wvVar3 = (wv) list2.get(i18);
                        if (left > 0) {
                            View view2 = wvVar3.a;
                            int right = view2.getRight() - width2;
                            if (right < 0 && view2.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i17) {
                                wvVar2 = wvVar3;
                                i17 = iAbs4;
                            }
                        }
                        if (left < 0) {
                            View view3 = wvVar3.a;
                            int left2 = view3.getLeft() - i15;
                            if (left2 > 0 && view3.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left2)) > i17) {
                                wvVar2 = wvVar3;
                                i17 = iAbs3;
                            }
                        }
                        if (top < 0) {
                            View view4 = wvVar3.a;
                            int top2 = view4.getTop() - i16;
                            if (top2 > 0 && view4.getTop() < view.getTop() && (iAbs2 = Math.abs(top2)) > i17) {
                                wvVar2 = wvVar3;
                                i17 = iAbs2;
                            }
                        }
                        if (top > 0) {
                            View view5 = wvVar3.a;
                            int bottom = view5.getBottom() - height2;
                            if (bottom < 0 && view5.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i17) {
                                wvVar2 = wvVar3;
                                i17 = iAbs;
                            }
                        }
                    }
                    if (wvVar2 == null) {
                        this.y.clear();
                        this.z.clear();
                        return;
                    }
                    int iFs = wvVar2.fs();
                    wvVar.fs();
                    if (this.j.m(this.m, wvVar, wvVar2)) {
                        RecyclerView recyclerView = this.m;
                        wb wbVar2 = recyclerView.o;
                        if (wbVar2 instanceof aal) {
                            ((aal) wbVar2).ap(view, wvVar2.a);
                            return;
                        }
                        if (wbVar2.ae()) {
                            View view6 = wvVar2.a;
                            if (wb.bp(view6) <= recyclerView.getPaddingLeft()) {
                                recyclerView.aj(iFs);
                            }
                            if (wb.bs(view6) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.aj(iFs);
                            }
                        }
                        if (wbVar2.af()) {
                            View view7 = wvVar2.a;
                            if (wb.bt(view7) <= recyclerView.getPaddingTop()) {
                                recyclerView.aj(iFs);
                            }
                            if (wb.bo(view7) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.aj(iFs);
                            }
                        }
                    }
                }
            }
        }
    }

    final void j() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    @Override // defpackage.vx
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            p(this.t);
        }
        wv wvVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            aaj aajVar = (aaj) list.get(i);
            int iSave = canvas.save();
            wv wvVar2 = aajVar.h;
            float f = aajVar.l;
            float f2 = aajVar.m;
            int i2 = aajVar.i;
            canvas.restoreToCount(iSave);
        }
        if (wvVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aaj aajVar2 = (aaj) list.get(size);
            if (!aajVar2.o) {
                z = true;
            } else if (!aajVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    final void l(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(defpackage.wv r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aam.m(wv, int):void");
    }

    public final void n(wv wvVar) {
        if (!this.j.j(this.m, wvVar)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (wvVar.a.getParent() != this.m) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        j();
        this.f = 0.0f;
        this.e = 0.0f;
        m(wvVar, 2);
    }

    final void o(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.c;
        this.e = fMax;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.e = fMax;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    @Override // defpackage.wd
    public final void c(View view) {
    }
}
