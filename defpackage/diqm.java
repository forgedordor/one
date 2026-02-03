package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqm implements diqp {
    public final String a;
    public final dirz b;
    private final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public diqm() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diqm)) {
            return false;
        }
        diqm diqmVar = (diqm) obj;
        int i = diqmVar.c;
        return fdbq.f(this.a, diqmVar.a) && fdbq.f(this.b, diqmVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ScheduledSend(count=0, contentDescription=" + this.a + ", style=" + this.b + ")";
    }

    public /* synthetic */ diqm(String str, dirz dirzVar, int i) {
        dirzVar = (i & 4) != 0 ? new dirz(null) : dirzVar;
        str = (i & 2) != 0 ? null : str;
        dirzVar.getClass();
        this.c = 0;
        this.a = str;
        this.b = dirzVar;
    }
}
