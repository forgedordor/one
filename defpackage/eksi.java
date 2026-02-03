package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eksi implements ekrr {
    private final ekrr a;
    private final Object b;

    public eksi(ekrr ekrrVar, Object obj) {
        this.a = ekrrVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eksi)) {
            return false;
        }
        eksi eksiVar = (eksi) obj;
        return this.a.equals(eksiVar.a) && this.b.equals(eksiVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
