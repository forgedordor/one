package defpackage;

import android.database.SQLException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asqr {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/business/spam/RbmToolstoneDatabaseOperations");
    public final dqsn a;
    public final fdjx b;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final aqmq i;
    private final cqce j;

    public asqr(egyt egytVar, fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, aqmq aqmqVar, fdjx fdjxVar) {
        egytVar.getClass();
        dqsnVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        aqmqVar.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.a = dqsnVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = aqmqVar;
        this.b = fdjxVar;
        this.j = cqce.g("Bugle", "RbmToolstoneDatabaseOperations");
    }

    public static final void h(final ConversationIdType conversationIdType, asqe asqeVar) {
        try {
            String[] strArr = bmmf.a;
            bmky bmkyVar = new bmky();
            bmkyVar.c(conversationIdType);
            bmkyVar.d(asqeVar);
            bmkyVar.a().m(new Function() { // from class: asqf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmme bmmeVar = (bmme) obj;
                    bmmeVar.b(conversationIdType);
                    return bmmeVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } catch (SQLException e) {
            ((ekrd) ((ekrd) c.j()).g(e).h("com/google/android/apps/messaging/shared/business/spam/RbmToolstoneDatabaseOperations", "persistAutomatedToolstoneStateChange", 121, "RbmToolstoneDatabaseOperations.kt")).t("Failed to update/insert BusinessConversationsMetadataTable on toolstone state change. New state: %s", asqeVar);
        }
    }

    private final void i(long j, long j2, int i) {
        enft enftVar = (enft) enfv.a.createBuilder();
        enftVar.copyOnWrite();
        enfv enfvVar = (enfv) enftVar.instance;
        enfvVar.b |= 4;
        enfvVar.e = i;
        if (j <= 0 || j == Long.MAX_VALUE) {
            enftVar.copyOnWrite();
            enfv enfvVar2 = (enfv) enftVar.instance;
            enfvVar2.c = 2;
            enfvVar2.b |= 1;
        } else {
            enftVar.copyOnWrite();
            enfv enfvVar3 = (enfv) enftVar.instance;
            enfvVar3.c = 3;
            enfvVar3.b |= 1;
            long seconds = Duration.ofMillis(j2).toSeconds();
            enftVar.copyOnWrite();
            enfv enfvVar4 = (enfv) enftVar.instance;
            enfvVar4.b |= 2;
            enfvVar4.d = seconds;
        }
        ((aspz) this.g.b()).h((enfv) enftVar.build());
    }

    private static final long j(ConversationIdType conversationIdType) {
        bmma bmmaVarA = bmmf.a();
        bmmaVarA.A("business_conversations_metadata.queryOnConversationId");
        bmmaVarA.q();
        bmme bmmeVar = new bmme();
        bmmeVar.b(conversationIdType);
        bmmaVarA.k(new bmmd(bmmeVar));
        bmkv bmkvVar = (bmkv) dqru.c(bmmaVarA.b());
        if (bmkvVar != null) {
            return bmkvVar.k();
        }
        return 0L;
    }

    private final asqe k(int i, ConversationIdType conversationIdType, long j) throws IOException {
        asqe asqeVar;
        cczi ccziVar = asqt.a;
        int iD = asqt.d(i);
        if (iD <= 1) {
            return asqe.SHOW;
        }
        bgvg bgvgVarG = ((bael) this.e.b()).g(conversationIdType, iD);
        bgvgVarG.c(new bgvd(bgvl.c.d, true));
        dqqj dqqjVarP = bgvgVarG.b().p();
        try {
            bgvb bgvbVar = (bgvb) dqqjVarP;
            if (bgvbVar.getCount() < iD) {
                asqeVar = asqe.HIDE;
            } else {
                long j2 = j(conversationIdType);
                if (bgvbVar.moveToFirst() && baea.aa(bgvbVar.e())) {
                    long jF = bgvbVar.f();
                    long jF2 = jF;
                    while (true) {
                        if (!bgvbVar.moveToNext()) {
                            long j3 = jF2 - jF;
                            if (j3 > j) {
                                asqeVar = asqe.HIDE;
                            } else {
                                i(j, j3, bgvbVar.getCount());
                                asqeVar = asqe.SHOW;
                            }
                        } else {
                            if (!baea.aa(bgvbVar.e())) {
                                asqeVar = asqe.HIDE;
                                break;
                            }
                            if (bgvbVar.f() < j2) {
                                asqeVar = asqe.HIDE;
                                break;
                            }
                            jF2 = bgvbVar.f();
                        }
                    }
                } else {
                    asqeVar = asqe.HIDE;
                }
            }
            fczl.a(dqqjVarP, null);
            return asqeVar;
        } finally {
        }
    }

    private final asqe l(int i, final ConversationIdType conversationIdType, long j) throws IOException {
        asqe asqeVar;
        cczi ccziVar = asqt.a;
        int iD = asqt.d(i);
        if (iD <= 1) {
            return asqe.SHOW;
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("calculateAppearanceViaUnrespondedMessagesWithinTimeframeOptimized");
        bran branVar = MessagesTable.c;
        brao braoVar = branVar.i;
        brdrVarD.c(branVar.a, branVar.k, braoVar);
        brdrVarD.h(new Function() { // from class: asqh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.m(conversationIdType);
                brecVar.ao(3);
                brecVar.ao(16);
                brecVar.ak();
                String[] strArr = MessagesTable.a;
                brec brecVar2 = new brec();
                brecVar2.A(false);
                brec brecVar3 = new brec();
                bqkg bqkgVarA = bqkl.a();
                bqkgVarA.f(new Function() { // from class: asqi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqkk bqkkVar = (bqkk) obj2;
                        bqkkVar.ap(new dqpk("message_reactions.message_id", 1, MessagesTable.c.a));
                        return bqkkVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brecVar3.ar(new dqwh(bqkgVarA.b()));
                brecVar.aq(brecVar2, brecVar3);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.d(new brdo(braoVar, true));
        brdrVarD.y(iD);
        dqqj dqqjVarP = brdrVarD.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (brapVar.getCount() < iD) {
                asqeVar = asqe.HIDE;
            } else {
                long j2 = j(conversationIdType);
                if (brapVar.moveToFirst() && baea.aa(brapVar.i())) {
                    long jL = brapVar.l();
                    long jL2 = jL;
                    while (true) {
                        if (!brapVar.moveToNext()) {
                            long j3 = jL2 - jL;
                            if (j3 > j) {
                                asqeVar = asqe.HIDE;
                            } else {
                                i(j, j3, brapVar.getCount());
                                asqeVar = asqe.SHOW;
                            }
                        } else {
                            if (!baea.aa(brapVar.i())) {
                                asqeVar = asqe.HIDE;
                                break;
                            }
                            if (brapVar.l() < j2) {
                                asqeVar = asqe.HIDE;
                                break;
                            }
                            jL2 = brapVar.l();
                        }
                    }
                } else {
                    asqeVar = asqe.HIDE;
                }
            }
            fczl.a(dqqjVarP, null);
            return asqeVar;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.asqo
            if (r0 == 0) goto L13
            r0 = r6
            asqo r0 = (defpackage.asqo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asqo r0 = new asqo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.h
            java.lang.Object r6 = r6.b()
            anty r6 = (defpackage.anty) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r5)
            anpj r5 = r6.e(r2)
            eiju r5 = r5.b()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto Lb4
        L4f:
            ekgb r6 = (defpackage.ekgb) r6
            int r5 = r6.size()
            r0 = 0
            if (r5 > 0) goto L5d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L5d:
            java.lang.Object r5 = r6.get(r0)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            alqm r5 = r5.g()
            java.lang.Object r6 = r6.get(r0)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            boolean r6 = r6.z()
            if (r6 == 0) goto L78
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L78:
            java.lang.String r5 = r5.n()
            if (r5 != 0) goto L80
            java.lang.String r5 = ""
        L80:
            java.lang.String r5 = defpackage.alwh.c(r5)
            r5.getClass()
            int r6 = r5.length()
            if (r6 != 0) goto L99
            cqce r5 = r4.j
            java.lang.String r6 = "RBM toolstone is not shown as bot id is malformed."
            r5.n(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L99:
            java.util.List r6 = defpackage.asqt.a()
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto Laf
            cqce r5 = r4.j
            java.lang.String r6 = "RBM toolstone is not shown as it is not enabled on the bot domain."
            r5.r(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        Laf:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asqr.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    public final void b(ConversationIdType conversationIdType) {
        if (((Boolean) asqt.f.e()).booleanValue()) {
            c(conversationIdType, asqe.SHOW, false);
        } else {
            g(3, conversationIdType);
        }
    }

    public final void c(ConversationIdType conversationIdType, asqe asqeVar, boolean z) {
        asqeVar.getClass();
        auvw.k(this.b, null, null, new asqq(this, z, asqeVar, conversationIdType, null), 3);
    }

    public final void d(final ConversationIdType conversationIdType) {
        long epochMilli = ((cogw) this.d.b()).f().toEpochMilli();
        try {
            String[] strArr = bmmf.a;
            bmky bmkyVar = new bmky();
            bmkyVar.c(conversationIdType);
            bmkyVar.d(asqe.HIDE);
            bmkyVar.e(epochMilli);
            bmkyVar.a().m(new Function() { // from class: asqg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmme bmmeVar = (bmme) obj;
                    bmmeVar.b(conversationIdType);
                    return bmmeVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } catch (SQLException e) {
            ((ekrd) ((ekrd) c.j()).g(e).h("com/google/android/apps/messaging/shared/business/spam/RbmToolstoneDatabaseOperations", "persistUserInitiatedToolstoneDismissal", 94, "RbmToolstoneDatabaseOperations.kt")).q("Failed to update/insert BusinessConversationsMetadataTable on toolstone dismissal.");
        }
        aspz aspzVar = (aspz) this.g.b();
        enfx enfxVar = (enfx) enfy.a.createBuilder();
        enfxVar.copyOnWrite();
        enfy enfyVar = (enfy) enfxVar.instance;
        enfyVar.c = 1;
        enfyVar.b = 1 | enfyVar.b;
        aspzVar.i((enfy) enfxVar.build());
    }

    public final asqe f(int i, ConversationIdType conversationIdType) throws IOException {
        Instant instantOfEpochMilli;
        asqe asqeVarL;
        dqqj dqqjVarP;
        cczi ccziVar = asqt.a;
        Integer num = i == 3 ? (Integer) asqt.g.e() : (Integer) asqt.c.e();
        num.getClass();
        int iIntValue = num.intValue();
        int i2 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 3;
        }
        int i3 = i2 - 2;
        if (i3 != 2) {
            asqeVarL = i3 != 3 ? i3 != 4 ? asqe.HIDE : this.i.a() ? l(i, conversationIdType, asqt.c(i)) : k(i, conversationIdType, asqt.c(i)) : this.i.a() ? l(i, conversationIdType, Long.MAX_VALUE) : k(i, conversationIdType, Long.MAX_VALUE);
        } else {
            long j = j(conversationIdType);
            long jC = asqt.c(i);
            if (j > 0) {
                instantOfEpochMilli = Instant.ofEpochMilli(j);
            } else if (this.i.a()) {
                baes baesVar = (baes) this.f.b();
                final bjjn bjjnVarA = bjdl.a(conversationIdType);
                bfsa bfsaVar = baesVar.a;
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.c(MessagesTable.c.a);
                brdrVarD.h(new Function() { // from class: baem
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.s(bjjnVarA);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bfro bfroVarF = bfsaVar.f(brdrVarD);
                bfroVarF.A("ConversationMessageDataQueryHelperV2::getConversationMessagesByIdsQuerySql");
                bfroVarF.A("ConversationMessageDataQueryHelperV2::getFirstConversationMessageQuerySql");
                dqqjVarP = bfroVarF.b().p();
                try {
                    bfrj bfrjVar = (bfrj) dqqjVarP;
                    bfrjVar.moveToFirst();
                    instantOfEpochMilli = Instant.ofEpochMilli(bfrjVar.e());
                    fczl.a(dqqjVarP, null);
                } finally {
                }
            } else {
                dqqjVarP = ((bael) this.e.b()).a.d(false, barn.a, bjdl.a(conversationIdType)).b().p();
                try {
                    bgvb bgvbVar = (bgvb) dqqjVarP;
                    bgvbVar.moveToFirst();
                    instantOfEpochMilli = Instant.ofEpochMilli(bgvbVar.f());
                    fczl.a(dqqjVarP, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            Instant instantPlus = instantOfEpochMilli.plus(Duration.ofMillis(jC));
            Instant instantF = ((cogw) this.d.b()).f();
            if (instantPlus.isBefore(instantF)) {
                aspz aspzVar = (aspz) this.g.b();
                enft enftVar = (enft) enfv.a.createBuilder();
                enftVar.copyOnWrite();
                enfv enfvVar = (enfv) enftVar.instance;
                enfvVar.c = 1;
                enfvVar.b = 1 | enfvVar.b;
                long seconds = Duration.ofMillis(instantF.toEpochMilli() - instantOfEpochMilli.toEpochMilli()).toSeconds();
                enftVar.copyOnWrite();
                enfv enfvVar2 = (enfv) enftVar.instance;
                enfvVar2.b = 2 | enfvVar2.b;
                enfvVar2.d = seconds;
                aspzVar.h((enfv) enftVar.build());
                asqeVarL = asqe.SHOW;
            } else {
                asqeVarL = asqe.HIDE;
            }
        }
        if (asqeVarL == asqe.SHOW) {
            c(conversationIdType, asqeVarL, false);
        }
        return asqeVarL;
    }

    public final void g(int i, ConversationIdType conversationIdType) {
        auvw.k(this.b, null, null, new asqk(this, i, conversationIdType, null), 3);
    }
}
