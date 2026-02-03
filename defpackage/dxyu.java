package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxyu implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dxyv c;

    public dxyu(dxyv dxyvVar, Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        this.c = dxyvVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ecem.c();
        dxyv dxyvVar = this.c;
        ImageView imageView = (ImageView) dxyvVar.a.get();
        if (!dxyvVar.e && imageView != null) {
            imageView.setImageDrawable(this.a);
        }
        if (this.b) {
            dxyvVar.c();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
