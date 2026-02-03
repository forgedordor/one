package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esno {
    public final String a;
    public final ByteBuffer b;

    public esno(String str, ByteBuffer byteBuffer) {
        this.a = str;
        this.b = byteBuffer;
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.b;
        return super.toString() + ": contentType=" + this.a + ", data=" + byteBuffer.toString();
    }
}
