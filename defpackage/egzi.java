package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egzi implements eora {
    final /* synthetic */ Object a;
    final /* synthetic */ egzm b;
    final /* synthetic */ ejwi c;
    final /* synthetic */ egzj d;

    public egzi(egzj egzjVar, Object obj, egzm egzmVar, ejwi ejwiVar) {
        this.a = obj;
        this.b = egzmVar;
        this.c = ejwiVar;
        this.d = egzjVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        ekhx ekhxVarI;
        Object obj2 = this.a;
        obj2.getClass();
        egzj egzjVar = this.d;
        synchronized (egzjVar.a) {
            ekhg ekhgVar = new ekhg();
            if (obj2 instanceof egza) {
                ekhj ekhjVar = (ekhj) egzjVar.b.get(obj2);
                if (ekhjVar != null) {
                    ekhgVar.b(ekhjVar);
                }
            } else if (obj2 instanceof egyk) {
                ekqg ekqgVarListIterator = ((egyk) obj2).a().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    ekhj ekhjVar2 = (ekhj) egzjVar.b.get(ekqgVarListIterator.next());
                    if (ekhjVar2 != null) {
                        ekhgVar.b(ekhjVar2);
                    }
                }
            } else {
                ekhj ekhjVar3 = (ekhj) egzjVar.b.get(obj2);
                if (ekhjVar3 != null) {
                    ekhgVar.b(ekhjVar3);
                }
            }
            ekhxVarI = ekhgVar.a().i();
        }
        ekqg ekqgVarListIterator2 = ((ekim) ekhxVarI).listIterator();
        while (ekqgVarListIterator2.hasNext()) {
            ejwi ejwiVar = this.c;
            egzn egznVar = (egzn) ekqgVarListIterator2.next();
            if (ejwiVar.f() != egznVar) {
                egznVar.a(this.b);
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
