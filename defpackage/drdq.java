package defpackage;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdq {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil");

    public static ejwi a(Signature signature) {
        try {
            return ejwi.i(eldz.h.f().j(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())));
        } catch (NoSuchAlgorithmException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil", "signatureDigest", (char) 160, "GrpcMetadataUtil.java")).q("Failed to parse a signature");
            return ejud.a;
        }
    }
}
