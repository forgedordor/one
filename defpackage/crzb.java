package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crzb implements crzf {
    public final cogw a;
    private final ecjh c;
    private final dqsn d;
    private final fdjx e;

    public crzb(ecjh ecjhVar, cogw cogwVar, dqsn dqsnVar, fdjx fdjxVar) {
        ecjhVar.getClass();
        cogwVar.getClass();
        dqsnVar.getClass();
        fdjxVar.getClass();
        this.c = ecjhVar;
        this.a = cogwVar;
        this.d = dqsnVar;
        this.e = fdjxVar;
    }

    public static final crzm c(final ConversationIdType conversationIdType, MessageIdType messageIdType, crzb crzbVar) {
        String strM;
        String[] strArr = csav.a;
        csau csauVar = new csau();
        csauVar.b(conversationIdType);
        csauVar.d();
        csauVar.c();
        if (messageIdType == null) {
            csauVar.ap(new dqpn("spam_logging_ids_table.message_id", 5));
            csauVar.ap(new dqpn("spam_logging_ids_table.message_logging_id", 5));
        } else {
            csauVar.ap(new dqpj("spam_logging_ids_table.message_id", 1, Long.valueOf(bary.a(messageIdType))));
            csauVar.ap(new dqpj("spam_logging_ids_table.message_logging_id", 2, ""));
            csauVar.ap(new dqpn("spam_logging_ids_table.message_logging_id", 6));
        }
        String[] strArr2 = csav.a;
        csas csasVar = new csas(strArr2);
        csasVar.A("SpamLoggingIds#getConversationAndMessageLoggingIds#both");
        csasVar.k(new csat(csauVar));
        ekgb ekgbVarZ = csasVar.b().z();
        ekgbVarZ.getClass();
        crzm crzmVar = (crzm) fcva.P(ekgbVarZ);
        if (crzmVar != null) {
            return crzmVar;
        }
        csas csasVar2 = new csas(strArr2);
        csasVar2.A("SpamLoggingIds#getConversationAndMessageLoggingIds#conversation");
        csasVar2.c(new Function() { // from class: cryp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csau csauVar2 = (csau) obj;
                csauVar2.b(conversationIdType);
                csauVar2.d();
                csauVar2.c();
                return csauVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ2 = csasVar2.b().z();
        ekgbVarZ2.getClass();
        crzm crzmVar2 = (crzm) fcva.P(ekgbVarZ2);
        crzr crzrVar = new crzr();
        crzrVar.b(conversationIdType);
        crzrVar.d(crzbVar.a.f().toEpochMilli());
        if (crzmVar2 == null || (strM = crzmVar2.m()) == null || strM.length() == 0) {
            crzrVar.c(UUID.randomUUID().toString());
        } else {
            crzrVar.c(crzmVar2.m());
        }
        if (messageIdType != null) {
            crzrVar.e(messageIdType);
            crzrVar.f(UUID.randomUUID().toString());
        }
        try {
            crzm crzmVarA = crzrVar.a(new Supplier() { // from class: crzo
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new crzn();
                }
            });
            final dqsy dqsyVarA = csav.a();
            dqru.b(csav.a(), "spam_logging_ids_table", crzmVarA, new Function() { // from class: crzi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarA.P("spam_logging_ids_table", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: crzj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return crzmVarA;
        } catch (SQLiteConstraintException unused) {
            return null;
        }
    }

    private final long l() {
        long days = TimeUnit.MILLISECONDS.toDays(this.a.f().toEpochMilli());
        cczi ccziVar = crzd.c;
        Object objE = ccziVar.e();
        objE.getClass();
        long jLongValue = days / ((Number) objE).longValue();
        TimeUnit timeUnit = TimeUnit.DAYS;
        Object objE2 = ccziVar.e();
        objE2.getClass();
        return timeUnit.toMillis(jLongValue * ((Number) objE2).longValue());
    }

    private final void m() {
        final long jL = l();
        String[] strArr = csav.a;
        csao csaoVar = new csao();
        csaoVar.f("SpamLoggingIds#deleteExpiredTableRows");
        csaoVar.b = new csat((csau) new Function() { // from class: crys
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csau csauVar = (csau) obj;
                csauVar.ap(new dqty("spam_logging_ids_table.generation_timestamp", 8, Long.valueOf(jL)));
                return csauVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new csau()));
        csaoVar.d();
    }

    @Override // defpackage.crzf
    public final crze a(csnx csnxVar, csnz csnzVar) {
        crzm crzmVarB = b(((csog) csnxVar).a, csnzVar != null ? ((cspi) csnzVar).a : null);
        if (crzmVarB == null) {
            return null;
        }
        String strM = crzmVarB.m();
        strM.getClass();
        return new crze(csnxVar, strM, csnzVar, crzmVarB.n());
    }

    @Override // defpackage.crzf
    public final crzm b(final ConversationIdType conversationIdType, final MessageIdType messageIdType) {
        conversationIdType.getClass();
        ecem.b();
        m();
        return (crzm) this.d.c("SpamLoggingIds#getConversationAndMessageLoggingIds", new ejxr() { // from class: cryr
            @Override // defpackage.ejxr
            public final Object get() {
                return crzb.c(conversationIdType, messageIdType, this);
            }
        });
    }

    @Override // defpackage.crzf
    public final eiju d() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new cryz(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.crzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cryw
            if (r0 == 0) goto L13
            r0 = r5
            cryw r0 = (defpackage.cryw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cryw r0 = new cryw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L42
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ecjh r5 = r4.c     // Catch: java.lang.Exception -> L42
            cryq r2 = new cryq     // Catch: java.lang.Exception -> L42
            r2.<init>()     // Catch: java.lang.Exception -> L42
            r0.c = r3     // Catch: java.lang.Exception -> L42
            java.lang.Object r5 = defpackage.crrj.b(r5, r2, r0)     // Catch: java.lang.Exception -> L42
            if (r5 != r1) goto L42
            return r1
        L42:
            r4.m()
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crzb.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.crzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cryx
            if (r0 == 0) goto L13
            r0 = r5
            cryx r0 = (defpackage.cryx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cryx r0 = new cryx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.h(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cryv r5 = (defpackage.cryv) r5
            java.lang.String r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crzb.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.crzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cryy
            if (r0 == 0) goto L13
            r0 = r5
            cryy r0 = (defpackage.cryy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cryy r0 = new cryy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.h(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cryv r5 = (defpackage.cryv) r5
            java.lang.String r5 = r5.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crzb.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.crza
            if (r0 == 0) goto L13
            r0 = r6
            crza r0 = (defpackage.crza) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crza r0 = new crza
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fdci r0 = r0.d
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L5a
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            fdci r6 = new fdci
            r6.<init>()
            ecjh r2 = r5.c     // Catch: java.lang.Exception -> L5a
            cryu r4 = new cryu     // Catch: java.lang.Exception -> L5a
            r4.<init>()     // Catch: java.lang.Exception -> L5a
            r0.d = r6     // Catch: java.lang.Exception -> L5a
            r0.c = r3     // Catch: java.lang.Exception -> L5a
            java.lang.Object r0 = defpackage.crrj.b(r2, r4, r0)     // Catch: java.lang.Exception -> L5a
            if (r0 == r1) goto L59
            r0 = r6
        L4b:
            java.lang.Object r6 = r0.a     // Catch: java.lang.Exception -> L5a
            if (r6 != 0) goto L56
            java.lang.String r6 = "userIds"
            defpackage.fdbq.c(r6)     // Catch: java.lang.Exception -> L5a
            r6 = 0
            return r6
        L56:
            cryv r6 = (defpackage.cryv) r6     // Catch: java.lang.Exception -> L5a
            return r6
        L59:
            return r1
        L5a:
            cryv r6 = new cryv
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crzb.h(fcxy):java.lang.Object");
    }

    @Override // defpackage.crzf
    public final List i(final ConversationIdType conversationIdType) {
        ecem.b();
        final long jL = l();
        String[] strArr = csav.a;
        csas csasVar = new csas(csav.a);
        csasVar.A("SpamLoggingIds#getValidConversationLoggingIdsWithoutExpiringOldIds");
        csasVar.c(new Function() { // from class: cryt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csau csauVar = (csau) obj;
                csauVar.b(conversationIdType);
                csauVar.ap(new dqty("spam_logging_ids_table.generation_timestamp", 9, Long.valueOf(jL)));
                return csauVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = csasVar.b().z();
        ekgbVarZ.getClass();
        return ekgbVarZ;
    }

    @Override // defpackage.crzf
    public final List j(csnx csnxVar) {
        List<crzm> listI = i(((csog) csnxVar).a);
        ArrayList arrayList = new ArrayList(fcva.p(listI, 10));
        for (crzm crzmVar : listI) {
            String strM = crzmVar.m();
            strM.getClass();
            cspi cspiVar = null;
            if (crzmVar.k() != null && !crzmVar.k().c()) {
                MessageIdType messageIdTypeK = crzmVar.k();
                messageIdTypeK.getClass();
                cspiVar = new cspi(messageIdTypeK);
            }
            arrayList.add(new crze(csnxVar, strM, cspiVar, crzmVar.n()));
        }
        return arrayList;
    }

    public final boolean k(crzg crzgVar) {
        long days = TimeUnit.MILLISECONDS.toDays(((crzh) crzgVar.instance).d);
        cczi ccziVar = crzd.b;
        Object objE = ccziVar.e();
        objE.getClass();
        long jLongValue = days / ((Number) objE).longValue();
        long days2 = TimeUnit.MILLISECONDS.toDays(this.a.f().toEpochMilli());
        Object objE2 = ccziVar.e();
        objE2.getClass();
        return jLongValue != days2 / ((Number) objE2).longValue();
    }
}
