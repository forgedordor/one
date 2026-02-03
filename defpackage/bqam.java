package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqam {
    public final bqan a;
    public final bqan b;
    final bqan[] c;

    public bqam() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bqah
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "message_captions.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqai
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqbb.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqaj
        };
        bqan bqanVar = new bqan(dqprVarM.a());
        this.a = bqanVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "message_captions.caption";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqak
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqbb.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqal
        };
        bqan bqanVar2 = new bqan(dqprVarM2.a());
        this.b = bqanVar2;
        this.c = new bqan[]{bqanVar, bqanVar2};
    }
}
