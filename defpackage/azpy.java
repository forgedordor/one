package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azpy {
    public final azpz a;
    public final azpz b;
    public final azpz c;
    final azpz[] d;

    public azpy() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqogVar.a = "backup_metadata.created_timestamp";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azps
            @Override // java.util.function.Supplier
            public final Object get() {
                return azqo.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azpt
        };
        azpz azpzVar = new azpz(dqprVarM.a());
        this.a = azpzVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "backup_metadata.schema_version";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azpu
            @Override // java.util.function.Supplier
            public final Object get() {
                return azqo.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azpv
        };
        azpz azpzVar2 = new azpz(dqprVarM2.a());
        this.b = azpzVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "backup_metadata.backup_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: azpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return azqo.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: azpx
        };
        azpz azpzVar3 = new azpz(dqprVarM3.a());
        this.c = azpzVar3;
        this.d = new azpz[]{azpzVar, azpzVar2, azpzVar3};
    }
}
