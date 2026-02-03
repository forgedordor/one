package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dced extends dcec {
    public final byte[] a;

    public dced(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.dcec
    public final byte[] c() {
        return this.a;
    }
}
