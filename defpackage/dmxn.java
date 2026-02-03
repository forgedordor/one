package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmxn {
    public final float a;

    public dmxn(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmxn) && kir.b(this.a, ((dmxn) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Default(availableHeightForSheetPeek=" + kir.a(this.a) + ")";
    }
}
