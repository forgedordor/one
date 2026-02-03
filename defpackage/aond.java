package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aond {
    public final Context a;
    public final eosc b;
    public final aolw c;
    public final eigp d;
    public final Uri e;
    public final fcsu f;
    public MediaPlayer g;
    public final aomu k;
    public boolean h = false;
    private boolean l = false;
    public boolean i = false;
    public Duration j = Duration.ZERO;

    public aond(Context context, eosc eoscVar, aolw aolwVar, eigp eigpVar, fcsu fcsuVar, Uri uri, aomu aomuVar) {
        this.a = context;
        this.b = eoscVar;
        this.c = aolwVar;
        this.d = eigpVar;
        this.f = fcsuVar;
        this.e = uri;
        this.k = aomuVar;
    }

    final Duration a() {
        MediaPlayer mediaPlayer;
        return (!this.h || (mediaPlayer = this.g) == null) ? Duration.ZERO : Duration.ofMillis(mediaPlayer.getCurrentPosition());
    }

    final Duration b() {
        MediaPlayer mediaPlayer;
        long duration = -1;
        if (this.h && (mediaPlayer = this.g) != null) {
            duration = mediaPlayer.getDuration();
        }
        return Duration.ofMillis(duration);
    }

    final void c() throws IllegalStateException {
        MediaPlayer mediaPlayer;
        if (!this.h || (mediaPlayer = this.g) == null) {
            this.i = false;
            return;
        }
        mediaPlayer.pause();
        aomv aomvVar = this.k.a;
        if (equals(aomvVar.f) && aomvVar.g != null) {
            ((aiqb) aomvVar.c.b()).b(aomvVar.g(), b().toSeconds());
            aomvVar.f(new aomo(2, b(), a()));
            aomvVar.b();
        }
        this.c.a();
    }

    final void d() {
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null || this.l) {
            return;
        }
        cqwh.b(mediaPlayer);
        this.l = true;
        this.h = false;
        this.c.a();
    }

    final void e(Duration duration) throws IllegalStateException {
        MediaPlayer mediaPlayer;
        if (!this.h || (mediaPlayer = this.g) == null) {
            this.j = duration;
        } else {
            mediaPlayer.seekTo((int) duration.toMillis());
        }
    }

    final void f() throws IllegalStateException {
        Window window;
        if (!this.h || this.g == null) {
            this.i = true;
            return;
        }
        aolw aolwVar = this.c;
        aolwVar.b = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: aomw
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) throws IllegalStateException {
                aond aondVar;
                aomu aomuVar = this.a.k;
                if (i == -3 || i == -2) {
                    aond aondVar2 = aomuVar.a.f;
                    if (aondVar2 != null) {
                        aondVar2.c();
                        return;
                    }
                    return;
                }
                if (i == -1) {
                    aomuVar.a.e();
                    return;
                }
                if ((i == 1 || i == 2 || i == 3 || i == 4) && (aondVar = aomuVar.a.f) != null) {
                    aondVar.f();
                }
            }
        }).build();
        if (aolwVar.a.requestAudioFocus(aolwVar.b) != 1) {
            aomv aomvVar = this.k.a;
            if (equals(aomvVar.f)) {
                aomf aomfVar = aomvVar.g;
                if (aomfVar != null) {
                    aomvVar.c(aomfVar, aomh.a);
                }
                aomvVar.f(new aomo(2, b(), a()));
                ((eksl) ((eksl) aomv.a.h()).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$AudioControllerSessionStateChangeListener", "onAudioFocusRequestDenied", 364, "AudioAttachmentController.java")).q("Audio playback focus request denied.");
                return;
            }
            return;
        }
        this.g.start();
        aomv aomvVar2 = this.k.a;
        if (!equals(aomvVar2.f) || aomvVar2.g == null) {
            return;
        }
        ((aiqb) aomvVar2.c.b()).c(aomvVar2.g(), b().toSeconds());
        aomvVar2.f(new aomo(1, b(), a()));
        eg egVarG = aomvVar2.b.G();
        if (egVarG == null || (window = egVarG.getWindow()) == null) {
            return;
        }
        window.addFlags(128);
    }

    final boolean g() {
        MediaPlayer mediaPlayer;
        return this.h && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying();
    }
}
