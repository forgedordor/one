package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxb extends fcyz implements fdat {
    final /* synthetic */ dlxf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlxb(dlxf dlxfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlxfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlxb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dlxf dlxfVar = this.a;
        if (dlxfVar.d != null) {
            throw new IllegalStateException("This instance has already been prepared");
        }
        ekrw ekrwVarH = dlxf.a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder$prepare$2", "invokeSuspend", 61, "Mpeg4Encoder.kt");
        dlxg dlxgVar = dlxfVar.c;
        ekrdVar.t("Preparing Mpeg4Encoder with configuration: %s", dlxgVar.toString());
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", dlxgVar.c, 1);
        mediaFormatCreateAudioFormat.setInteger("bitrate", dlxgVar.e);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("pcm-encoding", 2);
        mediaFormatCreateAudioFormat.getClass();
        MediaCodec mediaCodecA = dlwy.a(mediaFormatCreateAudioFormat);
        mediaCodecA.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        dlxfVar.d = mediaCodecA;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlxb(this.a, fcxyVar);
    }
}
