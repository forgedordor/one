package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evuy extends evqs {
    static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};
    public static final /* synthetic */ int h = 0;
    private static final long serialVersionUID = 1;
    public final int d;
    public final evqs e;
    public final evqs f;
    public final int g;
    private final int i;

    public evuy(evqs evqsVar, evqs evqsVar2) {
        this.e = evqsVar;
        this.f = evqsVar2;
        int iD = evqsVar.d();
        this.i = iD;
        this.d = iD + evqsVar2.d();
        this.g = Math.max(evqsVar.f(), evqsVar2.f()) + 1;
    }

    static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : iArr[i];
    }

    public static evqs g(evqs evqsVar, evqs evqsVar2) {
        int iD = evqsVar.d();
        int iD2 = evqsVar2.d();
        byte[] bArr = new byte[iD + iD2];
        evqsVar.G(bArr, 0, 0, iD);
        evqsVar2.G(bArr, 0, iD, iD2);
        return new evqq(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.evqs
    public final byte a(int i) {
        F(i, this.d);
        return b(i);
    }

    @Override // defpackage.evqs
    public final byte b(int i) {
        int i2 = this.i;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.evqs
    public final int d() {
        return this.d;
    }

    @Override // defpackage.evqs
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.evqs
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof evqs)) {
            return false;
        }
        evqs evqsVar = (evqs) obj;
        int i = this.d;
        if (i != evqsVar.d()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.c;
        int i3 = evqsVar.c;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        evuw evuwVar = new evuw(this);
        evqp evqpVarA = evuwVar.next();
        evuw evuwVar2 = new evuw(evqsVar);
        evqp evqpVarA2 = evuwVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iD = evqpVarA.d() - i4;
            int iD2 = evqpVarA2.d() - i5;
            int iMin = Math.min(iD, iD2);
            if (!(i4 == 0 ? evqpVarA.g(evqpVarA2, i5, iMin) : evqpVarA2.g(evqpVarA, i4, iMin))) {
                return false;
            }
            i6 += iMin;
            if (i6 >= i) {
                if (i6 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                i4 = 0;
                evqpVarA = evuwVar.next();
            } else {
                i4 += iMin;
                evqpVarA = evqpVarA;
            }
            if (iMin == iD2) {
                evqpVarA2 = evuwVar2.next();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    @Override // defpackage.evqs
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.evqs
    protected final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.evqs
    protected final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.evqs, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new evuu(this);
    }

    @Override // defpackage.evqs
    protected final int j(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            return this.e.j(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.j(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.j(this.e.j(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.evqs
    public final evqs k(int i, int i2) {
        int i3 = this.d;
        int iS = s(i, i2, i3);
        if (iS == 0) {
            return evqs.b;
        }
        if (iS == i3) {
            return this;
        }
        int i4 = this.i;
        if (i2 <= i4) {
            return this.e.k(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.f.k(i - i4, i5);
        }
        return new evuy(this.e.C(i), this.f.k(0, i5));
    }

    @Override // defpackage.evqs
    public final evqz l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        evuw evuwVar = new evuw(this);
        while (evuwVar.hasNext()) {
            arrayList.add(evuwVar.next().o());
        }
        int i = evqz.g;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new evqw(arrayList, iRemaining) : evqz.K(new evtk(arrayList));
    }

    @Override // defpackage.evqs
    public final InputStream m() {
        return new evux(this);
    }

    @Override // defpackage.evqs
    protected final String n(Charset charset) {
        return new String(I(), charset);
    }

    @Override // defpackage.evqs
    public final ByteBuffer o() {
        return ByteBuffer.wrap(I()).asReadOnlyBuffer();
    }

    @Override // defpackage.evqs
    public final void p(evqj evqjVar) {
        this.e.p(evqjVar);
        this.f.p(evqjVar);
    }

    @Override // defpackage.evqs
    public final void q(OutputStream outputStream) {
        this.e.q(outputStream);
        this.f.q(outputStream);
    }

    @Override // defpackage.evqs
    public final boolean r() {
        evqs evqsVar = this.e;
        evqs evqsVar2 = this.f;
        return evqsVar2.j(evqsVar.j(0, 0, this.i), 0, evqsVar2.d()) == 0;
    }

    @Override // defpackage.evqs
    /* renamed from: t */
    public final evqn iterator() {
        return new evuu(this);
    }

    Object writeReplace() {
        return new evqq(I());
    }
}
