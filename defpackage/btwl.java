package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btwl {
    public final btwm a;
    public final btwm b;
    final btwm[] c;

    public btwl() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: btwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "satellite_emergency_details.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return btwx.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btwi
        };
        btwm btwmVar = new btwm(dqprVarM.a());
        this.a = btwmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqogVar2.a = "satellite_emergency_details.help_state";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return btwx.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btwk
        };
        btwm btwmVar2 = new btwm(dqprVarM2.a());
        this.b = btwmVar2;
        this.c = new btwm[]{btwmVar, btwmVar2};
    }
}
