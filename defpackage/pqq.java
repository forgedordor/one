package defpackage;

import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqq implements WebMessagePayloadBoundaryInterface {
    private final int a;
    private final String b;
    private final byte[] c;

    public pqq(String str) {
        this.a = 0;
        this.b = str;
        this.c = null;
    }

    private final void a(int i) {
        int i2 = this.a;
        if (i2 != i) {
            throw new IllegalStateException(a.s(i2, i, "Expected ", ", but type is "));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.c;
        bArr.getClass();
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.a;
    }

    public pqq(byte[] bArr) {
        this.a = 1;
        this.b = null;
        this.c = bArr;
    }
}
