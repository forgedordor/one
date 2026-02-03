package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buzf {
    public final buzg a;
    final buzg[] b;

    public buzf() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "verified_sms_blacklisted_senders.sender_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return buzp.a();
            }
        };
        dqogVar.c = new dqps() { // from class: buze
        };
        buzg buzgVar = new buzg(dqprVarM.a());
        this.a = buzgVar;
        this.b = new buzg[]{buzgVar};
    }
}
