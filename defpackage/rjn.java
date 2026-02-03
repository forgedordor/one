package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rjn implements rvo {
    public static final rjo b() {
        try {
            return new rjo(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.rvo
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
