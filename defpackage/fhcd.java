package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcd extends fhcg {
    private final fhbm a;

    public fhcd(fhdu fhduVar, fexj fexjVar, fhbv fhbvVar, fhbm fhbmVar) {
        super(fhduVar, fexjVar, fhbvVar);
        this.a = fhbmVar;
    }

    @Override // defpackage.fhcg
    protected final Object a(fhbk fhbkVar, Object[] objArr) {
        return this.a.adapt(fhbkVar);
    }
}
