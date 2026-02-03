package defpackage;

import android.media.MediaPlayer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqvs implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ cqwd a;
    public final /* synthetic */ kog b;
    public final /* synthetic */ cvjt c;

    public /* synthetic */ cqvs(cqwd cqwdVar, cvjt cvjtVar, kog kogVar) {
        this.a = cqwdVar;
        this.c = cvjtVar;
        this.b = kogVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
        ((eksl) cqwd.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getErrorListener", 231, "PlaybackSession.java")).u("Media player encountered an error: type = %d, code = %d", i, i2);
        cvjt cvjtVar = this.c;
        if (cvjtVar != null) {
            cvjtVar.a();
        }
        final kog kogVar = this.b;
        final cqwd cqwdVar = this.a;
        auvh.h(eijx.f(new Runnable() { // from class: cqvq
            @Override // java.lang.Runnable
            public final void run() {
                cqwdVar.b();
                if (kogVar.b(new cqux(2, Optional.of(new cquy(i, i2))))) {
                    return;
                }
                ((eksl) cqwd.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getErrorListener", 242, "PlaybackSession.java")).q("Media player encountered error before being released");
            }
        }, cqwdVar.c));
        return true;
    }
}
