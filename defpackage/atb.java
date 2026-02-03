package defpackage;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atb {
    public static int a(bnk bnkVar, int i) {
        int iOrdinal = bnkVar.ordinal();
        return iOrdinal != 0 ? (iOrdinal == 3 && awv.a(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 1;
    }
}
