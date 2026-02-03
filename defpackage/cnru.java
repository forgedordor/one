package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnru {
    public static evqs a(UUID uuid) {
        return evqs.x(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    public static UUID b(evqs evqsVar) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(evqsVar.I());
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
