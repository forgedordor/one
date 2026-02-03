package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eycm implements eycb {
    private final String a;
    private final eycb b;
    private eycu c;
    private eycu d;
    private eycu e;
    private final long h;
    private boolean i;
    private int j = 1;
    private long f = 0;
    private long g = 0;

    public eycm(String str, String str2, eyce eyceVar, eycb eycbVar) {
        this.a = str;
        this.b = eycbVar;
        this.c = new eycu("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + VCardBuilder.VCARD_END_OF_LINE);
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        for (String str3 : eyceVar.c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(eyceVar.a(str3));
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        if (this.b.e() >= 0 && eyceVar.b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.e());
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        this.d = new eycu(sb.toString());
        if (eycbVar.e() == -1) {
            this.h = -1L;
        } else {
            this.e = j();
            this.h = this.c.e() + this.d.e() + eycbVar.e() + this.e.e();
        }
    }

    private final eycu j() {
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.a);
        eydd.a();
        sb.append("--");
        return new eycu(sb.toString());
    }

    @Override // defpackage.eycb
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.i) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        ejwl.b(65536 - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 != 0) {
            long j = this.f;
            while (true) {
                long j2 = this.f;
                if (j2 != j) {
                    return (int) (j2 - j);
                }
                int i3 = this.j;
                int i4 = i3 - 1;
                eycb eycbVar = null;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    eycbVar = this.c;
                    i3 = 2;
                } else if (i4 == 1) {
                    eycbVar = this.d;
                    i3 = 3;
                } else if (i4 == 2) {
                    eycbVar = this.b;
                    i3 = 4;
                } else if (i4 == 3) {
                    if (this.e == null) {
                        this.e = j();
                    }
                    eycbVar = this.e;
                    i3 = 5;
                } else if (i4 == 4) {
                    break;
                }
                this.f += eycbVar.a(bArr, i, i2);
                if (eycbVar.c() < Long.MAX_VALUE) {
                    eycbVar.g();
                }
                if (!eycbVar.i()) {
                    this.j = i3;
                }
            }
        }
        return 0;
    }

    @Override // defpackage.eycb
    public final long b() {
        return this.g;
    }

    @Override // defpackage.eycb
    public final long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.eycb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.b.close();
    }

    @Override // defpackage.eycb
    public final long d() {
        return this.f;
    }

    @Override // defpackage.eycb
    public final long e() {
        return this.h;
    }

    @Override // defpackage.eycb
    public final long f(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    @Override // defpackage.eycb
    public final void g() {
        this.g = this.f;
    }

    @Override // defpackage.eycb
    public final void h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    @Override // defpackage.eycb
    public final boolean i() {
        return this.j != 5;
    }
}
