package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxt {
    public final bpxu a;
    final bpxu[] b;

    public bpxt() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "linked_account.account_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpyh.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpxs
        };
        bpxu bpxuVar = new bpxu(dqprVarM.a());
        this.a = bpxuVar;
        this.b = new bpxu[]{bpxuVar};
    }
}
