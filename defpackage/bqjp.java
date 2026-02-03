package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqjp {
    public final bqjq a;
    public final bqjq b;
    public final bqjq c;
    public final bqjq d;
    public final bqjq e;
    public final bqjq f;
    public final bqjq g;
    final bqjq[] h;

    public bqjp() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_reactions._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bqjm
        };
        bqjq bqjqVar = new bqjq(dqprVarM.a());
        this.a = bqjqVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_reactions.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqja
        };
        bqjq bqjqVar2 = new bqjq(dqprVarM2.a());
        this.b = bqjqVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqogVar3.a = "message_reactions.reactions_data";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqjc
        };
        bqjq bqjqVar3 = new bqjq(dqprVarM3.a());
        this.c = bqjqVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.d(true);
        dqprVarM4.e(true);
        dqogVar4.b = new Supplier() { // from class: bqjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar4.a = "message_reactions.reacted_message_id";
        dqprVarM4.i(46020);
        dqogVar4.d = new Supplier() { // from class: bqje
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqjf
        };
        bqjq bqjqVar4 = new bqjq(dqprVarM4.a());
        this.d = bqjqVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "message_reactions.reaction";
        dqprVarM5.i(48000);
        dqogVar5.d = new Supplier() { // from class: bqjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqjh
        };
        bqjq bqjqVar5 = new bqjq(dqprVarM5.a());
        this.e = bqjqVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "message_reactions.applied_reaction";
        dqprVarM6.i(59060);
        dqogVar6.d = new Supplier() { // from class: bqji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bqjj
        };
        bqjq bqjqVar6 = new bqjq(dqprVarM6.a());
        this.f = bqjqVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 5;
        dqprVarM7.d(true);
        dqogVar7.a = "message_reactions.animation_effect";
        dqprVarM7.i(59520);
        dqogVar7.d = new Supplier() { // from class: bqjk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkl.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bqjl
        };
        bqjq bqjqVar7 = new bqjq(dqprVarM7.a());
        this.g = bqjqVar7;
        this.h = new bqjq[]{bqjqVar, bqjqVar2, bqjqVar3, bqjqVar4, bqjqVar5, bqjqVar6, bqjqVar7};
    }
}
