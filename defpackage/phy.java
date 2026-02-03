package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class phy implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public phy(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        phy phyVar = (phy) obj;
        phyVar.getClass();
        int i = this.a - phyVar.a;
        return i == 0 ? this.d - phyVar.d : i;
    }
}
