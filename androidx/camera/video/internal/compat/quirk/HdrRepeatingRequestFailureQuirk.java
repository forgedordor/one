package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bls;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HdrRepeatingRequestFailureQuirk implements bls {
    public static boolean a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "pa3q".equalsIgnoreCase(Build.DEVICE);
    }
}
