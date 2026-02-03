package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bls;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements bls {
    public static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }
}
