package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaan {
    public static final eaan a = new eaan(ekoo.c);
    public final ekik b;

    public eaan(ekik ekikVar) {
        this.b = ekikVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eaan) {
            return this.b.equals(((eaan) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return ekpg.a(this.b);
    }
}
