package defpackage;

import j$.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvd implements eqrz {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = new byte[0];
    private static final Set c;
    private final String d;
    private final eqst e;
    private final eqrz f;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        c = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public eqvd(ermh ermhVar, eqrz eqrzVar) {
        if (!c.contains(ermhVar.b)) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + ermhVar.b + ". Only Tink AEAD key types are supported.");
        }
        this.d = ermhVar.b;
        ermg ermgVar = (ermg) ermh.a.createBuilder(ermhVar);
        ermy ermyVar = ermy.RAW;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
        this.e = eqta.a(((ermh) ermgVar.build()).toByteArray());
        this.f = eqrzVar;
    }

    @Override // defpackage.eqrz
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((eqrz) erey.a.a(erfb.a.a(erfv.a(this.d, evqs.x(this.f.a(bArr3, b)), 3, ermy.RAW, null), eqsy.a), eqrz.class)).a(bArr4, null);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // defpackage.eqrz
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        eqsg eqsgVarA = eres.a.a(this.e, null);
        byte[] bArrB = this.f.b(((erfv) erfb.a.c(eqsgVarA, erfv.class, eqsy.a)).c.I(), b);
        int length = bArrB.length;
        if (length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] bArrB2 = ((eqrz) erey.a.a(eqsgVarA, eqrz.class)).b(bArr, null);
        return ByteBuffer.allocate(length + 4 + bArrB2.length).putInt(length).put(bArrB).put(bArrB2).array();
    }
}
