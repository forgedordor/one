package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmuq {
    public final bmur a;
    public final bmur b;
    public final bmur c;
    public final bmur d;
    final bmur[] e;

    public bmuq() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_media_notifications._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmui
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmvh.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmuj
        };
        bmur bmurVar = new bmur(dqprVarM.a());
        this.a = bmurVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "cms_media_notifications.message_cms_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmvh.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmul
        };
        bmur bmurVar2 = new bmur(dqprVarM2.a());
        this.b = bmurVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "cms_media_notifications.blob_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmvh.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmun
        };
        bmur bmurVar3 = new bmur(dqprVarM3.a());
        this.c = bmurVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "cms_media_notifications.blob_type";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmvh.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmup
        };
        bmur bmurVar4 = new bmur(dqprVarM4.a());
        this.d = bmurVar4;
        this.e = new bmur[]{bmurVar, bmurVar2, bmurVar3, bmurVar4};
    }
}
