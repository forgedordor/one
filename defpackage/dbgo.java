package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgo extends dbgr {
    private final Integer a;

    public dbgo(Integer num) {
        this.a = num;
    }

    @Override // defpackage.dbgr
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dbgr)) {
            return false;
        }
        dbgr dbgrVar = (dbgr) obj;
        Integer num = this.a;
        return num == null ? dbgrVar.a() == null : num.equals(dbgrVar.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
