package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esln extends eslm {
    public static final esln a = new esln();

    @Override // defpackage.eslm
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }
}
