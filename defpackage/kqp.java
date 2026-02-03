package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqp implements Cloneable {
    private final char[] a;
    protected long b = -1;
    protected long c = Long.MAX_VALUE;
    protected kqo d;
    private int e;

    public kqp(char[] cArr) {
        this.a = cArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqp)) {
            return false;
        }
        kqp kqpVar = (kqp) obj;
        if (this.b != kqpVar.b || this.c != kqpVar.c) {
            return false;
        }
        int i = kqpVar.e;
        if (Arrays.equals(this.a, kqpVar.a)) {
            return Objects.equals(this.d, kqpVar.d);
        }
        return false;
    }

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public kqp clone() {
        try {
            return (kqp) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        kqo kqoVar = this.d;
        return (((((iHashCode + ((int) j2)) * 31) + ((int) j4)) * 31) + (kqoVar != null ? kqoVar.hashCode() : 0)) * 31;
    }

    public float t() {
        if (this instanceof kqr) {
            return ((kqr) this).t();
        }
        return Float.NaN;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.b + "-" + this.c + ")";
        }
        return w() + " (" + this.b + " : " + this.c + ") <<" + new String(this.a).substring((int) j, ((int) j2) + 1) + ">>";
    }

    public int u() {
        if (this instanceof kqr) {
            return ((kqr) this).u();
        }
        return 0;
    }

    public final String v() {
        String str = new String(this.a);
        if (str.length() <= 0) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        int i = (int) this.b;
        return str.substring(i, i + 1);
    }

    public final String w() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public final void x(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        kqo kqoVar = this.d;
        if (kqoVar != null) {
            kqoVar.q(this);
        }
    }

    public final boolean y() {
        char[] cArr = this.a;
        return cArr != null && cArr.length > 0;
    }

    public final void z() {
        this.b = 0L;
    }
}
