package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnw extends dwrc {
    public final ekgb a;

    public dwnw(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwrc
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrc) {
            return ekjz.h(this.a, ((dwrc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReceiptMetadata{contactIds=" + this.a.toString() + "}";
    }
}
