package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpj extends ffpo {
    public final int b;
    public ffpk c;
    private final boolean d;
    private final List e;
    private final List f;
    private final long g;
    private long h;

    private ffpj(int i, List list, List list2, long j, long j2, boolean z) {
        super(true);
        this.h = 0L;
        this.b = i;
        this.e = DesugarCollections.unmodifiableList(list);
        this.f = DesugarCollections.unmodifiableList(list2);
        this.h = j;
        this.g = j2;
        this.d = z;
    }

    public static ffpj a(Object obj) throws Throwable {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof ffpj) {
            return (ffpj) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i = dataInputStream2.readInt();
            long j = dataInputStream2.readLong();
            long j2 = dataInputStream2.readLong();
            boolean z = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(ffpq.a(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(ffps.a(obj));
            }
            return new ffpj(i, arrayList, arrayList2, j, j2, z);
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
                ffpj ffpjVarA = a(dataInputStream);
                dataInputStream.close();
                return ffpjVarA;
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

    public final synchronized ffpk b() {
        return new ffpk(this.b, ((ffpq) this.e.get(0)).b());
    }

    protected final Object clone() {
        try {
            return a(s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ffpj ffpjVar = (ffpj) obj;
        if (this.b == ffpjVar.b && this.d == ffpjVar.d && this.g == ffpjVar.g && this.h == ffpjVar.h && this.e.equals(ffpjVar.e)) {
            return this.f.equals(ffpjVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.b * 31) + (this.d ? 1 : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        long j = this.h;
        long j2 = j ^ (j >>> 32);
        long j3 = this.g;
        return (((iHashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) j2);
    }

    @Override // defpackage.ffpo, defpackage.ffwn
    public final synchronized byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream;
        byteArrayOutputStream = new ByteArrayOutputStream();
        ffpg.d(0, byteArrayOutputStream);
        ffpg.d(this.b, byteArrayOutputStream);
        ffpg.e(this.h, byteArrayOutputStream);
        ffpg.e(this.g, byteArrayOutputStream);
        byteArrayOutputStream.write(this.d ? 1 : 0);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ffpg.a((ffpq) it.next(), byteArrayOutputStream);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ffpg.a((ffps) it2.next(), byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
