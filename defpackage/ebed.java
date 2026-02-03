package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebed extends ebcx {
    final /* synthetic */ ebee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebed(ebee ebeeVar, OutputStream outputStream) {
        super(outputStream);
        this.a = ebeeVar;
    }

    @Override // defpackage.ebcx, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.d();
        super.flush();
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.d();
        super.write(i);
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a.d();
        super.write(bArr);
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.d();
        super.write(bArr, i, i2);
    }
}
