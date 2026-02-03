package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffps implements ffwn {
    private final int a;
    private final ffpn b;
    private final ffpu c;
    private final byte[][] d;

    public ffps(int i, ffpn ffpnVar, ffpu ffpuVar, byte[][] bArr) {
        this.a = i;
        this.b = ffpnVar;
        this.c = ffpuVar;
        this.d = bArr;
    }

    public static ffps a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof ffps) {
            return (ffps) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int i = dataInputStream2.readInt();
            ffpn ffpnVarA = ffpn.a(obj);
            ffpu ffpuVarA = ffpu.a(dataInputStream2.readInt());
            int i2 = ffpuVarA.w;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[ffpuVarA.v];
                bArr[i3] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new ffps(i, ffpnVarA, ffpuVarA, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(ffxd.a((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
            dataInputStream = null;
        }
        try {
            ffps ffpsVarA = a(dataInputStream);
            dataInputStream.close();
            return ffpsVarA;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ffps ffpsVar = (ffps) obj;
        if (this.a != ffpsVar.a) {
            return false;
        }
        ffpn ffpnVar = this.b;
        if (ffpnVar == null ? ffpsVar.b != null : !ffpnVar.equals(ffpsVar.b)) {
            return false;
        }
        ffpu ffpuVar = this.c;
        if (ffpuVar == null ? ffpsVar.c == null : ffpuVar.equals(ffpsVar.c)) {
            return Arrays.deepEquals(this.d, ffpsVar.d);
        }
        return false;
    }

    public final int hashCode() {
        ffpn ffpnVar = this.b;
        int iHashCode = ffpnVar != null ? ffpnVar.hashCode() : 0;
        int i = this.a;
        ffpu ffpuVar = this.c;
        return (((((i * 31) + iHashCode) * 31) + (ffpuVar != null ? ffpuVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.d);
    }

    @Override // defpackage.ffwn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.d(this.a, byteArrayOutputStream);
        ffpg.b(this.b.s(), byteArrayOutputStream);
        ffpg.d(this.c.u, byteArrayOutputStream);
        try {
            for (byte[] bArr : this.d) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
