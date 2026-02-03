package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciss extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler");
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final asre f;
    public final asqx g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;

    public ciss(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, asre asreVar, asqx asqxVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = asreVar;
        this.g = asqxVar;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
        this.l = fcsuVar7;
    }

    public static void k(Level level, ConversationIdType conversationIdType, String str, String str2) {
        ekrd ekrdVarA = a.a(level);
        ekrdVarA.X(eksq.a, "BugleGroupManagement");
        ekrdVarA.X(cqnc.r, conversationIdType.toString());
        ekrdVarA.X(cqnc.N, str);
        ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "logForLogcat", 561, "AddMembersToRcsConversationHandler.java")).q(str2);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).c = elgm.ADD_MEMBERS_TO_RCS_CONVERSATION_ACTION;
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("AddMembersToRcsConversationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cisu.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cisu cisuVar = (cisu) evuhVar;
        final ConversationIdType conversationIdTypeB = barn.b(cisuVar.c);
        return eijx.g(new cisr(this, conversationIdTypeB), this.b).i(new eooz() { // from class: ciso
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarE;
                eiju eijuVarE2;
                final ciss cissVar = this.a;
                cisu cisuVar2 = cisuVar;
                final bojh bojhVar = (bojh) obj;
                if (bojhVar == null) {
                    if (((ardw) cissVar.k.b()).a()) {
                        cifw cifwVar = (cifw) cissVar.e.b();
                        auib auibVar = cisuVar2.f;
                        if (auibVar == null) {
                            auibVar = auib.a;
                        }
                        cifwVar.n(auibVar, 21);
                    }
                    ciss.k(Level.WARNING, conversationIdTypeB, null, "Conversation is null when attempting to add users to RCS group conversation.");
                    return eijx.e(cbcw.k());
                }
                final ConversationIdType conversationIdTypeC = bojhVar.C();
                if ((cisuVar2.b & 1) != 0) {
                    aubq aubqVar = cisuVar2.e;
                    if (aubqVar == null) {
                        aubqVar = aubq.a;
                    }
                    eijuVarE = eijx.e(Optional.of(aubqVar));
                } else {
                    eijuVarE = ((chtk) cissVar.j.b()).e(bojhVar.C());
                }
                ekgb ekgbVarN = ekgb.n(cisuVar2.d);
                final auib auibVar2 = cisuVar2.f;
                if (auibVar2 == null) {
                    auibVar2 = auib.a;
                }
                final ekgb ekgbVar = (ekgb) Collection.EL.stream(ekgbVarN).map(new Function() { // from class: cisl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((alre) cissVar.i.b()).b((alwl) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a);
                fcsu fcsuVar = cissVar.h;
                citi citiVar = (citi) fcsuVar.b();
                int size = ekgbVar.size();
                ejwl.m(size > 0, "Number of users added must be positive.");
                ((ains) citiVar.a.b()).e("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.UserCount", size);
                ciss.k(Level.FINE, bojhVar.C(), bojhVar.ae(), "Adding users to RCS group using ChatApi");
                if (ejwk.c(bojhVar.ae())) {
                    ciss.k(Level.WARNING, bojhVar.C(), bojhVar.ae(), "Cannot add users to a conversation without RCS conversation ID.");
                    ((ains) ((citi) fcsuVar.b()).a.b()).c("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.NoRcsConversationId");
                    if (((ardw) cissVar.k.b()).a()) {
                        ((cifw) cissVar.e.b()).o(auibVar2, 22, ((armi) cissVar.l.b()).a() ? bojhVar.J() : cbqz.a, 3);
                    } else {
                        ((cifw) cissVar.e.b()).d();
                    }
                    eijuVarE2 = eijx.e(false);
                } else if (ejwk.c(bojhVar.ad())) {
                    ciss.k(Level.WARNING, bojhVar.C(), bojhVar.ae(), "Cannot add users to a conversation without RCS conference URI.");
                    ((ains) ((citi) fcsuVar.b()).a.b()).c("Bugle.Bugle.Rcs.Groups.AddingUsersToRcsConversation.NoRcsConferenceUri");
                    if (((ardw) cissVar.k.b()).a()) {
                        ((cifw) cissVar.e.b()).o(auibVar2, 23, ((armi) cissVar.l.b()).a() ? bojhVar.J() : cbqz.a, 3);
                    } else {
                        ((cifw) cissVar.e.b()).d();
                    }
                    eijuVarE2 = eijx.e(false);
                } else {
                    eooz eoozVar = new eooz() { // from class: cisi
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final ciss cissVar2 = cissVar;
                            final auib auibVar3 = auibVar2;
                            final bojh bojhVar2 = bojhVar;
                            aubq aubqVar2 = (aubq) ((Optional) obj2).orElseThrow(new Supplier() { // from class: cisn
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    ciss cissVar3 = cissVar2;
                                    if (((ardw) cissVar3.k.b()).a()) {
                                        cifw cifwVar2 = (cifw) cissVar3.e.b();
                                        cbqz cbqzVarJ = ((armi) cissVar3.l.b()).a() ? bojhVar2.J() : cbqz.a;
                                        auib auibVar4 = auibVar3;
                                        auibVar4.getClass();
                                        cbqzVarJ.getClass();
                                        cifw.u(cifwVar2, auibVar4, 24, cbqzVarJ, 8);
                                    }
                                    return new IllegalStateException("Sender is absent");
                                }
                            });
                            fcsu fcsuVar2 = cissVar2.k;
                            final UUID uuidRandomUUID = UUID.randomUUID();
                            if (!((ardw) fcsuVar2.b()).a()) {
                                cifw cifwVar2 = (cifw) cissVar2.e.b();
                                uuidRandomUUID.getClass();
                                cifw.v(cifwVar2, 16, 0, uuidRandomUUID.toString(), null, null, null, 0, null, null, 506);
                            }
                            ekgb ekgbVar2 = ekgbVar;
                            String strAe = bojhVar2.ae();
                            strAe.getClass();
                            String strAd = bojhVar2.ad();
                            strAd.getClass();
                            audt audtVar = (audt) audu.a.createBuilder();
                            audtVar.copyOnWrite();
                            audu auduVar = (audu) audtVar.instance;
                            auduVar.b |= 1;
                            auduVar.c = strAe;
                            aubq aubqVarA = cissVar2.g.a(strAd, true);
                            audtVar.copyOnWrite();
                            audu auduVar2 = (audu) audtVar.instance;
                            aubqVarA.getClass();
                            auduVar2.d = aubqVarA;
                            auduVar2.b |= 2;
                            audu auduVar3 = (audu) audtVar.build();
                            Stream map = Collection.EL.stream(ekgbVar2).map(new Function() { // from class: cism
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    Optional optionalE = ((alqm) obj3).e();
                                    final ciss cissVar3 = cissVar2;
                                    final auib auibVar4 = auibVar3;
                                    final bojh bojhVar3 = bojhVar2;
                                    final UUID uuid = uuidRandomUUID;
                                    return (aubq) optionalE.orElseThrow(new Supplier() { // from class: cisp
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            ciss cissVar4 = cissVar3;
                                            if (((ardw) cissVar4.k.b()).a()) {
                                                auib auibVar5 = auibVar4;
                                                if (((armi) cissVar4.l.b()).a()) {
                                                    ((cifw) cissVar4.e.b()).e(auibVar5, bojhVar3.J());
                                                } else {
                                                    cifw cifwVar3 = (cifw) cissVar4.e.b();
                                                    auibVar5.getClass();
                                                    cifwVar3.e(auibVar5, cbqz.a);
                                                }
                                            } else {
                                                UUID uuid2 = uuid;
                                                cifw cifwVar4 = (cifw) cissVar4.e.b();
                                                uuid2.getClass();
                                                String string = uuid2.toString();
                                                enxt enxtVar = (enxt) enxu.a.createBuilder();
                                                enxtVar.getClass();
                                                enxv enxvVar = (enxv) enxw.a.createBuilder();
                                                enxvVar.getClass();
                                                enye.d(2, enxvVar);
                                                enye.c(enxk.CHAT_API_FAILED_PERMANENTLY, enxvVar);
                                                enye.b(enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT, enxvVar);
                                                enxb.b(enye.a(enxvVar), enxtVar);
                                                cifw.v(cifwVar4, 17, 3, string, null, null, enxb.a(enxtVar), 0, null, null, 472);
                                            }
                                            return new IllegalStateException("no RCS identifier found for the participant to add");
                                        }
                                    });
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = ekgb.d;
                            ekgb ekgbVar3 = (ekgb) map.collect(ekcv.a);
                            auba aubaVar = (auba) aubb.a.createBuilder();
                            aubaVar.copyOnWrite();
                            aubb aubbVar = (aubb) aubaVar.instance;
                            aubbVar.b |= 1;
                            aubbVar.c = strAe;
                            String string = uuidRandomUUID.toString();
                            aubaVar.copyOnWrite();
                            aubb aubbVar2 = (aubb) aubaVar.instance;
                            string.getClass();
                            aubbVar2.b |= 2;
                            aubbVar2.e = string;
                            aubaVar.copyOnWrite();
                            aubb aubbVar3 = (aubb) aubaVar.instance;
                            auibVar3.getClass();
                            aubbVar3.f = auibVar3;
                            aubbVar3.b |= 4;
                            if (((armi) cissVar2.l.b()).a()) {
                                cbqz cbqzVarJ = bojhVar2.J();
                                cbqz cbqzVar = cbqz.a;
                                long jA = cbqy.a(cbqzVarJ);
                                aubaVar.copyOnWrite();
                                aubb aubbVar4 = (aubb) aubaVar.instance;
                                aubbVar4.b |= 8;
                                aubbVar4.g = jA;
                            }
                            aubc aubcVar = (aubc) aubd.a.createBuilder();
                            aubcVar.copyOnWrite();
                            aubd aubdVar = (aubd) aubcVar.instance;
                            auduVar3.getClass();
                            aubdVar.c = auduVar3;
                            aubdVar.b |= 1;
                            aubcVar.copyOnWrite();
                            aubd aubdVar2 = (aubd) aubcVar.instance;
                            evtg evtgVar = aubdVar2.d;
                            if (!evtgVar.c()) {
                                aubdVar2.d = evsn.mutableCopy(evtgVar);
                            }
                            evpz.addAll(ekgbVar3, aubdVar2.d);
                            aubcVar.copyOnWrite();
                            aubd aubdVar3 = (aubd) aubcVar.instance;
                            aubqVar2.getClass();
                            aubdVar3.f = aubqVar2;
                            aubdVar3.b |= 4;
                            evqs byteString = ((aubb) aubaVar.build()).toByteString();
                            aubcVar.copyOnWrite();
                            aubd aubdVar4 = (aubd) aubcVar.instance;
                            aubdVar4.b |= 2;
                            aubdVar4.e = byteString;
                            aubcVar.copyOnWrite();
                            aubd aubdVar5 = (aubd) aubcVar.instance;
                            auibVar3.getClass();
                            aubdVar5.g = auibVar3;
                            aubdVar5.b |= 8;
                            return cissVar2.f.a((aubd) aubcVar.build());
                        }
                    };
                    eosc eoscVar = cissVar.c;
                    eijuVarE2 = eijuVarE.i(eoozVar, eoscVar).h(new ejvr() { // from class: cisj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            aubf aubfVar = (aubf) obj2;
                            aubl aublVar = aubfVar.c;
                            if (aublVar == null) {
                                aublVar = aubl.a;
                            }
                            aubk aubkVarB = aubk.b(aublVar.c);
                            if (aubkVarB == null) {
                                aubkVarB = aubk.UNKNOWN_STATUS;
                            }
                            if (aubkVarB.equals(aubk.PENDING) || aubkVarB.equals(aubk.OK)) {
                                return true;
                            }
                            bojh bojhVar2 = bojhVar;
                            ekrw ekrwVarJ = ciss.a.j();
                            ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                            ekrd ekrdVar = (ekrd) ekrwVarJ;
                            ekrdVar.X(cqnc.s, bojhVar2.C());
                            ekrdVar.X(cqnc.N, bojhVar2.ae());
                            ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "addUsersToGroupWithChatApi", 331, "AddMembersToRcsConversationHandler.java");
                            aubl aublVar2 = aubfVar.c;
                            if (aublVar2 == null) {
                                aublVar2 = aubl.a;
                            }
                            aubi aubiVarB = aubi.b(aublVar2.d);
                            if (aubiVarB == null) {
                                aubiVarB = aubi.UNKNOWN_CAUSE;
                            }
                            ciss cissVar2 = cissVar;
                            ekrdVar2.r("Failed to add user to group: %s", aubiVarB.v);
                            if (((ardw) cissVar2.k.b()).a()) {
                                ((cifw) cissVar2.e.b()).f(aubfVar);
                            } else {
                                ((cifw) cissVar2.e.b()).c(aubfVar);
                            }
                            return false;
                        }
                    }, eoscVar).e(RuntimeException.class, new ejvr() { // from class: cisk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrw ekrwVarJ = ciss.a.j();
                            ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(((RuntimeException) obj2).getCause());
                            bojh bojhVar2 = bojhVar;
                            ekrdVar.X(cqnc.s, bojhVar2.C());
                            ekrdVar.X(cqnc.N, bojhVar2.ae());
                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "addUsersToGroupWithChatApi", 350, "AddMembersToRcsConversationHandler.java")).q("Failed to addUserToGroup - Chat API rejected the request.");
                            ciss cissVar2 = cissVar;
                            if (((ardw) cissVar2.k.b()).a()) {
                                ((cifw) cissVar2.e.b()).o(auibVar2, 25, ((armi) cissVar2.l.b()).a() ? bojhVar2.J() : cbqz.a, 3);
                            } else {
                                ((cifw) cissVar2.e.b()).d();
                            }
                            return false;
                        }
                    }, eoscVar);
                }
                return eijuVarE2.i(new eooz() { // from class: cisq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        ConversationIdType conversationIdType = conversationIdTypeC;
                        bojh bojhVar2 = bojhVar;
                        if (zBooleanValue) {
                            ciss.k(Level.FINE, conversationIdType, bojhVar2.ae(), "Users successfully queued to be added to RCS group conversation.");
                            return eijx.e(cbcw.i());
                        }
                        ciss.k(Level.FINE, conversationIdType, bojhVar2.ae(), "Users not successfully queued to be added to RCS group conversation.");
                        return eijx.e(cbcw.k());
                    }
                }, cissVar.b);
            }
        }, this.c);
    }
}
