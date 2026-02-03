package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpd extends ebpc {
    private final ebom a;

    public ebpd(ebom ebomVar) {
        super(1);
        this.a = ebomVar;
    }

    @Override // defpackage.ebpc
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        this.a.a(stringBuffer);
        super.l(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // defpackage.ebpc
    public final byte[] b() {
        StringBuffer stringBuffer = new StringBuffer();
        this.a.a(stringBuffer);
        byte[] bytes = stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        byte[] bArrB = super.b();
        if (bytes == null || bArrB == null) {
            return null;
        }
        int length = bArrB.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + length];
        System.arraycopy(bytes, 0, bArr, 0, length2);
        System.arraycopy(bArrB, 0, bArr, length2, length);
        return bArr;
    }

    @Override // defpackage.ebpc
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ebpd) && this.a.equals(((ebpd) obj).a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ebpc
    public final int hashCode() {
        return (this.a.hashCode() * 37) + super.hashCode();
    }

    @Override // defpackage.ebpc
    public final String i() {
        return this.a.b;
    }

    public final String toString() {
        return a();
    }

    public final ebma w() {
        return this.a.a;
    }
}
