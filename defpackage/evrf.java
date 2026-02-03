package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evrf extends evqj {
    private static final Logger a = Logger.getLogger(evrf.class.getName());
    public static final boolean e = evvz.b;
    evrg f;

    public static int B(int i, evqs evqsVar) {
        return U(i) + C(evqsVar);
    }

    public static int C(evqs evqsVar) {
        return K(evqsVar.d());
    }

    public static int D(int i, int i2) {
        return U(i) + G(i2);
    }

    @Deprecated
    static int E(int i, evuh evuhVar, evuz evuzVar) {
        int iU = U(i);
        return iU + iU + ((evpz) evuhVar).getSerializedSize(evuzVar);
    }

    public static int F(int i, int i2) {
        return U(i) + G(i2);
    }

    public static int G(int i) {
        return Y(i);
    }

    public static int H(int i, long j) {
        return U(i) + Y(j);
    }

    public static int I(int i, evtp evtpVar) {
        return U(i) + J(evtpVar);
    }

    public static int J(evtp evtpVar) {
        return K(evtpVar.b != null ? evtpVar.b.d() : evtpVar.a != null ? evtpVar.a.getSerializedSize() : 0);
    }

    static int K(int i) {
        return W(i) + i;
    }

    public static int L(evuh evuhVar) {
        return K(evuhVar.getSerializedSize());
    }

    static int M(evuh evuhVar, evuz evuzVar) {
        return K(((evpz) evuhVar).getSerializedSize(evuzVar));
    }

    static int N(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int O(int i, int i2) {
        return U(i) + P(i2);
    }

    public static int P(int i) {
        return W(Z(i));
    }

    public static int Q(int i, long j) {
        return U(i) + R(j);
    }

    public static int R(long j) {
        return Y(aa(j));
    }

    public static int S(int i, String str) {
        return U(i) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = evwe.b(str);
        } catch (evwd unused) {
            length = str.getBytes(evth.a).length;
        }
        return K(length);
    }

    public static int U(int i) {
        return W(evwj.c(i, 0));
    }

    public static int V(int i, int i2) {
        return U(i) + W(i2);
    }

    public static int W(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int X(int i, long j) {
        return U(i) + Y(j);
    }

    public static int Y(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int Z(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long aa(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static evrf ab(byte[] bArr) {
        return new evrc(bArr, 0, bArr.length);
    }

    public static int an(int i) {
        return U(i) + 1;
    }

    public static int ao(int i) {
        return U(i) + 8;
    }

    public static int ap(int i) {
        return U(i) + 4;
    }

    public static int aq(int i) {
        return U(i) + 8;
    }

    public static int ar(int i) {
        return U(i) + 4;
    }

    public static int as(int i) {
        return U(i) + 4;
    }

    public static int at(int i) {
        return U(i) + 8;
    }

    @Override // defpackage.evqj
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void aA(evqs evqsVar);

    public final void ac() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void ad(String str, evwd evwdVar) throws evrd {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) evwdVar);
        byte[] bytes = str.getBytes(evth.a);
        try {
            int length = bytes.length;
            w(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new evrd(e2);
        }
    }

    public final void ae(int i, double d) {
        k(i, Double.doubleToRawLongBits(d));
    }

    public final void af(double d) {
        l(Double.doubleToRawLongBits(d));
    }

    public final void ag(int i, float f) {
        i(i, Float.floatToRawIntBits(f));
    }

    public final void ah(float f) {
        j(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void ai(evuh evuhVar) {
        evuhVar.writeTo(this);
    }

    public final void aj(int i, int i2) {
        v(i, Z(i2));
    }

    public final void ak(int i) {
        w(Z(i));
    }

    public final void al(int i, long j) {
        x(i, aa(j));
    }

    public final void am(long j) {
        y(aa(j));
    }

    public abstract void aw();

    public abstract void ax(byte b);

    public abstract void ay(int i, boolean z);

    public abstract void az(int i, evqs evqsVar);

    public abstract int b();

    public abstract void i(int i, int i2);

    public abstract void j(int i);

    public abstract void k(int i, long j);

    public abstract void l(long j);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(int i, evuh evuhVar, evuz evuzVar);

    public abstract void p(evuh evuhVar);

    public abstract void q(int i, evuh evuhVar);

    public abstract void r(int i, evqs evqsVar);

    public abstract void s(int i, String str);

    public abstract void t(String str);

    public abstract void u(int i, int i2);

    public abstract void v(int i, int i2);

    public abstract void w(int i);

    public abstract void x(int i, long j);

    public abstract void y(long j);

    public abstract void z(byte[] bArr, int i);
}
