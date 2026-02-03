package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobs {
    public static final evqs a(UUID uuid) {
        return evqs.x(d(uuid));
    }

    public static final UUID b(evqs evqsVar) {
        try {
            return c(evqsVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final UUID c(evqs evqsVar) {
        evqsVar.getClass();
        if (!((Boolean) cobr.a.e()).booleanValue() || evqsVar.d() == 16) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(evqsVar.I());
            byteBufferWrap.getClass();
            return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
        }
        throw new IllegalArgumentException("The input to UUID must have 16 bytes. It had bytes.size()=" + evqsVar.d());
    }

    public static final byte[] d(UUID uuid) {
        byte[] bArrArray = ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        bArrArray.getClass();
        return bArrArray;
    }
}
