package defpackage;

import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eful implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ImageView a;

    public eful(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ImageView imageView = this.a;
        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
        if (!eftb.a() || imageView.getDrawable() == null || (imageView.getDrawable() instanceof VectorDrawable) || (imageView.getDrawable() instanceof pop)) {
            return true;
        }
        if (!Build.TYPE.equals("userdebug") && !Build.TYPE.equals("eng")) {
            return true;
        }
        Log.w("HeaderAreaStyler", "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(String.valueOf(imageView.getContext().getPackageName())));
        return true;
    }
}
