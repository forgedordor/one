package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyag {
    public dxxr a;
    private ejwi b;

    public dyag() {
        this.b = ejud.a;
    }

    public final dyaf a() {
        dxxr dxxrVar = this.a;
        if (dxxrVar != null) {
            return new dyaf(this.b, dxxrVar);
        }
        throw new IllegalStateException("Missing required properties: accountCapabilitiesRetriever");
    }

    public final void b(dyak dyakVar) {
        this.b = ejwi.j(dyakVar);
    }

    public dyag(dyaf dyafVar) {
        this.b = ejud.a;
        this.b = dyafVar.a;
        this.a = dyafVar.b;
    }
}
