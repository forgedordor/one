package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffh implements ffgb {
    private byte a;
    private final fffv b;
    private final Inflater c;
    private final fffi d;
    private final CRC32 e;

    public fffh(ffgb ffgbVar) {
        ffgbVar.getClass();
        fffv fffvVar = new fffv(ffgbVar);
        this.b = fffvVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new fffi(fffvVar, inflater);
        this.e = new CRC32();
    }

    private final void c(ffez ffezVar, long j, long j2) {
        fffw fffwVar = ffezVar.a;
        fffwVar.getClass();
        while (true) {
            long j3 = fffwVar.c - fffwVar.b;
            if (j < j3) {
                break;
            }
            fffwVar = fffwVar.f;
            fffwVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (fffwVar.b + j);
            int iMin = (int) Math.min(fffwVar.c - i, j2);
            this.e.update(fffwVar.a, i, iMin);
            fffwVar = fffwVar.f;
            fffwVar.getClass();
            j2 -= iMin;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + fdgn.Q(ffes.a(i2), 8) + " != expected 0x" + fdgn.Q(ffes.a(i), 8));
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.b.a();
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws DataFormatException, IOException {
        fffh fffhVar = this;
        byte b = fffhVar.a;
        if (b == 0) {
            fffv fffvVar = fffhVar.b;
            fffvVar.C(10L);
            ffez ffezVar2 = fffvVar.b;
            byte bC = ffezVar2.c(3L);
            int i = (bC >> 1) & 1;
            if (i != 0) {
                fffhVar.c(ffezVar2, 0L, 10L);
            }
            d("ID1ID2", 8075, fffvVar.z());
            fffvVar.D(8L);
            if (((bC >> 2) & 1) == 1) {
                fffvVar.C(2L);
                if (i != 0) {
                    c(ffezVar2, 0L, 2L);
                }
                long jA = (char) ffezVar2.A();
                fffvVar.C(jA);
                if (i != 0) {
                    c(ffezVar2, 0L, jA);
                }
                fffvVar.D(jA);
            }
            if (((bC >> 3) & 1) == 1) {
                long jE = fffvVar.e();
                if (jE == -1) {
                    throw new EOFException();
                }
                long j2 = jE + 1;
                if (i != 0) {
                    c(ffezVar2, 0L, j2);
                }
                fffvVar.D(j2);
            }
            if (((bC >> 4) & 1) == 1) {
                long jE2 = fffvVar.e();
                if (jE2 == -1) {
                    throw new EOFException();
                }
                long j3 = jE2 + 1;
                if (i != 0) {
                    fffhVar = this;
                    fffhVar.c(ffezVar2, 0L, j3);
                } else {
                    fffhVar = this;
                }
                fffvVar.D(j3);
            } else {
                fffhVar = this;
            }
            if (i != 0) {
                fffvVar.C(2L);
                CRC32 crc32 = fffhVar.e;
                d("FHCRC", ffezVar2.A(), (short) crc32.getValue());
                crc32.reset();
            }
            fffhVar.a = (byte) 1;
            b = 1;
        }
        if (b != 1) {
            if (b == 2) {
            }
            return -1L;
        }
        long j4 = ffezVar.b;
        long jB = fffhVar.d.b(ffezVar, 8192L);
        if (jB != -1) {
            fffhVar.c(ffezVar, j4, jB);
            return jB;
        }
        fffhVar.a = (byte) 2;
        fffv fffvVar2 = fffhVar.b;
        d("CRC", fffvVar2.c(), (int) fffhVar.e.getValue());
        d("ISIZE", fffvVar2.c(), (int) fffhVar.c.getBytesWritten());
        fffhVar.a = (byte) 3;
        if (!fffvVar2.E()) {
            throw new IOException("gzip finished without exhausting source");
        }
        return -1L;
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
