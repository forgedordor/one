package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuu extends dhph {
    public final ekgp a;

    public dhuu(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    public final sbn a() {
        Object obj = this.a.get("/internal/moirai_default/1");
        obj.getClass();
        return (sbn) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhuu) && fdbq.f(this.a, ((dhuu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
