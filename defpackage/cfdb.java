package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdb {
    public final fcsu A;
    public final cfis B;
    public final eygg C;
    public final cqzo D;
    public final crmx E;
    public final fcsu F;
    public final fcsu G;
    public final bacs H;
    public final aypj I;
    public final cfga J;
    public final cfdf K;
    public final cexq L;
    public final aixq M;
    public final crtn N;
    public final fcsu O;
    public final alrj P;
    public final fcsu Q;
    public final bael R;
    public final baes S;
    public final fcsu T;
    public final fcsu U;
    public final fcsu V;
    public final fcsu W;
    public final fcsu X;
    public final awhr Y;
    public final awhr Z;
    public final fcsu aa;
    public final fcsu ab;
    public final appk ac;
    public final fcsu ad;
    public final fcsu ae;
    public final fcsu af;
    public final aqmq ag;
    public final cfad ah;
    public final aykj ai;
    private final cpkk ak;
    private final fcsu al;
    private final ayox am;
    private final avnh an;
    private final fcsu ao;
    private final Map ap;
    private final fcsu aq;
    private final fcsu ar;
    private final fcsu as;
    private final fcsu at;
    private final cfeh au;
    public final fcsu d;
    public final aypp e;
    public final cpgf f;
    public final fcsu g;
    public final aypm h;
    public final aypl i;
    public final cdys j;
    public final fcsu k;
    public final cqiz l;
    public final ayqp m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final bvin q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final bvkr u;
    public final fcsu v;
    public final ScheduledExecutorService w;
    public final eosc x;
    public final baeb y;
    public final ains z;
    public static final ejxr a = cdag.v("populate_is_etouffee_rcs_group_eligible");
    public static final ejxr b = cdag.v("catch_status_errors_from_ditto_request_handlers");
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2");
    private static final long aj = TimeUnit.DAYS.toMicros(1);

    public cfdb(fcsu fcsuVar, aypp ayppVar, cpgf cpgfVar, fcsu fcsuVar2, cpkk cpkkVar, fcsu fcsuVar3, ayox ayoxVar, cfad cfadVar, aypm aypmVar, aypl ayplVar, cdys cdysVar, avnh avnhVar, fcsu fcsuVar4, cqiz cqizVar, ayqp ayqpVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, bvin bvinVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, bvkr bvkrVar, fcsu fcsuVar11, fcsu fcsuVar12, ScheduledExecutorService scheduledExecutorService, eosc eoscVar, baeb baebVar, Map map, ains ainsVar, fcsu fcsuVar13, cfis cfisVar, eygg eyggVar, cqzo cqzoVar, crmx crmxVar, fcsu fcsuVar14, fcsu fcsuVar15, bacs bacsVar, aypj aypjVar, cfga cfgaVar, cfdf cfdfVar, cfeh cfehVar, cexq cexqVar, aixq aixqVar, crtn crtnVar, aykj aykjVar, fcsu fcsuVar16, alrj alrjVar, fcsu fcsuVar17, bael baelVar, baes baesVar, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, awhr awhrVar, awhr awhrVar2, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, appk appkVar, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, aqmq aqmqVar) {
        this.d = fcsuVar;
        this.e = ayppVar;
        this.f = cpgfVar;
        this.g = fcsuVar2;
        this.ak = cpkkVar;
        this.al = fcsuVar3;
        this.am = ayoxVar;
        this.ah = cfadVar;
        this.h = aypmVar;
        this.i = ayplVar;
        this.j = cdysVar;
        this.an = avnhVar;
        this.k = fcsuVar4;
        this.l = cqizVar;
        this.m = ayqpVar;
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.q = bvinVar;
        this.r = fcsuVar8;
        this.s = fcsuVar9;
        this.t = fcsuVar10;
        this.u = bvkrVar;
        this.v = fcsuVar11;
        this.ao = fcsuVar12;
        this.w = scheduledExecutorService;
        this.x = eoscVar;
        this.y = baebVar;
        this.ap = map;
        this.z = ainsVar;
        this.A = fcsuVar13;
        this.B = cfisVar;
        this.C = eyggVar;
        this.D = cqzoVar;
        this.E = crmxVar;
        this.F = fcsuVar14;
        this.G = fcsuVar15;
        this.H = bacsVar;
        this.I = aypjVar;
        this.J = cfgaVar;
        this.K = cfdfVar;
        this.au = cfehVar;
        this.L = cexqVar;
        this.M = aixqVar;
        this.N = crtnVar;
        this.ai = aykjVar;
        this.O = fcsuVar16;
        this.P = alrjVar;
        this.Q = fcsuVar17;
        this.R = baelVar;
        this.S = baesVar;
        this.T = fcsuVar18;
        this.U = fcsuVar19;
        this.V = fcsuVar20;
        this.W = fcsuVar21;
        this.X = fcsuVar22;
        this.Y = awhrVar;
        this.Z = awhrVar2;
        this.aa = fcsuVar23;
        this.aq = fcsuVar24;
        this.ar = fcsuVar25;
        this.ab = fcsuVar26;
        this.ac = appkVar;
        this.ad = fcsuVar27;
        this.as = fcsuVar28;
        this.ae = fcsuVar30;
        for (epby epbyVar : epby.values()) {
            switch (epbyVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 11:
                case 14:
                case 15:
                case 16:
                case 17:
                case 21:
                case 22:
                case 23:
                case 24:
                case 33:
                case 36:
                case 37:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                case 50:
                    ejwl.l(map.containsKey(epbyVar));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 18:
                case 19:
                case 20:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 35:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                    ejwl.l(!map.containsKey(epbyVar));
                    break;
            }
        }
        this.at = fcsuVar29;
        this.af = fcsuVar31;
        this.ag = aqmqVar;
    }

    public static epby l(eoxe eoxeVar) {
        int i = eoxeVar.c;
        epby epbyVarB = epby.b(i);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        epby epbyVar = epby.UNRECOGNIZED;
        if (epbyVarB == epbyVar) {
            return epby.MESSAGE_TYPE_UNSPECIFIED;
        }
        epby epbyVarB2 = epby.b(i);
        return epbyVarB2 == null ? epbyVar : epbyVarB2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.epfx m(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r4, defpackage.bvdk r5, java.lang.Boolean r6, defpackage.cpkr r7) {
        /*
            if (r4 == 0) goto Lb8
            if (r5 == 0) goto Lb8
            if (r7 == 0) goto Lb8
            ekfk r0 = defpackage.cehg.g
            boolean r1 = r0.containsKey(r5)
            if (r1 != 0) goto L10
            goto Lb8
        L10:
            epej r1 = defpackage.epej.a
            evsf r1 = r1.createBuilder()
            epeh r1 = (defpackage.epeh) r1
            java.lang.Object r5 = r0.get(r5)
            eowr r5 = (defpackage.eowr) r5
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r1.instance
            epej r0 = (defpackage.epej) r0
            int r5 = r5.a()
            r0.e = r5
            epcj r5 = defpackage.epcj.a
            evsf r5 = r5.createBuilder()
            epci r5 = (defpackage.epci) r5
            epcm r0 = defpackage.epcm.a
            evsf r0 = r0.createBuilder()
            epck r0 = (defpackage.epck) r0
            java.lang.String r2 = r4.R()
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r3 = r0.instance
            epcm r3 = (defpackage.epcm) r3
            r2.getClass()
            r3.d = r2
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r5.instance
            epcj r2 = (defpackage.epcj) r2
            evsn r0 = r0.build()
            epcm r0 = (defpackage.epcm) r0
            r0.getClass()
            r2.c = r0
            int r0 = r2.b
            r0 = r0 | 1
            r2.b = r0
            boolean r0 = r4.X()
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r5.instance
            epcj r2 = (defpackage.epcj) r2
            r2.p = r0
            boolean r0 = r4.aa()
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r5.instance
            epcj r2 = (defpackage.epcj) r2
            r2.l = r0
            int r4 = r4.o()
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r5.instance
            epcj r0 = (defpackage.epcj) r0
            r0.m = r4
            evsn r4 = r5.build()
            epcj r4 = (defpackage.epcj) r4
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r1.instance
            epej r5 = (defpackage.epej) r5
            r4.getClass()
            r5.c = r4
            int r4 = r5.b
            r4 = r4 | 1
            r5.b = r4
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r1.instance
            epej r4 = (defpackage.epej) r4
            r4.f = r7
            int r5 = r4.b
            r5 = r5 | 2
            r4.b = r5
            evsn r4 = r1.build()
            epej r4 = (defpackage.epej) r4
            goto Lba
        Lb8:
            epej r4 = defpackage.epej.a
        Lba:
            epfx r5 = defpackage.epfx.a
            evsf r5 = r5.createBuilder()
            epfw r5 = (defpackage.epfw) r5
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = r7.equals(r6)
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r7 = r5.instance
            epfx r7 = (defpackage.epfx) r7
            r7.d = r6
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r6 = r5.instance
            epfx r6 = (defpackage.epfx) r6
            r4.getClass()
            r6.c = r4
            r4 = 3
            r6.b = r4
            evsn r4 = r5.build()
            epfx r4 = (defpackage.epfx) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdb.m(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, bvdk, java.lang.Boolean, cpkr):epfx");
    }

    public static epfx n(Boolean bool) {
        epfw epfwVar = (epfw) epfx.a.createBuilder();
        boolean zEquals = Boolean.TRUE.equals(bool);
        epfwVar.copyOnWrite();
        ((epfx) epfwVar.instance).d = zEquals;
        return (epfx) epfwVar.build();
    }

    public static boolean r(eoxe eoxeVar) {
        epby epbyVarB = epby.b(eoxeVar.c);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        if (epbyVarB.equals(epby.CREATE_GAIA_PAIRING_CLIENT_INIT)) {
            return true;
        }
        epby epbyVarB2 = epby.b(eoxeVar.c);
        if (epbyVarB2 == null) {
            epbyVarB2 = epby.UNRECOGNIZED;
        }
        if (epbyVarB2.equals(epby.CREATE_GAIA_PAIRING_CLIENT_FINISHED)) {
            return true;
        }
        epby epbyVarB3 = epby.b(eoxeVar.c);
        if (epbyVarB3 == null) {
            epbyVarB3 = epby.UNRECOGNIZED;
        }
        if (epbyVarB3.equals(epby.CANCEL_GAIA_PAIRING)) {
            return true;
        }
        epby epbyVarB4 = epby.b(eoxeVar.c);
        if (epbyVarB4 == null) {
            epbyVarB4 = epby.UNRECOGNIZED;
        }
        return epbyVarB4.equals(epby.PREWARM);
    }

    private final alqm u(eoxx eoxxVar) {
        eowf eowfVar = eoxxVar.c;
        if (eowfVar == null) {
            eowfVar = eowf.a;
        }
        alrj alrjVar = this.P;
        String str = eowfVar.c;
        epes epesVar = eoxxVar.d;
        if (epesVar == null) {
            epesVar = epes.a;
        }
        return alrjVar.u(str, epesVar.c);
    }

    private final eiju v(eoxx eoxxVar, Executor executor) {
        return g(u(eoxxVar)).e(Throwable.class, new ejvr() { // from class: cfct
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarI = cfdb.c.i();
                ekrwVarI.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "isRcsEligibleFuture", (char) 3112, "DittoChannelRequestHandlerV2.java")).q("Failed to get RCS capabilities of all users");
                return false;
            }
        }, executor);
    }

    private final eiju w(final ConversationIdType conversationIdType, final bvdk bvdkVar) {
        return eijx.g(new Callable() { // from class: cfci
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.f.a(conversationIdType, bvdkVar, elka.CONVERSATION_FROM_WEB_ACTION));
            }
        }, this.x);
    }

    private final void x(Cursor cursor, Collection collection, Collection collection2) throws NumberFormatException {
        bacr bacrVarA = this.H.a();
        while (cursor.moveToNext()) {
            bacrVarA.e(cursor);
            eozk eozkVarM = ((cehg) this.k.b()).m(bacrVarA.f());
            if (eozkVarM != null) {
                eowg eowgVar = (eowg) eowh.a.createBuilder();
                eowgVar.copyOnWrite();
                eowh eowhVar = (eowh) eowgVar.instance;
                eowhVar.d = eozkVarM;
                eowhVar.b |= 1;
                String str = bacrVarA.c;
                if (str != null) {
                    eowgVar.copyOnWrite();
                    ((eowh) eowgVar.instance).c = str;
                }
                collection2.add((eowh) eowgVar.build());
                collection.remove(bacrVarA.c);
            }
        }
    }

    private final eiju y(final ConversationIdType conversationIdType, final int i, epej epejVar, final boolean z) {
        epcj epcjVar;
        if ((epejVar.b & 1) != 0) {
            epcjVar = epejVar.c;
            if (epcjVar == null) {
                epcjVar = epcj.a;
            }
        } else {
            epcjVar = null;
        }
        final epcj epcjVar2 = epcjVar;
        return epcjVar2 == null ? eijx.e(n(false)) : eijx.h(new eooy() { // from class: cfaf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final String str;
                epcj epcjVar3 = epcjVar2;
                if ((epcjVar3.b & 1) != 0) {
                    epcm epcmVar = epcjVar3.c;
                    if (epcmVar == null) {
                        epcmVar = epcm.a;
                    }
                    str = epcmVar.d;
                } else {
                    str = null;
                }
                if (str == null) {
                    return eijx.e(false);
                }
                final ConversationIdType conversationIdType2 = conversationIdType;
                boolean z2 = z;
                final cfdb cfdbVar = this.a;
                eiju eijuVarE = eijx.e(true);
                if (z2) {
                    cpki cpkiVarQ = cpkj.q();
                    cpju cpjuVar = (cpju) cpkiVarQ;
                    cpjuVar.d = new BugleConversationId(conversationIdType2);
                    cpjuVar.a = true;
                    cpjuVar.g = elka.CONVERSATION_FROM_WEB_ACTION;
                    cpjuVar.i = 3;
                    cpjuVar.j = 10;
                    eijuVarE = ((cpjw) cfdbVar.g.b()).a(cpkiVarQ.a().p()).h(new ejvr() { // from class: cfcb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            boolean z3 = ((cpkr) obj) != null;
                            ejxr ejxrVar = cfdb.a;
                            return Boolean.valueOf(z3);
                        }
                    }, eoqg.a);
                }
                final int i2 = i;
                return eijuVarE.h(new ejvr() { // from class: cfcc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        boolean z3 = false;
                        if (((Boolean) obj).booleanValue()) {
                            int i3 = i2;
                            cfdb cfdbVar2 = cfdbVar;
                            eodx eodxVar = (eodx) eodz.a.createBuilder();
                            eodxVar.copyOnWrite();
                            eodz eodzVar = (eodz) eodxVar.instance;
                            ConversationIdType conversationIdType3 = conversationIdType2;
                            eodzVar.c = i3 - 1;
                            eodzVar.b |= 1;
                            eodxVar.copyOnWrite();
                            eodz eodzVar2 = (eodz) eodxVar.instance;
                            eodzVar2.d = 2;
                            eodzVar2.b |= 2;
                            eodz eodzVar3 = (eodz) eodxVar.build();
                            elka elkaVar = elka.CONVERSATION_FROM_WEB_ACTION;
                            conversationIdType3.getClass();
                            eodzVar3.getClass();
                            elkaVar.getClass();
                            ecem.b();
                            int i4 = eodzVar3.c;
                            int iA = eodw.a(i4);
                            eofr eofrVar = null;
                            if (iA != 0 && iA == 4) {
                                eofrVar = eofr.DISMISSED_WARNING_BANNER;
                            }
                            eofr eofrVar2 = eofrVar;
                            int iA2 = eodw.a(i4);
                            boolean z4 = iA2 != 0 && iA2 == 2;
                            csdl csdlVar = csdl.b;
                            int i5 = eodzVar3.c;
                            int iA3 = eodw.a(i5);
                            boolean z5 = iA3 == 0 || iA3 != 4;
                            int iA4 = eodw.a(i5);
                            if (iA4 == 0) {
                                iA4 = 1;
                            }
                            crtn crtnVar = cfdbVar2.N;
                            if (crtnVar.c.b(cruh.b(z4, conversationIdType3, str, csdlVar, z5, iA4 == 2, elkaVar, null, eofrVar2, 3, 10, 2, 532)) != null && ((csea) crtnVar.b.b()).g(csof.a(conversationIdType3))) {
                                z3 = true;
                            }
                        }
                        return Boolean.valueOf(z3);
                    }
                }, cfdbVar.x);
            }
        }, this.x).h(new cfaq(), eoqg.a);
    }

    final cfef a(epby epbyVar, ezol ezolVar, String str, ezjj ezjjVar, boolean z, int i, bvks bvksVar) {
        if (((cdio) this.X.b()).a() && ezolVar.d.equals("GDitto")) {
            cfef cfefVarA = this.au.a(bvksVar, epbyVar);
            cfefVarA.c = str;
            cfefVarA.l = z;
            cfefVarA.k = i;
            cfefVarA.j = aj;
            cfefVarA.m = ezjjVar.c;
            ezol ezolVar2 = ezjjVar.i;
            if (ezolVar2 == null) {
                ezolVar2 = ezol.a;
            }
            cfefVarA.n = ezolVar2;
            return cfefVarA;
        }
        cfef cfefVarC = this.au.c(ezolVar, Optional.empty(), epbyVar);
        cfefVarC.c = str;
        cfefVarC.l = z;
        cfefVarC.k = i;
        cfefVarC.j = aj;
        cfefVarC.m = ezjjVar.c;
        ezol ezolVar3 = ezjjVar.i;
        if (ezolVar3 == null) {
            ezolVar3 = ezol.a;
        }
        cfefVarC.n = ezolVar3;
        return cfefVarC;
    }

    final eiju b(final ConversationIdType conversationIdType, epfv epfvVar, final boolean z) {
        if (epfvVar.c != 5) {
            return eijx.e(n(false));
        }
        epej epejVar = (epej) epfvVar.d;
        int iA = epei.a(epejVar.d);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 2;
        return i != 1 ? i != 2 ? eijx.e(n(false)) : y(conversationIdType, 2, epejVar, true) : ((cpkp) this.al.b()).a(conversationIdType).i(new eooz() { // from class: cfar
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                cfdb cfdbVar = this.a;
                bakt baktVar = (bakt) cfdbVar.r.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                final bvdk bvdkVarS = baktVar.s(conversationIdType2);
                cpki cpkiVarQ = cpkj.q();
                BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType2);
                cpju cpjuVar = (cpju) cpkiVarQ;
                cpjuVar.d = bugleConversationId;
                cpjuVar.a = bool;
                cpjuVar.b = true != z ? null : true;
                cpjuVar.g = elka.CONVERSATION_FROM_WEB_ACTION;
                cpjuVar.i = 3;
                cpjuVar.j = 10;
                return ((cpjw) cfdbVar.g.b()).a(cpkiVarQ.a().p()).h(new ejvr() { // from class: cfbo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cpkr cpkrVar = (cpkr) obj2;
                        boolean z2 = cpkrVar != null;
                        bvdk bvdkVar = bvdkVarS;
                        ParticipantsTable.BindData bindData2 = bindData;
                        ejxr ejxrVar = cfdb.a;
                        return cfdb.m(bindData2, bvdkVar, Boolean.valueOf(z2), cpkrVar);
                    }
                }, cfdbVar.w);
            }
        }, this.x);
    }

    public final eiju c(evuh evuhVar, ezol ezolVar, String str, ezjj ezjjVar, boolean z, int i, epby epbyVar, bvks bvksVar) {
        ezol ezolVar2;
        ezol ezolVar3;
        cfdb cfdbVar;
        String str2;
        ezjj ezjjVar2;
        boolean z2;
        int i2;
        epby epbyVar2;
        if (((cdio) this.X.b()).a()) {
            ezolVar2 = ezolVar;
            ezolVar3 = bvksVar.d;
            str2 = str;
            ezjjVar2 = ezjjVar;
            z2 = z;
            i2 = i;
            epbyVar2 = epbyVar;
            cfdbVar = this;
        } else {
            ezolVar2 = ezolVar;
            ezolVar3 = ezolVar2;
            cfdbVar = this;
            str2 = str;
            ezjjVar2 = ezjjVar;
            z2 = z;
            i2 = i;
            epbyVar2 = epbyVar;
        }
        cfef cfefVarA = cfdbVar.a(epbyVar2, ezolVar2, str2, ezjjVar2, z2, i2, bvksVar);
        cfefVarA.b(evuhVar);
        cfeg cfegVarA = cfefVarA.a();
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "buildHandlerAndSendResponse", 1442, "DittoChannelRequestHandlerV2.java")).D("Preparing response for request of type %s %s", epbyVar, ((cehg) this.k.b()).A(str, cfegVarA.c, ezolVar3));
        return j(cfegVarA, str, ezolVar, bvksVar);
    }

    final eiju d(ConversationIdType conversationIdType, boolean z) {
        Action actionA = this.am.a(conversationIdType, Boolean.valueOf(z), null, null, null);
        SettableFuture settableFutureCreate = SettableFuture.create();
        actionA.G(new ayow(settableFutureCreate));
        return eiju.g(settableFutureCreate);
    }

    protected final eiju e(final eoxx eoxxVar) {
        final eiju eijuVarE;
        final eiju eijuVarE2;
        if (!((bvur) this.W.b()).h() || !((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            eiju eijuVarE3 = eijx.e(false);
            if ((1 & eoxxVar.b) != 0) {
                eijuVarE3 = v(eoxxVar, eoqg.a);
            }
            return eijuVarE3.h(new ejvr() { // from class: cfcw
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ejxr ejxrVar = cfdb.a;
                    eoxy eoxyVar = (eoxy) eoxz.a.createBuilder();
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    eoxyVar.copyOnWrite();
                    ((eoxz) eoxyVar.instance).b = zBooleanValue;
                    return (eoxz) eoxyVar.build();
                }
            }, eoqg.a);
        }
        if ((eoxxVar.b & 1) != 0) {
            eijuVarE = v(eoxxVar, this.w);
            alqm alqmVarU = u(eoxxVar);
            if (alqmVarU.e().isPresent()) {
                final aubq aubqVar = (aubq) alqmVarU.e().get();
                if ((eoxxVar.b & 2) != 0) {
                    eijuVarE2 = h(eoxxVar, aubqVar);
                } else {
                    ekrw ekrwVarJ = c.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "isE2eeRcsGroupEligibleFuture", 3060, "DittoChannelRequestHandlerV2.java")).q("Ditto has not provided subscription id.");
                    ((ains) this.A.b()).c("Bugle.Ditto.AddParticipantToGroup.SubscriptionNotProvided.Counts");
                    eijuVarE2 = (eiju) ((cqle) this.at.b()).a(epes.a).map(new Function() { // from class: cfbj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            epeq epeqVar = (epeq) epes.a.createBuilder();
                            int iIntValue = ((Integer) obj).intValue();
                            epeqVar.copyOnWrite();
                            ((epes) epeqVar.instance).c = iIntValue;
                            epeqVar.copyOnWrite();
                            ((epes) epeqVar.instance).b = eper.a(4);
                            epes epesVar = (epes) epeqVar.build();
                            eoxw eoxwVar = (eoxw) eoxxVar.toBuilder();
                            eoxwVar.copyOnWrite();
                            eoxx eoxxVar2 = (eoxx) eoxwVar.instance;
                            epesVar.getClass();
                            eoxxVar2.d = epesVar;
                            eoxxVar2.b |= 2;
                            return this.a.h((eoxx) eoxwVar.build(), aubqVar);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(eijx.e(false));
                }
            } else {
                eijuVarE2 = eijx.e(false);
            }
        } else {
            eijuVarE = eijx.e(false);
            eijuVarE2 = eijx.e(false);
        }
        return eijx.m(eijuVarE, eijuVarE2).a(new Callable() { // from class: cfcx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ejxr ejxrVar = cfdb.a;
                eoxy eoxyVar = (eoxy) eoxz.a.createBuilder();
                boolean zBooleanValue = ((Boolean) eork.q(eijuVarE)).booleanValue();
                eoxyVar.copyOnWrite();
                ((eoxz) eoxyVar.instance).b = zBooleanValue;
                boolean zBooleanValue2 = ((Boolean) eork.q(eijuVarE2)).booleanValue();
                eoxyVar.copyOnWrite();
                ((eoxz) eoxyVar.instance).c = zBooleanValue2;
                return (eoxz) eoxyVar.build();
            }
        }, this.w);
    }

    public final eiju f(final eoxe eoxeVar, final ezjj ezjjVar, final ezol ezolVar, final bvks bvksVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ezol ezolVar2;
        Object obj;
        eiju eijuVarE;
        final eoxe eoxeVar2 = eoxeVar;
        fcsu fcsuVar = this.X;
        ezol ezolVar3 = ((cdio) fcsuVar.b()).a() ? bvksVar.d : ezolVar;
        ekrg ekrgVar = c;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleNetwork");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getResponseForRequest", 869, "DittoChannelRequestHandlerV2.java");
        epby epbyVarB = epby.b(eoxeVar2.c);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        fcsu fcsuVar2 = this.k;
        ekrdVar.D("Received DittoRequest: %s %s", epbyVarB, ((cehg) fcsuVar2.b()).B(eoxeVar2.b, ezolVar3));
        if (!((cdio) fcsuVar.b()).a() || !r(eoxeVar2)) {
            if (this.u.C(ezolVar3) || this.B.b(ezolVar3)) {
                ezolVar2 = ezolVar;
                q(eoxeVar);
                ekrw ekrwVarH = ekrgVar.h();
                ekrwVarH.X(ekrzVar, "BugleNetwork");
                ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getResponseForRequest", 890, "DittoChannelRequestHandlerV2.java");
                epby epbyVarB2 = epby.b(eoxeVar2.c);
                if (epbyVarB2 == null) {
                    epbyVarB2 = epby.UNRECOGNIZED;
                }
                ekrdVar2.w("Handling DittoRequest: %s %s", epbyVarB2.a(), ((cehg) fcsuVar2.b()).B(eoxeVar2.b, ezolVar3));
                Optional optionalY = ((cehg) fcsuVar2.b()).y(eoxeVar2.e, eoxeVar2.b, ezolVar3);
                if (optionalY.isEmpty()) {
                    eijuVarE = eijx.e(Optional.empty());
                } else {
                    obj = optionalY.get();
                }
            } else {
                t(ezolVar, bvksVar);
                eijuVarE = eijx.e(Optional.empty());
            }
            return eijuVarE.i(new eooz() { // from class: cfca
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    Optional optional = (Optional) obj2;
                    if (!optional.isPresent() || evrl.a.equals(optional.get())) {
                        return eijx.e(true);
                    }
                    bvks bvksVar2 = bvksVar;
                    ezjj ezjjVar2 = ezjjVar;
                    ezol ezolVar4 = ezolVar;
                    return this.a.i((evuh) optional.get(), eoxeVar, ezolVar4, ezjjVar2, true, 1, bvksVar2);
                }
            }, this.x);
        }
        obj = eoxeVar2.d;
        ezolVar2 = ezolVar;
        Map map = this.ap;
        epby epbyVarB3 = epby.b(eoxeVar2.c);
        if (epbyVarB3 == null) {
            epbyVarB3 = epby.UNRECOGNIZED;
        }
        if (map.containsKey(epbyVarB3)) {
            epby epbyVarB4 = epby.b(eoxeVar2.c);
            if (epbyVarB4 == null) {
                epbyVarB4 = epby.UNRECOGNIZED;
            }
            fcsu fcsuVar3 = (fcsu) map.get(epbyVarB4);
            fcsuVar3.getClass();
            try {
                try {
                } catch (evtj e) {
                    e = e;
                    eoxeVar2 = eoxeVar;
                }
                try {
                    eoxeVar2 = eoxeVar;
                    eijuVarE = ((cfmz) fcsuVar3.b()).a(new cfjg(eoxeVar, ezolVar2, bvksVar, this.x, (evqs) obj, ezjjVar.h, ezjjVar));
                } catch (evtj e2) {
                    e = e2;
                    eoxeVar2 = eoxeVar;
                    ekrw ekrwVarI = c.i();
                    ekrwVarI.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getResponseForRequest", 921, "DittoChannelRequestHandlerV2.java")).t("Exception parsing ditto channel request %s", ((cehg) this.k.b()).B(eoxeVar2.b, ezolVar3));
                    eijuVarE = eijx.d(e);
                    return eijuVarE.i(new eooz() { // from class: cfca
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            Optional optional = (Optional) obj2;
                            if (!optional.isPresent() || evrl.a.equals(optional.get())) {
                                return eijx.e(true);
                            }
                            bvks bvksVar2 = bvksVar;
                            ezjj ezjjVar2 = ezjjVar;
                            ezol ezolVar4 = ezolVar;
                            return this.a.i((evuh) optional.get(), eoxeVar, ezolVar4, ezjjVar2, true, 1, bvksVar2);
                        }
                    }, this.x);
                }
            } catch (evtj e3) {
                e = e3;
            }
        } else {
            final ezol ezolVar4 = ((cdio) fcsuVar.b()).a() ? bvksVar.d : ezolVar;
            final evqs evqsVar = (evqs) obj;
            eijuVarE = eijx.h(new eooy() { // from class: cfcs
                /* JADX WARN: Removed duplicated region for block: B:149:0x04b0  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x0986  */
                /* JADX WARN: Removed duplicated region for block: B:304:0x098f  */
                @Override // defpackage.eooy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() throws java.lang.NumberFormatException {
                    /*
                        Method dump skipped, instructions count: 2912
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cfcs.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.x).h(new ejvr() { // from class: cfav
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return Optional.of((evuh) obj2);
                }
            }, eoqg.a);
        }
        return eijuVarE.i(new eooz() { // from class: cfca
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                Optional optional = (Optional) obj2;
                if (!optional.isPresent() || evrl.a.equals(optional.get())) {
                    return eijx.e(true);
                }
                bvks bvksVar2 = bvksVar;
                ezjj ezjjVar2 = ezjjVar;
                ezol ezolVar42 = ezolVar;
                return this.a.i((evuh) optional.get(), eoxeVar, ezolVar42, ezjjVar2, true, 1, bvksVar2);
            }
        }, this.x);
    }

    public final eiju g(alqm alqmVar) {
        return (eiju) alqmVar.e().map(new Function() { // from class: cfck
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfdb cfdbVar = this.a;
                return cfdbVar.Y.d((aubq) obj).h(new ejvr() { // from class: cfbh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((assi) obj2).g());
                    }
                }, cfdbVar.w);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: cfcl
            @Override // java.util.function.Supplier
            public final Object get() {
                ejxr ejxrVar = cfdb.a;
                return eijx.e(false);
            }
        });
    }

    public final eiju h(eoxx eoxxVar, final aubq aubqVar) {
        final bwvc bwvcVar = (bwvc) bwvf.a.createBuilder();
        elyd elydVar = elyd.DITTO_CONTACT_PICKER_SELECT_CONTACT;
        bwvcVar.copyOnWrite();
        bwvf bwvfVar = (bwvf) bwvcVar.instance;
        bwvfVar.e = elydVar.m;
        bwvfVar.b |= 1;
        bwvd bwvdVar = (bwvd) bwve.a.createBuilder();
        bwvdVar.a(aubqVar);
        bwve bwveVar = (bwve) bwvdVar.build();
        bwvcVar.copyOnWrite();
        bwvf bwvfVar2 = (bwvf) bwvcVar.instance;
        bwveVar.getClass();
        bwvfVar2.d = bwveVar;
        bwvfVar2.c = 1;
        chtk chtkVar = (chtk) this.as.b();
        epes epesVar = eoxxVar.d;
        if (epesVar == null) {
            epesVar = epes.a;
        }
        eiju eijuVarH = chtkVar.g(epesVar.c).h(new ejvr() { // from class: cfaz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aubq aubqVar2 = (aubq) obj;
                ejxr ejxrVar = cfdb.a;
                bwvc bwvcVar2 = bwvcVar;
                bwvcVar2.copyOnWrite();
                bwvf bwvfVar3 = (bwvf) bwvcVar2.instance;
                bwvf bwvfVar4 = bwvf.a;
                aubqVar2.getClass();
                bwvfVar3.f = aubqVar2;
                bwvfVar3.b |= 2;
                return (bwvf) bwvcVar2.build();
            }
        }, eoqg.a);
        eooz eoozVar = new eooz() { // from class: cfam
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((bwuv) this.a.T.b()).b((bwvf) obj);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.w;
        return eijuVarH.i(eoozVar, scheduledExecutorService).h(new ejvr() { // from class: cfan
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Collection collection;
                bwvh bwvhVar = (bwvh) obj;
                ejxr ejxrVar = cfdb.a;
                if (bwvhVar == null) {
                    collection = ekon.a;
                } else {
                    final aubq aubqVar2 = aubqVar;
                    collection = (ekhx) Collection.EL.stream(bwvhVar.b).filter(new Predicate() { // from class: cfao
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
                        public final boolean test(Object obj2) {
                            ejxr ejxrVar2 = cfdb.a;
                            aubq aubqVar3 = ((bwvb) obj2).d;
                            if (aubqVar3 == null) {
                                aubqVar3 = aubq.a;
                            }
                            return aubqVar3.equals(aubqVar2);
                        }
                    }).flatMap(new Function() { // from class: cfap
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ejxr ejxrVar2 = cfdb.a;
                            return Collection.EL.stream(new evsz(((bwvb) obj2).e, bwvb.a));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.b);
                }
                boolean z = false;
                if (collection.contains(bwva.ONE_ON_ONE_ENCRYPTION) && collection.contains(bwva.GROUP_ENCRYPTION)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, scheduledExecutorService);
    }

    final eiju i(final evuh evuhVar, eoxe eoxeVar, final ezol ezolVar, final ezjj ezjjVar, final boolean z, final int i, bvks bvksVar) {
        bvks bvksVar2;
        final ezol ezolVar2;
        this.z.c("Bugle.Ditto.Responses");
        evuhVar.getClass();
        final epby epbyVarL = l(eoxeVar);
        if (epbyVarL != epby.SETTINGS_UPDATE) {
            return c(evuhVar, ezolVar, eoxeVar.b, ezjjVar, z, i, epbyVarL, bvksVar);
        }
        final String str = eoxeVar.b;
        if (((cdio) this.X.b()).a()) {
            bvksVar2 = bvksVar;
            ezolVar2 = bvksVar2.d;
        } else {
            bvksVar2 = bvksVar;
            ezolVar2 = ezolVar;
        }
        final bvks bvksVar3 = bvksVar2;
        return this.u.j(new Function() { // from class: cfbf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvix bvixVar = (bvix) obj;
                boolean zEquals = bvixVar.d().equals(ezolVar2);
                cfdb cfdbVar = this.a;
                if (!zEquals) {
                    bvin bvinVar = cfdbVar.q;
                    fcsu fcsuVar = cfdbVar.X;
                    return bvinVar.a(((cdio) fcsuVar.b()).a() ? bvixVar.c().a : bvixVar.d(), ((cdio) fcsuVar.b()).a() ? Optional.of(bvixVar.c()) : Optional.empty(), bvixVar.e()).h(new ejvr() { // from class: cfcy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ejxr ejxrVar = cfdb.a;
                            return true;
                        }
                    }, eoqg.a);
                }
                bvks bvksVar4 = bvksVar3;
                epby epbyVar = epbyVarL;
                int i2 = i;
                boolean z2 = z;
                ezjj ezjjVar2 = ezjjVar;
                return cfdbVar.c(evuhVar, ezolVar, str, ezjjVar2, z2, i2, epbyVar, bvksVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: cfbg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejxr ejxrVar = cfdb.a;
                return true;
            }
        }, eoqg.a);
    }

    final eiju j(final cfeg cfegVar, final String str, final ezol ezolVar, bvks bvksVar) {
        if (((cdio) this.X.b()).a()) {
            ezolVar = bvksVar.d;
        }
        fcsu fcsuVar = this.ao;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            ekrw ekrwVarJ = c.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1465, "DittoChannelRequestHandlerV2.java")).q("DittoRetryExecutor is not available on this device.");
            return eijx.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
        }
        eiju eijuVarA = ((cfya) ((Optional) fcsuVar.b()).get()).a(cfegVar);
        ejvr ejvrVar = new ejvr() { // from class: cfag
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezjn ezjnVar = (ezjn) obj;
                if (ezjnVar != null) {
                    ezol ezolVar2 = ezolVar;
                    cfeg cfegVar2 = cfegVar;
                    String str2 = str;
                    cfdb cfdbVar = this.a;
                    ekrg ekrgVar = cfdb.c;
                    ekrw ekrwVarE = ekrgVar.e();
                    ekrz ekrzVar = eksq.a;
                    ekrwVarE.X(ekrzVar, "BugleNetwork");
                    ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1476, "DittoChannelRequestHandlerV2.java");
                    fcsu fcsuVar2 = cfdbVar.k;
                    cehg cehgVar = (cehg) fcsuVar2.b();
                    String str3 = cfegVar2.c;
                    ekrdVar.D("Ditto response returned result: %s %s", ezjnVar, cehgVar.A(str2, str3, ezolVar2));
                    ekrw ekrwVarH = ekrgVar.h();
                    ekrwVarH.X(ekrzVar, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1483, "DittoChannelRequestHandlerV2.java")).t("Sent ditto response for request: %s", ((cehg) fcsuVar2.b()).A(str2, str3, ezolVar2));
                }
                return true;
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.w;
        return eijuVarA.h(ejvrVar, scheduledExecutorService).e(fbtf.class, new ejvr() { // from class: cfah
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ2 = cfdb.c.j();
                ekrwVarJ2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g((fbtf) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponseWithRpcHandler", 1495, "DittoChannelRequestHandlerV2.java")).t("Ditto response to request threw exception %s", ((cehg) this.a.k.b()).A(str, cfegVar.c, ezolVar));
                return false;
            }
        }, scheduledExecutorService);
    }

    public final eiju k(final ConversationIdType conversationIdType, epfv epfvVar) {
        int iA = epfu.a(epfvVar.e);
        if (iA == 0) {
            iA = 1;
        }
        final ParticipantsTable.BindData bindData = null;
        cpkr cpkrVar = null;
        switch (iA - 2) {
            case 1:
                avnh avnhVar = this.an;
                elka elkaVar = elka.CONVERSATION_FROM_WEB_ACTION;
                avnk avnkVarF = avnl.f();
                avnkVarF.b(conversationIdType);
                avnkVarF.c(Long.MAX_VALUE);
                avnkVarF.f(elkaVar);
                eiju eijuVarG = eiju.g(avnhVar.a(avnkVarF.a()));
                ejvr ejvrVar = new ejvr() { // from class: cfbp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ejxr ejxrVar = cfdb.a;
                        return true;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarG.h(ejvrVar, eoqgVar).e(Throwable.class, new ejvr() { // from class: cfbq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekrw ekrwVarI = cfdb.c.i();
                        ekrwVarI.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "deleteConversationAndNotify", (char) 2421, "DittoChannelRequestHandlerV2.java")).q("Couldn't delete the conversation.");
                        return false;
                    }
                }, eoqgVar).h(new cfaq(), eoqgVar);
            case 2:
                List<ParticipantsTable.BindData> listK = ((bakt) this.ak.a.b()).K(conversationIdType);
                ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList();
                for (ParticipantsTable.BindData bindData2 : listK) {
                    if (bindData2.r() == -2) {
                        arrayList.add(bindData2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList.size();
                for (ParticipantsTable.BindData bindData3 : arrayList) {
                    if (bindData3.X()) {
                        arrayList2.add(bindData3);
                    }
                    if (bindData3.aa()) {
                        csdn csdnVarA = csdm.a(bindData3.o());
                        if (csdnVarA.e()) {
                            arrayList3.add(bindData3);
                        } else if (csdnVarA.f()) {
                            arrayList4.add(bindData3);
                        }
                    }
                }
                if (size == 1 && !arrayList2.isEmpty()) {
                    bindData = (ParticipantsTable.BindData) arrayList2.get(0);
                } else if (!arrayList3.isEmpty()) {
                    bindData = (ParticipantsTable.BindData) arrayList3.get(0);
                } else if (!arrayList4.isEmpty()) {
                    bindData = (ParticipantsTable.BindData) arrayList4.get(0);
                }
                final bvdk bvdkVarS = ((bakt) this.r.b()).s(conversationIdType);
                cpki cpkiVarQ = cpkj.q();
                BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
                cpju cpjuVar = (cpju) cpkiVarQ;
                cpjuVar.d = bugleConversationId;
                cpjuVar.a = false;
                cpjuVar.b = false;
                cpjuVar.g = elka.CONVERSATION_FROM_WEB_ACTION;
                cpjuVar.i = 3;
                cpjuVar.j = 10;
                if (bindData != null) {
                    cpjuVar.e = bindData.R();
                }
                return ((cpjw) this.g.b()).a(cpkiVarQ.a().p()).h(new ejvr() { // from class: cfcj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cpkr cpkrVar2 = (cpkr) obj;
                        boolean z = cpkrVar2 != null;
                        bvdk bvdkVar = bvdkVarS;
                        ParticipantsTable.BindData bindData4 = bindData;
                        ejxr ejxrVar = cfdb.a;
                        return cfdb.m(bindData4, bvdkVar, Boolean.valueOf(z), cpkrVar2);
                    }
                }, eoqg.a);
            case 3:
                return w(conversationIdType, bvdk.UNARCHIVED).h(new cfaq(), eoqg.a);
            case 4:
                return w(conversationIdType, bvdk.ARCHIVED).h(new cfaq(), eoqg.a);
            case 5:
                return d(conversationIdType, false).h(new cfaq(), eoqg.a);
            case 6:
                return d(conversationIdType, true).h(new cfaq(), eoqg.a);
            case 7:
                return b(conversationIdType, epfvVar, false);
            case 8:
                return b(conversationIdType, epfvVar, true);
            case 9:
                if (epfvVar.c != 5) {
                    return eijx.e(n(false));
                }
                epej epejVar = (epej) epfvVar.d;
                int iA2 = epei.a(epejVar.d);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i = iA2 - 2;
                return i != 1 ? i != 2 ? eijx.e(n(false)) : y(conversationIdType, 2, epejVar, false) : ((cpkp) this.al.b()).a(conversationIdType).i(new eooz() { // from class: cfcu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final ParticipantsTable.BindData bindData4 = (ParticipantsTable.BindData) obj;
                        cfdb cfdbVar = this.a;
                        bakt baktVar = (bakt) cfdbVar.r.b();
                        ConversationIdType conversationIdType2 = conversationIdType;
                        final bvdk bvdkVarS2 = baktVar.s(conversationIdType2);
                        cpki cpkiVarQ2 = cpkj.q();
                        BugleConversationId bugleConversationId2 = new BugleConversationId(conversationIdType2);
                        cpju cpjuVar2 = (cpju) cpkiVarQ2;
                        cpjuVar2.d = bugleConversationId2;
                        cpjuVar2.b = true;
                        cpjuVar2.g = elka.CONVERSATION_FROM_WEB_ACTION;
                        cpjuVar2.i = 3;
                        cpjuVar2.j = 10;
                        if (bindData4 != null) {
                            cpjuVar2.e = bindData4.R();
                        }
                        return ((cpjw) cfdbVar.g.b()).a(cpkiVarQ2.a().p()).h(new ejvr() { // from class: cfcv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cpkr cpkrVar2 = (cpkr) obj2;
                                boolean z = cpkrVar2 != null;
                                bvdk bvdkVar = bvdkVarS2;
                                ParticipantsTable.BindData bindData5 = bindData4;
                                ejxr ejxrVar = cfdb.a;
                                return cfdb.m(bindData5, bvdkVar, Boolean.valueOf(z), cpkrVar2);
                            }
                        }, cfdbVar.w);
                    }
                }, this.x);
            case 10:
            default:
                epfw epfwVar = (epfw) epfx.a.createBuilder();
                epfwVar.copyOnWrite();
                ((epfx) epfwVar.instance).d = false;
                return eijx.e((epfx) epfwVar.build());
            case 11:
                if (((epfvVar.c == 5 ? (epej) epfvVar.d : epej.a).b & 1) != 0) {
                    return y(conversationIdType, 4, epfvVar.c == 5 ? (epej) epfvVar.d : epej.a, false);
                }
                return eijx.e(n(false));
            case 12:
                if (epfvVar.c != 5) {
                    return eijx.e(n(false));
                }
                epej epejVar2 = (epej) epfvVar.d;
                int iA3 = epei.a(epejVar2.d);
                return (iA3 != 0 ? iA3 : 1) + (-2) != 2 ? eijx.e(n(false)) : y(conversationIdType, 3, epejVar2, false);
            case 13:
                if (epfvVar.c != 5) {
                    return eijx.e(n(false));
                }
                epej epejVar3 = (epej) epfvVar.d;
                if ((epejVar3.b & 2) != 0 && (cpkrVar = epejVar3.f) == null) {
                    cpkrVar = cpkr.a;
                }
                return cpkrVar != null ? ((cpjw) this.g.b()).a(cpkg.c(cpkrVar, elka.CONVERSATION_FROM_WEB_ACTION, 10)).h(new ejvr() { // from class: cfbt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        boolean z = ((cpkr) obj) != null;
                        ejxr ejxrVar = cfdb.a;
                        return cfdb.n(Boolean.valueOf(z));
                    }
                }, eoqg.a) : eijx.e(n(false));
            case 14:
                return ((ajln) this.aq.b()).J(ekgb.r(new BugleConversationId(conversationIdType)), 4).h(new ejvr() { // from class: cfbu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ejxr ejxrVar = cfdb.a;
                        return cfdb.n(true);
                    }
                }, eoqg.a);
        }
    }

    public final void o(eoyb eoybVar, final eoxe eoxeVar, final ezjj ezjjVar, final ezol ezolVar, final bvks bvksVar) {
        eoyc eoycVar;
        int serializedSize;
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        cfda cfdaVar = new cfda() { // from class: cfbs
            @Override // defpackage.cfda
            public final void a(evsn evsnVar, boolean z) {
                this.a.i(evsnVar, eoxeVar, ezolVar, ezjjVar, z, atomicInteger.getAndIncrement(), bvksVar);
            }
        };
        if (eoybVar.b.isEmpty()) {
            cfdaVar.a(eoyd.a, true);
            return;
        }
        java.util.Collection hashSet = new HashSet(eoybVar.b);
        ArrayList arrayList = new ArrayList(hashSet.size());
        Cursor cursorA = this.l.d(hashSet).a();
        if (cursorA != null) {
            try {
                x(cursorA, hashSet, arrayList);
            } finally {
            }
        }
        if (cursorA != null) {
            cursorA.close();
        }
        if (!hashSet.isEmpty()) {
            cursorA = this.l.c(hashSet).a();
            if (cursorA != null) {
                try {
                    x(cursorA, hashSet, arrayList);
                } finally {
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
        }
        int iA = cfkq.a();
        ListIterator listIterator = arrayList.listIterator();
        loop0: while (true) {
            int i = 0;
            eoycVar = null;
            while (listIterator.hasNext()) {
                if (eoycVar == null) {
                    eoycVar = (eoyc) eoyd.a.createBuilder();
                }
                eowh eowhVar = (eowh) listIterator.next();
                serializedSize = eowhVar.getSerializedSize();
                if (serializedSize >= iA) {
                    ekrw ekrwVarH = c.h();
                    ekrwVarH.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getContactsThumbnail", 1820, "DittoChannelRequestHandlerV2.java")).B("Ignore large contact thumbnail. contact=%s, size=%s", eowhVar.c, serializedSize);
                } else {
                    int i2 = i + serializedSize;
                    if (i2 < iA) {
                        eoycVar.copyOnWrite();
                        eoyd eoydVar = (eoyd) eoycVar.instance;
                        eoyd eoydVar2 = eoyd.a;
                        eowhVar.getClass();
                        evtg evtgVar = eoydVar.b;
                        if (!evtgVar.c()) {
                            eoydVar.b = evsn.mutableCopy(evtgVar);
                        }
                        eoydVar.b.add(eowhVar);
                        i = i2;
                    }
                }
            }
            ekrw ekrwVarH2 = c.h();
            ekrwVarH2.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getContactsThumbnail", 1829, "DittoChannelRequestHandlerV2.java")).I("Incomplete contact thumbnail batch response due to size constraint. thumbnail size=%s, currentSize=%s, maxMessageSize=%s", Integer.valueOf(serializedSize), Integer.valueOf(i), Integer.valueOf(iA));
            listIterator.previous();
            cfdaVar.a((eoyd) eoycVar.build(), false);
        }
        if (eoycVar != null) {
            cfdaVar.a((eoyd) eoycVar.build(), true);
        } else {
            cfdaVar.a(eoyd.a, true);
        }
    }

    public final void p(eoyx eoyxVar, final eoxe eoxeVar, final ezjj ezjjVar, final ezol ezolVar, final bvks bvksVar) {
        eoyy eoyyVar;
        int serializedSize;
        Uri uriF;
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        cfda cfdaVar = new cfda() { // from class: cfay
            @Override // defpackage.cfda
            public final void a(evsn evsnVar, boolean z) {
                this.a.i(evsnVar, eoxeVar, ezolVar, ezjjVar, z, atomicInteger.getAndIncrement(), bvksVar);
            }
        };
        if (eoyxVar.b.isEmpty()) {
            cfdaVar.a(eoyz.a, true);
            return;
        }
        ekhx ekhxVarO = ekhx.o(eoyxVar.b);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("processParticipantDataForThumbnails");
        bsbx bsbxVar = new bsbx();
        bsbxVar.m(ekhxVarO);
        bsboVarE.g(bsbxVar);
        brzj brzjVar = (brzj) bsboVarE.b().p();
        while (brzjVar.moveToNext()) {
            try {
                String strP = brzjVar.p();
                if (strP == null || !brzjVar.g().a()) {
                    fcsu fcsuVar = this.k;
                    Uri uriF2 = brzjVar.f();
                    chpq chpqVarH = brzjVar.h();
                    if (uriF2 == null || TextUtils.isEmpty(uriF2.toString()) || chpqVarH != chpq.PROFILE_PEOPLE_SHARING_SOURCE) {
                        uriF = brzjVar.f();
                    } else {
                        cehg cehgVar = (cehg) fcsuVar.b();
                        uriF = brzjVar.f();
                        if (uriF == null) {
                            uriF = null;
                        } else {
                            try {
                                drjk drjkVar = (drjk) cehgVar.A.b();
                                drjkVar.getClass();
                                uriF = drjkVar.a(((Long) cehgVar.B.b()).intValue(), uriF);
                            } catch (drji e) {
                                ekrw ekrwVarJ = cehg.b.j();
                                ekrwVarJ.X(eksq.a, "BugleNetwork");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/net/NetworkUtils", "resizePeopleAndSharingPhotoForDitto", (char) 1884, "NetworkUtils.java")).q("Invalid photo uri to resize");
                            }
                        }
                    }
                } else {
                    ekrw ekrwVarE = c.e();
                    ekrwVarE.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getAvatarUriForParticipant", 1989, "DittoChannelRequestHandlerV2.java")).q("Participant is verification applicable");
                    String[] strArr = bmfr.a;
                    bmfo bmfoVar = new bmfo(bmfr.a);
                    bmfoVar.A("getAvatarUriForParticipant");
                    bmfq bmfqVar = new bmfq();
                    bmfqVar.ap(new dqpj("verified_sms_senders.sender_id", 1, strP));
                    bmfoVar.k(new bmfp(bmfqVar));
                    bmfm bmfmVar = (bmfm) bmfoVar.b().p();
                    try {
                        Uri uriC = bmfmVar.moveToFirst() ? bmfmVar.c() : null;
                        bmfmVar.close();
                        uriF = uriC;
                    } catch (Throwable th) {
                        try {
                            bmfmVar.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (uriF == null) {
                    ekrw ekrwVarJ2 = c.j();
                    ekrwVarJ2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "processParticipantDataForThumbnails", 1962, "DittoChannelRequestHandlerV2.java")).q("Fetch participant Uri failed.");
                } else {
                    eozk eozkVarM = ((cehg) this.k.b()).m(uriF);
                    if (eozkVarM != null) {
                        epcn epcnVar = (epcn) epco.a.createBuilder();
                        String strO = brzjVar.o();
                        epcnVar.copyOnWrite();
                        epco epcoVar = (epco) epcnVar.instance;
                        strO.getClass();
                        epcoVar.c = strO;
                        epcnVar.copyOnWrite();
                        epco epcoVar2 = (epco) epcnVar.instance;
                        epcoVar2.d = eozkVarM;
                        epcoVar2.b |= 1;
                        ekfwVar.h((epco) epcnVar.build());
                    }
                }
            } finally {
            }
        }
        brzjVar.close();
        ekgb ekgbVarG = ekfwVar.g();
        int iA = cfkq.a();
        ekqh it = ekgbVarG.iterator();
        loop1: while (true) {
            int i2 = 0;
            eoyyVar = null;
            while (it.hasNext()) {
                if (eoyyVar == null) {
                    eoyyVar = (eoyy) eoyz.a.createBuilder();
                }
                epco epcoVar3 = (epco) it.next();
                serializedSize = epcoVar3.getSerializedSize();
                if (serializedSize >= iA) {
                    ekrw ekrwVarH = c.h();
                    ekrwVarH.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getParticipantsThumbnails", 1920, "DittoChannelRequestHandlerV2.java")).B("Ignore large participant thumbnail. ParticipantInternalId=%s, size=%s", epcoVar3.c, serializedSize);
                } else {
                    int i3 = i2 + serializedSize;
                    if (i3 < iA) {
                        eoyyVar.copyOnWrite();
                        eoyz eoyzVar = (eoyz) eoyyVar.instance;
                        eoyz eoyzVar2 = eoyz.a;
                        epcoVar3.getClass();
                        evtg evtgVar = eoyzVar.b;
                        if (!evtgVar.c()) {
                            eoyzVar.b = evsn.mutableCopy(evtgVar);
                        }
                        eoyzVar.b.add(epcoVar3);
                        i2 = i3;
                    }
                }
            }
            ekrw ekrwVarH2 = c.h();
            ekrwVarH2.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getParticipantsThumbnails", 1929, "DittoChannelRequestHandlerV2.java")).I("Incomplete participant thumbnail batch response due to size constraint. thumbnail size=%s, currentSize=%s, maxMessageSize=%s", Integer.valueOf(serializedSize), Integer.valueOf(i2), Integer.valueOf(iA));
            it.previous();
            cfdaVar.a((eoyz) eoyyVar.build(), false);
        }
        if (eoyyVar != null) {
            cfdaVar.a((eoyz) eoyyVar.build(), true);
        } else {
            cfdaVar.a(eoyz.a, true);
        }
    }

    public final void q(eoxe eoxeVar) {
        epby epbyVarB = epby.b(eoxeVar.c);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        int iOrdinal = epbyVarB.ordinal();
        if (iOrdinal != 3 && iOrdinal != 18 && iOrdinal != 12 && iOrdinal != 13 && iOrdinal != 15 && iOrdinal != 16) {
            switch (iOrdinal) {
            }
            return;
        }
        this.D.b(true);
    }

    final void s(ezol ezolVar, bvks bvksVar, int i) {
        fcsu fcsuVar = this.X;
        ((bvio) this.p.b()).r((((cdio) fcsuVar.b()).a() ? bvksVar.d : ezolVar).c, i);
        if (((cdio) fcsuVar.b()).a()) {
            auvh.h(this.K.b(bvksVar));
        } else {
            ((cema) this.v.b()).a(this.J.a(ezolVar));
        }
    }

    public final void t(ezol ezolVar, bvks bvksVar) {
        ezol ezolVar2 = ((cdio) this.X.b()).a() ? bvksVar.d : ezolVar;
        ejye ejyeVar = ((cfae) this.ar.b()).a;
        synchronized (ejyeVar) {
            if (((ezol) ejyeVar.b(ezolVar2.c)) == null) {
                ejyeVar.d(ezolVar2.c, ezolVar2);
                s(ezolVar, bvksVar, 12);
            } else {
                ekrw ekrwVarE = c.e();
                ekrwVarE.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "unpairFromBrowserWithCache", 3299, "DittoChannelRequestHandlerV2.java")).t("Skipping unpairing from browser [browser id=%s] due to id cached.", ezolVar2.c);
            }
        }
    }
}
