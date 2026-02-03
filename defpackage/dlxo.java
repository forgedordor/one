package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxo {
    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        byteBuffer2.getClass();
        int iLimit = byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + i);
        byteBuffer.put(byteBuffer2);
        byteBuffer2.limit(iLimit);
    }
}
