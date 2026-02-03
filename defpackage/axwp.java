package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwp implements axur {
    public final Action A;
    public final aymo B;
    private final cogw D;
    private final cmvy E;
    private final fcsu F;
    private final bbhh G;
    private final Optional H;
    private final fcsu I;
    private final aipo J;
    private final crtq K;
    private final fcsu L;
    private final cmop M;
    private final axkf N;
    private final ayqd O;
    private final bxlc P;
    private final bbfn Q;
    private final dqsn R;
    private final cqjy S;
    private final cmqf T;
    private final bydb U;
    private final ckxh V;
    private final aiyt W;
    private final Optional X;
    private final fcsu Y;
    private final fcyh Z;
    private final fcsu aa;
    private final eygg ab;
    private final dzuc ac;
    private final fcsu ad;
    private final fcsu ae;
    private final fcsu af;
    private final fcsu ag;
    private final fcsu ah;
    private final fcsu ai;
    private final aprr aj;
    private final fcsu ak;
    private final fcsu al;
    private final fcsu am;
    private final fcsu an;
    private final fcsu ao;
    private final awlc ap;
    private final fcsu aq;
    private final fcsu ar;
    private final fcsu as;
    private final fcsu at;
    private final ayeo au;
    public final Context c;
    public final cmos d;
    public final byeb e;
    public final ajhd f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final cmqj m;
    public final bbdl n;
    public final cmoq o;
    public final axsh p;
    public final bahv q;
    public final fcsu r;
    public final fcsu s;
    public final fdjx t;
    public final fdjx u;
    public final fcyh v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final anty z;
    public static final cqce a = cqce.g("BugleDataModel", "ProcessDownloadedMmsAction");
    public static final eksp b = eksp.c("Bugle");
    private static final eksp C = eksp.c("BugleNotifications");

    public axwp(Context context, cogw cogwVar, cmos cmosVar, cmvy cmvyVar, fcsu fcsuVar, bbhh bbhhVar, Optional optional, byeb byebVar, ajhd ajhdVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, aipo aipoVar, crtq crtqVar, fcsu fcsuVar8, cmqj cmqjVar, fcsu fcsuVar9, bbdl bbdlVar, cmop cmopVar, axkf axkfVar, cmoq cmoqVar, ayqd ayqdVar, bxlc bxlcVar, bbfn bbfnVar, dqsn dqsnVar, ayeo ayeoVar, axsh axshVar, bahv bahvVar, cqjy cqjyVar, cmqf cmqfVar, bydb bydbVar, ckxh ckxhVar, aiyt aiytVar, fcsu fcsuVar10, Optional optional2, fcsu fcsuVar11, fcsu fcsuVar12, fdjx fdjxVar, fdjx fdjxVar2, fcyh fcyhVar, fcyh fcyhVar2, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, eygg eyggVar, dzuc dzucVar, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, aprr aprrVar, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, awlc awlcVar, anty antyVar, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, Action action) {
        this.c = context;
        this.D = cogwVar;
        this.d = cmosVar;
        this.E = cmvyVar;
        this.F = fcsuVar;
        this.G = bbhhVar;
        this.H = optional;
        this.e = byebVar;
        this.f = ajhdVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
        this.I = fcsuVar7;
        this.J = aipoVar;
        this.K = crtqVar;
        this.l = fcsuVar8;
        this.m = cmqjVar;
        this.L = fcsuVar9;
        this.n = bbdlVar;
        this.M = cmopVar;
        this.N = axkfVar;
        this.o = cmoqVar;
        this.O = ayqdVar;
        this.P = bxlcVar;
        this.Q = bbfnVar;
        this.R = dqsnVar;
        this.au = ayeoVar;
        this.p = axshVar;
        this.q = bahvVar;
        this.S = cqjyVar;
        this.T = cmqfVar;
        this.U = bydbVar;
        this.V = ckxhVar;
        this.W = aiytVar;
        this.r = fcsuVar10;
        this.X = optional2;
        this.s = fcsuVar11;
        this.Y = fcsuVar12;
        this.t = fdjxVar;
        this.u = fdjxVar2;
        this.v = fcyhVar;
        this.Z = fcyhVar2;
        this.w = fcsuVar13;
        this.x = fcsuVar14;
        this.aa = fcsuVar15;
        this.ab = eyggVar;
        this.ac = dzucVar;
        this.y = fcsuVar16;
        this.ad = fcsuVar17;
        this.ae = fcsuVar18;
        this.af = fcsuVar19;
        this.ag = fcsuVar20;
        this.ah = fcsuVar21;
        this.ai = fcsuVar22;
        this.aj = aprrVar;
        this.ak = fcsuVar23;
        this.al = fcsuVar24;
        this.am = fcsuVar25;
        this.an = fcsuVar26;
        this.ao = fcsuVar27;
        this.ap = awlcVar;
        this.z = antyVar;
        this.aq = fcsuVar28;
        this.ar = fcsuVar29;
        this.as = fcsuVar30;
        this.at = fcsuVar31;
        this.A = action;
        aymo aymoVar = action.v;
        aymoVar.getClass();
        this.B = aymoVar;
    }

    public static final cczi b() {
        return cdag.h(cdag.b, "bug_193237225_use_lightweight_scope", false);
    }

    private final Object o(int i, int i2, Uri uri, long j, int i3, fcxy fcxyVar) {
        return ((Boolean) avos.a.e()).booleanValue() ? i(i, i2, uri, j, i3, fcxyVar) : j(i, i2, uri, j, i3, fcxyVar);
    }

    private final Object p(ekgb ekgbVar, fcxy fcxyVar) {
        return k(Optional.of(ekgbVar), fcxyVar);
    }

    private final fcti q() {
        aymo aymoVar = this.B;
        return new fcti(bary.b(aymoVar.l("message_id")), barn.b(aymoVar.l("conversation_id")));
    }

    private final void r(MessageIdType messageIdType, int i) {
        aiyc aiycVar = (aiyc) aiyd.a.createBuilder();
        aiycVar.copyOnWrite();
        aiyd aiydVar = (aiyd) aiycVar.instance;
        aiydVar.c = 2;
        aiydVar.b |= 1;
        elpq elpqVar = (elpq) elpr.a.createBuilder();
        String strB = messageIdType.b();
        elpqVar.copyOnWrite();
        elpr elprVar = (elpr) elpqVar.instance;
        strB.getClass();
        elprVar.b |= 1;
        elprVar.c = strB;
        aiycVar.copyOnWrite();
        aiyd aiydVar2 = (aiyd) aiycVar.instance;
        elpr elprVar2 = (elpr) elpqVar.build();
        elprVar2.getClass();
        aiydVar2.d = elprVar2;
        aiydVar2.b |= 2;
        aiycVar.copyOnWrite();
        aiyd aiydVar3 = (aiyd) aiycVar.instance;
        aiydVar3.b |= 4;
        aiydVar3.e = i;
        aymo aymoVar = this.B;
        int iA = aymoVar.a("result_code");
        aiycVar.copyOnWrite();
        aiyd aiydVar4 = (aiyd) aiycVar.instance;
        aiydVar4.b |= 16;
        aiydVar4.g = iA;
        int iA2 = aymoVar.a("mms_last_connection_failure_cause_code");
        aiycVar.copyOnWrite();
        aiyd aiydVar5 = (aiyd) aiycVar.instance;
        aiydVar5.b |= 64;
        aiydVar5.i = iA2;
        this.W.e((aiyd) aiycVar.build());
    }

    private final void s(axus axusVar) {
        MessageCoreData messageCoreDataE;
        if (axusVar.d() != null) {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("read", Boolean.valueOf(axusVar.k()));
            ainv ainvVarB = this.J.b("Bugle.Telephony.Update.Mms.Read.Latency");
            cdzz.b(axusVar.c().getContentResolver(), axusVar.d(), contentValues, null, null);
            ainvVarB.c();
        }
        if (!axusVar.m().b() && (messageCoreDataE = axusVar.e()) != null && !messageCoreDataE.cF()) {
            ((eksl) C.h()).q("Creating notification from ProcessDownloadedMmsAsyncAction");
            ((cgpi) this.ad.b()).b(axusVar.m(), Duration.ofMillis(axusVar.b()), false);
        }
        ((cggg) this.am.b()).b();
        final ConversationIdType conversationIdTypeM = axusVar.m();
        if (!conversationIdTypeM.b()) {
            this.P.l(conversationIdTypeM, axusVar.h(), new String[0]);
            if (((crlk) this.L.b()).b() && !conversationIdTypeM.b()) {
                String[] strArr = bprf.a;
                bppg bppgVar = new bppg();
                bppgVar.c(1);
                bppgVar.b(axusVar.h().b());
                bppgVar.d(2);
                final bppd bppdVarA = bppgVar.a();
                final dqsy dqsyVarB = bprf.b();
                dqru.b(bprf.b(), "generic_worker_queue", bppdVarA, new Function() { // from class: bppb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVarB.P("generic_worker_queue", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bppc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            bppd bppdVar = bppdVarA;
                            bppdVar.a = String.valueOf(l);
                            bppdVar.fN(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ayeo ayeoVar = this.au;
                MessageIdType messageIdTypeH = axusVar.h();
                Object objE = crbf.c.e();
                objE.getClass();
                ayeoVar.a(conversationIdTypeM, messageIdTypeH, ((Number) objE).intValue()).z();
            }
        }
        final MessageCoreData messageCoreDataE2 = axusVar.e();
        if (messageCoreDataE2 != null) {
            Iterator it = ((Set) this.ab.b()).iterator();
            while (it.hasNext()) {
                ((baxz) it.next()).gb(messageCoreDataE2);
            }
            final ParticipantsTable.BindData bindDataI = axusVar.i();
            if (bindDataI != null) {
                this.ap.d(new Consumer() { // from class: axvd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        baxy baxyVar = (baxy) obj;
                        baxyVar.getClass();
                        axwp axwpVar = this;
                        baxyVar.b(conversationIdTypeM, axwpVar.z.h(((alrj) axwpVar.r.b()).t(bindDataI)));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            Optional optional = this.H;
            final fdap fdapVar = new fdap() { // from class: axvf
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    aikq aikqVar = (aikq) obj;
                    cqce cqceVar = axwp.a;
                    aikqVar.getClass();
                    MessageCoreData messageCoreData = messageCoreDataE2;
                    String strAB = messageCoreData.aB();
                    int i = bbbd.a;
                    aikqVar.a(messageCoreData, ParticipantsTable.b(strAB));
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: axvg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cqce cqceVar = axwp.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        this.G.a(axusVar.h());
        this.P.l(axusVar.g(), axusVar.h(), new String[0]);
    }

    private final void t(cmny cmnyVar) {
        String strC;
        for (baxz baxzVar : (Set) this.ab.b()) {
            Iterator it = cmnyVar.x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strC = null;
                    break;
                }
                cmnz cmnzVar = (cmnz) it.next();
                if (cmnzVar.e()) {
                    strC = cmop.c(cmnzVar);
                    break;
                }
            }
            baxzVar.e(strC);
        }
    }

    private static final void u(bvds bvdsVar, ekhx ekhxVar, ekfw ekfwVar) {
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        ekqgVarListIterator.getClass();
        while (ekqgVarListIterator.hasNext()) {
            ekfwVar.h(new batw(bvdsVar, (String) ekqgVarListIterator.next()));
        }
    }

    public final axus a(int i, int i2, Uri uri) {
        long jS;
        int iF;
        int i3;
        aymo aymoVar = this.B;
        int iB = aymoVar.b("sub_id", -1);
        ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
        Uri uri2 = (Uri) aymoVar.h("notification_uri");
        MessageIdType messageIdTypeB = bary.b(aymoVar.l("message_id"));
        boolean zY = aymoVar.y("auto_download");
        boolean zF = ((bwwe) this.F.b()).f(conversationIdTypeB);
        int iA = i != 2 ? i != 3 ? aymoVar.a("status_if_failed") : 107 : zY ? EnergyProfile.EVCONNECTOR_TYPE_OTHER : 106;
        cqjy cqjyVar = this.S;
        if (cqjyVar.p()) {
            iA = cqjyVar.l;
        }
        int i4 = iA;
        this.p.a(uri2, messageIdTypeB, conversationIdTypeB, i4, i2, uri2 != null, false);
        MessageCoreData messageCoreDataA = ((baxe) this.g.b()).A(messageIdTypeB);
        ajhd ajhdVar = this.f;
        ConversationIdType conversationIdTypeA = barn.a;
        if (messageCoreDataA != null) {
            jS = messageCoreDataA.s();
            conversationIdTypeA = messageCoreDataA.A();
            conversationIdTypeA.getClass();
            iF = messageCoreDataA.f();
        } else {
            jS = -1;
            iF = 0;
        }
        ConversationIdType conversationIdType = conversationIdTypeA;
        long j = jS;
        int iB2 = aymoVar.b("sub_id", -1);
        int iA2 = aymoVar.a("result_code");
        int iA3 = aymoVar.a("http_status_code");
        long jD = aymoVar.d("received_timestamp") * 1000;
        String strL = aymoVar.l("content_location");
        if (cqjyVar.p()) {
            i3 = i4;
        } else {
            ajhdVar.J(iB2, iA2, iA3, iF, aika.i(null, strL, jD, null, null), i4, j, conversationIdType);
            i3 = i4;
            ajft ajftVarE = ajhdVar.e();
            if (ajftVarE != null) {
                ajftVarE.a(0, uri, iA3);
            }
        }
        r(messageIdTypeB, i3);
        ((baqi) this.j.b()).b(conversationIdTypeB, true, bvdk.UNARCHIVED);
        return axus.l(uri, this.c, messageIdTypeB, conversationIdTypeB.a(), zF, null, null, iB, -1L, null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b3, code lost:
    
        if (defpackage.fdin.a(r5, r6, r14) != r15) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0316 A[EDGE_INSN: B:116:0x0316->B:84:0x0316 BREAK  A[LOOP:0: B:61:0x0265->B:83:0x030f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [dzub] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [axwb, fcxy] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [axwp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.axwb
            if (r0 == 0) goto L13
            r0 = r10
            axwb r0 = (defpackage.axwb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axwb r0 = new axwb
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "ProcessDownloadedMmsAsyncAction#executeActionSuspend"
            java.lang.String r4 = "MMS receiving END"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r1 = r0.a
            dzub r0 = r0.e
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L33
            goto L7b
        L33:
            r10 = move-exception
            goto L9b
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            java.lang.Object r2 = r0.a
            dzub r6 = r0.e
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L46
            goto L6b
        L46:
            r10 = move-exception
            r1 = r2
            r0 = r6
            goto L9b
        L4a:
            defpackage.fctl.b(r10)
            dzuc r10 = r9.ac
            dzub r10 = r10.d()
            r10.getClass()
            java.lang.String r2 = "ProcessDownloadedMmsAction.executeAction"
            eieu r2 = defpackage.eiiy.a(r2)     // Catch: java.lang.Throwable -> La1
            r0.e = r10     // Catch: java.lang.Throwable -> L96
            r0.a = r2     // Catch: java.lang.Throwable -> L96
            r0.d = r6     // Catch: java.lang.Throwable -> L96
            java.lang.Object r6 = r9.c(r0)     // Catch: java.lang.Throwable -> L96
            if (r6 == r1) goto L95
            r8 = r6
            r6 = r10
            r10 = r8
        L6b:
            android.os.Bundle r10 = (android.os.Bundle) r10     // Catch: java.lang.Throwable -> L46
            r0.e = r6     // Catch: java.lang.Throwable -> L46
            r0.a = r2     // Catch: java.lang.Throwable -> L46
            r0.d = r5     // Catch: java.lang.Throwable -> L46
            java.lang.Object r10 = r9.h(r10, r0)     // Catch: java.lang.Throwable -> L46
            if (r10 == r1) goto L95
            r1 = r2
            r0 = r6
        L7b:
            defpackage.fczl.a(r1, r7)     // Catch: java.lang.Throwable -> L90
            cqce r1 = defpackage.axwp.a
            r1.l(r4)
            dzuc r1 = r9.ac
            dzfh r2 = new dzfh
            r2.<init>(r3)
            dzua r3 = defpackage.dzua.SUCCESS
            r1.f(r0, r2, r7, r3)
            return r10
        L90:
            r10 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto La2
        L95:
            return r1
        L96:
            r0 = move-exception
            r1 = r0
            r0 = r10
            r10 = r1
            r1 = r2
        L9b:
            throw r10     // Catch: java.lang.Throwable -> L9c
        L9c:
            r2 = move-exception
            defpackage.fczl.a(r1, r10)     // Catch: java.lang.Throwable -> L90
            throw r2     // Catch: java.lang.Throwable -> L90
        La1:
            r0 = move-exception
        La2:
            cqce r1 = defpackage.axwp.a
            r1.l(r4)
            dzuc r1 = r9.ac
            dzfh r2 = new dzfh
            r2.<init>(r3)
            dzua r3 = defpackage.dzua.SUCCESS
            r1.f(r10, r2, r7, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r18, int r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.e(java.lang.String, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.axwe
            if (r0 == 0) goto L13
            r0 = r6
            axwe r0 = (defpackage.axwe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axwe r0 = new axwe
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "MMS receiving END"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            r0.c = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r5.g(r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r6     // Catch: java.lang.Throwable -> L29
            cqce r0 = defpackage.axwp.a
            r0.l(r3)
            return r6
        L47:
            cqce r0 = defpackage.axwp.a
            r0.l(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.axwh
            if (r0 == 0) goto L13
            r0 = r12
            axwh r0 = (defpackage.axwh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axwh r0 = new axwh
            r0.<init>(r11, r12)
        L18:
            r8 = r0
            java.lang.Object r12 = r8.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.c
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L32
            if (r1 != r10) goto L2a
            defpackage.fctl.b(r12)
            r1 = r11
            goto L5d
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            defpackage.fctl.b(r12)
            aymo r12 = r11.B
            java.lang.String r1 = "send_deferred_resp_status"
            boolean r1 = r12.y(r1)
            if (r1 == 0) goto L47
            cqce r12 = defpackage.axwp.a
            java.lang.String r0 = "Exception while sending deferred NotifyRespInd"
            r12.r(r0)
            return r9
        L47:
            java.lang.String r1 = "sub_id"
            r2 = -1
            int r7 = r12.b(r1, r2)
            r8.c = r10
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            java.lang.Object r12 = r1.o(r2, r3, r4, r5, r7, r8)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            aymo r12 = r1.B
            java.lang.String r0 = "cloud_sync_id"
            java.lang.String r12 = r12.l(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r12 = r12 ^ r10
            r0 = 0
            int r12 = defpackage.axvr.a(r12, r0)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = r1.A
            defpackage.axtl.d(r12, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.os.Bundle r26, defpackage.fcxy r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.h(android.os.Bundle, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r17, final int r18, android.net.Uri r19, long r20, int r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.i(int, int, android.net.Uri, long, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x044d, code lost:
    
        if (r4 != r11) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0451 A[PHI: r0 r2 r3 r11
      0x0451: PHI (r0v33 axvu) = (r0v29 axvu), (r0v35 axvu) binds: [B:94:0x0433, B:97:0x044f] A[DONT_GENERATE, DONT_INLINE]
      0x0451: PHI (r2v26 axus) = (r2v22 axus), (r2v28 axus) binds: [B:94:0x0433, B:97:0x044f] A[DONT_GENERATE, DONT_INLINE]
      0x0451: PHI (r3v29 cmny) = (r3v25 cmny), (r3v30 cmny) binds: [B:94:0x0433, B:97:0x044f] A[DONT_GENERATE, DONT_INLINE]
      0x0451: PHI (r11v9 java.lang.Object) = (r11v6 java.lang.Object), (r11v10 java.lang.Object) binds: [B:94:0x0433, B:97:0x044f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0453  */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r22, final int r23, final android.net.Uri r24, long r25, int r27, defpackage.fcxy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.j(int, int, android.net.Uri, long, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(j$.util.Optional r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axwm
            if (r0 == 0) goto L13
            r0 = r7
            axwm r0 = (defpackage.axwm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axwm r0 = new axwm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            axwp r6 = r0.e
            j$.util.Optional r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L56
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L48
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.fctl.b(r7)
            r0.d = r6     // Catch: java.lang.Throwable -> L56
            r0.e = r5     // Catch: java.lang.Throwable -> L56
            r0.c = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r7 = r5.l(r6, r0)     // Catch: java.lang.Throwable -> L56
            if (r7 == r1) goto L55
            r0 = r7
            r7 = r5
        L48:
            j$.util.Optional r0 = (j$.util.Optional) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L56
            axvu r1 = new axvu     // Catch: java.lang.Throwable -> L56
            ekgb r6 = (defpackage.ekgb) r6     // Catch: java.lang.Throwable -> L56
            r1.<init>(r7, r0, r6)     // Catch: java.lang.Throwable -> L56
        L55:
            return r1
        L56:
            r6 = move-exception
            eksp r7 = defpackage.axwp.b
            ekrw r7 = r7.j()
            java.lang.String r0 = "Unable to perform BCM"
            defpackage.a.N(r7, r0, r6)
            fcsu r7 = r5.aa
            java.lang.Object r7 = r7.b()
            cden r7 = (defpackage.cden) r7
            eiju r6 = r7.a(r6)
            defpackage.auvh.h(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.k(j$.util.Optional, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(j$.util.Optional r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axwo
            if (r0 == 0) goto L13
            r0 = r7
            axwo r0 = (defpackage.axwo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axwo r0 = new axwo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.v
            fcyh r7 = defpackage.eicg.a(r7)
            axwn r2 = new axwn
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axwp.l(j$.util.Optional, fcxy):java.lang.Object");
    }

    public final void m(ConversationIdType conversationIdType, boolean z) {
        if (((cdmo) this.al.b()).d()) {
            if (z) {
                return;
            }
        } else if (z) {
            cdmg.c(conversationIdType);
            return;
        }
        cdmg.b(conversationIdType);
    }

    public final axus n(baqv baqvVar, cmny cmnyVar, axcy axcyVar, long j, final MessageIdType messageIdType, final ConversationIdType conversationIdType, long j2, Uri uri, Uri uri2, final bvdk bvdkVar, ParticipantsTable.BindData bindData, boolean z) {
        long epochMilli;
        cqjy cqjyVar;
        int iA = elow.a(this.B.a("mms_api"));
        fcsu fcsuVar = this.F;
        boolean zF = ((bwwe) fcsuVar.b()).f(baqvVar.a());
        boolean zG = ((bwwe) fcsuVar.b()).g(baqvVar.a());
        cmnyVar.l = zF;
        cmnyVar.m = zG || this.K.a(baqvVar.a()) || !z;
        cqjy cqjyVar2 = this.S;
        int i = cqjyVar2.p() ? cqjyVar2.l : 100;
        axkf axkfVar = this.N;
        boolean zA = axkf.b(bindData.R()).a();
        if (zA) {
            axkfVar.a(bindData.R());
        }
        MessageCoreData messageCoreDataA = this.M.a(cmnyVar, baqvVar.a(), bindData.R(), axcyVar.f(), i, zA ? bvdz.VERIFICATION_UNVERIFIED : bvdz.VERIFICATION_NA, j);
        if (((csme) this.at.b()).b()) {
            ArrayList arrayList = ((MessageData) messageCoreDataA).i;
            bvdq bvdqVar = bvdq.PENDING_VERDICT;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((MessagePartCoreData) it.next()).ax(bvdqVar);
            }
        }
        messageCoreDataA.cf();
        ArrayList arrayList2 = ((MessageData) messageCoreDataA).i;
        Collection.EL.stream(arrayList2).forEach(new Consumer() { // from class: bahg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((MessagePartCoreData) obj).ad();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Collection.EL.stream(arrayList2).forEach(new Consumer() { // from class: bahi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((MessagePartCoreData) obj).ae();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.T.i(messageCoreDataA.o());
        final MessageCoreData messageCoreDataA2 = ((baxe) this.g.b()).A(messageIdType);
        if (messageCoreDataA2 == null) {
            a.r("Message deleted prior to update");
            this.U.g(messageCoreDataA);
            ((bauh) this.ae.b()).a(messageCoreDataA);
            epochMilli = -1;
            cqjyVar = cqjyVar2;
        } else {
            messageCoreDataA.cc(messageIdType);
            messageCoreDataA.bW(messageCoreDataA2.t());
            epochMilli = this.D.f().toEpochMilli();
            messageCoreDataA.aZ(epochMilli);
            cqjyVar = cqjyVar2;
            if (cqjyVar2.p()) {
                messageCoreDataA.bU(cqjyVar.l);
            }
            Iterator it2 = ((Set) this.ab.b()).iterator();
            while (it2.hasNext()) {
                ((baxz) it2.next()).g(messageCoreDataA);
            }
            this.U.j(conversationIdType, messageCoreDataA);
        }
        long j3 = epochMilli;
        if (!cqjyVar.p()) {
            ajhd ajhdVar = this.f;
            ajhdVar.ai(messageCoreDataA, cmnyVar.q, j2, false, iA);
            ajft ajftVarE = ajhdVar.e();
            if (ajftVarE != null) {
                ajftVarE.b(0, uri, j2, 0L, messageCoreDataA.am());
            }
            r(messageIdType, i);
            Optional optional = this.X;
            final fdap fdapVar = new fdap() { // from class: axuw
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cdzq cdzqVar = (cdzq) obj;
                    cqce cqceVar = axwp.a;
                    cdzqVar.getClass();
                    cdzqVar.c();
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: axux
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cqce cqceVar = axwp.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (!conversationIdType.equals(baqvVar.a()) && !((cdww) this.I.b()).g(conversationIdType)) {
            final baqi baqiVar = (baqi) this.j.b();
            baqiVar.d(new Runnable() { // from class: bapt
                @Override // java.lang.Runnable
                public final void run() {
                    bojh bojhVarR;
                    cqaz.h();
                    baqi baqiVar2 = baqiVar;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    MessageIdType messageIdType2 = messageIdType;
                    if (messageIdType2.c() || ((bojhVarR = ((bakt) baqiVar2.h.b()).r(conversationIdType2)) != null && bojhVarR.E().equals(messageIdType2))) {
                        baqiVar2.b(conversationIdType2, true, bvdkVar);
                    }
                }
            }, "ConversationMetadataDatabaseOperations#maybeRefreshConversationMetadata", conversationIdType);
        }
        ((baqi) this.j.b()).b(baqvVar.a(), true, bvdkVar);
        this.P.e(baqvVar.a(), true);
        if (messageCoreDataA2 != null) {
            this.R.g(new dqsm() { // from class: axvb
                @Override // defpackage.dqsm
                public final eieu a() {
                    cqce cqceVar = axwp.a;
                    return eiiy.a("ProcessDownloadedMmsAsyncAction.createMmsResultValues.runAfterCommit.spam");
                }
            }, null, new Runnable() { // from class: axvc
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    axwp axwpVar = this.a;
                    MessageCoreData messageCoreDataW = ((baxe) axwpVar.g.b()).w(messageCoreDataA2.C());
                    if (messageCoreDataW != null) {
                        ((cscx) axwpVar.l.b()).a(messageCoreDataW, null, null);
                    }
                }
            });
        }
        return axus.l(uri2, this.c, messageIdType, conversationIdType.a(), zF, baqvVar, messageCoreDataA, axcyVar.e(), j3, bindData, z);
    }
}
