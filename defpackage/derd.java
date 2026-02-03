package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derd implements dent {
    private final int a;
    private final denv b;

    public derd(dent dentVar) {
        this.a = dentVar.a();
        this.b = new deri(dentVar.b());
    }

    @Override // defpackage.dent
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dent
    public final denv b() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        return "DataEventEntity{ type=" + (i == 1 ? "changed" : i == 2 ? "deleted" : "unknown") + ", dataitem=" + this.b.toString() + " }";
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
