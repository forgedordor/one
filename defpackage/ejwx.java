package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwx {
    public static final SecureRandom a;
    public static final ThreadLocal b;

    static {
        new ejwv();
        a = a();
        new ejww();
        b = new ejwu();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
