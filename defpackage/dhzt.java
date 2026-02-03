package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzt extends dhph {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dhzt(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhzt)) {
            return false;
        }
        dhzt dhztVar = (dhzt) obj;
        return this.a == dhztVar.a && this.b == dhztVar.b && this.c == dhztVar.c && this.d == dhztVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
