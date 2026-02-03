package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ MediaPlayer c;
    final /* synthetic */ dqbt d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbr(MediaPlayer mediaPlayer, dqbt dqbtVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = mediaPlayer;
        this.d = dqbtVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqbr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            try {
                if (this.b != 0) {
                    fctl.b(obj);
                } else {
                    fctl.b(obj);
                    MediaPlayer mediaPlayer = this.c;
                    dqbt dqbtVar = this.d;
                    int i = this.e;
                    this.a = mediaPlayer;
                    this.b = 1;
                    fdiu fdiuVar = new fdiu(fcym.c(this), 1);
                    fdiuVar.B();
                    fdiuVar.d(new dqbp(mediaPlayer));
                    mediaPlayer.setOnCompletionListener(new dqbq(fdiuVar));
                    mediaPlayer.setAudioAttributes(dqbt.b);
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = dqbtVar.c.getResources().openRawResourceFd(i);
                    try {
                        mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd);
                        fczl.a(assetFileDescriptorOpenRawResourceFd, null);
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                        if (fdiuVar.m() == fcylVar) {
                            return fcylVar;
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                ((ekrd) ((ekrd) dqbt.a.j()).g(e).h("com/google/android/libraries/compose/voice/audioplayer/DefaultSoundEffectPlayer$play$2", "invokeSuspend", 56, "DefaultSoundEffectPlayer.kt")).q("Exception occurred while playing sound effect.");
            }
            this.c.release();
            return fctx.a;
        } catch (Throwable th) {
            this.c.release();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqbr(this.c, this.d, this.e, fcxyVar);
    }
}
