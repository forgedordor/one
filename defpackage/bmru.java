package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmru {
    public final bmrv a;
    public final bmrv b;
    public final bmrv c;
    public final bmrv d;
    public final bmrv e;
    final bmrv[] f;

    public bmru() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_deleted_messages_buffer._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmso.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmrl
        };
        bmrv bmrvVar = new bmrv(dqprVarM.a());
        this.a = bmrvVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "cms_deleted_messages_buffer.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmso.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmrn
        };
        bmrv bmrvVar2 = new bmrv(dqprVarM2.a());
        this.b = bmrvVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "cms_deleted_messages_buffer.conversation_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmro
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmso.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmrp
        };
        bmrv bmrvVar3 = new bmrv(dqprVarM3.a());
        this.c = bmrvVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.k(true);
        dqogVar4.a = "cms_deleted_messages_buffer.message_deletion_reason";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmso.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmrr
        };
        bmrv bmrvVar4 = new bmrv(dqprVarM4.a());
        this.d = bmrvVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.k(true);
        dqogVar5.a = "cms_deleted_messages_buffer.deletion_timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmso.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmrt
        };
        bmrv bmrvVar5 = new bmrv(dqprVarM5.a());
        this.e = bmrvVar5;
        this.f = new bmrv[]{bmrvVar, bmrvVar2, bmrvVar3, bmrvVar4, bmrvVar5};
    }
}
