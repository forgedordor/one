package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtt extends rtu {
    public rtt(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.rtu
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }
}
