package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bls;
import defpackage.fdgn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PrematureEndOfStreamVideoQuirk implements bls {
    public static final PrematureEndOfStreamVideoQuirk a = new PrematureEndOfStreamVideoQuirk();
    public static final boolean b;

    static {
        b = fdgn.j("OPPO", Build.BRAND, true) && fdgn.j("CPH1931", Build.MODEL, true);
    }

    private PrematureEndOfStreamVideoQuirk() {
    }
}
