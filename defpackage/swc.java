package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swc {
    public static final Optional a(Context context) {
        context.getClass();
        ekrg ekrgVar = ebum.a;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0).iterator();
        ComponentName componentName = null;
        ComponentName componentName2 = null;
        while (true) {
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                if (next.serviceInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                    componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                    break;
                }
                if (next.serviceInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                    componentName2 = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                }
            } else if (componentName2 == null) {
                ((ekrd) ((ekrd) ebum.a.j()).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getRecognitionServiceComponent", 118, "TranscriptionUtils.java")).q("No speech services provided by Google.");
            } else {
                componentName = componentName2;
            }
        }
        return Optional.ofNullable(componentName);
    }
}
