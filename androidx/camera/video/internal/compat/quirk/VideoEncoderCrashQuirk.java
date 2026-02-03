package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bir;
import defpackage.bxo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    public static boolean b() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean a(bir birVar, bxo bxoVar) {
        return b() && birVar.a() == 0 && bxoVar == bxo.b;
    }
}
