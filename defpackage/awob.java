package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awob {
    public final awoc a;
    public final awoc b;
    final awoc[] c;

    public awob() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: awnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return awse.b.a;
            }
        };
        dqogVar.a = "group_members.group_token";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: awnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awoq.a();
            }
        };
        dqogVar.c = new dqps() { // from class: awnx
        };
        awoc awocVar = new awoc(dqprVarM.a());
        this.a = awocVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: awny
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.b.a;
            }
        };
        dqogVar2.a = "group_members.destination_token";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: awnz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awoq.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: awoa
        };
        awoc awocVar2 = new awoc(dqprVarM2.a());
        this.b = awocVar2;
        this.c = new awoc[]{awocVar, awocVar2};
    }
}
