package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evqz {
    private static volatile int a = 100;
    public static final /* synthetic */ int g = 0;
    int b;
    int c;
    final int d = a;
    public int e = Alert.DURATION_SHOW_INDEFINITELY;
    evra f;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int I(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new evtj("CodedInputStream encountered a malformed varint.");
    }

    public static long J(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static evqz K(InputStream inputStream) {
        return N(inputStream, 4096);
    }

    public static evqz L(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return R(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect()) {
            int i = evqy.a;
            if (evvz.a) {
                return new evqy(byteBuffer);
            }
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return R(bArr, 0, iRemaining);
    }

    public static evqz M(byte[] bArr) {
        int length = bArr.length;
        return R(bArr, 0, 0);
    }

    public static evqz N(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? M(evth.b) : new evqx(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static evqz R(byte[] bArr, int i, int i2) {
        evqv evqvVar = new evqv(bArr, i, i2);
        try {
            evqvVar.e(i2);
            return evqvVar;
        } catch (evtj e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void O() throws evtj {
        if (this.b + this.c >= this.d) {
            throw new evtj("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void P() {
        if (this.c == 0) {
            z(0);
        }
    }

    public final void Q() throws evtj {
        int iM;
        do {
            iM = m();
            if (iM == 0) {
                return;
            }
            O();
            this.c++;
            this.c--;
        } while (E(iM));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract evqs w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
