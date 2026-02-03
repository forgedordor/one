package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aban extends abai {
    private final abao g;

    public aban(abag abagVar, abao abaoVar) {
        super(abagVar, "GServices and Phenotype logging");
        this.g = abaoVar;
    }

    @Override // defpackage.abai
    public final abaj a() {
        abaf abafVar = this.a;
        abafVar.b("GServices keys and values:");
        abam abamVar = (abam) this.g;
        abafVar.b(abamVar.a);
        abafVar.b("Phenotype keys and values:");
        abafVar.b(abamVar.b);
        return abaj.a;
    }
}
