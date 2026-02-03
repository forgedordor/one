package defpackage;

import com.google.communication.synapse.security.scytale.MediaDecryptionParams;
import com.google.communication.synapse.security.scytale.MediaEncryptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvv implements cbtg {
    private final eygg a;

    public bvvv(eygg eyggVar) {
        eyggVar.getClass();
        this.a = eyggVar;
    }

    @Override // defpackage.cbtg
    public final InputStream a(InputStream inputStream, cbtf cbtfVar) {
        if (!(cbtfVar instanceof cbte)) {
            throw new IllegalArgumentException("Scytale decryption requested, but the metadata provided is not scytale");
        }
        eyfn eyfnVar = ((cbte) cbtfVar).a;
        this.a.b();
        Object objA = bwlb.a(MediaEncryptor.createDecryptorInstance(new MediaDecryptionParams(eyfnVar.c.I(), eyfnVar.d.I(), eyfnVar.e)));
        objA.getClass();
        return new epqr(inputStream, (MediaEncryptor) objA, 2);
    }
}
