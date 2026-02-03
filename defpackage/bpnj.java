package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpnj {
    public final bpnk a;
    public final bpnk b;
    public final bpnk c;
    final bpnk[] d;

    public bpnj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bpnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "gemini_conversation_id_mappings.conversation_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpnc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpoa.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpnd
        };
        bpnk bpnkVar = new bpnk(dqprVarM.a());
        this.a = bpnkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bpne
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar2.a = "gemini_conversation_id_mappings.my_identity_token";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpoa.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpng
        };
        bpnk bpnkVar2 = new bpnk(dqprVarM2.a());
        this.b = bpnkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.l(true);
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqogVar3.a = "gemini_conversation_id_mappings.gemini_conversation_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bpnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpoa.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpni
        };
        bpnk bpnkVar3 = new bpnk(dqprVarM3.a());
        this.c = bpnkVar3;
        this.d = new bpnk[]{bpnkVar, bpnkVar2, bpnkVar3};
    }
}
