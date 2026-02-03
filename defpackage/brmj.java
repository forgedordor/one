package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brmj {
    public final brmk a;
    public final brmk b;
    public final brmk c;
    public final brmk d;
    public final brmk e;
    public final brmk f;
    public final brmk g;
    final brmk[] h;

    public brmj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "p2p_suggestions._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brlu
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar.c = new dqps() { // from class: brmf
        };
        brmk brmkVar = new brmk(dqprVarM.a());
        this.a = brmkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: brmg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "p2p_suggestions.target_message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: brmh
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: brmi
        };
        brmk brmkVar2 = new brmk(dqprVarM2.a());
        this.b = brmkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "p2p_suggestions.generated_timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: brlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: brlw
        };
        brmk brmkVar3 = new brmk(dqprVarM3.a());
        this.c = brmkVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqogVar4.a = "p2p_suggestions.suggestion";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: brlx
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: brly
        };
        brmk brmkVar4 = new brmk(dqprVarM4.a());
        this.d = brmkVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "p2p_suggestions.smart_suggestion_type";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: brlz
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: brma
        };
        brmk brmkVar5 = new brmk(dqprVarM5.a());
        this.e = brmkVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "p2p_suggestions.suggestion_status";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: brmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: brmc
        };
        brmk brmkVar6 = new brmk(dqprVarM6.a());
        this.f = brmkVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "p2p_suggestions.consumption_state";
        dqprVarM7.i(53080);
        dqogVar7.d = new Supplier() { // from class: brmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return brnk.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: brme
        };
        brmk brmkVar7 = new brmk(dqprVarM7.a());
        this.g = brmkVar7;
        this.h = new brmk[]{brmkVar, brmkVar2, brmkVar3, brmkVar4, brmkVar5, brmkVar6, brmkVar7};
    }
}
