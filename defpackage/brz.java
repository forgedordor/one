package defpackage;

import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brz {
    public final boolean a;

    public brz() {
        this.a = brt.a(SurfaceOrderQuirk.class) != null;
    }

    public static final int a(bjz bjzVar) {
        Class cls = bjzVar.n;
        if (cls != MediaCodec.class) {
            return (cls == bch.class || cls == bvk.class) ? 0 : 1;
        }
        return 2;
    }
}
