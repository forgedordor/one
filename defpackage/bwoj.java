package defpackage;

import com.google.communication.synapse.security.scytale.DecryptState;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class bwoj extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        bwor bworVar = (bwor) obj;
        DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
        int iOrdinal = bworVar.ordinal();
        if (iOrdinal == 0) {
            return c();
        }
        if (iOrdinal == 1) {
            return DecryptState.UNTRUSTED_IDENTITY_KEY;
        }
        if (iOrdinal == 2) {
            return DecryptState.UNTRUSTED_USER_ID;
        }
        if (iOrdinal == 3) {
            return DecryptState.FAIL_TO_DECRYPT;
        }
        if (iOrdinal == 4) {
            return DecryptState.SUCCESS;
        }
        if (iOrdinal == 5) {
            return d();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(bworVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        DecryptState decryptState = (DecryptState) obj;
        int iOrdinal = decryptState.ordinal();
        if (iOrdinal == 0) {
            return bwor.UNTRUSTED_IDENTITY_KEY;
        }
        if (iOrdinal == 1) {
            return bwor.UNTRUSTED_USER_ID;
        }
        if (iOrdinal == 2) {
            return bwor.FAIL_TO_DECRYPT;
        }
        if (iOrdinal == 3) {
            return bwor.DECRYPT_SUCCESS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(decryptState.toString()));
    }

    public abstract DecryptState c();

    public abstract DecryptState d();
}
