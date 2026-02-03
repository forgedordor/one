package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbhi {
    public static final cczi a = cdag.e(cdag.b, "ditto_bugle_media_encryption_chunk_size_power", 15);

    public static int a() {
        return ((Integer) a.e()).intValue();
    }

    public static void b(int i) throws GeneralSecurityException {
        if (i < 29) {
            throw new GeneralSecurityException(String.format("Chunk size %d is too small", Integer.valueOf(i)));
        }
    }

    public static final byte[] c(InputStream inputStream, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        if (inputStream.available() == 0) {
            byteBufferAllocate.put((byte) 1);
        }
        byteBufferAllocate.position(1);
        byteBufferAllocate.putInt(i);
        return byteBufferAllocate.array();
    }
}
