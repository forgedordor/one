package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpan {
    public final bpao a;
    public final bpao b;
    final bpao[] c;

    public bpan() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.d(true);
        dqogVar.a = "disambiguations.lookup_key";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpbc.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpak
        };
        bpao bpaoVar = new bpao(dqprVarM.a());
        this.a = bpaoVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "disambiguations.normalized_destination";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpbc.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpam
        };
        bpao bpaoVar2 = new bpao(dqprVarM2.a());
        this.b = bpaoVar2;
        this.c = new bpao[]{bpaoVar, bpaoVar2};
    }
}
