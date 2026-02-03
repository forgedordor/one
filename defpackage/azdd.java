package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdd {
    public final azde a;
    public final azde b;
    public final azde c;
    public final azde d;
    public final azde e;
    public final azde f;
    final azde[] g;

    public azdd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_reactions_backup._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdx.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azcy
        };
        azde azdeVar = new azde(dqprVarM.a());
        this.a = azdeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: azcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar2.a = "message_reactions_backup.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azda
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdx.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azdb
        };
        azde azdeVar2 = new azde(dqprVarM2.a());
        this.b = azdeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqogVar3.a = "message_reactions_backup.reactions_data";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: azdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdx.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: azcq
        };
        azde azdeVar3 = new azde(dqprVarM3.a());
        this.c = azdeVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.d(true);
        dqprVarM4.e(true);
        dqogVar4.b = new Supplier() { // from class: azcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar4.a = "message_reactions_backup.reacted_message_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: azcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdx.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: azct
        };
        azde azdeVar4 = new azde(dqprVarM4.a());
        this.d = azdeVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "message_reactions_backup.reaction";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: azcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdx.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: azcv
        };
        azde azdeVar5 = new azde(dqprVarM5.a());
        this.e = azdeVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "message_reactions_backup.applied_reaction";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: azcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdx.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: azcx
        };
        azde azdeVar6 = new azde(dqprVarM6.a());
        this.f = azdeVar6;
        this.g = new azde[]{azdeVar, azdeVar2, azdeVar3, azdeVar4, azdeVar5, azdeVar6};
    }
}
