package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwvd extends dwwg {
    public final ekgb a;

    public dwvd(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwwg
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwwg) {
            return ekjz.h(this.a, ((dwwg) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StackComponent{elements=" + this.a.toString() + "}";
    }
}
