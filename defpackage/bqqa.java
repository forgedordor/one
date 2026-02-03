package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqqa {
    public final bqqb a;
    public final bqqb b;
    public final bqqb c;
    public final bqqb d;
    public final bqqb e;
    public final bqqb f;
    public final bqqb g;
    public final bqqb h;
    public final bqqb i;
    public final bqqb j;
    public final bqqb k;
    public final bqqb l;
    public final bqqb m;
    final bqqb[] n;

    public bqqa() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_spam._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bqpa
        };
        bqqb bqqbVar = new bqqb(dqprVarM.a());
        this.a = bqqbVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_spam.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqpm
        };
        bqqb bqqbVar2 = new bqqb(dqprVarM2.a());
        this.b = bqqbVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bqpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar3.a = "message_spam.conversation_id";
        dqprVarM3.i(59460);
        dqogVar3.d = new Supplier() { // from class: bqpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqpp
        };
        bqqb bqqbVar3 = new bqqb(dqprVarM3.a());
        this.c = bqqbVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "message_spam.source";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bqpq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqpr
        };
        bqqb bqqbVar4 = new bqqb(dqprVarM4.a());
        this.d = bqqbVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 3;
        dqogVar5.a = "message_spam.score";
        dqprVarM5.i(45040);
        dqogVar5.d = new Supplier() { // from class: bqpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqps
        };
        bqqb bqqbVar5 = new bqqb(dqprVarM5.a());
        this.e = bqqbVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqogVar6.a = "message_spam.outcome";
        dqprVarM6.i(58030);
        dqogVar6.d = new Supplier() { // from class: bqpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bqpu
        };
        bqqb bqqbVar6 = new bqqb(dqprVarM6.a());
        this.f = bqqbVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "message_spam.ares_initiated_by";
        dqprVarM7.i(58100);
        dqogVar7.d = new Supplier() { // from class: bqpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bqpw
        };
        bqqb bqqbVar7 = new bqqb(dqprVarM7.a());
        this.g = bqqbVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqprVarM8.d(true);
        dqogVar8.a = "message_spam.classification_timestamp";
        dqprVarM8.i(59190);
        dqogVar8.d = new Supplier() { // from class: bqpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bqpy
        };
        bqqb bqqbVar8 = new bqqb(dqprVarM8.a());
        this.h = bqqbVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqogVar9.a = "message_spam.trigger";
        dqprVarM9.i(59460);
        dqogVar9.d = new Supplier() { // from class: bqpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bqoz
        };
        bqqb bqqbVar9 = new bqqb(dqprVarM9.a());
        this.i = bqqbVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "message_spam.action_type";
        dqprVarM10.i(59460);
        dqogVar10.d = new Supplier() { // from class: bqpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bqpc
        };
        bqqb bqqbVar10 = new bqqb(dqprVarM10.a());
        this.j = bqqbVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqogVar11.a = "message_spam.action_contributors";
        dqprVarM11.i(59460);
        dqogVar11.d = new Supplier() { // from class: bqpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: bqpe
        };
        bqqb bqqbVar11 = new bqqb(dqprVarM11.a());
        this.k = bqqbVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 1;
        dqogVar12.a = "message_spam.error_code";
        dqprVarM12.i(59460);
        dqogVar12.d = new Supplier() { // from class: bqpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar12.c = new dqps() { // from class: bqpg
        };
        bqqb bqqbVar12 = new bqqb(dqprVarM12.a());
        this.l = bqqbVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqogVar13.a = "message_spam.reclassification_index";
        dqprVarM13.i(59460);
        dqogVar13.d = new Supplier() { // from class: bqph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrg.b();
            }
        };
        dqogVar13.c = new dqps() { // from class: bqpi
        };
        bqqb bqqbVar13 = new bqqb(dqprVarM13.a());
        this.m = bqqbVar13;
        this.n = new bqqb[]{bqqbVar, bqqbVar2, bqqbVar3, bqqbVar4, bqqbVar5, bqqbVar6, bqqbVar7, bqqbVar8, bqqbVar9, bqqbVar10, bqqbVar11, bqqbVar12, bqqbVar13};
    }
}
