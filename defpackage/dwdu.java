package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdu {
    public static UUID a(evqs evqsVar) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(evqsVar.I());
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
