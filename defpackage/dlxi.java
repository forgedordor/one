package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxi {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;

    public dlxi(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = byteBuffer;
        this.b = bufferInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlxi)) {
            return false;
        }
        dlxi dlxiVar = (dlxi) obj;
        return fdbq.f(this.a, dlxiVar.a) && fdbq.f(this.b, dlxiVar.b);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        return ((byteBuffer == null ? 0 : byteBuffer.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OutputBufferResult(buffer=" + this.a + ", bufferInfo=" + this.b + ")";
    }
}
