package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlwk extends fcyz implements fdat {
    final /* synthetic */ dlwo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlwk(dlwo dlwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlwk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dlwo dlwoVar = this.a;
        if (dlwoVar.e != null) {
            throw new IllegalStateException("This instance has already been prepared");
        }
        ekrw ekrwVarH = dlwo.a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/codec/AmrEncoder$prepare$2", "invokeSuspend", 53, "AmrEncoder.kt");
        dlwp dlwpVar = dlwoVar.d;
        ekrdVar.t("Preparing AmrEncoder with configuration: %s", dlwpVar.toString());
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/3gpp", dlwpVar.c, 1);
        mediaFormatCreateAudioFormat.setInteger("bitrate", dlwpVar.e);
        mediaFormatCreateAudioFormat.setInteger("pcm-encoding", 2);
        mediaFormatCreateAudioFormat.getClass();
        MediaCodec mediaCodecA = dlwy.a(mediaFormatCreateAudioFormat);
        mediaCodecA.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        dlwoVar.e = mediaCodecA;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlwk(this.a, fcxyVar);
    }
}
