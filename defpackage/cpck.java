package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpck extends rns {
    private static final byte[] b = "com.google.android.apps.messaging.shared.ui.glide.HorizontalFlip".getBytes(a);

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rns
    protected final Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2) {
        return rpm.i(bitmap, 2);
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        return obj instanceof cpck;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return -1018665206;
    }
}
