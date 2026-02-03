package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rto extends rtu {
    public rto(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.rtu
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageBitmap((Bitmap) obj);
    }
}
