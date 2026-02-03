package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbp implements fdap {
    final /* synthetic */ MediaPlayer a;

    public dqbp(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.release();
        return fctx.a;
    }
}
