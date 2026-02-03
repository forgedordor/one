package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwun extends dwvl {
    public final ekgb a;

    public dwun(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwvl
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvl) {
            return ekjz.h(this.a, ((dwvl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "HorizontalLayoutButtons{verticalLayoutButtons=" + this.a.toString() + "}";
    }
}
