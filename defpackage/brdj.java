package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdj extends dqta {
    public brdj(dqtd dqtdVar, dqyj dqyjVar) {
        super(dqtdVar, dqyjVar == null ? new brdv(new brec()) : dqyjVar);
    }

    public final ekgb a() {
        final brdv brdvVar = (brdv) this.b;
        return (ekgb) MessagesTable.f().p("messages-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: bque
            @Override // defpackage.ejxr
            public final Object get() {
                brdr brdrVarD = MessagesTable.d();
                brdv brdvVar2 = brdvVar;
                brdrVarD.k(brdvVar2);
                brdrVarD.A("messages-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ = brdrVarD.b().z();
                brdk brdkVar = new brdk();
                brdkVar.b = brdvVar2;
                brdkVar.f("messages-deleteAndReturnDeletedRows-delete");
                brdkVar.b().b();
                return ekgbVarZ;
            }
        });
    }
}
