package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmh extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler");
    private static final Map c = fcwa.g(new fcti(clnt.OUTCOME_SUCCESS, fcwa.g(new fcti(clmt.HELP_NOT_LONGER_NEED, clko.b), new fcti(clmt.WAITING_FOR_HELP, clko.a))), new fcti(clnt.OUTCOME_FAILURE, fcwa.g(new fcti(clmt.HELP_NOT_LONGER_NEED, clko.d), new fcti(clmt.WAITING_FOR_HELP, clko.c))));
    public final bauh b;
    private final fdjx d;
    private final clhc e;
    private final cllj f;
    private final clkq g;
    private final bbdl h;
    private final clpm i;
    private final Optional j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final clhq n;
    private final alrj o;
    private final clox p;
    private final fcsu q;
    private final clow r;
    private final fcsu s;
    private final apsl t;
    private final fcsu u;

    public clmh(fdjx fdjxVar, clhc clhcVar, bauh bauhVar, cllj clljVar, clkq clkqVar, bbdl bbdlVar, clpm clpmVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, clhq clhqVar, alrj alrjVar, clox cloxVar, fcsu fcsuVar4, clow clowVar, fcsu fcsuVar5, apsl apslVar, fcsu fcsuVar6) {
        fdjxVar.getClass();
        clhcVar.getClass();
        bauhVar.getClass();
        bbdlVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        alrjVar.getClass();
        cloxVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        apslVar.getClass();
        fcsuVar6.getClass();
        this.d = fdjxVar;
        this.e = clhcVar;
        this.b = bauhVar;
        this.f = clljVar;
        this.g = clkqVar;
        this.h = bbdlVar;
        this.i = clpmVar;
        this.j = optional;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.n = clhqVar;
        this.o = alrjVar;
        this.p = cloxVar;
        this.q = fcsuVar4;
        this.r = clowVar;
        this.s = fcsuVar5;
        this.t = apslVar;
        this.u = fcsuVar6;
    }

    private final void o(ConversationIdType conversationIdType, final MessageCoreData messageCoreData, clnt clntVar, elpa elpaVar, final MessageCoreData messageCoreData2) {
        Object objA = this.i.a(messageCoreData);
        if (fctk.d(objA)) {
            final Uri uri = (Uri) objA;
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.ab, uri);
            ekrdVar.X(cqnc.ac, messageCoreData.B());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoTelephonyDatabase", 390, "RetrieveQuestionnaireWorkHandler.kt")).q("Successfully inserted the satellite message in Telephony DB");
            messageCoreData.bD(uri);
            if (this.t.a()) {
                ((awlc) this.u.b()).d(new Consumer() { // from class: cllx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cmvv cmvvVar = (cmvv) obj;
                        ekrg ekrgVar = clmh.a;
                        cmvvVar.getClass();
                        messageCoreData.aI();
                        cmvvVar.d(uri);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                Optional optional = this.j;
                final fdap fdapVar = new fdap() { // from class: clly
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        cmvv cmvvVar = (cmvv) obj;
                        ekrg ekrgVar = clmh.a;
                        cmvvVar.getClass();
                        messageCoreData.aI();
                        cmvvVar.d(uri);
                        return fctx.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: cllz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ekrg ekrgVar = clmh.a;
                        fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        ((dqsn) this.q.b()).d("RetrieveQuestionnaireWorkHandler#insertToBugleDatabaseAndNotifyUI", new Runnable() { // from class: clma
            @Override // java.lang.Runnable
            public final void run() {
                bauh bauhVar = this.a.b;
                MessageCoreData messageCoreData3 = messageCoreData;
                if (bauhVar.a(messageCoreData3).c()) {
                    ekrw ekrwVarJ = clmh.a.j();
                    ekrwVarJ.X(eksq.a, "BugleSatellite");
                    ekrd ekrdVar2 = (ekrd) ekrwVarJ;
                    ekrdVar2.X(cqnc.ac, messageCoreData3.B());
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 356, "RetrieveQuestionnaireWorkHandler.kt")).q("Failed to insert outgoing satellite message");
                } else {
                    ekrw ekrwVarH2 = clmh.a.h();
                    ekrwVarH2.X(eksq.a, "BugleSatellite");
                    ekrd ekrdVar3 = (ekrd) ekrwVarH2;
                    ekrdVar3.X(cqnc.ac, messageCoreData3.B());
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 361, "RetrieveQuestionnaireWorkHandler.kt")).q("Successfully inserted outgoing satellite message");
                }
                MessageCoreData messageCoreData4 = messageCoreData2;
                if (bauhVar.a(messageCoreData4).c()) {
                    ekrw ekrwVarJ2 = clmh.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleSatellite");
                    ekrd ekrdVar4 = (ekrd) ekrwVarJ2;
                    ekrdVar4.X(cqnc.ac, messageCoreData3.B());
                    ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 370, "RetrieveQuestionnaireWorkHandler.kt")).r("Failed to insert tombstone [status: %s] for satellite message", messageCoreData4.k());
                    return;
                }
                ekrw ekrwVarH3 = clmh.a.h();
                ekrwVarH3.X(eksq.a, "BugleSatellite");
                ekrd ekrdVar5 = (ekrd) ekrwVarH3;
                ekrdVar5.X(cqnc.ac, messageCoreData3.B());
                ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoBugleDatabase$lambda$16", 375, "RetrieveQuestionnaireWorkHandler.kt")).r("Successfully inserted the satellite tombstone [status: %s] for satellite message", messageCoreData4.k());
            }
        });
        ((baqi) this.s.b()).e(conversationIdType, messageCoreData2.C(), Long.valueOf(messageCoreData2.o()), bvdk.UNARCHIVED, false);
        ajhd ajhdVar = (ajhd) this.k.b();
        if (clntVar != clnt.OUTCOME_SUCCESS) {
            ajek ajekVar = new ajek();
            ajekVar.e(messageCoreData);
            ajekVar.h(this.h.d().e());
            ajekVar.f(-2);
            ajekVar.b(-1);
            ajekVar.c(0);
            ajekVar.d = 1;
            ajekVar.d(0);
            ajekVar.g(elpaVar);
            ajhdVar.D(ajekVar.a());
            return;
        }
        int iE = this.h.d().e();
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        elhf.h(2, elofVar);
        elhf.c(messageCoreData.cM(), elofVar);
        elpaVar.getClass();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.ay = elpaVar.e;
        elpgVar.e |= 65536;
        ajhdVar.H(messageCoreData, iE, (elof) elhf.a(elofVar).toBuilder());
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        fcsu fcsuVar = this.l;
        caxz caxzVarL = caya.l();
        caxzVarL.c((int) ((Number) fcsuVar.b()).longValue());
        caxzVarL.f(pza.a);
        Object objB = this.m.b();
        objB.getClass();
        caxzVarL.g(((Number) objB).longValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("RetrieveQuestionnaireWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = evrl.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ((evrl) evuhVar).getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new clmf(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.alqm r5, defpackage.clod r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.clmc
            if (r0 == 0) goto L13
            r0 = r7
            clmc r0 = (defpackage.clmc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clmc r0 = new clmc
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            alqk r5 = r0.d
            defpackage.fctl.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            clhq r7 = r4.n
            r2 = r5
            alqk r2 = (defpackage.alqk) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r7.e(r5, r6, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            bojh r7 = (defpackage.bojh) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r7.C()
            r6.getClass()
            bbdl r7 = r4.h
            axcy r7 = r7.d()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r7 = r7.f()
            clhq r0 = r4.n
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = r0.a(r5)
            clmb r0 = new clmb
            r0.<init>(r6, r7, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clmh.k(alqm, clod, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.clod r19, java.util.List r20, defpackage.alqm r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clmh.l(clod, java.util.List, alqm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r0.a(r2) == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        if (n(r0, r14, r11, r2) != r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
    
        if (n(r4, r11, r0, r2) == r3) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /* JADX WARN: Type inference failed for: r17v0, types: [clmh] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.fcxy r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clmh.m(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.clod r18, java.util.List r19, defpackage.alqm r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clmh.n(clod, java.util.List, alqm, fcxy):java.lang.Object");
    }
}
