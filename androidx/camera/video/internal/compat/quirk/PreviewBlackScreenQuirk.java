package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import defpackage.fdgn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean a;

    static {
        a = fdgn.j(Build.BRAND, "motorola", true) && fdgn.j(Build.MODEL, "motorola edge 20 fusion", true);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final /* synthetic */ boolean i() {
        return true;
    }
}
