package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdh {
    public static AudioManager a;

    public static synchronized AudioManager a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            a = null;
        }
        AudioManager audioManager = a;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            final mem memVar = new mem();
            mef.a().execute(new Runnable() { // from class: mdg
                @Override // java.lang.Runnable
                public final void run() {
                    mdh.a = (AudioManager) applicationContext.getSystemService("audio");
                    memVar.e();
                }
            });
            memVar.b();
            AudioManager audioManager2 = a;
            mee.f(audioManager2);
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        a = audioManager3;
        mee.f(audioManager3);
        return audioManager3;
    }
}
