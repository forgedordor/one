package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqg implements csea {
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/spam/system/bugle/BugleSpamDatabaseOperations");
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final dqsn h;
    private final fdjx i;

    public csqg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, dqsn dqsnVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        dqsnVar.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = dqsnVar;
        this.i = fdjxVar;
    }

    static /* synthetic */ Long m(final csqg csqgVar, final csnz csnzVar, final csdl csdlVar, csdo csdoVar, final eoeo eoeoVar, int i, eoff eoffVar, String str, eofg eofgVar, int i2) throws IOException {
        final csdo csdoVar2 = (i2 & 4) != 0 ? csdo.a : csdoVar;
        final int i3 = (i2 & 16) != 0 ? 0 : i;
        final eoff eoffVar2 = (i2 & 32) != 0 ? eoff.UNKNOWN_SPAM_VERDICT : eoffVar;
        final String str2 = (i2 & 64) != 0 ? "" : str;
        final eofg eofgVar2 = (i2 & 128) != 0 ? eofg.UNKNOWN_SPAM_ERROR : eofgVar;
        eieu eieuVarH = eiiy.h("SpamDatabaseOperations#insertMessageSpamTableEntryWithoutAction");
        try {
            ecem.b();
            if (eofgVar2 != eofg.UNKNOWN_SPAM_ERROR && eoffVar2 != eoff.UNKNOWN_SPAM_VERDICT) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Long l = (Long) csqgVar.h.c("SpamDatabaseOperations#insertMessageSpamTableEntryWithoutAction", new ejxr() { // from class: cspv
                @Override // defpackage.ejxr
                public final Object get() {
                    csqg csqgVar2 = this.a;
                    MessageCoreData messageCoreDataA = ((baxe) csqgVar2.e.b()).A(((cspi) csnzVar).a);
                    if (messageCoreDataA == null) {
                        return null;
                    }
                    int i4 = i3;
                    eofg eofgVar3 = eofgVar2;
                    eoeo eoeoVar2 = eoeoVar;
                    String str3 = str2;
                    eoff eoffVar3 = eoffVar2;
                    csdo csdoVar3 = csdoVar2;
                    csdl csdlVar2 = csdlVar;
                    String[] strArr = bqrg.a;
                    bqox bqoxVar = new bqox();
                    bqoxVar.h(messageCoreDataA.C());
                    bqoxVar.f(messageCoreDataA.A());
                    bqoxVar.l(csdlVar2.n);
                    bqoxVar.k(csdoVar3.a());
                    bqoxVar.i(eoffVar3);
                    bqoxVar.d(str3);
                    bqoxVar.m(eoeoVar2);
                    bqoxVar.c(eykc.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION);
                    bqoxVar.b(new csdn().a());
                    bqoxVar.e(((cogw) csqgVar2.g.b()).f().toEpochMilli());
                    bqoxVar.g(eofgVar3);
                    bqoxVar.j(i4);
                    final bqou bqouVarA = bqoxVar.a();
                    final dqsy dqsyVarB = bqrg.b();
                    return Long.valueOf(dqru.b(bqrg.b(), "message_spam", bqouVarA, new Function() { // from class: bqor
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarB.P("message_spam", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bqoq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            Long l2 = (Long) obj;
                            if (l2.longValue() >= 0) {
                                bqou bqouVar = bqouVarA;
                                bqouVar.a = l2.longValue();
                                bqouVar.fN(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }));
                }
            });
            fczl.a(eieuVarH, null);
            return l;
        } finally {
        }
    }

    @Override // defpackage.csea
    public final ekgb a(final csnz csnzVar) throws IOException {
        eieu eieuVarH = eiiy.h("SpamDatabaseOperations#getSpamListForMessage");
        try {
            ecem.b();
            bqqz bqqzVarA = bqrg.a();
            bqqzVarA.A("getSpamCursorFromMessageId");
            bqqzVarA.c(new Function() { // from class: cspz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqrf bqrfVar = (bqrf) obj;
                    bqrfVar.c(((cspi) csnzVar).a);
                    return bqrfVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqqc bqqcVar = (bqqc) bqqzVarA.b().q(bqrg.b.d);
            try {
                ekgb ekgbVarE = bqqcVar.e();
                bqqcVar.close();
                ekgbVarE.getClass();
                fczl.a(eieuVarH, null);
                return ekgbVarE;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.csea
    public final List b(final csnz csnzVar, final csnx csnxVar) {
        if (csnzVar == null && csnxVar == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        bqqz bqqzVarA = bqrg.a();
        bqqzVarA.A("SpamDatabaseOperations#getLatestNonEmptyClassificationBySource");
        bqqzVarA.c(new Function() { // from class: csqd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csnz csnzVar2 = csnzVar;
                bqrf bqrfVar = (bqrf) obj;
                if (csnzVar2 != null) {
                    bqrfVar.c(((cspi) csnzVar2).a);
                }
                csnx csnxVar2 = csnxVar;
                if (csnxVar2 != null) {
                    bqrfVar.b(((csog) csnxVar2).a);
                }
                eoff[] eoffVarArr = {eoff.SPAM, eoff.NOT_SPAM};
                int iIntValue = bqrg.c().intValue();
                if (iIntValue < 58030) {
                    dqru.x("outcome", iIntValue);
                }
                bqrfVar.ap(new dqpm("message_spam.outcome", 3, bqrf.as((Iterable) DesugarArrays.stream(eoffVarArr).map(new Function() { // from class: bqrd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((eoff) obj2).a());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bqre
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }))), true));
                return bqrfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqqa bqqaVar = bqrg.b;
        bqqzVarA.n(new dqxl(" MAX($V) ", new Object[]{bqqaVar.h}), "max_timestamp");
        bqqzVarA.w(bqqaVar.d);
        ekgb<bqou> ekgbVarZ = bqqzVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (bqou bqouVar : ekgbVarZ) {
            bqouVar.getClass();
            bqouVar.aA(0, "_id");
            csoe csoeVar = new csoe(bqouVar.a);
            MessageIdType messageIdTypeQ = bqouVar.q();
            messageIdTypeQ.getClass();
            cspi cspiVar = new cspi(messageIdTypeQ);
            bqouVar.aA(2, "conversation_id");
            ConversationIdType conversationIdType = bqouVar.c;
            conversationIdType.getClass();
            csog csogVar = new csog(conversationIdType);
            csdl csdlVar = csdl.a;
            csdl csdlVarA = csdk.a(bqouVar.o());
            csdo csdoVar = new csdo(bqouVar.k());
            long jP = bqouVar.p();
            eoeo eoeoVarR = bqouVar.r();
            eoeoVarR.getClass();
            int iN = bqouVar.n();
            eoff eoffVarS = bqouVar.s();
            eoffVarS.getClass();
            bqouVar.aA(6, "ares_initiated_by");
            String str = bqouVar.g;
            if (str == null) {
                str = "";
            }
            eofg eofgVarT = bqouVar.t();
            eofgVarT.getClass();
            eykc eykcVarU = bqouVar.u();
            eykcVarU.getClass();
            arrayList.add(new csnw(csoeVar, cspiVar, csogVar, csdlVarA, csdoVar, jP, eoeoVarR, iN, eoffVarS, str, eofgVarT, eykcVarU, csdm.a(bqouVar.m())));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csea
    public final Map c(final List list) throws IOException {
        list.getClass();
        eieu eieuVarH = eiiy.h("SpamDatabaseOperations#fetchSpamSourcesDataList");
        try {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(((csnz) it.next()) instanceof cspi)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            ecem.b();
            bqqz bqqzVarA = bqrg.a();
            bqqzVarA.A("+fetchSpamSourcesDataList");
            bqqzVarA.c(new Function() { // from class: csqa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List<csnz> list2 = list;
                    bqrf bqrfVar = (bqrf) obj;
                    ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                    for (csnz csnzVar : list2) {
                        csnzVar.getClass();
                        arrayList.add(((cspi) csnzVar).a);
                    }
                    ekfw ekfwVar = new ekfw();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ekfwVar.h(String.valueOf(bary.a((MessageIdType) it2.next())));
                    }
                    bqrfVar.ap(new dqpm("message_spam.message_id", 3, bqrf.as(ekfwVar.g()), true));
                    return bqrfVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bqqzVarA.b().z();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ekqh it2 = ekgbVarZ.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                bqou bqouVar = (bqou) it2.next();
                if (bqouVar.s() != eoff.UNKNOWN_SPAM_VERDICT) {
                    if (linkedHashMap.get(bqouVar.q()) == null) {
                        linkedHashMap.put(bqouVar.q(), new ArrayList());
                    }
                    Object obj = linkedHashMap.get(bqouVar.q());
                    obj.getClass();
                    ((List) obj).add(Integer.valueOf(bqouVar.o()));
                }
            }
            fczl.a(eieuVarH, null);
            return linkedHashMap;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.csea
    public final void d() {
        auvw.k(this.i, null, null, new csqf(this, null), 3);
    }

    @Override // defpackage.csea
    public final boolean e(csnx csnxVar) throws IOException {
        eieu eieuVarH = eiiy.h("SpamDatabaseOperations#getConversationSpamDismissStatus");
        try {
            ecem.b();
            bojh bojhVarR = ((bakt) this.d.b()).r(((csog) csnxVar).a);
            boolean z = false;
            if (bojhVarR != null) {
                if (bojhVarR.au()) {
                    z = true;
                }
            }
            fczl.a(eieuVarH, null);
            return z;
        } finally {
        }
    }

    @Override // defpackage.csea
    public final boolean f(final csnx csnxVar, final eykc eykcVar) {
        bqqz bqqzVarA = bqrg.a();
        bqqzVarA.A("SpamDatabaseOperations.hasActionBeenAppliedToConversation");
        bqqzVarA.c(new Function() { // from class: cspw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqrf bqrfVar = (bqrf) obj;
                bqrfVar.b(((csog) csnxVar).a);
                int iIntValue = bqrg.c().intValue();
                if (iIntValue < 59460) {
                    dqru.x("action_type", iIntValue);
                }
                bqrfVar.ap(new dqty("message_spam.action_type", 1, Integer.valueOf(eykcVar.a())));
                return bqrfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bqqzVarA.b().U();
    }

    @Override // defpackage.csea
    public final boolean g(final csnx csnxVar) {
        ecem.b();
        Object objC = this.h.c("SpamDatabaseOperations#updateConversationSpamDismissStatus", new ejxr() { // from class: csqb
            @Override // defpackage.ejxr
            public final Object get() {
                bakt baktVar = (bakt) this.a.d.b();
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("updateConversationSpamDismissStatus");
                boteVar.aa(true);
                return Boolean.valueOf(baktVar.aj(((csog) csnxVar).a, boteVar));
            }
        });
        objC.getClass();
        return ((Boolean) objC).booleanValue();
    }

    @Override // defpackage.csea
    public final csoe h(csnz csnzVar, csdl csdlVar, csdo csdoVar, eoeo eoeoVar, int i, eoff eoffVar, String str) {
        Long lM = m(this, csnzVar, csdlVar, csdoVar, eoeoVar, i, eoffVar, str, null, 128);
        if (lM == null) {
            return null;
        }
        return new csoe(lM.longValue());
    }

    @Override // defpackage.csea
    public final void i(csoe csoeVar, eykc eykcVar, csdn csdnVar) {
        ecem.b();
        eieu eieuVarH = eiiy.h("SpamDatabaseOperations#addActionToClassificationRecord");
        try {
            if (!fcva.g(eykc.DO_NOTHING, eykc.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION).contains(eykcVar) && csdnVar.g()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String[] strArr = bqrg.a;
            bqrb bqrbVar = new bqrb();
            int iIntValue = bqrg.c().intValue();
            int iIntValue2 = bqrg.c().intValue();
            if (iIntValue2 < 59460) {
                dqru.x("action_type", iIntValue2);
            }
            if (iIntValue >= 59460) {
                bqrbVar.a.put("action_type", Integer.valueOf(eykcVar.a()));
            }
            int iA = csdnVar.a();
            int iIntValue3 = bqrg.c().intValue();
            int iIntValue4 = bqrg.c().intValue();
            if (iIntValue4 < 59460) {
                dqru.x("action_contributors", iIntValue4);
            }
            if (iIntValue3 >= 59460) {
                bqrbVar.a.put("action_contributors", Integer.valueOf(iA));
            }
            long j = csoeVar.a;
            bqrf bqrfVar = new bqrf();
            bqrfVar.ap(new dqty("message_spam._id", 1, Long.valueOf(j)));
            bqrbVar.aj(new bqrc(bqrfVar), "message_spam-buildAndUpdateForId");
            fczl.a(eieuVarH, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.csea
    public final boolean j(final cspo cspoVar, final csdl csdlVar, final boolean z) {
        csdlVar.getClass();
        ecem.b();
        if (cspoVar == null) {
            return false;
        }
        Object objC = this.h.c("SpamDatabaseOperations#updateParticipantIsSpam", new ejxr() { // from class: cspx
            @Override // defpackage.ejxr
            public final Object get() {
                csqg csqgVar = this.a;
                csqi csqiVar = (csqi) csqgVar.f.b();
                cspo cspoVar2 = cspoVar;
                csoc csocVarB = csqiVar.b(cspoVar2);
                if (csocVarB == null) {
                    return false;
                }
                boolean z2 = z;
                csdl csdlVar2 = csdlVar;
                csps cspsVar = (csps) csocVarB;
                csdn csdnVar = cspsVar.i;
                csdn csdnVarB = csdnVar.b(csdlVar2, z2);
                if (fdbq.f(csdnVar, csdnVarB) && z2 == cspsVar.h) {
                    return true;
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("updateParticipantIsSpam");
                bsbsVarF.al();
                bsbsVarF.A(csdnVarB.a());
                if (csdnVar.c(csdlVar2, z2)) {
                    bsbsVarF.z(z2);
                }
                String str = cspoVar2.a;
                boolean zE = bsbsVarF.e(str);
                ((bbca) csqgVar.c.b()).p(zE ? 1 : 0, true != zE ? "Failed to update participants' spam status." : "Successfully updated participants' spam status.");
                if (zE) {
                    boolean z3 = cspsVar.h;
                    ((bakt) csqgVar.d.b()).R(str);
                    ekrw ekrwVarH = csqg.b.h();
                    ekrwVarH.X(eksq.a, "BugleSpam");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(new ekrz("oldState", Boolean.class, false, false), Boolean.valueOf(z3));
                    ekrdVar.X(new ekrz("oldSources", csdn.class, false, false), csdnVar);
                    ekrdVar.X(new ekrz("newState", Boolean.class, false, false), Boolean.valueOf(z2));
                    ekrdVar.X(new ekrz("newSources", csdn.class, false, false), csdnVarB);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/spam/system/bugle/BugleSpamDatabaseOperations", "updateParticipantIsSpam$lambda$3", 326, "BugleSpamDatabaseOperations.kt")).q("BuglerSpamDatabaseOperations: updated spam state.");
                }
                return Boolean.valueOf(zE);
            }
        });
        objC.getClass();
        return ((Boolean) objC).booleanValue();
    }

    @Override // defpackage.csea
    public final void k(final cspo cspoVar) {
        ecem.b();
        if (cspoVar == null) {
            return;
        }
        Object objC = this.h.c("SpamDatabaseOperations#updateParticipantIsSpam", new ejxr() { // from class: cspy
            @Override // defpackage.ejxr
            public final Object get() {
                csqi csqiVar = (csqi) this.a.f.b();
                cspo cspoVar2 = cspoVar;
                csoc csocVarB = csqiVar.b(cspoVar2);
                if (csocVarB == null || ((csps) csocVarB).i.e()) {
                    return false;
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("markParticipantAsAllowlisted");
                bsbsVarF.A(new csdn().a());
                bsbsVarF.z(false);
                return Boolean.valueOf(bsbsVarF.e(cspoVar2.a));
            }
        });
        objC.getClass();
        ((Boolean) objC).booleanValue();
    }

    @Override // defpackage.csea
    public final void l(csnz csnzVar, csdl csdlVar, eoeo eoeoVar, int i, eofg eofgVar) throws IOException {
        eofgVar.getClass();
        Long lM = m(this, csnzVar, csdlVar, null, eoeoVar, i, null, null, eofgVar, 100);
        if (lM == null) {
            return;
        }
        lM.longValue();
    }
}
