package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cars {
    public final int a;
    public final int b;
    public final int c;

    public cars(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cars)) {
            return false;
        }
        cars carsVar = (cars) obj;
        return this.a == carsVar.a && this.b == carsVar.b && this.c == carsVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BugleDataCount(messages=" + this.a + ", conversations=" + this.b + ", participants=" + this.c + ")";
    }
}
