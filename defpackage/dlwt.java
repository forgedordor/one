package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwt extends fcyz implements fdat {
    final /* synthetic */ dlwu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlwt(dlwu dlwuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlwuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlwt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dlwu dlwuVar = this.a;
        if (!dlwuVar.a()) {
            throw new IllegalStateException("This instance needs to be prepared before reading output buffers");
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = dlwuVar.d;
        MediaCodec mediaCodec2 = null;
        if (mediaCodec == null) {
            fdbq.c("mediaCodec");
            mediaCodec = null;
        }
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer < 0) {
            return new dlxi(null, bufferInfo);
        }
        if (bufferInfo.size <= 0) {
            MediaCodec mediaCodec3 = dlwuVar.d;
            if (mediaCodec3 == null) {
                fdbq.c("mediaCodec");
                mediaCodec3 = null;
            }
            mediaCodec3.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return new dlxi(null, bufferInfo);
        }
        MediaCodec mediaCodec4 = dlwuVar.d;
        if (mediaCodec4 == null) {
            fdbq.c("mediaCodec");
            mediaCodec4 = null;
        }
        ByteBuffer outputBuffer = mediaCodec4.getOutputBuffer(iDequeueOutputBuffer);
        if (outputBuffer == null) {
            throw new IllegalStateException("Output buffer should have been dequeued");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(outputBuffer.limit());
        byteBufferAllocate.getClass();
        outputBuffer.rewind();
        byteBufferAllocate.put(outputBuffer);
        outputBuffer.rewind();
        byteBufferAllocate.flip();
        MediaCodec mediaCodec5 = dlwuVar.d;
        if (mediaCodec5 == null) {
            fdbq.c("mediaCodec");
        } else {
            mediaCodec2 = mediaCodec5;
        }
        mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer, false);
        return new dlxi(byteBufferAllocate, bufferInfo);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlwt(this.a, fcxyVar);
    }
}
