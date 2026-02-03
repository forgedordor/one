package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebec extends ebcw {
    final /* synthetic */ ebee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebec(ebee ebeeVar, InputStream inputStream) {
        super(inputStream);
        this.a = ebeeVar;
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int available() {
        this.a.d();
        return super.available();
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read() {
        this.a.d();
        return super.read();
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read(byte[] bArr) {
        this.a.d();
        return super.read(bArr);
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        this.a.d();
        return super.read(bArr, i, i2);
    }
}
