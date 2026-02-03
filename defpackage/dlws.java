package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlws extends fcyz implements fdat {
    final /* synthetic */ dlwu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlws(dlwu dlwuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlwuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlws) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        fctl.b(obj);
        dlwu dlwuVar = this.a;
        if (!dlwuVar.a()) {
            throw new IllegalStateException("This instance needs to be prepared before filling input buffers");
        }
        MediaCodec mediaCodec3 = dlwuVar.d;
        MediaExtractor mediaExtractor = null;
        if (mediaCodec3 == null) {
            fdbq.c("mediaCodec");
            mediaCodec3 = null;
        }
        int iDequeueInputBuffer = mediaCodec3.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer < 0) {
            return dlwx.b;
        }
        MediaCodec mediaCodec4 = dlwuVar.d;
        if (mediaCodec4 == null) {
            fdbq.c("mediaCodec");
            mediaCodec4 = null;
        }
        ByteBuffer inputBuffer = mediaCodec4.getInputBuffer(iDequeueInputBuffer);
        if (inputBuffer == null) {
            throw new IllegalStateException("Input buffer should have been dequeued");
        }
        MediaExtractor mediaExtractor2 = dlwuVar.c;
        if (mediaExtractor2 == null) {
            fdbq.c("mediaExtractor");
            mediaExtractor2 = null;
        }
        int sampleData = mediaExtractor2.readSampleData(inputBuffer, 0);
        if (sampleData < 0) {
            MediaCodec mediaCodec5 = dlwuVar.d;
            if (mediaCodec5 == null) {
                fdbq.c("mediaCodec");
                mediaCodec2 = null;
            } else {
                mediaCodec2 = mediaCodec5;
            }
            mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
            return dlwx.c;
        }
        MediaCodec mediaCodec6 = dlwuVar.d;
        if (mediaCodec6 == null) {
            fdbq.c("mediaCodec");
            mediaCodec = null;
        } else {
            mediaCodec = mediaCodec6;
        }
        MediaExtractor mediaExtractor3 = dlwuVar.c;
        if (mediaExtractor3 == null) {
            fdbq.c("mediaExtractor");
            mediaExtractor3 = null;
        }
        mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, mediaExtractor3.getSampleTime(), 0);
        MediaExtractor mediaExtractor4 = dlwuVar.c;
        if (mediaExtractor4 == null) {
            fdbq.c("mediaExtractor");
        } else {
            mediaExtractor = mediaExtractor4;
        }
        mediaExtractor.advance();
        return dlwx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlws(this.a, fcxyVar);
    }
}
