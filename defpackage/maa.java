package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class maa {
    public final AudioAttributes a;

    public maa(mac macVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(macVar.b).setFlags(0).setUsage(1);
        if (Build.VERSION.SDK_INT >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.a = usage.build();
    }
}
