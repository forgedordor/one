package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axay {
    public static final String[] a = {"my_identities.token", "my_identities.canonical_token", "my_identities.provisioning_id_v2", "my_identities.is_verified_v2", "my_identities.address_type", "my_identities.phone_number", "my_identities.display_name", "group_concat(quote(subscriptions.sub_id), '|')", "group_concat(quote(subscriptions.sim_serial_number), '|')", "group_concat(quote(subscriptions.rowid), '|') AS subscriptions__ROWID"};

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("my_identities.canonical_token", 60530);
        ekgiVar.i("my_identities.provisioning_id_v2", 60810);
        ekgiVar.i("my_identities.is_verified_v2", 60810);
        ekgiVar.i("my_identities.address_type", 59980);
        ekgiVar.i("my_identities.display_name", 60120);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("canonical_token", "index_null_canonical_token");
        ekgiVar2.c();
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "my_identities.token";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: awzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar.c = new dqps() { // from class: awzt
        };
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: axad
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar2.a = "my_identities.canonical_token";
        dqprVarM2.i(60530);
        dqogVar2.d = new Supplier() { // from class: axae
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: axaf
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "my_identities.provisioning_id_v2";
        dqprVarM3.i(60810);
        dqogVar3.d = new Supplier() { // from class: axag
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: axah
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.k(true);
        dqogVar4.a = "my_identities.is_verified_v2";
        dqprVarM4.i(60810);
        dqogVar4.d = new Supplier() { // from class: axai
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: axaj
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "my_identities.address_type";
        dqprVarM5.i(59980);
        dqogVar5.d = new Supplier() { // from class: axak
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: axac
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "my_identities.phone_number";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: axal
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: axam
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "my_identities.display_name";
        dqprVarM7.i(60120);
        dqogVar7.d = new Supplier() { // from class: axan
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: axao
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqprVarM8.l(true);
        dqprVarM8.g(true);
        dqprVarM8.d(true);
        dqogVar8.a = "subscriptions.sub_id";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: axap
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: axaq
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqprVarM9.l(true);
        dqprVarM9.g(true);
        dqprVarM9.d(true);
        dqogVar9.a = "subscriptions.sim_serial_number";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: axar
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: axas
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 8;
        dqogVar10.a = "subscriptions__ROWID";
        dqprVarM10.i(0);
        dqogVar10.d = new Supplier() { // from class: awzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: awzu
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 4;
        dqogVar11.a = "subscriptions.telephony_phone_number";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: awzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: awzw
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqprVarM12.d(true);
        dqogVar12.a = "subscriptions.my_identity_token";
        dqprVarM12.i(59450);
        dqogVar12.d = new Supplier() { // from class: awzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: awzy
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqprVarM13.d(true);
        dqprVarM13.e(true);
        dqogVar13.b = new Supplier() { // from class: awzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar13.a = "subscriptions.my_identity_token_with_foreign_key";
        dqprVarM13.i(60160);
        dqogVar13.d = new Supplier() { // from class: axaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return axay.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: axab
        };
        dqprVarM13.a();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static Integer b() {
        return Integer.valueOf(a().M().a());
    }
}
