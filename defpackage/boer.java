package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boer {
    public final boes a;
    public final boes b;
    public final boes c;
    public final boes d;
    public final boes e;
    public final boes f;
    public final boes g;
    public final boes h;
    public final boes i;
    public final boes j;
    final boes[] k;

    public boer() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_suggestions._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bodw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar.c = new dqps() { // from class: body
        };
        boes boesVar = new boes(dqprVarM.a());
        this.a = boesVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: boea
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "conversation_suggestions.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: boeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: boec
        };
        boes boesVar2 = new boes(dqprVarM2.a());
        this.b = boesVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "conversation_suggestions.conversation_suggestion_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: boed
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: boee
        };
        boes boesVar3 = new boes(dqprVarM3.a());
        this.c = boesVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "conversation_suggestions.properties";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: boef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: boeg
        };
        boes boesVar4 = new boes(dqprVarM4.a());
        this.d = boesVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "conversation_suggestions.post_back_data";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: boei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: boeh
        };
        boes boesVar5 = new boes(dqprVarM5.a());
        this.e = boesVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "conversation_suggestions.post_back_encoding";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: boej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: boek
        };
        boes boesVar6 = new boes(dqprVarM6.a());
        this.f = boesVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "conversation_suggestions.rcs_message_id";
        dqprVarM7.i(11001);
        dqogVar7.d = new Supplier() { // from class: boel
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: boem
        };
        boes boesVar7 = new boes(dqprVarM7.a());
        this.g = boesVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqprVarM8.d(true);
        dqogVar8.a = "conversation_suggestions.target_rcs_message_id";
        dqprVarM8.i(12000);
        dqogVar8.d = new Supplier() { // from class: boen
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: boeo
        };
        boes boesVar8 = new boes(dqprVarM8.a());
        this.h = boesVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqogVar9.a = "conversation_suggestions.read";
        dqprVarM9.i(12000);
        dqogVar9.d = new Supplier() { // from class: boep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: boeq
        };
        boes boesVar9 = new boes(dqprVarM9.a());
        this.i = boesVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "conversation_suggestions.received_timestamp";
        dqprVarM10.i(12000);
        dqogVar10.d = new Supplier() { // from class: bodx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bofr.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bodz
        };
        boes boesVar10 = new boes(dqprVarM10.a());
        this.j = boesVar10;
        this.k = new boes[]{boesVar, boesVar2, boesVar3, boesVar4, boesVar5, boesVar6, boesVar7, boesVar8, boesVar9, boesVar10};
    }
}
