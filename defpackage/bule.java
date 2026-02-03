package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bule {
    public final bulf a;
    public final bulf b;
    final bulf[] c;

    public bule() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "trigger_flags._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bula
            @Override // java.util.function.Supplier
            public final Object get() {
                return bulp.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bulb
        };
        bulf bulfVar = new bulf(dqprVarM.a());
        this.a = bulfVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "trigger_flags.enabled";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bulc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bulp.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buld
        };
        bulf bulfVar2 = new bulf(dqprVarM2.a());
        this.b = bulfVar2;
        this.c = new bulf[]{bulfVar, bulfVar2};
    }
}
