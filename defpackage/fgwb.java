package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwb implements Comparable {
    public final byte[] a;

    public fgwb(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        byte[][] bArr = {new byte[]{5}, this.a};
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < 2; i++) {
                byteArrayOutputStream.write(bArr[i]);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.a).compareTo(new BigInteger(((fgwb) obj).a));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fgwb)) {
            return Arrays.equals(this.a, ((fgwb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
