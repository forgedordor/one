package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdr implements mdm {
    public float b = 1.0f;
    public float c = 1.0f;
    public mdk d;
    public mdk e;
    public boolean f;
    public mdq g;
    public long h;
    public long i;
    private int j;
    private mdk k;
    private mdk l;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;

    public mdr() {
        mdk mdkVar = mdk.a;
        this.k = mdkVar;
        this.l = mdkVar;
        this.d = mdkVar;
        this.e = mdkVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = byteBuffer;
        this.j = -1;
    }

    @Override // defpackage.mdm
    public final long a(long j) {
        if (this.i < 1024) {
            return (long) (j / this.b);
        }
        long j2 = this.h;
        mee.f(this.g);
        long jB = j2 - r2.b();
        int i = this.e.b;
        int i2 = this.d.b;
        return i == i2 ? mgb.y(j, this.i, jB) : mgb.y(j, this.i * i2, jB * i);
    }

    @Override // defpackage.mdm
    public final mdk b(mdk mdkVar) throws mdl {
        if (mdkVar.d != 2) {
            throw new mdl(mdkVar);
        }
        int i = this.j;
        if (i == -1) {
            i = mdkVar.b;
        }
        this.k = mdkVar;
        mdk mdkVar2 = new mdk(i, mdkVar.c, 2);
        this.l = mdkVar2;
        this.f = true;
        return mdkVar2;
    }

    @Override // defpackage.mdm
    public final ByteBuffer c() {
        int iA;
        mdq mdqVar = this.g;
        if (mdqVar != null && (iA = mdqVar.a()) > 0) {
            if (this.m.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.m = byteBufferOrder;
                this.n = byteBufferOrder.asShortBuffer();
            } else {
                this.m.clear();
                this.n.clear();
            }
            ShortBuffer shortBuffer = this.n;
            mee.c(mdqVar.i >= 0);
            int iRemaining = shortBuffer.remaining();
            int i = mdqVar.a;
            int iMin = Math.min(iRemaining / i, mdqVar.i);
            int i2 = iMin * i;
            shortBuffer.put(mdqVar.h, 0, i2);
            int i3 = mdqVar.i - iMin;
            mdqVar.i = i3;
            short[] sArr = mdqVar.h;
            System.arraycopy(sArr, i2, sArr, 0, i3 * i);
            this.i += iA;
            this.m.limit(iA);
            this.o = this.m;
        }
        ByteBuffer byteBuffer = this.o;
        this.o = a;
        return byteBuffer;
    }

    @Override // defpackage.mdm
    public final void d() {
        if (h()) {
            this.d = this.k;
            this.e = this.l;
            if (this.f) {
                mdk mdkVar = this.d;
                this.g = new mdq(mdkVar.b, mdkVar.c, this.b, this.c, this.e.b);
            } else {
                mdq mdqVar = this.g;
                if (mdqVar != null) {
                    mdqVar.g = 0;
                    mdqVar.i = 0;
                    mdqVar.j = 0;
                    mdqVar.k = 0;
                    mdqVar.l = 0;
                    mdqVar.m = 0;
                    mdqVar.n = 0;
                    mdqVar.o = 0;
                    mdqVar.p = 0;
                    mdqVar.q = 0;
                    mdqVar.r = 0.0d;
                }
            }
        }
        this.o = a;
        this.h = 0L;
        this.i = 0L;
        this.p = false;
    }

    @Override // defpackage.mdm
    public final void e() {
        mdq mdqVar = this.g;
        if (mdqVar != null) {
            int i = mdqVar.g;
            int i2 = mdqVar.m;
            int i3 = i - i2;
            double d = i2;
            float f = mdqVar.c;
            float f2 = mdqVar.b;
            int i4 = mdqVar.i + ((int) ((((((i3 / (f2 / f)) + d) + mdqVar.r) + mdqVar.j) / (mdqVar.d * f)) + 0.5d));
            mdqVar.r = 0.0d;
            int i5 = mdqVar.e;
            int i6 = i5 + i5;
            mdqVar.f = mdqVar.d(mdqVar.f, i, i + i6);
            int i7 = 0;
            while (true) {
                int i8 = mdqVar.a;
                if (i7 >= i6 * i8) {
                    break;
                }
                mdqVar.f[(i8 * i) + i7] = 0;
                i7++;
            }
            mdqVar.g += i6;
            mdqVar.c();
            if (mdqVar.i > i4) {
                mdqVar.i = Math.max(i4, 0);
            }
            mdqVar.g = 0;
            mdqVar.m = 0;
            mdqVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.mdm
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            mdq mdqVar = this.g;
            mee.f(mdqVar);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.h += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = mdqVar.a;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            mdqVar.f = mdqVar.d(mdqVar.f, mdqVar.g, i2);
            shortBufferAsShortBuffer.get(mdqVar.f, mdqVar.g * i, (i3 + i3) / 2);
            mdqVar.g += i2;
            mdqVar.c();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.mdm
    public final void g() {
        this.b = 1.0f;
        this.c = 1.0f;
        mdk mdkVar = mdk.a;
        this.k = mdkVar;
        this.l = mdkVar;
        this.d = mdkVar;
        this.e = mdkVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = byteBuffer;
        this.j = -1;
        this.f = false;
        this.g = null;
        this.h = 0L;
        this.i = 0L;
        this.p = false;
    }

    @Override // defpackage.mdm
    public final boolean h() {
        if (this.l.b != -1) {
            return Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b;
        }
        return false;
    }

    @Override // defpackage.mdm
    public final boolean i() {
        if (!this.p) {
            return false;
        }
        mdq mdqVar = this.g;
        return mdqVar == null || mdqVar.a() == 0;
    }

    public final void j(int i) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        mee.a(z);
        this.j = i;
    }
}
