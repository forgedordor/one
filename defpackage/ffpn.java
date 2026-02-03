package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffpn implements ffwn {
    private final ffpm a;
    private final byte[] b;
    private final byte[] c;

    public ffpn(ffpm ffpmVar, byte[] bArr, byte[] bArr2) {
        this.a = ffpmVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static ffpn a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof ffpn) {
            return (ffpn) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            ffpm ffpmVarA = ffpm.a(dataInputStream2.readInt());
            int i = ffpmVarA.r;
            byte[] bArr = new byte[i];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[ffpmVarA.t * i];
            dataInputStream2.readFully(bArr2);
            return new ffpn(ffpmVarA, bArr, bArr2);
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
                ffpn ffpnVarA = a(dataInputStream);
                dataInputStream.close();
                return ffpnVarA;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ffpn ffpnVar = (ffpn) obj;
        ffpm ffpmVar = this.a;
        if (ffpmVar == null ? ffpnVar.a != null : !ffpmVar.equals(ffpnVar.a)) {
            return false;
        }
        if (Arrays.equals(this.b, ffpnVar.b)) {
            return Arrays.equals(this.c, ffpnVar.c);
        }
        return false;
    }

    public final int hashCode() {
        ffpm ffpmVar = this.a;
        return ((((ffpmVar != null ? ffpmVar.hashCode() : 0) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // defpackage.ffwn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.d(this.a.q, byteArrayOutputStream);
        ffpg.b(this.b, byteArrayOutputStream);
        ffpg.b(this.c, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
