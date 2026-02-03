package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erbw implements erbz {
    private final eqtt a;
    private final int b;

    public erbw(eqtt eqttVar) {
        this.a = eqttVar;
        this.b = eqttVar.a + eqttVar.b;
    }

    private final eqrz d(byte[] bArr) {
        eqtt eqttVar = this.a;
        int i = eqttVar.a;
        return ervb.c(eqtk.a(eqttVar, erwp.c(Arrays.copyOf(bArr, i)), erwp.c(Arrays.copyOfRange(bArr, i, eqttVar.b + i)), null));
    }

    @Override // defpackage.erbz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.erbz
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return d(bArr).a(Arrays.copyOfRange(bArr2, i, length), erca.a);
    }

    @Override // defpackage.erbz
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return erup.b(bArr2, bArr3, d(bArr).b(bArr4, erca.a));
    }
}
