package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebdm extends ebcw implements ebrr {
    private final ebrz a;

    public ebdm(InputStream inputStream) {
        super(inputStream);
        this.a = ebrz.a(ebdh.f);
    }

    public final /* synthetic */ Integer a() {
        return Integer.valueOf(super.read());
    }

    public final /* synthetic */ Integer b(byte[] bArr) {
        return Integer.valueOf(super.read(bArr));
    }

    public final /* synthetic */ Integer c(byte[] bArr, int i, int i2) {
        return Integer.valueOf(super.read(bArr, i, i2));
    }

    @Override // defpackage.ebcw, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(ebdh.CLOSING, new ebrh(new ebri() { // from class: ebdi
            @Override // defpackage.ebri
            public final void a() throws IOException {
                this.a.d();
            }
        }), ebdh.CLOSED);
    }

    public final /* synthetic */ void d() throws IOException {
        super.close();
    }

    @Override // defpackage.ebrr
    public final void e(ebru ebruVar) {
        this.a.f(ebruVar);
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read() {
        return ((Integer) this.a.c(ebdh.ACTIVE, new ebsa() { // from class: ebdk
            @Override // defpackage.ebsa
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.ebsa
            public final Object b() {
                return this.a.a();
            }
        })).intValue();
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read(final byte[] bArr) {
        return ((Integer) this.a.c(ebdh.ACTIVE, new ebsa() { // from class: ebdj
            @Override // defpackage.ebsa
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.ebsa
            public final Object b() {
                return this.a.b(bArr);
            }
        })).intValue();
    }

    @Override // defpackage.ebcw, java.io.InputStream
    public final int read(final byte[] bArr, final int i, final int i2) {
        return ((Integer) this.a.c(ebdh.ACTIVE, new ebsa() { // from class: ebdl
            @Override // defpackage.ebsa
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.ebsa
            public final Object b() {
                return this.a.c(bArr, i, i2);
            }
        })).intValue();
    }
}
