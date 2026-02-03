package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzz extends dwaw {
    public final ekgb a;

    public dvzz(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwaw
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwaw) {
            return ekjz.h(this.a, ((dwaw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GroupInfo{contactIds=" + this.a.toString() + "}";
    }
}
