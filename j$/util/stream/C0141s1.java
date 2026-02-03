package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0141s1 extends C0054a3 implements G0, InterfaceC0170y0 {
    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0170y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void end() {
    }

    @Override // j$.util.stream.G0
    public final void f(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.G0
    public final Object[] j(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        clear();
        v(j);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }
}
