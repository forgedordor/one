package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhko {
    public final bhkp a;

    public bhko() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "messages_annotations._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bhkd
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bhkg
        };
        this.a = new bhkp(dqprVarM.a());
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "messages_annotations.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bhkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bhki
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bhkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar3.a = "messages_annotations.message_id";
        dqprVarM3.i(20040);
        dqogVar3.d = new Supplier() { // from class: bhkk
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bhkl
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.d(true);
        dqogVar4.a = "messages_annotations.annotation_type";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bhkm
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bhkn
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 5;
        dqogVar5.a = "messages_annotations.annotation_details";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bhke
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bhkf
        };
        dqprVarM5.a();
    }
}
