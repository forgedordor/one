package defpackage;

import com.sun.jna.Memory;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpk {
    private final eqbw a;
    private boolean b;

    public ccpk(eqbw eqbwVar) {
        this.a = eqbwVar;
    }

    public final epsp a() {
        Object objA;
        if (this.b) {
            throw new IllegalStateException("encryptFinalize should only be called once.");
        }
        this.b = true;
        try {
            epzp epzpVarZinnia_ZinniaFileEncryptor_encrypt_finalize = eqbw.a.Zinnia_ZinniaFileEncryptor_encrypt_finalize(this.a.b);
            if (epzpVarZinnia_ZinniaFileEncryptor_encrypt_finalize.isOk == 1) {
                eqam eqamVar = new eqam(epzpVarZinnia_ZinniaFileEncryptor_encrypt_finalize.union.ok);
                eqamVar.a();
                objA = eqamVar;
            } else {
                eqbs eqbsVar = new eqbs(epzpVarZinnia_ZinniaFileEncryptor_encrypt_finalize.union.err);
                eqbsVar.b();
                objA = fctl.a(eqbsVar);
            }
            fctl.b(objA);
            epsp epspVar = (epsp) evsn.parseFrom(epsp.a, ccvs.a((eqam) objA));
            epspVar.getClass();
            return epspVar;
        } catch (Exception e) {
            throw new Exception("Error finalizing Zinnia File Encryptor", e);
        }
    }

    public final byte[] b(byte[] bArr) throws Exception {
        Object objA;
        if (this.b) {
            throw new IllegalStateException("Encrypt called after the encryptor was finalized. Create a new encryptor to encrypt\n      another payload or check the control flow to ensure a resource isn't continuing to encrypt\n      after this is finalized.");
        }
        try {
            eqbw eqbwVar = this.a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            bArrCopyOf.getClass();
            fcti fctiVarC = epzk.c(bArrCopyOf);
            Memory memory = (Memory) fctiVarC.a;
            epzp epzpVarZinnia_ZinniaFileEncryptor_encrypt_chunk = eqbw.a.Zinnia_ZinniaFileEncryptor_encrypt_chunk(eqbwVar.b, (eqau) fctiVarC.b);
            if (epzpVarZinnia_ZinniaFileEncryptor_encrypt_chunk.isOk == 1) {
                eqam eqamVar = new eqam(epzpVarZinnia_ZinniaFileEncryptor_encrypt_chunk.union.ok);
                eqamVar.a();
                objA = eqamVar;
                if (memory != null) {
                    memory.close();
                    objA = eqamVar;
                }
            } else {
                eqbs eqbsVar = new eqbs(epzpVarZinnia_ZinniaFileEncryptor_encrypt_chunk.union.err);
                eqbsVar.b();
                if (memory != null) {
                    memory.close();
                }
                objA = fctl.a(eqbsVar);
            }
            fctl.b(objA);
            return ccvs.a((eqam) objA);
        } catch (Exception e) {
            throw new Exception("Error encrypting next chunk in Zinnia Encryption", e);
        }
    }
}
