package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmc extends ebmp {
    public final int a;
    private final int b;
    private final int c;

    public ebmc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.ebmp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ebmp
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ebmp
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebmp) {
            ebmp ebmpVar = (ebmp) obj;
            if (this.a == ebmpVar.a() && this.b == ebmpVar.b() && this.c == ebmpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "TimerConfiguration{t1=" + this.a + ", t2=" + this.b + ", t4=" + this.c + "}";
    }
}
