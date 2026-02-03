package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmlm {
    public final bmln a;
    public final bmln b;
    public final bmln c;
    public final bmln d;
    public final bmln e;
    public final bmln f;
    final bmln[] g;

    public bmlm() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "business_conversations_metadata._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmkz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmmf.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bmlg
        };
        bmln bmlnVar = new bmln(dqprVarM.a());
        this.a = bmlnVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bmlh
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "business_conversations_metadata.conversation_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmmf.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmlj
        };
        bmln bmlnVar2 = new bmln(dqprVarM2.a());
        this.b = bmlnVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "business_conversations_metadata.chatbot_directory_conversation_state";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmlk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmmf.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmll
        };
        bmln bmlnVar3 = new bmln(dqprVarM3.a());
        this.c = bmlnVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "business_conversations_metadata.conversation_stop_state";
        dqprVarM4.i(59010);
        dqogVar4.d = new Supplier() { // from class: bmla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmmf.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmlb
        };
        bmln bmlnVar4 = new bmln(dqprVarM4.a());
        this.d = bmlnVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "business_conversations_metadata.conversation_toolstone_state";
        dqprVarM5.i(59050);
        dqogVar5.d = new Supplier() { // from class: bmlc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmmf.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmld
        };
        bmln bmlnVar5 = new bmln(dqprVarM5.a());
        this.e = bmlnVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "business_conversations_metadata.conversation_toolstone_timestamp_ms";
        dqprVarM6.i(59050);
        dqogVar6.d = new Supplier() { // from class: bmle
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmmf.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bmlf
        };
        bmln bmlnVar6 = new bmln(dqprVarM6.a());
        this.f = bmlnVar6;
        this.g = new bmln[]{bmlnVar, bmlnVar2, bmlnVar3, bmlnVar4, bmlnVar5, bmlnVar6};
    }
}
