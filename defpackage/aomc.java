package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aomc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder");
    public final Context b;
    public final aolx c;
    public MediaRecorder d;
    public Uri e;
    public ParcelFileDescriptor f;
    public eiju g;
    private final eosd h;
    private final eosc i;
    private final ctce j;

    public aomc(Context context, eosd eosdVar, eosc eoscVar, aolx aolxVar, ctce ctceVar) {
        this.b = context;
        this.h = eosdVar;
        this.i = eoscVar;
        this.c = aolxVar;
        this.j = ctceVar;
    }

    private static int f(int i) {
        int i2 = (i / 307200) * 60;
        return i2 == 0 ? (i / 51200) * 10 : i2;
    }

    public final int a(int i) {
        if (!this.j.b()) {
            return ((Boolean) aonl.a.e()).booleanValue() ? ((Integer) aonl.b.e()).intValue() : f(i);
        }
        int iF = f(i);
        return ((Boolean) aonl.a.e()).booleanValue() ? Math.min(((Integer) aonl.b.e()).intValue(), iF) : iF;
    }

    public final Uri b() {
        MediaRecorder mediaRecorder;
        synchronized (aomc.class) {
            MediaRecorder mediaRecorder2 = this.d;
            if (mediaRecorder2 == null) {
                throw new IllegalStateException("Not currently recording!");
            }
            try {
                try {
                    mediaRecorder2.stop();
                    mediaRecorder = this.d;
                } catch (Throwable th) {
                    MediaRecorder mediaRecorder3 = this.d;
                    if (mediaRecorder3 != null) {
                        mediaRecorder3.release();
                        this.d = null;
                    }
                    throw th;
                }
            } catch (RuntimeException e) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "stopRecording", 207, "LevelTrackingMediaRecorder.java")).t("Something went wrong when stopping media recorder. %s", e);
                final Uri uri = this.e;
                if (uri != null) {
                    eijx.f(new Runnable() { // from class: aoly
                        @Override // java.lang.Runnable
                        public final void run() {
                            bxlf.i(this.a.b, uri);
                        }
                    }, this.i).k(auvh.b(), eoqg.a);
                    this.e = null;
                }
                MediaRecorder mediaRecorder4 = this.d;
                if (mediaRecorder4 != null) {
                    mediaRecorder4.release();
                }
            }
            if (mediaRecorder != null) {
                mediaRecorder.release();
                this.d = null;
            }
        }
        ParcelFileDescriptor parcelFileDescriptor = this.f;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
            this.f = null;
        }
        d();
        return this.e;
    }

    public final eiju c(long j, final long j2) {
        Callable callable = new Callable() { // from class: aolz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                aomc aomcVar = this.a;
                synchronized (aomc.class) {
                    if (aomcVar.d != null) {
                        ekrw ekrwVarE = aomc.a.e();
                        ekrwVarE.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "trackingSoundLevel", 295, "LevelTrackingMediaRecorder.java")).q("start tracking sound level with recorder");
                        aolx aolxVar = aomcVar.c;
                        synchronized (aomc.class) {
                            MediaRecorder mediaRecorder = aomcVar.d;
                            z = false;
                            int iMin = mediaRecorder != null ? Math.min(mediaRecorder.getMaxAmplitude() / 327, 100) : 0;
                            fdue fdueVar = aolxVar.a;
                            dqcd.a(iMin);
                            fdueVar.h(new dqcd(iMin));
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eosd eosdVar = this.h;
        return eiju.g(eosdVar.schedule(callable, j, timeUnit)).i(new eooz() { // from class: aoma
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    ekrw ekrwVarE = aomc.a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 318, "LevelTrackingMediaRecorder.java")).q("start tracking sound level is over");
                    return eijx.e(null);
                }
                long j3 = j2;
                aomc aomcVar = this.a;
                ekrw ekrwVarE2 = aomc.a.e();
                ekrwVarE2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 321, "LevelTrackingMediaRecorder.java")).q("start tracking sound level again");
                return aomcVar.c(j3, j3);
            }
        }, eosdVar).e(InterruptedException.class, new ejvr() { // from class: aomb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarE = aomc.a.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 330, "LevelTrackingMediaRecorder.java")).q("start tracking sound level interrupted");
                return null;
            }
        }, eosdVar);
    }

    public final void d() {
        eiju eijuVar = this.g;
        if (eijuVar != null && !eijuVar.isDone()) {
            this.g.cancel(true);
        }
        this.c.a.e();
    }

    public final boolean e() {
        return this.d != null;
    }
}
