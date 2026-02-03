package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcrg extends InputStream implements InputStreamRetargetInterface, fbpu {
    public evuh a;
    public final evuo b;
    public ByteArrayInputStream c;

    public fcrg(evuh evuhVar, evuo evuoVar) {
        this.a = evuhVar;
        this.b = evuoVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        evuh evuhVar = this.a;
        if (evuhVar != null) {
            return evuhVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        evuh evuhVar = this.a;
        if (evuhVar != null) {
            this.c = new ByteArrayInputStream(evuhVar.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        evuh evuhVar = this.a;
        if (evuhVar != null) {
            int serializedSize = evuhVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                boolean z = evrf.e;
                evrc evrcVar = new evrc(bArr, i, serializedSize);
                this.a.writeTo(evrcVar);
                evrcVar.ac();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
