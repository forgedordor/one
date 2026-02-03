package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dwiw extends dwsa {
    public final ekgb a;

    public dwiw(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwsa
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsa) {
            return ekjz.h(this.a, ((dwsa) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RichText{lines=" + this.a.toString() + "}";
    }
}
