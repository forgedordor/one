package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avql {
    public final avqm a;
    public final avqm b;
    public final avqm c;
    public final avqm d;
    final avqm[] e;

    public avql() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_matcher_cache._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: avqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return avrd.a();
            }
        };
        dqogVar.c = new dqps() { // from class: avqd
        };
        avqm avqmVar = new avqm(dqprVarM.a());
        this.a = avqmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "conversation_matcher_cache.matcher_version";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: avqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return avrd.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: avqf
        };
        avqm avqmVar2 = new avqm(dqprVarM2.a());
        this.b = avqmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.k(true);
        dqogVar3.a = "conversation_matcher_cache.destination_key";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: avqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return avrd.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: avqh
        };
        avqm avqmVar3 = new avqm(dqprVarM3.a());
        this.c = avqmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.k(true);
        dqprVarM4.d(true);
        dqprVarM4.e(true);
        dqogVar4.b = new Supplier() { // from class: avqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar4.a = "conversation_matcher_cache.conversation_id";
        dqprVarM4.f(true);
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: avqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return avrd.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: avqk
        };
        avqm avqmVar4 = new avqm(dqprVarM4.a());
        this.d = avqmVar4;
        this.e = new avqm[]{avqmVar, avqmVar2, avqmVar3, avqmVar4};
    }
}
