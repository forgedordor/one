package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evah extends evao {
    public final int a;
    public final int b;
    public final evad c;

    public evah(int i, int i2, evad evadVar) {
        this.a = i;
        this.b = i2;
        this.c = evadVar;
    }

    @Override // defpackage.evao
    public final int a() {
        return this.b;
    }

    @Override // defpackage.evao
    public final int b() {
        return this.a;
    }

    @Override // defpackage.evao
    public final evad c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evao) {
            evao evaoVar = (evao) obj;
            if (this.a == evaoVar.b() && this.b == evaoVar.a() && this.c.equals(evaoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "SegmentationOptions{outputWidth=" + this.a + ", outputHeight=" + this.b + ", imageProcessingOptions=" + this.c.toString() + "}";
    }
}
