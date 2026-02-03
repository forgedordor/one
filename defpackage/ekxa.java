package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxa {
    public final InputStream a;

    public ekxa(InputStream inputStream) {
        this.a = inputStream;
    }

    public final byte a() {
        return ekwz.a(this.a);
    }

    public final double b() {
        InputStream inputStream = this.a;
        return Double.longBitsToDouble(((ekwz.a(inputStream) & 255) << 56) | (ekwz.a(inputStream) & 255) | ((ekwz.a(inputStream) & 255) << 8) | ((ekwz.a(inputStream) & 255) << 16) | ((ekwz.a(inputStream) & 255) << 24) | ((ekwz.a(inputStream) & 255) << 32) | ((ekwz.a(inputStream) & 255) << 40) | ((ekwz.a(inputStream) & 255) << 48));
    }

    public final int c() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    public final int d() {
        return (int) e();
    }

    public final long e() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((ekwz.a(this.a) & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint.");
    }
}
