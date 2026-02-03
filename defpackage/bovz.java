package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bovz {
    public final bowa a;
    public final bowa b;
    public final bowa c;
    final bowa[] d;

    public bovz() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "data_usage._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bovt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bowl.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bovu
        };
        bowa bowaVar = new bowa(dqprVarM.a());
        this.a = bowaVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "data_usage.phone_number";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bovv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bowl.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bovw
        };
        bowa bowaVar2 = new bowa(dqprVarM2.a());
        this.b = bowaVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "data_usage.data_size";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bovx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bowl.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bovy
        };
        bowa bowaVar3 = new bowa(dqprVarM3.a());
        this.c = bowaVar3;
        this.d = new bowa[]{bowaVar, bowaVar2, bowaVar3};
    }
}
