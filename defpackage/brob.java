package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brob {
    public final broc a;
    public final broc b;
    final broc[] c;

    public brob() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: brnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "parent_disallowed_conversations.conversation_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brnx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bros.b();
            }
        };
        dqogVar.c = new dqps() { // from class: brny
        };
        broc brocVar = new broc(dqprVarM.a());
        this.a = brocVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqogVar2.a = "parent_disallowed_conversations.conversation_parent_supervision_state";
        dqprVarM2.i(60790);
        dqogVar2.d = new Supplier() { // from class: brnz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bros.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: broa
        };
        broc brocVar2 = new broc(dqprVarM2.a());
        this.b = brocVar2;
        this.c = new broc[]{brocVar, brocVar2};
    }
}
