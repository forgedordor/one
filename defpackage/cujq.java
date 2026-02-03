package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final daoe a;
    private int b = -1;
    private final dakl c;
    private final Activity d;
    private final View e;
    private final boolean f;
    private final cujp g;
    private final cujp h;

    public cujq(daoe daoeVar, dakl daklVar, Activity activity, View view, boolean z) throws Resources.NotFoundException {
        this.a = daoeVar;
        this.c = daklVar;
        this.d = activity;
        this.e = view;
        this.f = z;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.c2o_ime_minimum_height);
        this.g = new cujp(this, dimensionPixelSize);
        this.h = new cujp(this, dimensionPixelSize);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity = this.d;
        if (activity.getWindow().getAttributes().softInputMode == 48) {
            return;
        }
        if (craf.e(activity, this.f)) {
            this.a.d(false);
            return;
        }
        Rect rect = new Rect();
        Point point = new Point();
        this.e.getWindowVisibleDisplayFrame(rect);
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        int iHeight = rect.height() > point.y ? -1 : rect.height();
        if (iHeight == -1 || iHeight == this.b) {
            return;
        }
        if (this.c.l()) {
            this.h.a(iHeight);
        } else {
            this.g.a(iHeight);
        }
        this.b = iHeight;
    }
}
