package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucx {
    public final boolean a;
    public final dlcn b;
    public final dlbt c;
    public final cucw d;

    public cucx(boolean z, dlcn dlcnVar, dlbt dlbtVar, cucw cucwVar) {
        this.a = z;
        this.b = dlcnVar;
        this.c = dlbtVar;
        this.d = cucwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cucx)) {
            return false;
        }
        cucx cucxVar = (cucx) obj;
        return this.a == cucxVar.a && fdbq.f(this.b, cucxVar.b) && fdbq.f(this.c, cucxVar.c) && fdbq.f(this.d, cucxVar.d);
    }

    public final int hashCode() {
        dlcn dlcnVar = this.b;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (dlcnVar == null ? 0 : dlcnVar.hashCode());
        dlbt dlbtVar = this.c;
        return (((iHashCode * 31) + (dlbtVar != null ? dlbtVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SimSelectorRowUiData(visible=" + this.a + ", simBarUiData=" + this.b + ", simBar2UiData=" + this.c + ", flags=" + this.d + ")";
    }

    public /* synthetic */ cucx() {
        this(false, null, null, new cucw((byte[]) null));
    }
}
