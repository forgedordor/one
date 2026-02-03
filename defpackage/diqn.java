package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqn implements diqp {
    public final String a;
    public final dirz b;
    private final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public diqn() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diqn)) {
            return false;
        }
        diqn diqnVar = (diqn) obj;
        int i = diqnVar.c;
        return fdbq.f(this.a, diqnVar.a) && fdbq.f(this.b, diqnVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Star(count=0, contentDescription=" + this.a + ", style=" + this.b + ")";
    }

    public /* synthetic */ diqn(String str, dirz dirzVar, int i) {
        dirzVar = (i & 4) != 0 ? new dirz(null) : dirzVar;
        str = (i & 2) != 0 ? null : str;
        dirzVar.getClass();
        this.c = 0;
        this.a = str;
        this.b = dirzVar;
    }
}
