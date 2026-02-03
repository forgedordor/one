package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqti {
    public final bqtj a;
    public final bqtj b;
    public final bqtj c;
    public final bqtj d;
    public final bqtj e;
    public final bqtj f;
    final bqtj[] g;

    public bqti() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_status._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqub.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqtb
        };
        bqtj bqtjVar = new bqtj(dqprVarM.a());
        this.a = bqtjVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "message_status.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqub.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqtd
        };
        bqtj bqtjVar2 = new bqtj(dqprVarM2.a());
        this.b = bqtjVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "message_status.timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqte
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqub.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqtf
        };
        bqtj bqtjVar3 = new bqtj(dqprVarM3.a());
        this.c = bqtjVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "message_status.status";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bqtg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqub.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqth
        };
        bqtj bqtjVar4 = new bqtj(dqprVarM4.a());
        this.d = bqtjVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "message_status.custom_status";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bqsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqub.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqsy
        };
        bqtj bqtjVar5 = new bqtj(dqprVarM5.a());
        this.e = bqtjVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "message_status.data";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bqsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqub.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bqta
        };
        bqtj bqtjVar6 = new bqtj(dqprVarM6.a());
        this.f = bqtjVar6;
        this.g = new bqtj[]{bqtjVar, bqtjVar2, bqtjVar3, bqtjVar4, bqtjVar5, bqtjVar6};
    }
}
