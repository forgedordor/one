package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ros extends rns {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rns
    protected final Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2) {
        return rpm.c(riiVar, bitmap, i, i2);
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        return obj instanceof ros;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return 1572326941;
    }
}
