package defpackage;

import android.media.MediaMuxer;
import android.os.Build;
import android.util.SparseArray;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocw implements oag {
    public static final String a = "android.media:" + Build.VERSION.SDK_INT;
    public static final ekgb b;
    public static final ekgb c;
    public final MediaMuxer d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public boolean g;
    private boolean h;

    static {
        ekfw ekfwVar = new ekfw();
        ekfwVar.i("video/avc", "video/3gpp", "video/mp4v-es");
        ekfwVar.h("video/hevc");
        if (Build.VERSION.SDK_INT >= 33) {
            ekfwVar.h("video/dolby-vision");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ekfwVar.h("video/av01");
        }
        if (Build.VERSION.SDK_INT >= 36) {
            ekfwVar.h("video/apv");
        }
        b = ekfwVar.g();
        c = ekgb.t("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb");
    }

    public ocw(MediaMuxer mediaMuxer) {
        this.d = mediaMuxer;
    }

    public final void a() throws oah {
        try {
            this.d.start();
            this.g = true;
        } catch (RuntimeException e) {
            throw new oah("Failed to start the muxer", e);
        }
    }

    @Override // defpackage.oag, java.lang.AutoCloseable
    public final void close() throws oah {
        if (this.h) {
            return;
        }
        if (!this.g) {
            a();
        }
        this.g = false;
        try {
            try {
                MediaMuxer mediaMuxer = this.d;
                try {
                    mediaMuxer.stop();
                } catch (RuntimeException e) {
                    if (Build.VERSION.SDK_INT < 30) {
                        try {
                            Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                            declaredField.setAccessible(true);
                            Integer num = (Integer) declaredField.get(mediaMuxer);
                            String str = mgb.a;
                            num.intValue();
                            Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                            declaredField2.setAccessible(true);
                            declaredField2.set(mediaMuxer, num);
                        } catch (Exception unused) {
                        }
                    }
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw new oah("Failed to stop the MediaMuxer", e2);
            }
        } finally {
            this.d.release();
            this.h = true;
        }
    }
}
