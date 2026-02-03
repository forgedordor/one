package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhil {
    public static basd a() {
        return basd.a(b());
    }

    public static String b() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        return "Ms".concat(String.valueOf(Base64.encodeToString(byteBufferWrap.array(), 11).replace('_', '=')));
    }
}
