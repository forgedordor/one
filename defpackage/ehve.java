package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehve extends ehvh {
    public final int a;
    public final int b;

    public ehve(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ehvh
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ehvh
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehvh) {
            ehvh ehvhVar = (ehvh) obj;
            if (this.a == ehvhVar.b() && this.b == ehvhVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "StorageSpec{type=" + ehvi.a(this.a) + ", directBoot=" + (this.b != 1 ? "CREDENTIAL" : "DEVICE") + "}";
    }
}
