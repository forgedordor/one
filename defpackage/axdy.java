package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axdy {
    public final axdz a;
    public final axdz b;
    public final axdz c;
    public final axdz d;
    public final axdz e;
    final axdz[] f;

    public axdy() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "subscriptions.sub_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: axdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.b();
            }
        };
        dqogVar.c = new dqps() { // from class: axdq
        };
        axdz axdzVar = new axdz(dqprVarM.a());
        this.a = axdzVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "subscriptions.sim_serial_number";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: axdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: axds
        };
        axdz axdzVar2 = new axdz(dqprVarM2.a());
        this.b = axdzVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "subscriptions.telephony_phone_number";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: axdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: axdu
        };
        axdz axdzVar3 = new axdz(dqprVarM3.a());
        this.c = axdzVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.d(true);
        dqogVar4.a = "subscriptions.my_identity_token";
        dqprVarM4.i(59450);
        dqogVar4.d = new Supplier() { // from class: axdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: axdw
        };
        axdz axdzVar4 = new axdz(dqprVarM4.a());
        this.d = axdzVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqprVarM5.d(true);
        dqprVarM5.e(true);
        dqogVar5.b = new Supplier() { // from class: axdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar5.a = "subscriptions.my_identity_token_with_foreign_key";
        dqprVarM5.i(60160);
        dqogVar5.d = new Supplier() { // from class: axdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: axdp
        };
        axdz axdzVar5 = new axdz(dqprVarM5.a());
        this.e = axdzVar5;
        this.f = new axdz[]{axdzVar, axdzVar2, axdzVar3, axdzVar4, axdzVar5};
    }
}
