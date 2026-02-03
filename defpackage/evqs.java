package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evqs implements Iterable<Byte>, Serializable {
    public static final evqs b = new evqq(evth.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    public static evqs A(String str) {
        return new evqq(str.getBytes(evth.a));
    }

    public static evqs B(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            evqs evqsVarZ = i == 0 ? null : z(bArr, 0, i);
            if (evqsVarZ == null) {
                return v(arrayList);
            }
            arrayList.add(evqsVarZ);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    static void F(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.s(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.g(i, "Index < 0: "));
        }
    }

    private static evqs c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (evqs) it.next();
        }
        int i2 = i >>> 1;
        return c(it, i2).u(c(it, i - i2));
    }

    static int s(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.e(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.s(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.s(i3, i2, "End index: ", " >= "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static evqs v(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? b : c(iterable.iterator(), size);
    }

    public static evqs w(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        s(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new evqq(bArr);
    }

    public static evqs x(byte[] bArr) {
        return z(bArr, 0, bArr.length);
    }

    public static evqs y(String str, Charset charset) {
        return new evqq(str.getBytes(charset));
    }

    public static evqs z(byte[] bArr, int i, int i2) {
        s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new evqq(bArr2);
    }

    public final evqs C(int i) {
        return k(i, d());
    }

    public final String D(Charset charset) {
        return d() == 0 ? "" : n(charset);
    }

    public final String E() {
        return D(evth.a);
    }

    @Deprecated
    public final void G(byte[] bArr, int i, int i2, int i3) {
        s(i, i + i3, d());
        s(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }

    public final boolean H() {
        return d() == 0;
    }

    public final byte[] I() {
        int iD = d();
        if (iD == 0) {
            return evth.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    protected abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int iD = d();
            i = i(iD, 0, iD);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    protected abstract int j(int i, int i2, int i3);

    public abstract evqs k(int i, int i2);

    public abstract evqz l();

    public abstract InputStream m();

    protected abstract String n(Charset charset);

    public abstract ByteBuffer o();

    public abstract void p(evqj evqjVar);

    public abstract void q(OutputStream outputStream);

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public evqn iterator() {
        return new evqk(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? evvn.a(this) : evvn.a(k(0, 47)).concat("..."));
    }

    public final evqs u(evqs evqsVar) {
        if (Alert.DURATION_SHOW_INDEFINITELY - d() < evqsVar.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + d() + "+" + evqsVar.d());
        }
        int i = evuy.h;
        if (evqsVar.d() == 0) {
            return this;
        }
        if (d() == 0) {
            return evqsVar;
        }
        int iD = d() + evqsVar.d();
        if (iD < 128) {
            return evuy.g(this, evqsVar);
        }
        if (this instanceof evuy) {
            evuy evuyVar = (evuy) this;
            evqs evqsVar2 = evuyVar.f;
            if (evqsVar2.d() + evqsVar.d() < 128) {
                return new evuy(evuyVar.e, evuy.g(evqsVar2, evqsVar));
            }
            evqs evqsVar3 = evuyVar.e;
            if (evqsVar3.f() > evqsVar2.f() && evuyVar.g > evqsVar.f()) {
                return new evuy(evqsVar3, new evuy(evqsVar2, evqsVar));
            }
        }
        if (iD >= evuy.c(Math.max(f(), evqsVar.f()) + 1)) {
            return new evuy(this, evqsVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        evuv.a(this, arrayDeque);
        evuv.a(evqsVar, arrayDeque);
        evqs evuyVar2 = (evqs) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            evuyVar2 = new evuy((evqs) arrayDeque.pop(), evuyVar2);
        }
        return evuyVar2;
    }
}
