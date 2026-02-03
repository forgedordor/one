package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzc {
    public final bpzd a;
    public final bpzd b;
    public final bpzd c;
    public final bpzd d;
    public final bpzd e;
    final bpzd[] f;

    public bpzc() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "messages_annotations._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpzx.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bpyu
        };
        bpzd bpzdVar = new bpzd(dqprVarM.a());
        this.a = bpzdVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "messages_annotations.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpzx.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpyw
        };
        bpzd bpzdVar2 = new bpzd(dqprVarM2.a());
        this.b = bpzdVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bpyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar3.a = "messages_annotations.message_id";
        dqprVarM3.i(20040);
        dqogVar3.d = new Supplier() { // from class: bpyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpzx.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpyz
        };
        bpzd bpzdVar3 = new bpzd(dqprVarM3.a());
        this.c = bpzdVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.d(true);
        dqogVar4.a = "messages_annotations.annotation_type";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bpza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpzx.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bpzb
        };
        bpzd bpzdVar4 = new bpzd(dqprVarM4.a());
        this.d = bpzdVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 5;
        dqogVar5.a = "messages_annotations.annotation_details";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bpys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpzx.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bpyt
        };
        bpzd bpzdVar5 = new bpzd(dqprVarM5.a());
        this.e = bpzdVar5;
        this.f = new bpzd[]{bpzdVar, bpzdVar2, bpzdVar3, bpzdVar4, bpzdVar5};
    }
}
