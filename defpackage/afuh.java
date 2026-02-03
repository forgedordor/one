package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afuh {
    public final fdvc a;
    public final afrs b;
    public final fdvc c;
    public final fdvc d;
    public final fdvc e;
    public final afug f;

    public afuh(fdvc fdvcVar, afrs afrsVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, afug afugVar) {
        fdvcVar.getClass();
        fdvcVar2.getClass();
        this.a = fdvcVar;
        this.b = afrsVar;
        this.c = fdvcVar2;
        this.d = fdvcVar3;
        this.e = fdvcVar4;
        this.f = afugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afuh)) {
            return false;
        }
        afuh afuhVar = (afuh) obj;
        return fdbq.f(this.a, afuhVar.a) && fdbq.f(this.b, afuhVar.b) && fdbq.f(this.c, afuhVar.c) && fdbq.f(this.d, afuhVar.d) && fdbq.f(this.e, afuhVar.e) && fdbq.f(this.f, afuhVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MultiShareScreenUiData(autoCompleteTopAppBarUiData=" + this.a + ", multiShareListUiData=" + this.b + ", extendedFabUiData=" + this.c + ", destinationsDialogUiData=" + this.d + ", editMessageUiData=" + this.e + ", flags=" + this.f + ")";
    }
}
