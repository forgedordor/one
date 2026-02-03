package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buyd {
    public final buye a;
    public final buye b;
    public final buye c;
    public final buye d;
    final buye[] e;

    public buyd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "user_references._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return buyx.b();
            }
        };
        dqogVar.c = new dqps() { // from class: buxu
        };
        buye buyeVar = new buye(dqprVarM.a());
        this.a = buyeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: buxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "user_references.message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: buxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return buyx.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: buxx
        };
        buye buyeVar2 = new buye(dqprVarM2.a());
        this.b = buyeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: buxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "user_references.user_ref_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: buxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return buyx.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: buya
        };
        buye buyeVar3 = new buye(dqprVarM3.a());
        this.c = buyeVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "user_references.user_ref_datetime";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: buyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return buyx.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: buyc
        };
        buye buyeVar4 = new buye(dqprVarM4.a());
        this.d = buyeVar4;
        this.e = new buye[]{buyeVar, buyeVar2, buyeVar3, buyeVar4};
    }
}
