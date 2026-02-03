package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpq extends ffpo {
    private static ffpp c;
    private static ffpp[] d;
    public ffpr b;
    private final byte[] e;
    private final ffpu f;
    private final ffpm g;
    private final int h;
    private final byte[] i;
    private final Map j;
    private final int k;
    private final ffil l;
    private final int m;

    static {
        ffpp ffppVar = new ffpp(1);
        c = ffppVar;
        ffpp[] ffppVarArr = new ffpp[129];
        d = ffppVarArr;
        ffppVarArr[1] = ffppVar;
        int i = 2;
        while (true) {
            ffpp[] ffppVarArr2 = d;
            int length = ffppVarArr2.length;
            if (i >= 129) {
                return;
            }
            ffppVarArr2[i] = new ffpp(i);
            i++;
        }
    }

    public ffpq(ffpu ffpuVar, ffpm ffpmVar, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f = ffpuVar;
        this.g = ffpmVar;
        this.m = i;
        this.e = ffwk.c(bArr);
        this.h = i2;
        this.i = ffwk.c(bArr2);
        this.k = 1 << (ffpuVar.w + 1);
        this.j = new WeakHashMap();
        this.l = ffpi.a(ffpuVar.x, ffpuVar.v);
    }

    public static ffpq a(Object obj) throws Throwable {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof ffpq) {
            return (ffpq) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            ffpu ffpuVarA = ffpu.a(dataInputStream2.readInt());
            ffpm ffpmVarA = ffpm.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int i = dataInputStream2.readInt();
            int i2 = dataInputStream2.readInt();
            int i3 = dataInputStream2.readInt();
            if (i3 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (i3 <= dataInputStream2.available()) {
                byte[] bArr2 = new byte[i3];
                dataInputStream2.readFully(bArr2);
                return new ffpq(ffpuVarA, ffpmVarA, i, bArr, i2, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream2.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(ffxd.a((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                ffpq ffpqVarA = a(dataInputStream);
                dataInputStream.close();
                return ffpqVarA;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
        }
    }

    private final byte[] e(int i) {
        int i2 = 1 << this.f.w;
        if (i < i2) {
            int i3 = i + i;
            byte[] bArrC = c(i3);
            byte[] bArrC2 = c(i3 + 1);
            byte[] bArrD = d();
            ffil ffilVar = this.l;
            ffpv.a(bArrD, ffilVar);
            ffpv.c(i, ffilVar);
            ffpv.b((short) -31869, ffilVar);
            ffpv.a(bArrC, ffilVar);
            ffpv.a(bArrC2, ffilVar);
            byte[] bArr = new byte[ffilVar.b()];
            ffilVar.a(bArr, 0);
            return bArr;
        }
        byte[] bArrD2 = d();
        ffil ffilVar2 = this.l;
        ffpv.a(bArrD2, ffilVar2);
        ffpv.c(i, ffilVar2);
        ffpv.b((short) -32126, ffilVar2);
        ffpm ffpmVar = this.g;
        byte[] bArrD3 = d();
        byte[] bArrC3 = ffwk.c(this.i);
        ffil ffilVarB = ffpi.b(ffpmVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.b(bArrD3, byteArrayOutputStream);
        int i4 = i - i2;
        ffpg.d(i4, byteArrayOutputStream);
        byteArrayOutputStream.write(-128);
        byteArrayOutputStream.write(-128);
        ffpg.c(22, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ffilVarB.e(byteArray, 0, byteArray.length);
        ffil ffilVarB2 = ffpi.b(ffpmVar);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ffpg.b(bArrD3, byteArrayOutputStream2);
        ffpg.d(i4, byteArrayOutputStream2);
        ffpg.c(ffilVarB2.b() + 23, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        ffil ffilVarB3 = ffpi.b(ffpmVar);
        int i5 = 1 << ffpmVar.s;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = ffpmVar.t;
            if (i6 >= i8) {
                byte[] bArr2 = new byte[ffilVarB.b()];
                ffilVarB.a(bArr2, 0);
                ffpv.a(bArr2, ffilVar2);
                byte[] bArr3 = new byte[ffilVar2.b()];
                ffilVar2.a(bArr3, 0);
                return bArr3;
            }
            int i9 = i8 - 1;
            if (byteArray2.length - 23 < ffilVarB3.b()) {
                throw new IllegalArgumentException("target length is less than digest size.");
            }
            ffilVarB3.e(bArrD3, 0, bArrD3.length);
            ffilVarB3.d((byte) (i4 >> 24));
            ffilVarB3.d((byte) (i4 >>> 16));
            ffilVarB3.d((byte) (i4 >>> 8));
            ffilVarB3.d((byte) i4);
            ffilVarB3.d((byte) (i7 >>> 8));
            ffilVarB3.d((byte) i7);
            ffilVarB3.d((byte) -1);
            ffilVarB3.e(bArrC3, 0, bArrC3.length);
            ffilVarB3.a(byteArray2, 23);
            if (i6 < i9) {
                i7++;
            }
            short s = (short) i6;
            byteArray2[20] = (byte) (s >>> 8);
            byteArray2[21] = (byte) s;
            for (int i10 = 0; i10 < i5 - 1; i10++) {
                byteArray2[22] = (byte) i10;
                ffilVarB2.e(byteArray2, 0, byteArray2.length);
                ffilVarB2.a(byteArray2, 23);
            }
            ffilVarB.e(byteArray2, 23, ffpmVar.r);
            i6++;
        }
    }

    private final byte[] f(ffpp ffppVar) {
        Map map = this.j;
        synchronized (map) {
            byte[] bArr = (byte[]) map.get(ffppVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] bArrE = e(ffppVar.a);
            map.put(ffppVar, bArrE);
            return bArrE;
        }
    }

    public final ffpr b() {
        ffpr ffprVar;
        synchronized (this) {
            if (this.b == null) {
                this.b = new ffpr(this.f, this.g, f(c), this.e);
            }
            ffprVar = this.b;
        }
        return ffprVar;
    }

    final byte[] c(int i) {
        if (i >= this.k) {
            return e(i);
        }
        ffpp[] ffppVarArr = d;
        int length = ffppVarArr.length;
        return f(i < 129 ? ffppVarArr[i] : new ffpp(i));
    }

    public final byte[] d() {
        return ffwk.c(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ffpq ffpqVar = (ffpq) obj;
        if (this.m != ffpqVar.m || this.h != ffpqVar.h || !Arrays.equals(this.e, ffpqVar.e)) {
            return false;
        }
        ffpu ffpuVar = this.f;
        if (ffpuVar == null ? ffpqVar.f != null : !ffpuVar.equals(ffpqVar.f)) {
            return false;
        }
        ffpm ffpmVar = this.g;
        if (ffpmVar == null ? ffpqVar.g == null : ffpmVar.equals(ffpqVar.g)) {
            return Arrays.equals(this.i, ffpqVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iA = (this.m * 31) + ffwk.a(this.e);
        ffpu ffpuVar = this.f;
        int iHashCode = ((iA * 31) + (ffpuVar != null ? ffpuVar.hashCode() : 0)) * 31;
        ffpm ffpmVar = this.g;
        return ((((iHashCode + (ffpmVar != null ? ffpmVar.hashCode() : 0)) * 31) + this.h) * 31) + ffwk.a(this.i);
    }

    @Override // defpackage.ffpo, defpackage.ffwn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.d(0, byteArrayOutputStream);
        ffpg.d(this.f.u, byteArrayOutputStream);
        ffpg.d(this.g.q, byteArrayOutputStream);
        ffpg.b(this.e, byteArrayOutputStream);
        ffpg.d(this.m, byteArrayOutputStream);
        ffpg.d(this.h, byteArrayOutputStream);
        byte[] bArr = this.i;
        ffpg.d(bArr.length, byteArrayOutputStream);
        ffpg.b(bArr, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
