package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crzd {
    static final /* synthetic */ crzd a = new crzd();
    public static final cczi b = cdag.e(cdag.b, "spam_logging_ids_user_id_lifetime_days", 14);
    public static final cczi c = cdag.e(cdag.b, "spam_logging_ids_conversation_and_message_id_lifetime_days", 7);

    private crzd() {
    }

    public final evqs a(String str) {
        str.getClass();
        UUID uuidFromString = UUID.fromString(str);
        return evqs.x(ByteBuffer.allocate(16).putLong(uuidFromString.getMostSignificantBits()).putLong(uuidFromString.getLeastSignificantBits()).array());
    }
}
