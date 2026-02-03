package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btny {
    public final btnz a;
    public final btnz b;
    final btnz[] c;

    public btny() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "remote_user_id_to_registration_id.remote_user_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bton.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btnu
        };
        btnz btnzVar = new btnz(dqprVarM.a());
        this.a = btnzVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: btnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b.a;
            }
        };
        dqogVar2.a = "remote_user_id_to_registration_id.tachyon_registration_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bton.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btnx
        };
        btnz btnzVar2 = new btnz(dqprVarM2.a());
        this.b = btnzVar2;
        this.c = new btnz[]{btnzVar, btnzVar2};
    }
}
