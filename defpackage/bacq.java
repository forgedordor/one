package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bacq implements Comparable {
    public final alqm a;
    public final int b;
    public final String c;

    public bacq(alrj alrjVar, String str, int i, String str2) {
        this.b = i;
        this.c = str2;
        this.a = alrjVar.n(str);
    }

    public final String a() {
        return cssf.c(ejwk.b(this.a.F().a));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bacq bacqVar = (bacq) obj;
        int i = bacqVar.b;
        int i2 = this.b;
        if (i2 == i) {
            boolean zBooleanValue = ((Boolean) alrj.a.e()).booleanValue();
            return ejwk.b(this.a.p(zBooleanValue)).compareTo(ejwk.b(bacqVar.a.p(zBooleanValue)));
        }
        if (i2 == 2) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        return Integer.compare(i2, i);
    }
}
