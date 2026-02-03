package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbq implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ fdis a;

    public dqbq(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        fdis fdisVar = this.a;
        if (fdisVar.i()) {
            fdisVar.w(fctx.a);
        }
    }
}
