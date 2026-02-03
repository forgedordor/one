package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsnh {
    public final bsni a;
    public final bsni b;
    final bsni[] c;

    public bsnh() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "phone_number_min_match_guesser.guesser_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bsnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsnw.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bsne
        };
        bsni bsniVar = new bsni(dqprVarM.a());
        this.a = bsniVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "phone_number_min_match_guesser.test_phone_number";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bsnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsnw.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bsng
        };
        bsni bsniVar2 = new bsni(dqprVarM2.a());
        this.b = bsniVar2;
        this.c = new bsni[]{bsniVar, bsniVar2};
    }
}
