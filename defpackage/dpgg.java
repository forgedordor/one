package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgg implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ dpfq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ShapeDrawable d;
    final /* synthetic */ jyq e;
    final /* synthetic */ kio f;

    public dpgg(View view, dpfq dpfqVar, boolean z, ShapeDrawable shapeDrawable, jyq jyqVar, kio kioVar) {
        this.a = view;
        this.b = dpfqVar;
        this.c = z;
        this.d = shapeDrawable;
        this.e = jyqVar;
        this.f = kioVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ShapeDrawable shapeDrawableA;
        View view = this.a;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.getWidth();
        int height = view.getHeight();
        dpfq dpfqVar = this.b;
        if (this.c) {
            shapeDrawableA = this.d;
            shapeDrawableA.getClass();
        } else {
            shapeDrawableA = dpgi.a(this.e, this.f, height);
        }
        dpfqVar.setTextCursorDrawable(shapeDrawableA);
    }
}
