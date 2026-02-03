package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bls;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements bls {
    public static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }
}
