package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxp implements Comparable {
    public final int a;
    public final nxk b;

    public nxp(int i, nxk nxkVar) {
        this.a = i;
        this.b = nxkVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((nxp) obj).a);
    }
}
