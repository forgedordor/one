package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofn {
    public static final fctc a = fctd.a(new fdae() { // from class: dofl
        @Override // defpackage.fdae
        public final Object invoke() {
            return new dofn(1.0f);
        }
    });
    private final float b;

    public dofn(float f) {
        this.b = f;
    }

    public final int a(int i) {
        return fdcu.b(i / this.b);
    }

    public final int b(int i) {
        return fdcu.b(i * this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dofn) && Float.compare(this.b, ((dofn) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AspectRatio(value=" + this.b + ")";
    }

    public dofn(int i, int i2) {
        this(i / i2);
    }
}
