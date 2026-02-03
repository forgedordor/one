package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrm implements dsru, dsrt {
    public dsqy a;
    public dsro b;
    public dsrv c;
    public View d;
    private final Rect e = new Rect();
    private final int[] f = new int[2];

    public dsrm(dsro dsroVar) {
        this.b = dsroVar;
    }

    static boolean c(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return view.getMeasuredHeight() == rect.height() && view.getMeasuredWidth() == rect.width();
    }

    private final Rect d(Rect rect) {
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.d;
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final void a() {
        dsqy dsqyVar = this.a;
        if (dsqyVar == null || !dsqyVar.b()) {
            return;
        }
        dsqyVar.a();
        if (dsqyVar == this.a) {
            this.a = null;
            this.b = null;
        }
    }

    @Override // defpackage.dsru
    public final void b(dsrr dsrrVar) {
        if (this.a == null) {
            return;
        }
        if (dsrrVar.b()) {
            dsro dsroVar = this.b;
            if (c(dsroVar != null ? ((dsqu) dsroVar).a : null)) {
                if (this.a.b()) {
                    dsqy dsqyVar = this.a;
                    Rect rectD = d(dsrrVar.a);
                    dsqx dsqxVar = dsqyVar.b;
                    dsqxVar.a(rectD);
                    dsqxVar.requestLayout();
                    return;
                }
                Rect rectD2 = d(dsrrVar.a);
                dsqy dsqyVar2 = this.a;
                int i = dsqyVar2.c;
                int i2 = dsqyVar2.d;
                final dsqx dsqxVar2 = dsqyVar2.b;
                View view = dsqyVar2.a;
                dsqxVar2.d(view, rectD2, i, i2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                dsqxVar2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                if ((dsqxVar2.getMeasuredHeightAndState() & (-16777216)) == 16777216) {
                    dsqxVar2.d(view, rectD2, i == 1 ? 2 : 1, i2);
                }
                dsqxVar2.c.setClippingEnabled(false);
                dsqxVar2.c.setAnimationStyle(R.style.Animation.Dialog);
                dsqxVar2.c.setTouchable(true);
                dsqxVar2.c.setBackgroundDrawable(new ColorDrawable(0));
                dsqxVar2.c.setOutsideTouchable(dsqxVar2.d);
                dsqxVar2.c.setTouchInterceptor(new View.OnTouchListener() { // from class: dsqw
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        dsqx dsqxVar3 = dsqxVar2;
                        View.OnClickListener onClickListener = dsqxVar3.k;
                        if (onClickListener != null) {
                            onClickListener.onClick(view2);
                        }
                        if (dsqxVar3.j == null || motionEvent.getActionMasked() != 4 || !dsqxVar3.a.contains(Math.round(motionEvent.getRawX()), Math.round(motionEvent.getRawY()))) {
                            return false;
                        }
                        dsqxVar3.j.onClick(dsqxVar3.f);
                        return false;
                    }
                });
                if (Build.VERSION.SDK_INT >= 29) {
                    dsqxVar2.c();
                    dsqxVar2.c.setWidth(dsqxVar2.getMeasuredWidth());
                    dsqxVar2.c.setHeight(dsqxVar2.getMeasuredHeight());
                }
                dsqxVar2.c.showAtLocation(dsqxVar2.f, 0, dsqxVar2.h, dsqxVar2.i);
                return;
            }
        }
        a();
    }
}
