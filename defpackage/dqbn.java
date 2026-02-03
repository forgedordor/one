package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbn implements dqbh {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl");
    private static final AudioAttributes h = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
    public final fduf b;
    public final fduf c;
    public final fduf d;
    public final fdvc e;
    public final fdvc f;
    public final fdvc g;
    private final Context i;
    private final fdjx j;
    private final fctc k;
    private fdlr l;

    public dqbn(Context context, fdjx fdjxVar) {
        context.getClass();
        fdjxVar.getClass();
        this.i = context;
        this.j = fdjxVar;
        this.k = fctd.a(new fdae() { // from class: dqbl
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = dqbn.a;
                return new MediaPlayer();
            }
        });
        fduf fdufVarA = fdvf.a(false);
        this.b = fdufVarA;
        fduf fdufVarA2 = fdvf.a(false);
        this.c = fdufVarA2;
        fduf fdufVarA3 = fdvf.a(Duration.ZERO);
        this.d = fdufVarA3;
        this.e = new fduh(fdufVarA);
        this.f = new fduh(fdufVarA2);
        this.g = new fduh(fdufVarA3);
    }

    @Override // defpackage.dqbh
    public final void a() throws IllegalStateException {
        fduf fdufVar = this.b;
        if (((Boolean) fdufVar.c()).booleanValue()) {
            fduf fdufVar2 = this.c;
            if (((Boolean) fdufVar2.c()).booleanValue()) {
                e().pause();
                fdufVar2.f(false);
                f();
                return;
            }
        }
        ((ekrd) a.j().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "pause", 81, "AudioPlayerImpl.kt")).H("Failed to pause audio file, isPrepared: %b, isPlaying: %b", ((Boolean) fdufVar.c()).booleanValue(), ((Boolean) this.c.c()).booleanValue());
    }

    @Override // defpackage.dqbh
    public final void b() throws IllegalStateException {
        fduf fdufVar = this.b;
        if (((Boolean) fdufVar.c()).booleanValue()) {
            fduf fdufVar2 = this.c;
            if (!((Boolean) fdufVar2.c()).booleanValue()) {
                e().start();
                fdufVar2.f(true);
                fdlr fdlrVar = this.l;
                if (fdlrVar != null) {
                    fdlrVar.t(null);
                }
                this.l = fdil.d(this.j, null, null, new dqbm(this, null), 3);
                return;
            }
        }
        ((ekrd) a.j().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "play", 65, "AudioPlayerImpl.kt")).H("Failed to play audio file, isPrepared: %b, isPlaying: %b", ((Boolean) fdufVar.c()).booleanValue(), ((Boolean) this.c.c()).booleanValue());
    }

    @Override // defpackage.dqbh
    public final void c() {
        f();
        e().reset();
        this.b.f(false);
        this.c.f(false);
        this.d.f(Duration.ZERO);
    }

    @Override // defpackage.dqbh
    public final void d(Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        c();
        final MediaPlayer mediaPlayerE = e();
        mediaPlayerE.setAudioAttributes(h);
        mediaPlayerE.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: dqbi
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                dqbn dqbnVar = this.a;
                dqbnVar.c.f(false);
                dqbnVar.d.f(Duration.ZERO);
            }
        });
        mediaPlayerE.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: dqbj
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                this.a.d.f(Duration.ofMillis(mediaPlayerE.getCurrentPosition()));
            }
        });
        mediaPlayerE.setDataSource(this.i, uri);
        mediaPlayerE.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: dqbk
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                this.a.b.f(true);
            }
        });
        mediaPlayerE.prepareAsync();
    }

    public final MediaPlayer e() {
        return (MediaPlayer) this.k.a();
    }

    public final void f() {
        fdlr fdlrVar = this.l;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.l = null;
    }
}
