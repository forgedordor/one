package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfh {
    public final String a;

    public dzfh(String str) {
        this.a = str;
    }

    public static dzfh a(dzfh dzfhVar, dzfh dzfhVar2) {
        return new dzfh(String.valueOf(dzfhVar.a).concat(String.valueOf(dzfhVar2.a)));
    }

    public static dzfh b(Class cls) {
        return !ejwk.c(null) ? new dzfh("null".concat(String.valueOf(cls.getSimpleName()))) : new dzfh(cls.getSimpleName());
    }

    public static dzfh c(String str, Enum r2) {
        return !ejwk.c(str) ? new dzfh(str.concat(String.valueOf(r2.name()))) : new dzfh(r2.name());
    }

    public static String d(dzfh dzfhVar) {
        if (dzfhVar == null) {
            return null;
        }
        return dzfhVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzfh) {
            return this.a.equals(((dzfh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
