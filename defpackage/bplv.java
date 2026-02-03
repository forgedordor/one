package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bplv {
    public final bplw a;
    public final bplw b;
    public final bplw c;
    public final bplw d;
    public final bplw e;
    public final bplw f;
    final bplw[] g;

    public bplv() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "flagged_messages._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpmq.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bplp
        };
        bplw bplwVar = new bplw(dqprVarM.a());
        this.a = bplwVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bplq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "flagged_messages.flagged_message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bplr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpmq.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpls
        };
        bplw bplwVar2 = new bplw(dqprVarM2.a());
        this.b = bplwVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "flagged_messages.flagging_reason";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bplt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpmq.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bplu
        };
        bplw bplwVar3 = new bplw(dqprVarM3.a());
        this.c = bplwVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "flagged_messages.flagged_message_timestamp";
        dqprVarM4.i(39030);
        dqogVar4.d = new Supplier() { // from class: bplj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpmq.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bplk
        };
        bplw bplwVar4 = new bplw(dqprVarM4.a());
        this.d = bplwVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "flagged_messages.flagged_message_notified";
        dqprVarM5.i(46030);
        dqogVar5.d = new Supplier() { // from class: bpll
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpmq.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bplm
        };
        bplw bplwVar5 = new bplw(dqprVarM5.a());
        this.e = bplwVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqogVar6.a = "flagged_messages.flagged_message_delay";
        dqprVarM6.i(60710);
        dqogVar6.d = new Supplier() { // from class: bpln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpmq.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bplo
        };
        bplw bplwVar6 = new bplw(dqprVarM6.a());
        this.f = bplwVar6;
        this.g = new bplw[]{bplwVar, bplwVar2, bplwVar3, bplwVar4, bplwVar5, bplwVar6};
    }
}
