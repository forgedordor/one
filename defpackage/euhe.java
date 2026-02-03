package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euhe extends eulj {
    public final ekgb a;

    public euhe(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.eulj
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eulj) {
            return ekjz.h(this.a, ((eulj) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TextLanguage{locales=" + String.valueOf(this.a) + "}";
    }
}
