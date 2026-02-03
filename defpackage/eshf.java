package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eshf implements eshj {
    private final eshk a;
    private final defr b;

    public eshf(eshk eshkVar, defr defrVar) {
        this.a = eshkVar;
        this.b = defrVar;
    }

    @Override // defpackage.eshj
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.eshj
    public final boolean b(eshr eshrVar) {
        if (!eshrVar.l() || this.a.c(eshrVar)) {
            return false;
        }
        defr defrVar = this.b;
        eshn eshnVar = (eshn) eshrVar;
        String str = eshnVar.b;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        defrVar.b(new esgv(str, eshnVar.d, eshnVar.e));
        return true;
    }
}
