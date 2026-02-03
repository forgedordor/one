package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqzu extends Thread {
    public final cqzt a;
    final /* synthetic */ cqzv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqzu(cqzv cqzvVar, cqzt cqztVar) {
        super("CreationAndCompletionThread");
        this.b = cqzvVar;
        this.a = cqztVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String encodedPath;
        Looper.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.b.c = looperMyLooper;
        synchronized (this) {
            cqzv cqzvVar = this.b;
            Context context = cqzvVar.d;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            MediaPlayer mediaPlayerA = cqwh.a();
            try {
                mediaPlayerA.setAudioAttributes(new AudioAttributes.Builder().setUsage(8).build());
                cqzt cqztVar = this.a;
                mediaPlayerA.setDataSource(context, cqztVar.b);
                mediaPlayerA.setLooping(false);
                float f = cqztVar.c;
                mediaPlayerA.setVolume(f, f);
                mediaPlayerA.prepare();
                Uri uri = cqztVar.b;
                if (uri != null && (encodedPath = uri.getEncodedPath()) != null && encodedPath.length() > 0) {
                    AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
                    builder.setAudioAttributes(new AudioAttributes.Builder().setUsage(8).build());
                    audioManager.requestAudioFocus(builder.build());
                }
                mediaPlayerA.setOnCompletionListener(cqzvVar);
                mediaPlayerA.setOnErrorListener(cqzvVar);
                mediaPlayerA.start();
                MediaPlayer mediaPlayer = cqzvVar.h;
                if (mediaPlayer != null) {
                    cqwh.b(mediaPlayer);
                }
                cqzvVar.h = mediaPlayerA;
                cqztVar.e.set(null);
            } catch (Exception e) {
                ekrw ekrwVarJ = cqzv.a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer$CreationAndCompletionThread", "run", 142, "NotificationPlayer.java");
                cqzt cqztVar2 = this.a;
                ekrdVar.t("error loading sound for %s", cqztVar2.b);
                cqwh.b(mediaPlayerA);
                cqztVar2.e.setException(e);
            }
            this.b.i = audioManager;
            notify();
        }
        Looper.loop();
    }
}
