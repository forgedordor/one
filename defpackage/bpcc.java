package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpcc {
    public final bpcd a;
    public final bpcd b;
    public final bpcd c;
    public final bpcd d;
    public final bpcd e;
    public final bpcd f;
    public final bpcd g;
    final bpcd[] h;

    public bpcc() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bpbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "drafts.conversation_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bpbz
        };
        bpcd bpcdVar = new bpcd(dqprVarM.a());
        this.a = bpcdVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "drafts.text";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpca
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpcb
        };
        bpcd bpcdVar2 = new bpcd(dqprVarM2.a());
        this.b = bpcdVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqogVar3.a = "drafts.attachments";
        dqprVarM3.i(59420);
        dqogVar3.d = new Supplier() { // from class: bpbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpbp
        };
        bpcd bpcdVar3 = new bpcd(dqprVarM3.a());
        this.c = bpcdVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "drafts.subject";
        dqprVarM4.i(59170);
        dqogVar4.d = new Supplier() { // from class: bpbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bpbr
        };
        bpcd bpcdVar4 = new bpcd(dqprVarM4.a());
        this.d = bpcdVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqprVarM5.k(true);
        dqogVar5.a = "drafts.is_urgent";
        dqprVarM5.i(59170);
        dqogVar5.d = new Supplier() { // from class: bpbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bpbt
        };
        bpcd bpcdVar5 = new bpcd(dqprVarM5.a());
        this.e = bpcdVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "drafts.replied_to_message_id";
        dqprVarM6.i(59540);
        dqogVar6.d = new Supplier() { // from class: bpbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bpbv
        };
        bpcd bpcdVar6 = new bpcd(dqprVarM6.a());
        this.f = bpcdVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqprVarM7.k(true);
        dqogVar7.a = "drafts.is_encrypted";
        dqprVarM7.i(59720);
        dqogVar7.d = new Supplier() { // from class: bpbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpcy.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bpbx
        };
        bpcd bpcdVar7 = new bpcd(dqprVarM7.a());
        this.g = bpcdVar7;
        this.h = new bpcd[]{bpcdVar, bpcdVar2, bpcdVar3, bpcdVar4, bpcdVar5, bpcdVar6, bpcdVar7};
    }
}
