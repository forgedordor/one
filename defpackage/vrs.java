package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrs {
    public final fdvc a;
    public final fdvc b;
    public final vrr c;
    public final yil d;
    private final fdvc e;

    public vrs(fdvc fdvcVar, yil yilVar, fdvc fdvcVar2, fdvc fdvcVar3, vrr vrrVar) {
        fdvcVar2.getClass();
        fdvcVar3.getClass();
        this.a = fdvcVar;
        this.d = yilVar;
        this.e = fdvcVar2;
        this.b = fdvcVar3;
        this.c = vrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrs)) {
            return false;
        }
        vrs vrsVar = (vrs) obj;
        return fdbq.f(this.a, vrsVar.a) && fdbq.f(this.d, vrsVar.d) && fdbq.f(this.e, vrsVar.e) && fdbq.f(this.b, vrsVar.b) && fdbq.f(this.c, vrsVar.c);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BottomContentUiData(composeRowHolderUiData=" + this.a + ", messageListInsets=" + this.d + ", toolstoneUiData=" + this.e + ", stickyMessageUiData=" + this.b + ", flags=" + this.c + ")";
    }
}
