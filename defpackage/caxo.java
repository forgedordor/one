package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxo extends cbcu {
    public final String a;
    public final evuh b;
    public final cbog c;
    private final cohg d;

    public caxo(String str, evuh evuhVar, cbog cbogVar, cohg cohgVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
        if (evuhVar == null) {
            throw new NullPointerException("Null rawData");
        }
        this.b = evuhVar;
        this.c = cbogVar;
        this.d = cohgVar;
    }

    @Override // defpackage.cbcu
    public final cbog a() {
        return this.c;
    }

    @Override // defpackage.cbcu
    public final cohg b() {
        return this.d;
    }

    @Override // defpackage.cbcu
    public final evuh c() {
        return this.b;
    }

    @Override // defpackage.cbcu
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbcu) {
            cbcu cbcuVar = (cbcu) obj;
            if (this.a.equals(cbcuVar.d()) && this.b.equals(cbcuVar.c()) && this.c.equals(cbcuVar.a()) && this.d.equals(cbcuVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        cohg cohgVar = this.d;
        cbog cbogVar = this.c;
        return "WorkQueueRequest{key=" + this.a + ", rawData=" + this.b.toString() + ", extras=" + cbogVar.toString() + ", traceSpanSupplier=" + cohgVar.toString() + "}";
    }
}
