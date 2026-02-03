package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class colf {
    public final colg a;
    public final colg b;
    public final colg c;
    public final colg d;
    public final colg e;
    public final colg f;
    public final colg g;
    public final colg h;
    final colg[] i;

    public colf() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: coko
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "file_transfer.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cold
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar.c = new dqps() { // from class: cole
        };
        colg colgVar = new colg(dqprVarM.a());
        this.a = colgVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "file_transfer.transfer_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: cokp
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar2.c = new dqps() { // from class: cokq
        };
        colg colgVar2 = new colg(dqprVarM2.a());
        this.b = colgVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "file_transfer.transfer_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: cokr
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar3.c = new dqps() { // from class: coks
        };
        colg colgVar3 = new colg(dqprVarM3.a());
        this.c = colgVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqogVar4.a = "file_transfer.attachment_upload_response";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: cokt
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar4.c = new dqps() { // from class: coku
        };
        colg colgVar4 = new colg(dqprVarM4.a());
        this.d = colgVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 5;
        dqogVar5.a = "file_transfer.file_information";
        dqprVarM5.i(55030);
        dqogVar5.d = new Supplier() { // from class: cokv
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar5.c = new dqps() { // from class: cokw
        };
        colg colgVar5 = new colg(dqprVarM5.a());
        this.e = colgVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "file_transfer.thumbnail_information";
        dqprVarM6.i(59910);
        dqogVar6.d = new Supplier() { // from class: cokx
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar6.c = new dqps() { // from class: coky
        };
        colg colgVar6 = new colg(dqprVarM6.a());
        this.f = colgVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "file_transfer.transfer_handle";
        dqprVarM7.i(55030);
        dqogVar7.d = new Supplier() { // from class: cokz
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar7.c = new dqps() { // from class: cola
        };
        colg colgVar7 = new colg(dqprVarM7.a());
        this.g = colgVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 5;
        dqogVar8.a = "file_transfer.opaque_data";
        dqprVarM8.i(56040);
        dqogVar8.d = new Supplier() { // from class: colb
            @Override // java.util.function.Supplier
            public final Object get() {
                return comb.c();
            }
        };
        dqogVar8.c = new dqps() { // from class: colc
        };
        colg colgVar8 = new colg(dqprVarM8.a());
        this.h = colgVar8;
        this.i = new colg[]{colgVar, colgVar2, colgVar3, colgVar4, colgVar5, colgVar6, colgVar7, colgVar8};
    }
}
