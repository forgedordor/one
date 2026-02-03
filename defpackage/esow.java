package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esow extends espr {
    private ekgp b;
    private final esov c;

    public esow(esov esovVar) {
        this.c = esovVar;
        ekgi ekgiVar = new ekgi();
        ekqg ekqgVarListIterator = ((esoq) esovVar).b.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ejwi ejwiVar = (ejwi) ekqgVarListIterator.next();
            if (ejwiVar.g()) {
                esot esotVar = (esot) ejwiVar.c();
                ekqg ekqgVarListIterator2 = esotVar.a.listIterator();
                while (ekqgVarListIterator2.hasNext()) {
                    ekgiVar.i((String) ekqgVarListIterator2.next(), esotVar);
                }
            }
            this.b = ekgiVar.c();
        }
    }

    @Override // defpackage.espr
    public final esrw a() {
        esoq esoqVar = (esoq) this.c;
        return esoqVar.b.isEmpty() ? new esok(esoqVar.a, ekoj.a) : new esok(esoqVar.a, this.b);
    }
}
