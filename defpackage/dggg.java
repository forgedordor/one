package defpackage;

import android.content.Context;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggg implements dgga, dggj, dggb, dgfz {
    public static final Predicate a = new Predicate() { // from class: dggf
        public final /* synthetic */ Predicate and(Predicate predicate) {
            return Predicate$CC.$default$and(this, predicate);
        }

        @Override // java.util.function.Predicate
        /* renamed from: negate */
        public final /* synthetic */ Predicate mo538negate() {
            return Predicate$CC.$default$negate(this);
        }

        public final /* synthetic */ Predicate or(Predicate predicate) {
            return Predicate$CC.$default$or(this, predicate);
        }

        @Override // java.util.function.Predicate
        public final boolean test(Object obj) {
            Predicate predicate = dggg.a;
            int iOrdinal = ((ewhx) obj).ordinal();
            return iOrdinal == 2 || iOrdinal == 3;
        }
    };
    static final dfny b = dfod.a(202898879);
    private final Context c;
    private final deyw d;

    public dggg(Context context, deyw deywVar) {
        this.c = context;
        this.d = deywVar;
    }

    private static ewih k(int i) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewhe ewheVar = (ewhe) ewhg.a.createBuilder();
        ewheVar.copyOnWrite();
        ewhg ewhgVar = (ewhg) ewheVar.instance;
        ewhgVar.c = i - 1;
        ewhgVar.b |= 1;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewhg ewhgVar2 = (ewhg) ewheVar.build();
        ewhgVar2.getClass();
        ewhiVar.c = ewhgVar2;
        ewhiVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        return (ewih) ewigVar.build();
    }

    @Override // defpackage.dgga
    public final void a() {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewgl ewglVar = (ewgl) ewgn.a.createBuilder();
        ewglVar.copyOnWrite();
        ewgn ewgnVar = (ewgn) ewglVar.instance;
        ewgnVar.b |= 8;
        ewgnVar.f = false;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewgn ewgnVar2 = (ewgn) ewglVar.build();
        ewgnVar2.getClass();
        ewhiVar.d = ewgnVar2;
        ewhiVar.b |= 4;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        h((ewih) ewigVar.build());
    }

    @Override // defpackage.dgga
    public final void b(int i, boolean z, boolean z2) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewgl ewglVar = (ewgl) ewgn.a.createBuilder();
        ewglVar.copyOnWrite();
        ewgn ewgnVar = (ewgn) ewglVar.instance;
        ewgnVar.c = i - 1;
        ewgnVar.b |= 1;
        ewglVar.copyOnWrite();
        ewgn ewgnVar2 = (ewgn) ewglVar.instance;
        ewgnVar2.b = 2 | ewgnVar2.b;
        ewgnVar2.d = z;
        ewglVar.copyOnWrite();
        ewgn ewgnVar3 = (ewgn) ewglVar.instance;
        ewgnVar3.b |= 4;
        ewgnVar3.e = z2;
        ewglVar.copyOnWrite();
        ewgn ewgnVar4 = (ewgn) ewglVar.instance;
        ewgnVar4.b |= 8;
        ewgnVar4.f = true;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewgn ewgnVar5 = (ewgn) ewglVar.build();
        ewgnVar5.getClass();
        ewhiVar.d = ewgnVar5;
        ewhiVar.b |= 4;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        h((ewih) ewigVar.build());
    }

    @Override // defpackage.dggb
    public final void c(int i) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewhe ewheVar = (ewhe) ewhg.a.createBuilder();
        ewheVar.copyOnWrite();
        ewhg ewhgVar = (ewhg) ewheVar.instance;
        ewhgVar.c = 4;
        ewhgVar.b |= 1;
        ewheVar.copyOnWrite();
        ewhg ewhgVar2 = (ewhg) ewheVar.instance;
        ewhgVar2.b |= 2;
        ewhgVar2.d = i;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewhg ewhgVar3 = (ewhg) ewheVar.build();
        ewhgVar3.getClass();
        ewhiVar.c = ewhgVar3;
        ewhiVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        h((ewih) ewigVar.build());
    }

    @Override // defpackage.dggb
    public final void d() {
        h(k(4));
    }

    @Override // defpackage.dggb
    public final void e(boolean z) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewhe ewheVar = (ewhe) ewhg.a.createBuilder();
        ewheVar.copyOnWrite();
        ewhg ewhgVar = (ewhg) ewheVar.instance;
        ewhgVar.c = 1;
        ewhgVar.b = 1 | ewhgVar.b;
        ewheVar.copyOnWrite();
        ewhg ewhgVar2 = (ewhg) ewheVar.instance;
        ewhgVar2.b |= 4;
        ewhgVar2.e = z;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewhg ewhgVar3 = (ewhg) ewheVar.build();
        ewhgVar3.getClass();
        ewhiVar.c = ewhgVar3;
        ewhiVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        h((ewih) ewigVar.build());
    }

    @Override // defpackage.dggb
    public final void f() {
        h(k(3));
    }

    @Override // defpackage.dggb
    public final void g() {
        h(k(6));
    }

    public final void h(ewih ewihVar) {
        if (((Boolean) b.a()).booleanValue()) {
            this.d.h(this.c, ewihVar);
        }
    }

    @Override // defpackage.dggj
    public final void i(ewjo ewjoVar, ewjm ewjmVar, ewjk ewjkVar, int i) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 3;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewji ewjiVar = (ewji) ewjp.a.createBuilder();
        ewjiVar.copyOnWrite();
        ewjp ewjpVar = (ewjp) ewjiVar.instance;
        ewjpVar.c = ewjoVar.d;
        ewjpVar.b |= 1;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar2 = (ewjp) ewjiVar.instance;
        ewjpVar2.b |= 16;
        ewjpVar2.g = i;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar3 = (ewjp) ewjiVar.instance;
        ewjpVar3.b |= 2;
        ewjpVar3.d = false;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar4 = (ewjp) ewjiVar.instance;
        ewjpVar4.e = ewjkVar.j;
        ewjpVar4.b |= 4;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar5 = (ewjp) ewjiVar.instance;
        ewjpVar5.h = ewjmVar.l;
        ewjpVar5.b |= 32;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewjp ewjpVar6 = (ewjp) ewjiVar.build();
        ewjpVar6.getClass();
        ewhiVar.e = ewjpVar6;
        ewhiVar.b |= 8;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        h((ewih) ewigVar.build());
    }

    @Override // defpackage.dggj
    public final void j(ewjo ewjoVar, ewjm ewjmVar, ewjk ewjkVar, String str, int i) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 3;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 3;
        ewihVar2.b |= 4;
        ewhh ewhhVar = (ewhh) ewhi.a.createBuilder();
        ewji ewjiVar = (ewji) ewjp.a.createBuilder();
        ewjiVar.copyOnWrite();
        ewjp ewjpVar = (ewjp) ewjiVar.instance;
        ewjpVar.c = ewjoVar.d;
        ewjpVar.b |= 1;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar2 = (ewjp) ewjiVar.instance;
        ewjpVar2.b |= 16;
        ewjpVar2.g = i;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar3 = (ewjp) ewjiVar.instance;
        ewjpVar3.b |= 2;
        ewjpVar3.d = false;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar4 = (ewjp) ewjiVar.instance;
        ewjpVar4.e = ewjkVar.j;
        ewjpVar4.b |= 4;
        ewjiVar.copyOnWrite();
        ewjp ewjpVar5 = (ewjp) ewjiVar.instance;
        ewjpVar5.b |= 64;
        ewjpVar5.i = ejwk.b(str);
        ewjiVar.copyOnWrite();
        ewjp ewjpVar6 = (ewjp) ewjiVar.instance;
        ewjpVar6.h = ewjmVar.l;
        ewjpVar6.b |= 32;
        ewhhVar.copyOnWrite();
        ewhi ewhiVar = (ewhi) ewhhVar.instance;
        ewjp ewjpVar7 = (ewjp) ewjiVar.build();
        ewjpVar7.getClass();
        ewhiVar.e = ewjpVar7;
        ewhiVar.b |= 8;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewhi ewhiVar2 = (ewhi) ewhhVar.build();
        ewhiVar2.getClass();
        ewihVar3.d = ewhiVar2;
        ewihVar3.c = 9;
        h((ewih) ewigVar.build());
    }
}
