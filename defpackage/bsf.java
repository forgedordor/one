package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsf extends bsz {
    private final int a;
    private final int b;
    private final kog c;

    public bsf(int i, int i2, kog kogVar) {
        this.a = i;
        this.b = i2;
        this.c = kogVar;
    }

    @Override // defpackage.bsz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bsz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bsz
    public final kog c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsz) {
            bsz bszVar = (bsz) obj;
            if (this.a == bszVar.a() && this.b == bszVar.b() && this.c.equals(bszVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
