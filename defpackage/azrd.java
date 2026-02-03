package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azrd {
    public final azre a;
    public final azre b;
    public final azre c;
    public final azre d;
    final azre[] e;

    public azrd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "my_identities_backup.token";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return azru.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azqw
        };
        azre azreVar = new azre(dqprVarM.a());
        this.a = azreVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "my_identities_backup.address_type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return azru.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azqy
        };
        azre azreVar2 = new azre(dqprVarM2.a());
        this.b = azreVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "my_identities_backup.phone_number";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: azqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azru.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: azra
        };
        azre azreVar3 = new azre(dqprVarM3.a());
        this.c = azreVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "my_identities_backup.display_name";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: azrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return azru.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: azrc
        };
        azre azreVar4 = new azre(dqprVarM4.a());
        this.d = azreVar4;
        this.e = new azre[]{azreVar, azreVar2, azreVar3, azreVar4};
    }
}
