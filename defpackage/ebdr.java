package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebdr extends ebcx implements ebrr {
    private final ebrz a;

    public ebdr(OutputStream outputStream) {
        super(outputStream);
        this.a = ebrz.a(ebdh.f);
    }

    public final /* synthetic */ void a() throws IOException {
        super.close();
    }

    public final /* synthetic */ void b(byte[] bArr) throws IOException {
        super.write(bArr);
    }

    public final /* synthetic */ void c(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
    }

    @Override // defpackage.ebcx, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(ebdh.CLOSING, new ebrh(new ebri() { // from class: ebdq
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.a();
            }
        }), ebdh.CLOSED);
    }

    public final /* synthetic */ void d(int i) throws IOException {
        super.write(i);
    }

    @Override // defpackage.ebrr
    public final void e(ebru ebruVar) {
        this.a.f(ebruVar);
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(final int i) {
        this.a.c(ebdh.ACTIVE, new ebrh(new ebri() { // from class: ebdp
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.d(i);
            }
        }));
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(final byte[] bArr) {
        this.a.c(ebdh.ACTIVE, new ebrh(new ebri() { // from class: ebdo
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.b(bArr);
            }
        }));
    }

    @Override // defpackage.ebcx, java.io.OutputStream
    public final void write(final byte[] bArr, final int i, final int i2) {
        this.a.c(ebdh.ACTIVE, new ebrh(new ebri() { // from class: ebdn
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.c(bArr, i, i2);
            }
        }));
    }
}
