package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhcg extends fhdz {
    private final fhdu a;
    private final fexj b;
    private final fhbv c;

    public fhcg(fhdu fhduVar, fexj fexjVar, fhbv fhbvVar) {
        this.a = fhduVar;
        this.b = fexjVar;
        this.c = fhbvVar;
    }

    protected abstract Object a(fhbk fhbkVar, Object[] objArr);

    @Override // defpackage.fhdz
    public final Object b(Object[] objArr) {
        return a(new fhct(this.a, objArr, this.b, this.c), objArr);
    }
}
