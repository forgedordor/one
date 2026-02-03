package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrb {
    public static final /* synthetic */ int f = 0;
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpc");
    private static final cczi h = cdag.h(cdag.b, "send_raw_normalized_destination_for_group_member", true);
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcyh e;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;

    static {
        cdag.x("tachyon_spam_grpc_send_protocol_for_enforcement_signal");
    }

    public csrb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcyhVar.getClass();
        this.a = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.b = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.c = fcsuVar7;
        this.d = fcsuVar8;
        this.m = fcsuVar9;
        this.n = fcsuVar10;
        this.o = fcsuVar11;
        this.e = fcyhVar;
    }

    public static final String m(String str, String str2) {
        str.getClass();
        str2.getClass();
        int i = elcz.a;
        return elcx.a.c(str2.concat(str), StandardCharsets.UTF_8).toString();
    }

    static /* synthetic */ Object q(csrb csrbVar, felv felvVar, ParticipantsTable.BindData bindData, csoc csocVar, List list, csrn csrnVar, cspj cspjVar, eykc eykcVar, fcxy fcxyVar, int i) {
        return fdin.a(eicg.a(csrbVar.e), new csra(null, felvVar, bindData, csrbVar, csocVar, (i & 8) != 0 ? null : list, csrnVar, cspjVar, (i & 64) != 0 ? null : eykcVar), fcxyVar);
    }

    private static final long r(long j) {
        return TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j));
    }

    private static final ezto s(MessageCoreData messageCoreData, ezol ezolVar, ezol ezolVar2, String str, int i) {
        int iB = csqm.b(messageCoreData.d());
        eztn eztnVar = (eztn) ezto.a.createBuilder();
        eztnVar.getClass();
        final ezbb ezbbVar = new ezbb(eztnVar);
        ezolVar.getClass();
        eztn eztnVar2 = ezbbVar.a;
        eztnVar2.copyOnWrite();
        ezto eztoVar = (ezto) eztnVar2.instance;
        eztoVar.f = ezolVar;
        eztoVar.b |= 1;
        ezolVar2.getClass();
        eztnVar2.copyOnWrite();
        ezto eztoVar2 = (ezto) eztnVar2.instance;
        eztoVar2.g = ezolVar2;
        eztoVar2.b |= 2;
        evvp evvpVarA = cssu.a(r(messageCoreData.o()));
        evvpVarA.getClass();
        eztnVar2.copyOnWrite();
        ezto eztoVar3 = (ezto) eztnVar2.instance;
        eztoVar3.h = evvpVarA;
        eztoVar3.b |= 8;
        eztnVar2.copyOnWrite();
        ((ezto) eztnVar2.instance).j = felp.a(iB);
        if (messageCoreData.d() == 3) {
            messageCoreData.F().g(new Consumer() { // from class: csqk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    int i2 = csrb.f;
                    String strF = ((basd) obj).f();
                    eztn eztnVar3 = ezbbVar.a;
                    eztnVar3.copyOnWrite();
                    ezto eztoVar4 = (ezto) eztnVar3.instance;
                    ezto eztoVar5 = ezto.a;
                    eztoVar4.e = strF;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (str != null) {
            eztnVar2.copyOnWrite();
            ezto eztoVar4 = (ezto) eztnVar2.instance;
            eztoVar4.c = 8;
            eztoVar4.d = str;
        }
        eztnVar2.copyOnWrite();
        ((ezto) eztnVar2.instance).i = i - 2;
        evsn evsnVarBuild = eztnVar2.build();
        evsnVarBuild.getClass();
        return (ezto) evsnVarBuild;
    }

    public final ezol a(String str) {
        felm felmVar;
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.getClass();
        cqce cqceVar = cmvy.a;
        if (alwh.i(str)) {
            felmVar = felm.EMAIL;
        } else {
            fcsu fcsuVar = this.i;
            felmVar = alwh.k(str) ? felm.SHORT_CODE : ((cmvy) fcsuVar.b()).g(str) ? felm.PHONE_NUMBER : felm.NOT_KNOWN;
        }
        eymt.d(felmVar, ezokVar);
        if (str == null) {
            str = "-1";
        }
        eymt.c(str, ezokVar);
        eymt.b("Bugle", ezokVar);
        return eymt.a(ezokVar);
    }

    public final ezpp b() {
        ezpo ezpoVarA = ((cenj) this.k.b()).a("Bugle");
        ezpp ezppVar = (ezpp) ezpoVarA.instance;
        String str = ezppVar.c;
        str.getClass();
        ezol ezolVar = ezppVar.h;
        if (ezolVar == null) {
            ezolVar = ezol.a;
        }
        if (ezolVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        evsn evsnVarBuild = ezpoVarA.build();
        evsnVarBuild.getClass();
        return (ezpp) evsnVarBuild;
    }

    public final Object c(boolean z, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new csqp(null, this, z), fcxyVar);
    }

    public final Object d(String str, fcxy fcxyVar) {
        return ((csrc) this.c.b()).b(ceoy.b(str), "tachyon_registration", fcxyVar);
    }

    public final Object e(ezsn ezsnVar, String str, eykc eykcVar, fcxy fcxyVar) {
        csrc csrcVar = (csrc) this.c.b();
        evvp evvpVar = ezsnVar.f;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        evvpVar.getClass();
        String strValueOf = String.valueOf(evxd.d(evvpVar).toEpochMilli());
        fcti[] fctiVarArr = new fcti[4];
        felv felvVarB = felv.b(ezsnVar.c);
        if (felvVarB == null) {
            felvVarB = felv.UNRECOGNIZED;
        }
        fcti fctiVar = new fcti(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, m(strValueOf, felvVarB.name()));
        int i = 0;
        fctiVarArr[0] = fctiVar;
        ezol ezolVar = ezsnVar.d;
        if (ezolVar == null) {
            ezolVar = ezol.a;
        }
        String str2 = ezolVar.c;
        str2.getClass();
        fctiVarArr[1] = new fcti("reported_id", m(strValueOf, str2));
        fctiVarArr[2] = new fcti("reporter_id", m(strValueOf, str));
        fctiVarArr[3] = new fcti("salt", m(strValueOf, ""));
        Map mapH = fcwa.h(fctiVarArr);
        felv felvVarB2 = felv.b(ezsnVar.c);
        if (felvVarB2 == null) {
            felvVarB2 = felv.UNRECOGNIZED;
        }
        if (felvVarB2 == felv.USER_MARKED_AS_SPAM) {
            for (ezto eztoVar : ezsnVar.e) {
                int i2 = i + 1;
                String strG = a.g(i, "content_");
                ezol ezolVar2 = eztoVar.f;
                if (ezolVar2 == null) {
                    ezolVar2 = ezol.a;
                }
                mapH.put(strG, m(strValueOf, a.q(eztoVar.c == 8 ? (String) eztoVar.d : "", ezolVar2.c, ":")));
                i = i2;
            }
        }
        if ((ezsnVar.b & 64) != 0) {
            ezol ezolVar3 = ezsnVar.j;
            if (ezolVar3 == null) {
                ezolVar3 = ezol.a;
            }
            if (!fdbq.f(ezolVar3.c, "")) {
                ezol ezolVar4 = ezsnVar.j;
                if (ezolVar4 == null) {
                    ezolVar4 = ezol.a;
                }
                String str3 = ezolVar4.c;
                str3.getClass();
                mapH.put("group_id", m(strValueOf, str3));
            }
        }
        if (eykcVar != null) {
            int iA = csqm.a(eykcVar);
            mapH.put("enforcement_action_type", m(strValueOf, iA != 2 ? iA != 3 ? "ALLOWLIST" : "SPAM_FOLDER" : "SHOW_WARNING"));
        }
        return csrcVar.b(mapH, "tachyon_spam_signal", fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.eztc r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.csqs
            if (r0 == 0) goto L13
            r0 = r11
            csqs r0 = (defpackage.csqs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csqs r0 = new csqs
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r10 = r0.d
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L8f
        L2a:
            r11 = move-exception
            goto L98
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.fctl.b(r11)
            fcyh r11 = r0.u()
            boolean r11 = defpackage.eicg.b(r11)
            if (r11 == 0) goto L9e
            java.lang.String r11 = "TachyonSpamGrpc#getUrlSpamState#fetchFuzzyMatchingTemplates"
            eieu r11 = defpackage.eiiy.h(r11)
            fcsu r2 = r9.a     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L94
            csqj r2 = (defpackage.csqj) r2     // Catch: java.lang.Throwable -> L94
            eyjy r2 = r2.a()     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L59
            defpackage.fczl.a(r11, r3)
            return r3
        L59:
            ezpp r5 = r9.b()     // Catch: java.lang.Throwable -> L94
            fcsu r6 = r9.c     // Catch: java.lang.Throwable -> L94
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L94
            csrc r6 = (defpackage.csrc) r6     // Catch: java.lang.Throwable -> L94
            evsf r10 = r10.toBuilder()     // Catch: java.lang.Throwable -> L94
            eztb r10 = (defpackage.eztb) r10     // Catch: java.lang.Throwable -> L94
            r10.copyOnWrite()     // Catch: java.lang.Throwable -> L94
            MessageType extends evsn<MessageType, BuilderType> r7 = r10.instance     // Catch: java.lang.Throwable -> L94
            eztc r7 = (defpackage.eztc) r7     // Catch: java.lang.Throwable -> L94
            r7.e = r5     // Catch: java.lang.Throwable -> L94
            int r5 = r7.b     // Catch: java.lang.Throwable -> L94
            r5 = r5 | r4
            r7.b = r5     // Catch: java.lang.Throwable -> L94
            evsn r10 = r10.build()     // Catch: java.lang.Throwable -> L94
            r10.getClass()     // Catch: java.lang.Throwable -> L94
            eztc r10 = (defpackage.eztc) r10     // Catch: java.lang.Throwable -> L94
            r0.d = r11     // Catch: java.lang.Throwable -> L94
            r0.c = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r10 = r6.c(r2, r10, r0)     // Catch: java.lang.Throwable -> L94
            if (r10 == r1) goto L93
            r8 = r11
            r11 = r10
            r10 = r8
        L8f:
            defpackage.fczl.a(r10, r3)
            return r11
        L93:
            return r1
        L94:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L98:
            throw r11     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            defpackage.fczl.a(r10, r11)
            throw r0
        L9e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.f(eztc, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.csqt
            if (r0 == 0) goto L13
            r0 = r7
            csqt r0 = (defpackage.csqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csqt r0 = new csqt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4c
        L36:
            defpackage.fctl.b(r7)
            if (r6 == 0) goto L4f
            fcsu r6 = r5.m
            java.lang.Object r6 = r6.b()
            crzf r6 = (defpackage.crzf) r6
            r0.c = r4
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L4c
            goto L5f
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            goto L62
        L4f:
            fcsu r6 = r5.m
            java.lang.Object r6 = r6.b()
            crzf r6 = (defpackage.crzf) r6
            r0.c = r3
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r7 = (java.lang.String) r7
        L62:
            ezol r6 = defpackage.ezol.a
            evsf r6 = r6.createBuilder()
            ezok r6 = (defpackage.ezok) r6
            r6.getClass()
            felm r0 = defpackage.felm.OPAQUE_ID
            defpackage.eymt.d(r0, r6)
            defpackage.eymt.c(r7, r6)
            java.lang.String r7 = "Bugle"
            defpackage.eymt.b(r7, r6)
            ezol r6 = defpackage.eymt.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.g(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.csqu
            if (r0 == 0) goto L13
            r0 = r7
            csqu r0 = (defpackage.csqu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csqu r0 = new csqu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4c
        L36:
            defpackage.fctl.b(r7)
            if (r6 == 0) goto L4f
            fcsu r6 = r5.m
            java.lang.Object r6 = r6.b()
            crzf r6 = (defpackage.crzf) r6
            r0.c = r4
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L4c
            goto L5f
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            goto L62
        L4f:
            fcsu r6 = r5.m
            java.lang.Object r6 = r6.b()
            crzf r6 = (defpackage.crzf) r6
            r0.c = r3
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r7 = (java.lang.String) r7
        L62:
            ezpx r6 = defpackage.ezpx.a
            evsf r6 = r6.createBuilder()
            ezpu r6 = (defpackage.ezpu) r6
            r6.getClass()
            ezpw r0 = defpackage.ezpw.a
            evsf r0 = r0.createBuilder()
            ezpv r0 = (defpackage.ezpv) r0
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            evqs r7 = defpackage.evqs.y(r7, r1)
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            ezpw r1 = (defpackage.ezpw) r1
            r1.b = r7
            crzd r7 = defpackage.crzf.b
            cczi r7 = defpackage.crzd.b
            java.lang.Object r7 = r7.e()
            r7.getClass()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            ezpw r1 = (defpackage.ezpw) r1
            r1.c = r7
            evsn r7 = r0.build()
            r7.getClass()
            ezpw r7 = (defpackage.ezpw) r7
            r6.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r6.instance
            ezpx r0 = (defpackage.ezpx) r0
            r0.c = r7
            int r7 = r0.b
            r7 = r7 | r4
            r0.b = r7
            evsn r6 = r6.build()
            r6.getClass()
            ezpx r6 = (defpackage.ezpx) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.h(boolean, fcxy):java.lang.Object");
    }

    public final void i(evyv evyvVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        crzm crzmVarB = ((crzf) this.m.b()).b(conversationIdType, messageIdType);
        if (crzmVarB == null) {
            return;
        }
        evyn evynVar = (evyn) evyo.a.createBuilder();
        evynVar.getClass();
        String strM = crzmVarB.m();
        if (strM != null && strM.length() != 0) {
            crzd crzdVar = crzf.b;
            String strM2 = crzmVarB.m();
            strM2.getClass();
            evqs evqsVarA = crzdVar.a(strM2);
            evynVar.copyOnWrite();
            evyo evyoVar = (evyo) evynVar.instance;
            evyoVar.b |= 2;
            evyoVar.d = evqsVarA;
        }
        String strN = crzmVarB.n();
        if (strN != null && strN.length() != 0) {
            crzd crzdVar2 = crzf.b;
            String strN2 = crzmVarB.n();
            strN2.getClass();
            evqs evqsVarA2 = crzdVar2.a(strN2);
            evynVar.copyOnWrite();
            evyo evyoVar2 = (evyo) evynVar.instance;
            evyoVar2.b |= 1;
            evyoVar2.c = evqsVarA2;
        }
        evyo evyoVar3 = (evyo) evynVar.build();
        evyvVar.copyOnWrite();
        evyx evyxVar = (evyx) evyvVar.instance;
        evyx evyxVar2 = evyx.a;
        evyoVar3.getClass();
        evyxVar.n = evyoVar3;
        evyxVar.b |= 2048;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.evyv r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.csqn
            if (r0 == 0) goto L13
            r0 = r7
            csqn r0 = (defpackage.csqn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csqn r0 = new csqn
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            evyv r5 = r0.d
            defpackage.fctl.b(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            cczi r7 = defpackage.crtr.a
            ejxr r7 = defpackage.crtr.W
            java.lang.Object r7 = r7.get()
            cczi r7 = (defpackage.cczi) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb8
            fcsu r7 = r4.o
            java.lang.Object r7 = r7.b()
            cspg r7 = (defpackage.cspg) r7
            cspf r6 = r7.a(r6)
            if (r6 == 0) goto Lb8
            fdkf r6 = r6.f()
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 == r1) goto Lb7
        L66:
            java.util.List r7 = (java.util.List) r7
            int r6 = r7.size()
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r5.instance
            evyx r0 = (defpackage.evyx) r0
            evyx r1 = defpackage.evyx.a
            int r1 = r0.b
            r1 = r1 | 64
            r0.b = r1
            r0.h = r6
            boolean r6 = r7 instanceof java.util.Collection
            r0 = 0
            if (r6 == 0) goto L89
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L89
            goto La7
        L89:
            java.util.Iterator r6 = r7.iterator()
        L8d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La7
            java.lang.Object r7 = r6.next()
            csoc r7 = (defpackage.csoc) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L8d
            int r0 = r0 + 1
            if (r0 >= 0) goto L8d
            defpackage.fcva.l()
            goto L8d
        La7:
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r6 = r5.instance
            evyx r6 = (defpackage.evyx) r6
            int r7 = r6.b
            r7 = r7 | 128(0x80, float:1.794E-43)
            r6.b = r7
            r6.i = r0
            return r5
        Lb7:
            return r1
        Lb8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.j(evyv, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    public final void k(evyv evyvVar) {
        String strS = ((crny) this.n.b()).j().s();
        strS.getClass();
        if (strS.length() > 0) {
            evyl evylVar = (evyl) evym.a.createBuilder();
            String strD = ejuf.d(strS);
            strD.getClass();
            evylVar.copyOnWrite();
            evym evymVar = (evym) evylVar.instance;
            evymVar.b |= 1;
            evymVar.c = strD;
            evyvVar.copyOnWrite();
            evyx evyxVar = (evyx) evyvVar.instance;
            evym evymVar2 = (evym) evylVar.build();
            evyx evyxVar2 = evyx.a;
            evymVar2.getClass();
            evyxVar.f = evymVar2;
            evyxVar.b |= 8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.felv r19, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r20, defpackage.csoc r21, java.util.List r22, defpackage.csrn r23, defpackage.ezol r24, defpackage.ezol r25, defpackage.cspj r26, defpackage.eykc r27, java.lang.Integer r28, defpackage.fcxy r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.n(felv, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, csoc, java.util.List, csrn, ezol, ezol, cspj, eykc, java.lang.Integer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r13, defpackage.csrn r14, defpackage.eykc r15, defpackage.cspj r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.csqy
            if (r1 == 0) goto L15
            r1 = r0
            csqy r1 = (defpackage.csqy) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            csqy r1 = new csqy
            r1.<init>(r12, r0)
        L1a:
            r10 = r1
            java.lang.Object r0 = r10.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r10.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r0)
            goto L4b
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            defpackage.fctl.b(r0)
            felv r0 = defpackage.felv.DEVICE_SPAM_SIGNAL
            r10.c = r3
            r6 = 0
            r11 = 8
            r5 = 0
            r2 = r12
            r4 = r13
            r7 = r14
            r9 = r15
            r8 = r16
            r3 = r0
            java.lang.Object r0 = q(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            ezsq r0 = (defpackage.ezsq) r0
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.o(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, csrn, eykc, cspj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.csoc r12, defpackage.csrn r13, defpackage.eykc r14, defpackage.cspj r15, defpackage.fcxy r16) throws java.lang.Throwable {
        /*
            r11 = this;
            r1 = r16
            boolean r2 = r1 instanceof defpackage.csqz
            if (r2 == 0) goto L15
            r2 = r1
            csqz r2 = (defpackage.csqz) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.c = r3
            goto L1a
        L15:
            csqz r2 = new csqz
            r2.<init>(r11, r1)
        L1a:
            r8 = r2
            java.lang.Object r1 = r8.a
            fcyl r10 = defpackage.fcyl.a
            int r2 = r8.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r1)
            goto L62
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            defpackage.fctl.b(r1)
            r12.l()
            fcsu r1 = r11.l
            java.lang.Object r1 = r1.b()
            bbca r1 = (defpackage.bbca) r1
            cspo r2 = r12.l()
            java.lang.String r2 = r2.a
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r1.b(r2)
            if (r2 != 0) goto L4f
            fctx r1 = defpackage.fctx.a
            return r1
        L4f:
            felv r1 = defpackage.felv.DEVICE_SPAM_SIGNAL
            r8.c = r3
            r4 = 0
            r9 = 8
            r0 = r11
            r3 = r12
            r5 = r13
            r7 = r14
            r6 = r15
            java.lang.Object r1 = q(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r10) goto L62
            return r10
        L62:
            ezsq r1 = (defpackage.ezsq) r1
            fctx r0 = defpackage.fctx.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrb.p(csoc, csrn, eykc, cspj, fcxy):java.lang.Object");
    }
}
