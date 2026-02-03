package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enb {
    public final int a;
    public final int b;

    public enb(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            ebs.c("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        ebs.c("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enb)) {
            return false;
        }
        enb enbVar = (enb) obj;
        return this.a == enbVar.a && this.b == enbVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ')';
    }
}
