package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqzv extends dqzw {
    private final byte[] a;

    public dqzv(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null keyMaterial");
        }
        this.a = bArr;
    }

    @Override // defpackage.dqzw
    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqzw) {
            dqzw dqzwVar = (dqzw) obj;
            dqzwVar.c();
            if (Arrays.equals(this.a, dqzwVar instanceof dqzv ? ((dqzv) dqzwVar).a : dqzwVar.a())) {
                dqzwVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 720379956) * 1000003) ^ 1;
    }

    public final String toString() {
        return "EncryptionKey{keyVersion=-1, keyMaterial=" + Arrays.toString(this.a) + ", encryptionAlgorithm=AES_GCM_256}";
    }

    @Override // defpackage.dqzw
    public final void b() {
    }

    @Override // defpackage.dqzw
    public final void c() {
    }
}
