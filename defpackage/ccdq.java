package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdq {
    public final ccdr a;
    public final ccdr b;
    public final ccdr c;
    public final ccdr d;
    public final ccdr e;
    final ccdr[] f;

    public ccdq() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "mls_epoch_records.identity_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: ccdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccen.a();
            }
        };
        dqogVar.c = new dqps() { // from class: ccdh
        };
        ccdr ccdrVar = new ccdr(dqprVarM.a());
        this.a = ccdrVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "mls_epoch_records.group_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: ccdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccen.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: ccdj
        };
        ccdr ccdrVar2 = new ccdr(dqprVarM2.a());
        this.b = ccdrVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.l(true);
        dqprVarM3.k(true);
        dqprVarM3.g(true);
        dqprVarM3.d(true);
        dqogVar3.a = "mls_epoch_records.epoch_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: ccdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccen.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: ccdl
        };
        ccdr ccdrVar3 = new ccdr(dqprVarM3.a());
        this.c = ccdrVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqprVarM4.k(true);
        dqogVar4.a = "mls_epoch_records.epoch_data";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: ccdm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccen.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: ccdn
        };
        ccdr ccdrVar4 = new ccdr(dqprVarM4.a());
        this.d = ccdrVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.k(true);
        dqogVar5.a = "mls_epoch_records.creation_timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: ccdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccen.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: ccdp
        };
        ccdr ccdrVar5 = new ccdr(dqprVarM5.a());
        this.e = ccdrVar5;
        this.f = new ccdr[]{ccdrVar, ccdrVar2, ccdrVar3, ccdrVar4, ccdrVar5};
    }
}
