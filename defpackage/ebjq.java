package defpackage;

import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebjq {
    public final SecureRandom a = new SecureRandom();
    public final int b;

    public ebjq(int i) {
        this.b = i;
    }

    public static void a(ByteBuffer byteBuffer, String str, int i) {
        byteBuffer.put(ebjb.c);
        byteBuffer.put(str.getBytes());
        byteBuffer.put((byte) i);
        byteBuffer.put(ebjb.b);
    }

    public static void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        byteBuffer.put(bArr);
        byteBuffer.put(ebjb.e);
        byteBuffer.put(bArr2);
        byteBuffer.put(ebjb.b);
    }

    public static void c(ByteBuffer byteBuffer, String str, String str2) {
        byteBuffer.put(ebjb.a);
        byteBuffer.put((byte) 32);
        byteBuffer.put(str.getBytes());
        byteBuffer.put((byte) 32);
        byteBuffer.put(str2.getBytes());
        byteBuffer.put(ebjb.b);
    }
}
