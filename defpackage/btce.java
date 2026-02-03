package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btce {
    public final btcf a;
    public final btcf b;
    final btcf[] c;

    public btce() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "received_message_phone_numbers.rcs_message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btca
            @Override // java.util.function.Supplier
            public final Object get() {
                return btcp.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btcb
        };
        btcf btcfVar = new btcf(dqprVarM.a());
        this.a = btcfVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "received_message_phone_numbers.self_msisdn";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btcp.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btcd
        };
        btcf btcfVar2 = new btcf(dqprVarM2.a());
        this.b = btcfVar2;
        this.c = new btcf[]{btcfVar, btcfVar2};
    }
}
