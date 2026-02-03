package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpkn {
    public final bpko a;
    public final bpko b;
    public final bpko c;
    final bpko[] d;

    public bpkn() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bpkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "extension_messages.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpkz.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpki
        };
        bpko bpkoVar = new bpko(dqprVarM.a());
        this.a = bpkoVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "extension_messages.extension_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpkz.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpkk
        };
        bpko bpkoVar2 = new bpko(dqprVarM2.a());
        this.b = bpkoVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.k(true);
        dqogVar3.a = "extension_messages.extension_package_name";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bpkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpkz.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpkm
        };
        bpko bpkoVar3 = new bpko(dqprVarM3.a());
        this.c = bpkoVar3;
        this.d = new bpko[]{bpkoVar, bpkoVar2, bpkoVar3};
    }
}
