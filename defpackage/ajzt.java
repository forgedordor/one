package defpackage;

import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajzt implements anpj {
    public final akcd a;
    public final aroh b;
    private final fdjx c;
    private final int d;
    private final bbmn e;

    public ajzt(fdjx fdjxVar, bbmo bbmoVar, akcd akcdVar, aroh arohVar, int i) {
        botb botbVarD;
        this.c = fdjxVar;
        this.a = akcdVar;
        this.b = arohVar;
        this.d = i;
        if (arohVar.a()) {
            String[] strArr = botm.a;
            botl botlVar = new botl();
            botlVar.t(f().b());
            botbVarD = akcd.c(botlVar, true);
        } else {
            botbVarD = akcd.d(e());
        }
        this.e = bbmoVar.a(botbVarD.b(), "getTopConversations");
    }

    private static final botb g(botb botbVar) {
        bron bronVarA = bros.a();
        Function function = new Function() { // from class: ajzq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new broc[]{((brob) obj).a};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        brob brobVar = bros.c;
        bronVarA.c((broc[]) function.apply(brobVar));
        String[] strArr = botm.a;
        botl botlVar = new botl();
        broc brocVar = brobVar.a;
        botlVar.ar(new dqxl("$V{J:parent_disallowed_join_tag} ISNULL", new Object[]{brocVar}));
        botbVar.h(botlVar);
        dqtr dqtrVarI = dqts.i(bronVarA.b(), brocVar, botm.c.a);
        ((dqos) dqtrVarI).e = "parent_disallowed_join_tag";
        botbVar.G(dqtrVarI);
        return botbVar;
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        anpiVar.getClass();
        return this.e.f(new cqtk() { // from class: ajzn
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "TopConversationsSupplier::register", "TopConversationsSupplier::callback", "TopConversationsSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() throws IOException {
        eieu eieuVarH = eiiy.h("TopConversationsSupplier#getTopConversations");
        try {
            eiju eijuVarC = auvw.c(this.c, fcyi.a, fdjz.a, new ajzs(this, null));
            eieuVarH.b(eijuVarC);
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.botb r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ajzr
            if (r0 == 0) goto L13
            r0 = r6
            ajzr r0 = (defpackage.ajzr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajzr r0 = new ajzr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            bosz r5 = r5.b()
            eiju r5 = r5.x()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L73
        L45:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.fcva.p(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r6.next()
            bojh r0 = (defpackage.bojh) r0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r1 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r0.C()
            r1.<init>(r0)
            r5.add(r1)
            goto L59
        L72:
            return r5
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzt.d(botb, fcxy):java.lang.Object");
    }

    public final botl e() {
        botb botbVarE = botm.e();
        botbVarE.A("topConversationsInner");
        botbVarE.g(new Function() { // from class: ajzk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bopp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.B(0);
        botbVarE.y(this.d);
        botbVarE.i(new Function() { // from class: ajzl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.c(bvdk.UNARCHIVED);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopp boppVar = botm.c;
        botbVarE.e(new bosy(boppVar.r, false), new bosy(boppVar.a, false));
        botb botbVarG = g(botbVarE);
        botl botlVar = new botl();
        botlVar.t(botbVarG.b());
        return botlVar;
    }

    public final botb f() {
        botb botbVarE = botm.e();
        botbVarE.A("topConversationsInner");
        botbVarE.g(new Function() { // from class: ajzo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bopp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.B(0);
        botbVarE.y(this.d);
        botbVarE.i(new Function() { // from class: ajzp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.c(bvdk.UNARCHIVED);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr = bodn.a;
        bodk bodkVar = new bodk(bodn.a);
        Function function = new Function() { // from class: ajzm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new bocy[]{((bocx) obj).c};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bocx bocxVar = bodn.c;
        bodkVar.c((bocy[]) function.apply(bocxVar));
        bodj bodjVarB = bodkVar.b();
        bocy bocyVar = bocxVar.b;
        bopp boppVar = botm.c;
        bopq bopqVar = boppVar.a;
        dqtr dqtrVarI = dqts.i(bodjVarB, bocyVar, bopqVar);
        ((dqos) dqtrVarI).e = "conversation_pin_join_tag";
        botbVarE.G(dqtrVarI);
        botbVarE.C(new dqxl("$V{J:conversation_pin_join_tag} DESC, $V DESC, $V DESC", new Object[]{bocxVar.c, boppVar.r, bopqVar}));
        return g(botbVarE);
    }
}
