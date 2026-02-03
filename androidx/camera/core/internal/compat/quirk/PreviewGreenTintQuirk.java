package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import defpackage.bls;
import defpackage.fdgn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewGreenTintQuirk implements bls {
    public static final PreviewGreenTintQuirk a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    public static final boolean a() {
        return fdgn.j("motorola", Build.BRAND, true) && fdgn.j("moto e20", Build.MODEL, true);
    }
}
