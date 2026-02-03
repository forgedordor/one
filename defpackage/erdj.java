package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdj implements eqsq {
    public static final Object a = new Object();

    @Override // defpackage.eqsq
    public final eqrz a(String str) throws GeneralSecurityException {
        erdi erdiVar;
        try {
            synchronized (a) {
                erdiVar = new erdi(erwk.e(str));
                byte[] bArrB = erfy.b(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(bArrB, erdiVar.a(erdiVar.b(bArrB, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return erdiVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @Override // defpackage.eqsq
    public final boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
