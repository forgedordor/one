package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdh {
    public final bqdi a;
    public final bqdi b;
    public final bqdi c;
    public final bqdi d;
    final bqdi[] e;

    public bqdh() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_destinations._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqdw.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqcz
        };
        bqdi bqdiVar = new bqdi(dqprVarM.a());
        this.a = bqdiVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.b.a;
            }
        };
        dqogVar2.a = "message_destinations.message_send_receive_attempt_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqdw.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqdc
        };
        bqdi bqdiVar2 = new bqdi(dqprVarM2.a());
        this.b = bqdiVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "message_destinations.message_destination_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqdw.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqde
        };
        bqdi bqdiVar3 = new bqdi(dqprVarM3.a());
        this.c = bqdiVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.k(true);
        dqogVar4.a = "message_destinations.message_destination_raw";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bqdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqdw.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqdg
        };
        bqdi bqdiVar4 = new bqdi(dqprVarM4.a());
        this.d = bqdiVar4;
        this.e = new bqdi[]{bqdiVar, bqdiVar2, bqdiVar3, bqdiVar4};
    }
}
