package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eaxa {
    public static eaxe a() {
        try {
            byte[] bArr = eaxf.a;
            byte[] bArr2 = eaxf.c;
            erbc.a();
            return new eaxe((eqsf) eqso.f(bArr).h(erbh.a(), eqsf.class), (eqsf) eqso.f(bArr2).h(erbh.a(), eqsf.class));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("Failed to create TinkEncrypter", e);
        }
    }
}
