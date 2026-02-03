package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqcb extends dqta {
    public bqcb(dqtd dqtdVar, dqyj dqyjVar) {
        super(dqtdVar, dqyjVar == null ? new bqci(new bqcm()) : dqyjVar);
    }

    public final ekgb a() {
        final bqci bqciVar = (bqci) this.b;
        return (ekgb) bqcn.b().p("message_classifications_table-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: bqbd
            @Override // defpackage.ejxr
            public final Object get() {
                bqch bqchVarA = bqcn.a();
                bqci bqciVar2 = bqciVar;
                bqchVarA.k(bqciVar2);
                bqchVarA.A("message_classifications_table-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ = bqchVarA.b().z();
                bqcc bqccVar = new bqcc();
                bqccVar.b = bqciVar2;
                bqccVar.f("message_classifications_table-deleteAndReturnDeletedRows-delete");
                bqccVar.b().b();
                return ekgbVarZ;
            }
        });
    }
}
