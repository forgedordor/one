package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmhc {
    public final bmhd a;
    public final bmhd b;
    public final bmhd c;
    public final bmhd d;
    public final bmhd e;
    final bmhd[] f;

    public bmhc() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bmgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar.a = "a2p_conversation_subscriptions.participant_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmhw.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bmgv
        };
        bmhd bmhdVar = new bmhd(dqprVarM.a());
        this.a = bmhdVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqogVar2.a = "a2p_conversation_subscriptions.conversation_toolstone_state";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmhw.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmgx
        };
        bmhd bmhdVar2 = new bmhd(dqprVarM2.a());
        this.b = bmhdVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "a2p_conversation_subscriptions.conversation_toolstone_last_dismiss_timestamp";
        dqprVarM3.i(61030);
        dqogVar3.d = new Supplier() { // from class: bmgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmhw.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmgz
        };
        bmhd bmhdVar3 = new bmhd(dqprVarM3.a());
        this.c = bmhdVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "a2p_conversation_subscriptions.conversation_subscription_state";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmha
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmhw.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmhb
        };
        bmhd bmhdVar4 = new bmhd(dqprVarM4.a());
        this.d = bmhdVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "a2p_conversation_subscriptions.last_action_timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmgs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmhw.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmgt
        };
        bmhd bmhdVar5 = new bmhd(dqprVarM5.a());
        this.e = bmhdVar5;
        this.f = new bmhd[]{bmhdVar, bmhdVar2, bmhdVar3, bmhdVar4, bmhdVar5};
    }
}
