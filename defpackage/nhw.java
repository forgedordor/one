package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhw {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final Spatializer$OnSpatializerStateChangedListener d;

    public nhw(Context context, nid nidVar) {
        AudioManager audioManagerA = context == null ? null : mdh.a(context);
        if (audioManagerA != null) {
            mee.f(context);
            if (!mgb.ac(context)) {
                Spatializer spatializer = audioManagerA.getSpatializer();
                this.a = spatializer;
                this.b = spatializer.getImmersiveAudioLevel() != 0;
                nhv nhvVar = new nhv(nidVar);
                this.d = nhvVar;
                Looper looperMyLooper = Looper.myLooper();
                mee.g(looperMyLooper);
                final Handler handler = new Handler(looperMyLooper);
                this.c = handler;
                spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: nhu
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, nhvVar);
                return;
            }
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }
}
