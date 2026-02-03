package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqrv {
    public final bqrw a;
    public final bqrw b;
    final bqrw[] c;

    public bqrv() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_star._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqsm.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqrr
        };
        bqrw bqrwVar = new bqrw(dqprVarM.a());
        this.a = bqrwVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_star.message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqsm.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqru
        };
        bqrw bqrwVar2 = new bqrw(dqprVarM2.a());
        this.b = bqrwVar2;
        this.c = new bqrw[]{bqrwVar, bqrwVar2};
    }
}
