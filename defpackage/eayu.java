package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eayu {
    public static evqs a(SecureRandom secureRandom) {
        byte[] bArr = new byte[8];
        secureRandom.nextBytes(bArr);
        return evqs.x(bArr);
    }
}
