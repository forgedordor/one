package defpackage;

import io.grpc.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fchu implements fcdp {
    public fcmv b;
    public int c;
    public final fcmw g;
    public final fcmm h;
    public boolean i;
    public int j;
    public long l;
    private final fcht m;
    public int a = -1;
    public fbnr d = fbnp.a;
    public final fchs e = new fchs(this);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public fchu(fcht fchtVar, fcmw fcmwVar, fcmm fcmmVar) {
        this.m = fchtVar;
        this.g = fcmwVar;
        this.h = fcmmVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        fcrg fcrgVar = (fcrg) inputStream;
        evuh evuhVar = fcrgVar.a;
        if (evuhVar != null) {
            int serializedSize = evuhVar.getSerializedSize();
            fcrgVar.a.writeTo(outputStream);
            fcrgVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = fcrgVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        evrr evrrVar = fcrj.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                fcrgVar.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    public final void b(boolean z, boolean z2) {
        fcmv fcmvVar = this.b;
        this.b = null;
        this.m.v(fcmvVar, z, z2, this.j);
        this.j = 0;
    }

    public final void c(fchr fchrVar, boolean z) {
        List list = fchrVar.a;
        Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((fcmv) it.next()).a();
        }
        int i = this.a;
        if (i >= 0 && iA > i) {
            throw new fbtf(Status.k.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.a))));
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        fcmv fcmvVarA = this.g.a(5);
        fcmvVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.b = fcmvVarA;
            return;
        }
        fcht fchtVar = this.m;
        fchtVar.v(fcmvVarA, false, false, this.j - 1);
        this.j = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            fchtVar.v((fcmv) list.get(i2), false, false, 0);
        }
        this.b = (fcmv) list.get(list.size() - 1);
        this.l = iA;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            fcmv fcmvVar = this.b;
            if (fcmvVar != null && fcmvVar.b() == 0) {
                b(false, false);
            }
            if (this.b == null) {
                ejwl.m(this.c > 0, "knownLengthPendingAllocation reached 0");
                fcmv fcmvVarA = this.g.a(this.c);
                this.b = fcmvVarA;
                int i3 = this.c;
                this.c = i3 - Math.min(i3, fcmvVarA.b());
            }
            int iMin = Math.min(i2, this.b.b());
            this.b.d(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
