package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cims {
    public final cimt a;
    final cimt[] b;

    public cims() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: cimp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "message_self_mention.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cimq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cinb.a();
            }
        };
        dqogVar.c = new dqps() { // from class: cimr
        };
        cimt cimtVar = new cimt(dqprVarM.a());
        this.a = cimtVar;
        this.b = new cimt[]{cimtVar};
    }
}
