package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpr extends ffpo {
    private final ffpu b;
    private final ffpm c;
    private final byte[] d;
    private final byte[] e;

    public ffpr(ffpu ffpuVar, ffpm ffpmVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.b = ffpuVar;
        this.c = ffpmVar;
        this.d = ffwk.c(bArr2);
        this.e = ffwk.c(bArr);
    }

    public static ffpr a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof ffpr) {
            return (ffpr) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            ffpu ffpuVarA = ffpu.a(dataInputStream2.readInt());
            ffpm ffpmVarA = ffpm.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[ffpuVarA.v];
            dataInputStream2.readFully(bArr2);
            return new ffpr(ffpuVarA, ffpmVarA, bArr2, bArr);
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
                ffpr ffprVarA = a(dataInputStream);
                dataInputStream.close();
                return ffprVarA;
            } catch (Throwable th) {
                th = th;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.d(this.b.u, byteArrayOutputStream);
        ffpg.d(this.c.q, byteArrayOutputStream);
        ffpg.b(this.d, byteArrayOutputStream);
        ffpg.b(this.e, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ffpr ffprVar = (ffpr) obj;
        if (this.b.equals(ffprVar.b) && this.c.equals(ffprVar.c) && Arrays.equals(this.d, ffprVar.d)) {
            return Arrays.equals(this.e, ffprVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + ffwk.a(this.d)) * 31) + ffwk.a(this.e);
    }

    @Override // defpackage.ffpo, defpackage.ffwn
    public final byte[] s() {
        return b();
    }
}
