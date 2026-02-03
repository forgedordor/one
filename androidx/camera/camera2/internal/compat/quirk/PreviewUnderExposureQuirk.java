package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bls;
import defpackage.fdgn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewUnderExposureQuirk implements bls {
    public static final PreviewUnderExposureQuirk a = new PreviewUnderExposureQuirk();
    public static final boolean b = fdgn.j(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }
}
