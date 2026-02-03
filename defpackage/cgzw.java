package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgzw {
    public static final cgzx a(String str) {
        UUID uuidFromString = UUID.fromString(str);
        uuidFromString.getClass();
        return new cgzx(uuidFromString);
    }

    public static final cgzx b() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return new cgzx(uuidRandomUUID);
    }
}
