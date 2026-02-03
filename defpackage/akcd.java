package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akcd {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public akcd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public static final botb c(final botl botlVar, boolean z) {
        botlVar.getClass();
        botb botbVarE = botm.e();
        botbVarE.A("ConversationsSummary");
        botbVarE.i(new Function() { // from class: akbx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopp boppVar = botm.c;
        bopq bopqVar = boppVar.a;
        botbVarE.w(bopqVar);
        botbVarE.f(new Function() { // from class: akby
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar2 = (bopp) obj;
                return new bopq[]{boppVar2.a, boppVar2.c, boppVar2.O, boppVar2.g, boppVar2.D, boppVar2.t, boppVar2.k, boppVar2.l, boppVar2.m, boppVar2.n, boppVar2.o, boppVar2.j, boppVar2.L, boppVar2.r, boppVar2.aq, boppVar2.A, boppVar2.R, boppVar2.y};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.e(new Function() { // from class: akbw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new brao[]{((bran) obj).k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.e(new Function() { // from class: akbu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                return new brzi[]{brzhVar.m, brzhVar.n, brzhVar.h};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbm bsbmVarB = bsboVarE.b();
        brzi brziVar = ParticipantsTable.c.a;
        bran branVar = MessagesTable.c;
        brdrVarD.G(dqts.i(bsbmVarB, brziVar, branVar.c));
        String[] strArr = VmtTable.a;
        bvcy bvcyVar = new bvcy(VmtTable.a);
        bvcyVar.d(new Function() { // from class: akbz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvcm bvcmVar = (bvcm) obj;
                return new bvcn[]{bvcmVar.a, bvcmVar.c, bvcmVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.e(new Function() { // from class: akca
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new bsgs[]{((bsgr) obj).f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvcx bvcxVarB = bvcyVar.b();
        bvcn bvcnVar = VmtTable.c.a;
        bsgr bsgrVar = PartsTable.d;
        bsjeVarC.G(dqts.i(bvcxVarB, bvcnVar, bsgrVar.a));
        bsjc bsjcVarB = bsjeVarC.b();
        bsgs bsgsVar = bsgrVar.b;
        brao braoVar = branVar.a;
        brdrVarD.G(dqts.i(bsjcVarB, bsgsVar, braoVar));
        botbVarE.G(dqts.i(brdrVarD.b(), braoVar, boppVar.f));
        if (!z) {
            botbVarE.e(new bosy(boppVar.r, false), new bosy(bopqVar, false));
        }
        return botbVarE;
    }

    public static /* synthetic */ botb d(botl botlVar) {
        return c(botlVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ajlp e(defpackage.bojh r32) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcd.e(bojh):ajlp");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.botl r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akcb
            if (r0 == 0) goto L13
            r0 = r6
            akcb r0 = (defpackage.akcb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akcb r0 = new akcb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            botb r5 = d(r5)
            bosz r5 = r5.b()
            eiju r5 = r5.x()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L79
        L49:
            ekgb r6 = (defpackage.ekgb) r6
            r6.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.fcva.p(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r6.next()
            bojh r0 = (defpackage.bojh) r0
            r0.getClass()
            ajlp r0 = r4.e(r0)
            r5.add(r0)
            goto L5d
        L74:
            ekgb r5 = defpackage.ekfv.a(r5)
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcd.a(botl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.akcc
            if (r0 == 0) goto L13
            r0 = r13
            akcc r0 = (defpackage.akcc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akcc r0 = new akcc
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.fctl.b(r13)
            goto Lbb
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            defpackage.fctl.b(r13)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L43
            int r12 = defpackage.ekgb.d
            ekgb r12 = defpackage.ekoe.a
            r12.getClass()
            return r12
        L43:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r2 = defpackage.fcva.p(r12, r3)
            r13.<init>(r2)
            java.util.Iterator r2 = r12.iterator()
        L50:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r2.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r5
            java.lang.String r5 = r5.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.barn.b(r5)
            r13.add(r5)
            goto L50
        L68:
            java.lang.String[] r2 = defpackage.botm.a
            botl r2 = new botl
            r2.<init>()
            r2.u(r13)
            botb r13 = c(r2, r4)
            java.lang.Iterable r5 = defpackage.fcva.L(r12)
            akbv r9 = new akbv
            r9.<init>()
            r8 = 0
            r10 = 30
            java.lang.String r6 = " "
            r7 = 0
            java.lang.String r12 = defpackage.fcva.aF(r5, r6, r7, r8, r9, r10)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = 0
            r2[r5] = r12
            dqxl r12 = new dqxl
            java.lang.String r6 = "CASE $R ELSE -1 END"
            r12.<init>(r6, r2)
            java.lang.String r2 = "orderBy"
            r13.n(r12, r2)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r5] = r2
            dqxl r2 = new dqxl
            java.lang.String r5 = "$R"
            r2.<init>(r5, r12)
            r13.C(r2)
            bosz r12 = r13.b()
            eiju r12 = r12.x()
            r12.getClass()
            r0.c = r4
            java.lang.Object r13 = defpackage.fdxs.c(r12, r0)
            if (r13 == r1) goto Le9
        Lbb:
            ekgb r13 = (defpackage.ekgb) r13
            r13.getClass()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = defpackage.fcva.p(r13, r3)
            r12.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        Lcd:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r13.next()
            bojh r0 = (defpackage.bojh) r0
            r0.getClass()
            ajlp r0 = r11.e(r0)
            r12.add(r0)
            goto Lcd
        Le4:
            ekgb r12 = defpackage.ekfv.a(r12)
            return r12
        Le9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcd.b(java.util.List, fcxy):java.lang.Object");
    }
}
