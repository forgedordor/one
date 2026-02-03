package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqhv {
    public final bqhw a;
    public final bqhw b;
    final bqhw[] c;

    public bqhv() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bqhq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "message_photos_sharing.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqik.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqhs
        };
        bqhw bqhwVar = new bqhw(dqprVarM.a());
        this.a = bqhwVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 5;
        dqprVarM2.k(true);
        dqogVar2.a = "message_photos_sharing.sharing_state";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqht
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqik.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqhu
        };
        bqhw bqhwVar2 = new bqhw(dqprVarM2.a());
        this.b = bqhwVar2;
        this.c = new bqhw[]{bqhwVar, bqhwVar2};
    }
}
