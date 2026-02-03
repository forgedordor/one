package defpackage;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervy implements eqss {
    private static final byte[] a = {0};
    private final erig b;
    private final int c;
    private final byte[] d;
    private final byte[] e;

    public ervy(ergj ergjVar) {
        this.b = new ervv(ergjVar.b.d());
        this.c = ergjVar.a.b;
        this.d = ergjVar.c.c();
        if (ergjVar.a.c.equals(ergp.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    @Override // defpackage.eqss
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.e;
        return bArr2.length > 0 ? erup.b(this.d, this.b.a(erup.b(bArr, bArr2), this.c)) : erup.b(this.d, this.b.a(bArr, this.c));
    }

    public ervy(ergv ergvVar) {
        String strValueOf = String.valueOf(String.valueOf(ergvVar.a.d));
        this.b = new ervx("HMAC".concat(strValueOf), new SecretKeySpec(ergvVar.b.d(), "HMAC"));
        this.c = ergvVar.a.b;
        this.d = ergvVar.c.c();
        if (ergvVar.a.c.equals(erhd.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    public ervy(erig erigVar, int i) {
        this.b = erigVar;
        this.c = i;
        this.d = new byte[0];
        this.e = new byte[0];
        erigVar.a(new byte[0], i);
    }
}
