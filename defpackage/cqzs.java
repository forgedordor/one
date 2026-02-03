package defpackage;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqzs extends Thread {
    final /* synthetic */ cqzv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqzs(cqzv cqzvVar) {
        super("NotificationPlayer-Bugle");
        this.a = cqzvVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IllegalStateException {
        cqzt cqztVar;
        while (true) {
            cqzv cqzvVar = this.a;
            LinkedList linkedList = cqzvVar.b;
            synchronized (linkedList) {
                cqztVar = (cqzt) linkedList.removeFirst();
            }
            int i = cqztVar.a;
            if (i == 1) {
                try {
                    synchronized (cqzvVar.g) {
                        Looper looper = cqzvVar.c;
                        if (looper != null && looper.getThread().getState() != Thread.State.TERMINATED) {
                            cqzvVar.c.quit();
                        }
                        cqzvVar.f = new cqzu(cqzvVar, cqztVar);
                        synchronized (cqzvVar.f) {
                            cqzvVar.f.start();
                            cqzvVar.f.wait();
                        }
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - cqztVar.d;
                    if (jElapsedRealtime > 1000) {
                        ekrw ekrwVarJ = cqzv.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "startSound", 181, "NotificationPlayer.java")).s("Notification sound delayed by %dmsecs", jElapsedRealtime);
                    }
                } catch (Exception e) {
                    ekrw ekrwVarJ2 = cqzv.a.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "startSound", 184, "NotificationPlayer.java")).t("error loading sound for %s", cqztVar.b);
                }
            } else if (i == 2 && cqzvVar.h != null) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - cqztVar.d;
                if (jElapsedRealtime2 > 1000) {
                    ekrw ekrwVarJ3 = cqzv.a.j();
                    ekrwVarJ3.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "stopSound", 194, "NotificationPlayer.java")).s("Notification stop delayed by %dmsecs", jElapsedRealtime2);
                }
                MediaPlayer mediaPlayer = cqzvVar.h;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    cqwh.b(cqzvVar.h);
                }
                cqzvVar.h = null;
                AudioManager audioManager = cqzvVar.i;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(null);
                }
                cqzvVar.i = null;
                Looper looper2 = cqzvVar.c;
                if (looper2 != null && looper2.getThread().getState() != Thread.State.TERMINATED) {
                    cqzvVar.c.quit();
                }
            }
            LinkedList linkedList2 = this.a.b;
            synchronized (linkedList2) {
                if (linkedList2.isEmpty()) {
                    this.a.e = null;
                    return;
                }
            }
        }
    }
}
