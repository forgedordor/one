package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ste extends fcyz implements fdat {
    int a;
    final /* synthetic */ stf b;
    final /* synthetic */ Uri c;
    final /* synthetic */ MessagePartCoreData d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ste(stf stfVar, Uri uri, MessagePartCoreData messagePartCoreData, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = stfVar;
        this.c = uri;
        this.d = messagePartCoreData;
        this.e = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ste) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        stf stfVar;
        MediaExtractor mediaExtractor;
        Context context;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            try {
                stfVar = this.b;
                Uri uri = this.c;
                mediaExtractor = new MediaExtractor();
                try {
                    context = stfVar.c;
                    mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
                } catch (Exception e) {
                    mediaExtractor.release();
                    throw e;
                }
            } catch (Exception e2) {
                ((eksl) ((eksl) stf.b.i()).g(e2)).q("Failed to multiplex magic metadata.");
                stf stfVar2 = this.b;
                Uri uri2 = this.c;
                String strW = this.d.W();
                strW.getClass();
                MessageCoreData messageCoreData = this.e;
                MessageIdType messageIdTypeC = messageCoreData.C();
                messageIdTypeC.getClass();
                stfVar2.l(uri2, strW, messageIdTypeC);
                stfVar2.k("Bugle.MultiplexedMetadata.Sent.Invalid.Count", messageCoreData.cX());
            }
            if (!fdbq.f("audio/mp4", mediaExtractor.getMetrics().getString("android.media.mediaextractor.mime"))) {
                throw new UnsupportedOperationException();
            }
            Uri uriD = bxlf.d("m4a", context);
            fcti fctiVar = new fcti(new MediaMuxer(bxlf.h(uriD, context).getPath(), 0), uriD);
            MediaMuxer mediaMuxer = (MediaMuxer) fctiVar.a;
            Uri uri3 = (Uri) fctiVar.b;
            try {
                int trackCount = mediaExtractor.getTrackCount();
                for (int i2 = 0; i2 < trackCount; i2++) {
                    if (fdbq.f("application/am-mm-validation", mediaExtractor.getTrackFormat(i2).getString("mime"))) {
                        throw new UnsupportedOperationException();
                    }
                    mediaExtractor.selectTrack(i2);
                    mediaMuxer.addTrack(mediaExtractor.getTrackFormat(i2));
                }
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "application/am-mm-validation");
                int iAddTrack = mediaMuxer.addTrack(mediaFormat);
                mediaMuxer.start();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(stf.a);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.offset = 0;
                bufferInfo.size = 8;
                bufferInfo.presentationTimeUs = 0L;
                bufferInfo.flags = 4;
                mediaMuxer.writeSampleData(iAddTrack, byteBufferWrap, bufferInfo);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
                byteBufferAllocate.getClass();
                do {
                    int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                    if (sampleData > 0) {
                        int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.offset = 0;
                        bufferInfo2.size = sampleData;
                        bufferInfo2.presentationTimeUs = mediaExtractor.getSampleTime();
                        bufferInfo2.flags = 0;
                        mediaMuxer.writeSampleData(sampleTrackIndex, byteBufferAllocate, bufferInfo2);
                    }
                } while (mediaExtractor.advance());
                mediaMuxer.release();
                mediaExtractor.release();
                uri3.getClass();
                String strW2 = this.d.W();
                strW2.getClass();
                MessageCoreData messageCoreData2 = this.e;
                MessageIdType messageIdTypeC2 = messageCoreData2.C();
                messageIdTypeC2.getClass();
                stfVar.l(uri3, strW2, messageIdTypeC2);
                stf stfVar3 = this.b;
                bxlf.i(stfVar3.c, this.c);
                stfVar3.k("Bugle.MultiplexedMetadata.Sent.Valid.Count", messageCoreData2.cX());
                ListenableFuture listenableFutureS = this.b.e.b(6).s();
                this.a = 1;
                if (fdxs.c(listenableFutureS, this) == fcylVar) {
                    return fcylVar;
                }
            } catch (Throwable th) {
                mediaMuxer.release();
                mediaExtractor.release();
                throw th;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ste(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
