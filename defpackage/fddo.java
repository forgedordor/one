package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fddo implements Iterable, fdcn {
    public final int a;
    public final int b;
    public final int c;

    public fddo(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = fczg.a(i, i2, i3);
        this.c = i3;
    }

    public boolean a() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final fcvy iterator() {
        return new fddp(this.a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof fddo) {
            if (a() && ((fddo) obj).a()) {
                return true;
            }
            fddo fddoVar = (fddo) obj;
            return this.a == fddoVar.a && this.b == fddoVar.b && this.c == fddoVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
