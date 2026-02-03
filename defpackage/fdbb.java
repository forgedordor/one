package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdbb implements Serializable, fdbm {
    private final Class a;
    protected final Object b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final int g;

    public fdbb(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.b = obj;
        this.a = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i2 & 1);
        this.f = i;
        this.g = i2 >> 1;
    }

    @Override // defpackage.fdbm
    public final int dS() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdbb)) {
            return false;
        }
        fdbb fdbbVar = (fdbb) obj;
        return this.e == fdbbVar.e && this.f == fdbbVar.f && this.g == fdbbVar.g && fdbq.f(this.b, fdbbVar.b) && fdbq.f(this.a, fdbbVar.a) && this.c.equals(fdbbVar.c) && this.d.equals(fdbbVar.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((((((((((((obj != null ? obj.hashCode() : 0) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        int i = fdcj.a;
        return fdck.a(this);
    }

    public fdbb(int i, Class cls, String str, String str2, int i2) {
        this(i, fdbg.f, cls, str, str2, i2);
    }
}
