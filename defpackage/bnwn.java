package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnwn {
    public final bnwo a;
    public final bnwo b;
    public final bnwo c;
    public final bnwo d;
    public final bnwo e;
    public final bnwo f;
    public final bnwo g;
    public final bnwo h;
    public final bnwo i;
    public final bnwo j;
    public final bnwo k;
    public final bnwo l;
    final bnwo[] m;

    public bnwn() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_labels._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bnvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bnvo
        };
        bnwo bnwoVar = new bnwo(dqprVarM.a());
        this.a = bnwoVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bnvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "conversation_labels.conversation_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bnvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bnvz
        };
        bnwo bnwoVar2 = new bnwo(dqprVarM2.a());
        this.b = bnwoVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bnwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bukt.b.a;
            }
        };
        dqogVar3.a = "conversation_labels.label";
        dqprVarM3.f(true);
        dqprVarM3.i(53020);
        dqogVar3.d = new Supplier() { // from class: bnwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bnwc
        };
        bnwo bnwoVar3 = new bnwo(dqprVarM3.a());
        this.c = bnwoVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.d(true);
        dqprVarM4.e(true);
        dqogVar4.b = new Supplier() { // from class: bnwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar4.a = "conversation_labels.message_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bnwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bnvx
        };
        bnwo bnwoVar4 = new bnwo(dqprVarM4.a());
        this.d = bnwoVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "conversation_labels.snippet_text";
        dqprVarM5.i(53010);
        dqogVar5.d = new Supplier() { // from class: bnwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bnwg
        };
        bnwo bnwoVar5 = new bnwo(dqprVarM5.a());
        this.e = bnwoVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "conversation_labels.preview_uri";
        dqprVarM6.i(55040);
        dqogVar6.d = new Supplier() { // from class: bnwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bnwi
        };
        bnwo bnwoVar6 = new bnwo(dqprVarM6.a());
        this.f = bnwoVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "conversation_labels.preview_content_type";
        dqprVarM7.i(55040);
        dqogVar7.d = new Supplier() { // from class: bnwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bnwk
        };
        bnwo bnwoVar7 = new bnwo(dqprVarM7.a());
        this.g = bnwoVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqogVar8.a = "conversation_labels.message_status";
        dqprVarM8.i(57050);
        dqogVar8.d = new Supplier() { // from class: bnwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bnwm
        };
        bnwo bnwoVar8 = new bnwo(dqprVarM8.a());
        this.h = bnwoVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqogVar9.a = "conversation_labels.read";
        dqprVarM9.i(57050);
        dqogVar9.d = new Supplier() { // from class: bnvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bnvp
        };
        bnwo bnwoVar9 = new bnwo(dqprVarM9.a());
        this.i = bnwoVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 2;
        dqogVar10.a = "conversation_labels.received_timestamp";
        dqprVarM10.i(57050);
        dqogVar10.d = new Supplier() { // from class: bnvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bnvr
        };
        bnwo bnwoVar10 = new bnwo(dqprVarM10.a());
        this.j = bnwoVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 2;
        dqogVar11.a = "conversation_labels.message_protocol";
        dqprVarM11.i(57050);
        dqogVar11.d = new Supplier() { // from class: bnvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bnvt
        };
        bnwo bnwoVar11 = new bnwo(dqprVarM11.a());
        this.k = bnwoVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 2;
        dqogVar12.a = "conversation_labels.raw_telephony_status";
        dqprVarM12.i(57050);
        dqogVar12.d = new Supplier() { // from class: bnvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnxi.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bnvv
        };
        bnwo bnwoVar12 = new bnwo(dqprVarM12.a());
        this.l = bnwoVar12;
        this.m = new bnwo[]{bnwoVar, bnwoVar2, bnwoVar3, bnwoVar4, bnwoVar5, bnwoVar6, bnwoVar7, bnwoVar8, bnwoVar9, bnwoVar10, bnwoVar11, bnwoVar12};
    }
}
