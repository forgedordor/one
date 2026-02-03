package defpackage;

import j$.util.StringJoiner;
import j$.util.function.Function$CC;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnfd implements asre {
    public static final aubl a;
    public static final eksp b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final eosc k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final fcsu o;
    private final eosd p;

    static {
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        a = (aubl) aubgVar.build();
        b = eksp.c("BugleTachygram");
    }

    public cnfd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, eosd eosdVar, eosc eoscVar, fcsu fcsuVar12) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.o = fcsuVar8;
        this.k = eoscVar;
        this.l = fcsuVar10;
        this.j = fcsuVar9;
        this.m = fcsuVar11;
        this.p = eosdVar;
        this.n = fcsuVar12;
    }

    public static cbog i(String str) {
        caxr caxrVar = new caxr();
        caxrVar.a = str;
        return caxrVar.a();
    }

    @Override // defpackage.asre
    public final eiju a(final aubd aubdVar) {
        return eijx.g(new Callable() { // from class: cnez
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnbd cnbdVar = (cnbd) this.a.f.b();
                aubd aubdVar2 = aubdVar;
                audu auduVar = aubdVar2.c;
                if (auduVar == null) {
                    auduVar = audu.a;
                }
                ((cazj) cnbdVar.a.b()).a(cbcu.g("tachygram_add_user_to_group", aubdVar2, cnfd.i(auduVar.c)));
                eksl ekslVar = (eksl) cnfd.b.h();
                ekrz ekrzVar = cqnc.N;
                audu auduVar2 = aubdVar2.c;
                if (auduVar2 == null) {
                    auduVar2 = audu.a;
                }
                ekslVar.X(ekrzVar, auduVar2.c);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "addUserToGroupChat", 204, "TachygramOutgoingChatApi.java")).q("AddUserToGroupChatRequest is queued.");
                evqs evqsVar = aubdVar2.e;
                aube aubeVar = (aube) aubf.a.createBuilder();
                aubl aublVar = cnfd.a;
                aubeVar.copyOnWrite();
                aubf aubfVar = (aubf) aubeVar.instance;
                aublVar.getClass();
                aubfVar.c = aublVar;
                aubfVar.b |= 1;
                aubeVar.copyOnWrite();
                aubf aubfVar2 = (aubf) aubeVar.instance;
                evqsVar.getClass();
                aubfVar2.b |= 2;
                aubfVar2.d = evqsVar;
                return (aubf) aubeVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.asre
    public final eiju b(final auce auceVar) {
        return eijx.g(new Callable() { // from class: cnfb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnbo cnboVar = (cnbo) this.a.e.b();
                auce auceVar2 = auceVar;
                ((cazj) cnboVar.a.b()).a(cbcu.g("tachygram_create_group", auceVar2, cnfd.i(auceVar2.c)));
                eksl ekslVar = (eksl) cnfd.b.h();
                ekslVar.X(cqnc.N, auceVar2.c);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "createGroupChat", 182, "TachygramOutgoingChatApi.java")).q("CreateGroupChatRequest is queued.");
                evqs evqsVar = auceVar2.h;
                aucg aucgVar = (aucg) auch.a.createBuilder();
                aubl aublVar = cnfd.a;
                aucgVar.copyOnWrite();
                auch auchVar = (auch) aucgVar.instance;
                aublVar.getClass();
                auchVar.c = aublVar;
                auchVar.b |= 1;
                aucgVar.copyOnWrite();
                auch auchVar2 = (auch) aucgVar.instance;
                evqsVar.getClass();
                auchVar2.b |= 4;
                auchVar2.e = evqsVar;
                enyw enywVar = enyw.RCS_TACHYGRAM;
                aucgVar.copyOnWrite();
                auch auchVar3 = (auch) aucgVar.instance;
                auchVar3.f = enywVar.h;
                auchVar3.b |= 8;
                return (auch) aucgVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.asre
    public final eiju c(final augi augiVar) {
        return eijx.g(new Callable() { // from class: cnfa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnfy cnfyVar = (cnfy) this.a.g.b();
                augi augiVar2 = augiVar;
                audu auduVar = augiVar2.c;
                if (auduVar == null) {
                    auduVar = audu.a;
                }
                ((cazj) cnfyVar.a.b()).a(cbcu.g("tachygram_remove_user_from_group", augiVar2, cnfd.i(auduVar.c)));
                eksl ekslVar = (eksl) cnfd.b.h();
                ekrz ekrzVar = cqnc.N;
                audu auduVar2 = augiVar2.c;
                if (auduVar2 == null) {
                    auduVar2 = audu.a;
                }
                ekslVar.X(ekrzVar, auduVar2.c);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "removeUserFromGroupChat", 226, "TachygramOutgoingChatApi.java")).q("RemoveUserFromGroupChatRequest is queued.");
                evqs evqsVar = augiVar2.e;
                augj augjVar = (augj) augk.a.createBuilder();
                aubl aublVar = cnfd.a;
                augjVar.copyOnWrite();
                augk augkVar = (augk) augjVar.instance;
                aublVar.getClass();
                augkVar.c = aublVar;
                augkVar.b |= 1;
                augjVar.copyOnWrite();
                augk augkVar2 = (augk) augjVar.instance;
                evqsVar.getClass();
                augkVar2.b |= 2;
                augkVar2.d = evqsVar;
                return (augk) augjVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.asre
    public final eiju d(final augo augoVar) {
        return eijx.g(new Callable() { // from class: cnew
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnfd cnfdVar = this.a;
                cngf cngfVar = (cngf) cnfdVar.d.b();
                augo augoVar2 = augoVar;
                aubq aubqVar = augoVar2.c;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                String str = augoVar2.e;
                caxr caxrVar = new caxr();
                caxrVar.a = cnfdVar.j(aubqVar, str);
                ((cazj) cngfVar.a.b()).a(cbcu.g("tachygram_revoke_message", augoVar2, caxrVar.a()));
                eksl ekslVar = (eksl) cnfd.b.h();
                ekslVar.X(cqnc.a, augoVar2.d);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "revokeMessage", 165, "TachygramOutgoingChatApi.java")).q("RevokeChatMessageRequest is queued.");
                evqs evqsVar = augoVar2.f;
                augp augpVar = (augp) augq.a.createBuilder();
                aubl aublVar = cnfd.a;
                augpVar.copyOnWrite();
                augq augqVar = (augq) augpVar.instance;
                aublVar.getClass();
                augqVar.c = aublVar;
                augqVar.b |= 1;
                augpVar.copyOnWrite();
                augq augqVar2 = (augq) augpVar.instance;
                evqsVar.getClass();
                augqVar2.b |= 2;
                augqVar2.d = evqsVar;
                return (augq) augpVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.asre
    public final eiju e(final augw augwVar) {
        eieu eieuVarK = eiiy.k("TachygramOutgoingChatApi::sendMessage");
        try {
            cnhu cnhuVar = (cnhu) this.j.b();
            if ((augwVar.b & 2048) != 0) {
                auib auibVar = augwVar.n;
                if (auibVar == null) {
                    auibVar = auib.a;
                }
                cnhuVar.d(auibVar, basd.a(augwVar.h), 5);
            }
            eiju eijuVarG = eijx.g(new Callable() { // from class: cnfc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eieu eieuVarK2 = eiiy.k("TachygramOutgoingChatApi::sendMessageNowWithoutUsingPwq");
                    final cnfd cnfdVar = this.a;
                    final augw augwVar2 = augwVar;
                    try {
                        cngw cngwVar = (cngw) cnfdVar.l.b();
                        eieu eieuVarK3 = eiiy.k("TachygramSendMessageWorkHandler::processSendChatMessageRequest");
                        try {
                            final cnfv cnfvVar = cngwVar.b;
                            eieu eieuVarK4 = eiiy.k("TachygramOutgoingOperationTemplate::processWithoutUsingPwq");
                            try {
                                eiju eijuVarD = cnfvVar.d(augwVar2, null, new Function() { // from class: cnfe
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cnfv cnfvVar2 = cnfvVar;
                                        return ((eiju) obj).j(((Long) cnfvVar2.h.b()).longValue(), TimeUnit.SECONDS, cnfvVar2.i);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                eieuVarK4.b(eijuVarD);
                                eieuVarK4.close();
                                eieuVarK3.b(eijuVarD);
                                eieuVarK3.close();
                                ejvr ejvrVar = new ejvr() { // from class: cnet
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        eksl ekslVar = (eksl) cnfd.b.j();
                                        ekslVar.X(cqnc.a, augwVar2.h);
                                        ((eksl) ((eksl) ekslVar.g((Throwable) obj)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 298, "TachygramOutgoingChatApi.java")).q("Attempt to send chat message directly failed(or) timed-out so enqueueing it to pwq.");
                                        return atav.FAIL_RETRY;
                                    }
                                };
                                eosc eoscVar = cnfdVar.k;
                                eiju eijuVarH = eijuVarD.e(Throwable.class, ejvrVar, eoscVar).h(new ejvr() { // from class: cneu
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        int iOrdinal = ((atav) obj).ordinal();
                                        augw augwVar3 = augwVar2;
                                        if (iOrdinal == 0) {
                                            ekrw ekrwVarN = cnfd.b.n();
                                            ekrwVarN.X(cqnc.a, augwVar3.h);
                                            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 311, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is sent successfully");
                                            return null;
                                        }
                                        if (iOrdinal != 1) {
                                            if (iOrdinal != 2) {
                                                return null;
                                            }
                                            eksl ekslVar = (eksl) cnfd.b.j();
                                            ekslVar.X(cqnc.a, augwVar3.h);
                                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 317, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest failed, returning to Postmaster layer");
                                            return null;
                                        }
                                        cnfd cnfdVar2 = cnfdVar;
                                        ekrw ekrwVarN2 = cnfd.b.n();
                                        ekrwVarN2.X(cqnc.a, augwVar3.h);
                                        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 325, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is queued in Pwq after retryable failure.");
                                        ((cngk) cnfdVar2.c.b()).a(augwVar3, cnfdVar2.h(augwVar3));
                                        return null;
                                    }
                                }, eoscVar);
                                eieuVarK2.b(eijuVarH);
                                caxe caxeVar = (caxe) cnfdVar.m.b();
                                int iD = caxeVar.d(EnumSet.allOf(caxd.class), eijuVarH, new Supplier() { // from class: cnev
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return ((cgbn) cnfdVar.n.b()).b();
                                    }
                                });
                                caxeVar.f("Bugle.DataModel.Action.SendMessage.Rcs.Tachygram.AttachingAndroidFutureWrapper.Count", iD);
                                if (iD == 1) {
                                    ((cngk) cnfdVar.c.b()).a(augwVar2, cnfdVar.h(augwVar2));
                                } else {
                                    auvh.h(eijuVarH);
                                }
                                eieuVarK2.close();
                                cnhu cnhuVar2 = (cnhu) cnfdVar.j.b();
                                if ((augwVar2.b & 2048) != 0) {
                                    auib auibVar2 = augwVar2.n;
                                    if (auibVar2 == null) {
                                        auibVar2 = auib.a;
                                    }
                                    cnhuVar2.d(auibVar2, basd.a(augwVar2.h), 6);
                                }
                                eksl ekslVar = (eksl) cnfd.b.h();
                                ekslVar.X(cqnc.a, augwVar2.h);
                                ekslVar.X(cqnc.r, augwVar2.i);
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessage", 140, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is queued.");
                                evqs evqsVar = augwVar2.l;
                                augy augyVar = (augy) augz.a.createBuilder();
                                aubl aublVar = cnfd.a;
                                augyVar.copyOnWrite();
                                augz augzVar = (augz) augyVar.instance;
                                aublVar.getClass();
                                augzVar.c = aublVar;
                                augzVar.b |= 1;
                                augyVar.copyOnWrite();
                                augz augzVar2 = (augz) augyVar.instance;
                                evqsVar.getClass();
                                augzVar2.b |= 2;
                                augzVar2.d = evqsVar;
                                elpg elpgVarA = cnbk.a();
                                augyVar.copyOnWrite();
                                augz augzVar3 = (augz) augyVar.instance;
                                elpgVarA.getClass();
                                augzVar3.h = elpgVarA;
                                augzVar3.b |= 32;
                                return (augz) augyVar.build();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarK2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.p);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.asre
    public final eiju f(final auii auiiVar) {
        return eijx.g(new Callable() { // from class: cney
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cncl cnclVar = (cncl) this.a.i.b();
                auii auiiVar2 = auiiVar;
                audu auduVar = auiiVar2.c;
                if (auduVar == null) {
                    auduVar = audu.a;
                }
                ((cazj) cnclVar.a.b()).a(cbcu.g("tachygram_get_group_info", auiiVar2, cnfd.i(auduVar.c)));
                eksl ekslVar = (eksl) cnfd.b.h();
                ekrz ekrzVar = cqnc.N;
                audu auduVar2 = auiiVar2.c;
                if (auduVar2 == null) {
                    auduVar2 = audu.a;
                }
                ekslVar.X(ekrzVar, auduVar2.c);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "triggerChatGroupFullStateUpdate", 270, "TachygramOutgoingChatApi.java")).q("TriggerChatGroupFullStateUpdateRequest is queued.");
                evqs evqsVar = auiiVar2.d;
                auij auijVar = (auij) auik.a.createBuilder();
                aubl aublVar = cnfd.a;
                auijVar.copyOnWrite();
                auik auikVar = (auik) auijVar.instance;
                aublVar.getClass();
                auikVar.c = aublVar;
                auikVar.b |= 1;
                auijVar.copyOnWrite();
                auik auikVar2 = (auik) auijVar.instance;
                evqsVar.getClass();
                auikVar2.b |= 2;
                auikVar2.d = evqsVar;
                return (auik) auijVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.asre
    public final eiju g(final auip auipVar) {
        return eijx.g(new Callable() { // from class: cnex
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnhs cnhsVar = (cnhs) this.a.h.b();
                auip auipVar2 = auipVar;
                audu auduVar = auipVar2.c;
                if (auduVar == null) {
                    auduVar = audu.a;
                }
                ((cazj) cnhsVar.a.b()).a(cbcu.g("tachygram_update_group", auipVar2, cnfd.i(auduVar.c)));
                eksl ekslVar = (eksl) cnfd.b.h();
                ekrz ekrzVar = cqnc.N;
                audu auduVar2 = auipVar2.c;
                if (auduVar2 == null) {
                    auduVar2 = audu.a;
                }
                ekslVar.X(ekrzVar, auduVar2.c);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "updateGroupChat", 248, "TachygramOutgoingChatApi.java")).q("UpdateGroupChatRequest is queued.");
                evqs evqsVar = auipVar2.e;
                auir auirVar = (auir) auis.a.createBuilder();
                aubl aublVar = cnfd.a;
                auirVar.copyOnWrite();
                auis auisVar = (auis) auirVar.instance;
                aublVar.getClass();
                auisVar.c = aublVar;
                auisVar.b |= 1;
                auirVar.copyOnWrite();
                auis auisVar2 = (auis) auirVar.instance;
                evqsVar.getClass();
                auisVar2.b |= 2;
                auisVar2.d = evqsVar;
                return (auis) auirVar.build();
            }
        }, this.k);
    }

    public final cbog h(augw augwVar) {
        StringJoiner stringJoiner = new StringJoiner(",");
        aubq aubqVar = augwVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        StringJoiner stringJoinerAdd = stringJoiner.add("conversation: ".concat(String.valueOf(j(aubqVar, augwVar.i))));
        aufx aufxVar = augwVar.m;
        if (aufxVar == null) {
            aufxVar = aufx.a;
        }
        aufw aufwVarB = aufw.b(aufxVar.c);
        if (aufwVarB == null) {
            aufwVarB = aufw.UNKNOWN_MESSAGE_SOURCE;
        }
        StringJoiner stringJoinerAdd2 = stringJoinerAdd.add("messageSource: " + aufwVarB.d);
        aufx aufxVar2 = augwVar.m;
        if (aufxVar2 == null) {
            aufxVar2 = aufx.a;
        }
        aufu aufuVarB = aufu.b(aufxVar2.d);
        if (aufuVarB == null) {
            aufuVarB = aufu.UNKNOWN_MESSAGE_PRIORITY;
        }
        String string = stringJoinerAdd2.add("messagePriority: " + aufuVarB.e).toString();
        caxr caxrVar = new caxr();
        caxrVar.a = string;
        caxrVar.b = "sendMessage-pwq-dedupe-tag:".concat(String.valueOf(augwVar.h));
        return caxrVar.a();
    }

    public final String j(aubq aubqVar, String str) {
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return aubpVarB.equals(aubp.GROUP) ? str : Long.toString(((aika) this.o.b()).c(aubqVar.d));
    }
}
