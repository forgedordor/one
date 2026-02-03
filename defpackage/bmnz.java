package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmnz {
    public final bmoa a;
    public final bmoa b;
    public final bmoa c;
    final bmoa[] d;

    public bmnz() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_blobs_pending_delete._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmop.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmnu
        };
        bmoa bmoaVar = new bmoa(dqprVarM.a());
        this.a = bmoaVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "cms_blobs_pending_delete.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmop.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmnw
        };
        bmoa bmoaVar2 = new bmoa(dqprVarM2.a());
        this.b = bmoaVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "cms_blobs_pending_delete.blob_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmnx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmop.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmny
        };
        bmoa bmoaVar3 = new bmoa(dqprVarM3.a());
        this.c = bmoaVar3;
        this.d = new bmoa[]{bmoaVar, bmoaVar2, bmoaVar3};
    }
}
