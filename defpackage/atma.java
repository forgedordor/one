package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atma {
    public final atmb a;
    public final atmb b;
    public final atmb c;
    public final atmb d;
    public final atmb e;
    public final atmb f;
    public final atmb g;
    public final atmb h;
    final atmb[] i;

    public atma() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "file_processing.processing_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: atlk
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar.c = new dqps() { // from class: atlx
        };
        atmb atmbVar = new atmb(dqprVarM.a());
        this.a = atmbVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "file_processing.file_type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: atly
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: atlz
        };
        atmb atmbVar2 = new atmb(dqprVarM2.a());
        this.b = atmbVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "file_processing.file_uri";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: atll
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: atlm
        };
        atmb atmbVar3 = new atmb(dqprVarM3.a());
        this.c = atmbVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqogVar4.a = "file_processing.content_type";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: atln
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: atlo
        };
        atmb atmbVar4 = new atmb(dqprVarM4.a());
        this.d = atmbVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 5;
        dqogVar5.a = "file_processing.encryption_metadata";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: atlp
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: atlq
        };
        atmb atmbVar5 = new atmb(dqprVarM5.a());
        this.e = atmbVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "file_processing.transfer_handle";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: atlr
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: atls
        };
        atmb atmbVar6 = new atmb(dqprVarM6.a());
        this.f = atmbVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 5;
        dqogVar7.a = "file_processing.upload_result";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: atlt
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: atlu
        };
        atmb atmbVar7 = new atmb(dqprVarM7.a());
        this.g = atmbVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 5;
        dqogVar8.a = "file_processing.mls_file_metadata";
        dqprVarM8.i(60700);
        dqogVar8.d = new Supplier() { // from class: atlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return atmx.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: atlw
        };
        atmb atmbVar8 = new atmb(dqprVarM8.a());
        this.h = atmbVar8;
        this.i = new atmb[]{atmbVar, atmbVar2, atmbVar3, atmbVar4, atmbVar5, atmbVar6, atmbVar7, atmbVar8};
    }
}
