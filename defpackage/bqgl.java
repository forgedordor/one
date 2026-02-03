package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqgl {
    public final bqgm a;
    public final bqgm b;
    public final bqgm c;
    public final bqgm d;
    public final bqgm e;
    public final bqgm f;
    public final bqgm g;
    final bqgm[] h;

    public bqgl() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_labels._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bqgi
        };
        bqgm bqgmVar = new bqgm(dqprVarM.a());
        this.a = bqgmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqgj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_labels.message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqfw
        };
        bqgm bqgmVar2 = new bqgm(dqprVarM2.a());
        this.b = bqgmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bqfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bukt.b.a;
            }
        };
        dqogVar3.a = "message_labels.label";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqfz
        };
        bqgm bqgmVar3 = new bqgm(dqprVarM3.a());
        this.c = bqgmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "message_labels.confidence";
        dqprVarM4.i(53060);
        dqogVar4.d = new Supplier() { // from class: bqga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqgb
        };
        bqgm bqgmVar4 = new bqgm(dqprVarM4.a());
        this.d = bqgmVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "message_labels.source";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bqgc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqgd
        };
        bqgm bqgmVar5 = new bqgm(dqprVarM5.a());
        this.e = bqgmVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "message_labels.intent";
        dqprVarM6.i(58590);
        dqogVar6.d = new Supplier() { // from class: bqge
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bqgf
        };
        bqgm bqgmVar6 = new bqgm(dqprVarM6.a());
        this.f = bqgmVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "message_labels.model_id";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bqgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhf.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bqgh
        };
        bqgm bqgmVar7 = new bqgm(dqprVarM7.a());
        this.g = bqgmVar7;
        this.h = new bqgm[]{bqgmVar, bqgmVar2, bqgmVar3, bqgmVar4, bqgmVar5, bqgmVar6, bqgmVar7};
    }
}
