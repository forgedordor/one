package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccq {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public ccq(ByteBuffer byteBuffer, ccb ccbVar, int i, int i2) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        ccj ccjVar = (ccj) ccbVar;
        if (iLimit == ccjVar.a) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
            this.d = ccjVar.b;
            return;
        }
        throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + ccjVar.a);
    }
}
