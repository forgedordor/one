package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svw extends fcyz implements fdat {
    final /* synthetic */ svy a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ebsu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svw(fcxy fcxyVar, svy svyVar, Uri uri, ebsu ebsuVar) {
        super(2, fcxyVar);
        this.a = svyVar;
        this.b = uri;
        this.c = ebsuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        svy svyVar = this.a;
        if (svyVar.c()) {
            throw new IllegalStateException("This instance has already been prepared");
        }
        AssetFileDescriptor assetFileDescriptorA = ebsv.a(svyVar.a, this.b, "r", this.c);
        try {
            svyVar.c = new MediaExtractor();
            MediaExtractor mediaExtractor = svyVar.c;
            MediaCodec mediaCodec = null;
            if (mediaExtractor == null) {
                fdbq.c("mediaExtractor");
                mediaExtractor = null;
            }
            mediaExtractor.setDataSource(assetFileDescriptorA.getFileDescriptor());
            fczl.a(assetFileDescriptorA, null);
            svy svyVar2 = this.a;
            MediaExtractor mediaExtractor2 = svyVar2.c;
            if (mediaExtractor2 == null) {
                fdbq.c("mediaExtractor");
                mediaExtractor2 = null;
            }
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor2.getTrackFormat(i);
                trackFormat.getClass();
                String string = trackFormat.getString("mime");
                if (string != null && fdgn.t(string, "audio")) {
                    fcti fctiVar = new fcti(Integer.valueOf(i), trackFormat);
                    int iIntValue = ((Number) fctiVar.a).intValue();
                    MediaFormat mediaFormat = (MediaFormat) fctiVar.b;
                    MediaExtractor mediaExtractor3 = svyVar2.c;
                    if (mediaExtractor3 == null) {
                        fdbq.c("mediaExtractor");
                        mediaExtractor3 = null;
                    }
                    mediaExtractor3.selectTrack(iIntValue);
                    String strFindDecoderForFormat = new MediaCodecList(0).findDecoderForFormat(mediaFormat);
                    if (strFindDecoderForFormat == null) {
                        throw new IOException("Unable to find audio decoder for ".concat(String.valueOf(mediaFormat.getString("mime"))));
                    }
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(strFindDecoderForFormat);
                    mediaCodecCreateByCodecName.getClass();
                    svyVar2.d = mediaCodecCreateByCodecName;
                    MediaCodec mediaCodec2 = svyVar2.d;
                    if (mediaCodec2 == null) {
                        fdbq.c("mediaCodec");
                        mediaCodec2 = null;
                    }
                    mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    int integer = mediaFormat.getInteger("sample-rate");
                    int integer2 = mediaFormat.getInteger("channel-count");
                    Duration durationC = eoob.c(mediaFormat.getLong("durationUs"));
                    MediaCodec mediaCodec3 = svyVar2.d;
                    if (mediaCodec3 == null) {
                        fdbq.c("mediaCodec");
                    } else {
                        mediaCodec = mediaCodec3;
                    }
                    String name = mediaCodec.getCodecInfo().getName();
                    name.getClass();
                    return new svz(integer, integer2, durationC, name);
                }
            }
            throw new IOException("File does not contain an audio track");
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        svw svwVar = new svw(fcxyVar, this.a, this.b, this.c);
        svwVar.d = obj;
        return svwVar;
    }
}
