package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqzv implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer");
    public Looper c;
    public final Context d;
    public cqzs e;
    public cqzu f;
    public MediaPlayer h;
    public AudioManager i;
    public final LinkedList b = new LinkedList();
    public final Object g = new Object();
    public int j = 2;

    public cqzv(Context context) {
        this.d = context;
    }

    public final void a(cqzt cqztVar) {
        this.b.add(cqztVar);
        if (this.e == null) {
            cqzs cqzsVar = new cqzs(this);
            this.e = cqzsVar;
            cqzsVar.start();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AudioManager audioManager = this.i;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
        }
        LinkedList linkedList = this.b;
        synchronized (linkedList) {
            if (linkedList.isEmpty()) {
                synchronized (this.g) {
                    Looper looper = this.c;
                    if (looper != null) {
                        looper.quit();
                    }
                    this.f = null;
                }
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "onError", 277, "NotificationPlayer.java")).u("NotificationPlayer failed: error type: %d, extra code: %d", i, i2);
        return false;
    }
}
