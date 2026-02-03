package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmim {
    public final bmin a;
    public final bmin b;
    public final bmin c;
    final bmin[] d;

    public bmim() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "add_contact_banner._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmif
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmjd.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmig
        };
        bmin bminVar = new bmin(dqprVarM.a());
        this.a = bminVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bmih
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "add_contact_banner.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmii
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmjd.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmij
        };
        bmin bminVar2 = new bmin(dqprVarM2.a());
        this.b = bminVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "add_contact_banner.banner_status";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmjd.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmil
        };
        bmin bminVar3 = new bmin(dqprVarM3.a());
        this.c = bminVar3;
        this.d = new bmin[]{bminVar, bminVar2, bminVar3};
    }
}
