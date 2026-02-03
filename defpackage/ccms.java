package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccms {
    public final ccmt a;
    public final ccmt b;
    public final ccmt c;
    final ccmt[] d;

    public ccms() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "mls_zinnia_states.identity_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: ccmm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccni.a();
            }
        };
        dqogVar.c = new dqps() { // from class: ccmn
        };
        ccmt ccmtVar = new ccmt(dqprVarM.a());
        this.a = ccmtVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "mls_zinnia_states.group_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: ccmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccni.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: ccmp
        };
        ccmt ccmtVar2 = new ccmt(dqprVarM2.a());
        this.b = ccmtVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqprVarM3.k(true);
        dqogVar3.a = "mls_zinnia_states.zinnia_state";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: ccmq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccni.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: ccmr
        };
        ccmt ccmtVar3 = new ccmt(dqprVarM3.a());
        this.c = ccmtVar3;
        this.d = new ccmt[]{ccmtVar, ccmtVar2, ccmtVar3};
    }
}
