package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euxf extends euxe {
    private volatile transient int c;
    private volatile transient boolean d;

    public euxf(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.euxe
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euxf) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof euxo)) {
                return false;
            }
            euxo euxoVar = (euxo) obj;
            if (this.a != euxoVar.a() || this.b != euxoVar.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.euxe
    public final int hashCode() {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    this.c = ((this.a ^ 1000003) * 1000003) ^ this.b;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
