package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdbc {
    public final cdbd a;
    public final cdbd b;
    public final cdbd c;
    public final cdbd d;
    final cdbd[] e;

    public cdbc() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "external_capabilities.external_application";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cdau
            @Override // java.util.function.Supplier
            public final Object get() {
                return cdbo.a();
            }
        };
        dqogVar.c = new dqps() { // from class: cdav
        };
        cdbd cdbdVar = new cdbd(dqprVarM.a());
        this.a = cdbdVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "external_capabilities.capability_key";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: cdaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cdbo.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: cdax
        };
        cdbd cdbdVar2 = new cdbd(dqprVarM2.a());
        this.b = cdbdVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "external_capabilities.capability_value";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: cday
            @Override // java.util.function.Supplier
            public final Object get() {
                return cdbo.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: cdaz
        };
        cdbd cdbdVar3 = new cdbd(dqprVarM3.a());
        this.c = cdbdVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "external_capabilities.expiry";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: cdba
            @Override // java.util.function.Supplier
            public final Object get() {
                return cdbo.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: cdbb
        };
        cdbd cdbdVar4 = new cdbd(dqprVarM4.a());
        this.d = cdbdVar4;
        this.e = new cdbd[]{cdbdVar, cdbdVar2, cdbdVar3, cdbdVar4};
    }
}
