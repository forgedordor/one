package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpk extends ffpo {
    public final int b;
    public final ffpr c;

    public ffpk(int i, ffpr ffprVar) {
        super(false);
        if (ffprVar == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.b = i;
        this.c = ffprVar;
    }

    public static ffpk a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof ffpk) {
            return (ffpk) obj;
        }
        if (obj instanceof DataInputStream) {
            return new ffpk(((DataInputStream) obj).readInt(), ffpr.a(obj));
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
                ffpk ffpkVarA = a(dataInputStream);
                dataInputStream.close();
                return ffpkVarA;
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
        ffpk ffpkVar = (ffpk) obj;
        if (this.b != ffpkVar.b) {
            return false;
        }
        return this.c.equals(ffpkVar.c);
    }

    public final int hashCode() {
        return (this.b * 31) + this.c.hashCode();
    }

    @Override // defpackage.ffpo, defpackage.ffwn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.d(this.b, byteArrayOutputStream);
        ffpg.b(this.c.b(), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
