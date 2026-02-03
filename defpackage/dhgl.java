package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgl implements Comparable {
    public final long a;
    public final dhgg b;

    public dhgl(dhgg dhggVar) {
        this.b = dhggVar;
        this.a = System.currentTimeMillis() + (dhggVar.a() * 1000);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dhgl dhglVar = (dhgl) obj;
        return (int) (dhglVar == null ? 1L : this.a - dhglVar.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dhgl) && this.b.equals(((dhgl) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
