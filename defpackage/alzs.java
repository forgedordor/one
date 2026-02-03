package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzs implements andp {
    public final BugleConversationId a;
    public final alza b;
    public final amfr c;
    private final boolean e;
    public final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries");
    private final alzm f = new alzm();

    public alzs(BugleConversationId bugleConversationId, alza alzaVar, boolean z) {
        this.a = bugleConversationId;
        this.b = alzaVar;
        this.e = z;
        this.c = new amfr(z);
    }

    private final dqxe e(brdp brdpVar) {
        return this.e ? new dqxl("SELECT cpt FROM $V", new Object[]{brdpVar}) : brdpVar;
    }

    private final brdp f(brdr brdrVar) {
        return this.c.a(brdrVar).b();
    }

    private final brdp g(final alzi alziVar) {
        brdp brdpVarH = h();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("countItemsBeforeKeyQuery");
        brdrVarD.v();
        brdrVarD.n(new dqxm("COUNT(*)"), "cpt");
        brdrVarD.h(new Function() { // from class: alzj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, this.a.a);
                amfr.d(brecVar, alziVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdp brdpVarF = f(brdrVarD);
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("+countItemsBeforeKeyAndTotalQuery");
        brdrVarD2.v();
        brdrVarD2.n(e(brdpVarH), "total");
        brdrVarD2.n(e(brdpVarF), "subtotal");
        brdrVarD2.y(1);
        return brdrVarD2.b();
    }

    private final brdp h() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("totalCountQuery");
        brdrVarD.v();
        brdrVarD.n(new dqxm("COUNT(*)"), "cpt");
        brdrVarD.h(new Function() { // from class: alzl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.getClass();
                amfr.b(brecVar, this.a.a);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return f(brdrVarD);
    }

    @Override // defpackage.andp
    public final /* synthetic */ ando a(ajly ajlyVar) throws IOException {
        if (!(ajlyVar instanceof alzi)) {
            throw new IllegalStateException("Check failed.");
        }
        final alzi alziVar = (alzi) ajlyVar;
        brdp brdpVarH = h();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("countItemsAfterKeyQuery");
        brdrVarD.v();
        brdrVarD.n(new dqxm("COUNT(*)"), "cpt");
        brdrVarD.h(new Function() { // from class: alzk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, this.a.a);
                amfr.c(brecVar, alziVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdp brdpVarF = f(brdrVarD);
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("+countItemsAfterKeyAndTotalQuery");
        brdrVarD2.v();
        brdrVarD2.n(e(brdpVarH), "total");
        brdrVarD2.n(e(brdpVarF), "subtotal");
        brdrVarD2.y(1);
        dqqj dqqjVarP = brdrVarD2.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (!brapVar.moveToNext()) {
                alzm alzmVar = this.f;
                fczl.a(dqqjVarP, null);
                return alzmVar;
            }
            String strDe = brapVar.de("total");
            strDe.getClass();
            long j = Long.parseLong(strDe);
            String strDe2 = brapVar.de("subtotal");
            strDe2.getClass();
            alzn alznVar = new alzn(j, Long.parseLong(strDe2), this);
            fczl.a(dqqjVarP, null);
            return alznVar;
        } finally {
        }
    }

    @Override // defpackage.andp
    public final /* synthetic */ ando b(ajly ajlyVar) throws IOException {
        if (!(ajlyVar instanceof alzi)) {
            throw new IllegalStateException("Check failed.");
        }
        dqqj dqqjVarP = g((alzi) ajlyVar).p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (!brapVar.moveToNext()) {
                alzm alzmVar = this.f;
                fczl.a(dqqjVarP, null);
                return alzmVar;
            }
            String strDe = brapVar.de("total");
            strDe.getClass();
            long j = Long.parseLong(strDe);
            String strDe2 = brapVar.de("subtotal");
            strDe2.getClass();
            alzp alzpVar = new alzp(ajlyVar, Long.parseLong(strDe2), this, j);
            fczl.a(dqqjVarP, null);
            return alzpVar;
        } finally {
        }
    }

    @Override // defpackage.andp
    public final ando c(int i) throws IOException {
        dqqj dqqjVarP = h().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (!brapVar.moveToNext()) {
                alzm alzmVar = this.f;
                fczl.a(dqqjVarP, null);
                return alzmVar;
            }
            String strDe = brapVar.de("cpt");
            strDe.getClass();
            alzq alzqVar = new alzq(Long.parseLong(strDe), i, this);
            fczl.a(dqqjVarP, null);
            return alzqVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(dqqjVarP, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.andp
    public final /* synthetic */ ando d(ajly ajlyVar) throws IOException {
        if (!(ajlyVar instanceof alzi)) {
            throw new IllegalStateException("Check failed.");
        }
        dqqj dqqjVarP = g((alzi) ajlyVar).p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (!brapVar.moveToNext()) {
                alzm alzmVar = this.f;
                fczl.a(dqqjVarP, null);
                return alzmVar;
            }
            String strDe = brapVar.de("total");
            strDe.getClass();
            long j = Long.parseLong(strDe);
            String strDe2 = brapVar.de("subtotal");
            strDe2.getClass();
            alzr alzrVar = new alzr(Long.parseLong(strDe2), this, j);
            fczl.a(dqqjVarP, null);
            return alzrVar;
        } finally {
        }
    }
}
