package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzs {
    public static final dhzt a(evqs evqsVar) {
        int i = elcz.a;
        byte[] bArr = new byte[16];
        elcx.a.a(evqsVar.o()).h(bArr);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new dhzt(byteBufferOrder.getInt(), byteBufferOrder.getInt(), byteBufferOrder.getInt(), byteBufferOrder.getInt());
    }
}
