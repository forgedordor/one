package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvbj {
    public final bvbk a;
    public final bvbk b;
    final bvbk[] c;

    public bvbj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "verified_sms_senders.sender_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bvbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvbu.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bvbg
        };
        bvbk bvbkVar = new bvbk(dqprVarM.a());
        this.a = bvbkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "verified_sms_senders.brand_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bvbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvbu.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bvbi
        };
        bvbk bvbkVar2 = new bvbk(dqprVarM2.a());
        this.b = bvbkVar2;
        this.c = new bvbk[]{bvbkVar, bvbkVar2};
    }
}
