package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyb extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/message/delete/DeleteMessageHandler");
    public final Context b;
    public final eosc c;
    public final eosc d;
    public final fcsu e;
    public final bydb f;
    public final ains g;
    public final auuh h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final bvuq l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    private final coia q;

    public cdyb(Context context, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, bydb bydbVar, ains ainsVar, auuh auuhVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, coia coiaVar, bvuq bvuqVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.b = context;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar;
        this.f = bydbVar;
        this.g = ainsVar;
        this.h = auuhVar;
        this.i = fcsuVar3;
        this.j = fcsuVar2;
        this.k = fcsuVar4;
        this.q = coiaVar;
        this.l = bvuqVar;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
        this.o = fcsuVar7;
        this.p = fcsuVar8;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DeleteMessageHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cdyd.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cdyd cdydVar = (cdyd) evuhVar;
        final dzfh dzfhVar = cdydVar.c.size() == 1 ? ajfo.f : ajfo.g;
        Runnable runnable = new Runnable() { // from class: cdwz
            @Override // java.lang.Runnable
            public final void run() {
                ((ajfo) this.a.e.b()).d(dzfhVar);
            }
        };
        eosc eoscVar = this.c;
        return eijx.f(runnable, eoscVar).i(new eooz() { // from class: cdxa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cdyb cdybVar = this.a;
                final cdyd cdydVar2 = cdydVar;
                eooy eooyVar = new eooy() { // from class: cdxf
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final cdyd cdydVar3 = cdydVar2;
                        return eijx.g(new Callable() { // from class: cdwy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                final cdyd cdydVar4 = cdydVar3;
                                if (cdydVar4.d.size() == 0) {
                                    int i = ekgb.d;
                                    return ekoe.a;
                                }
                                brdr brdrVarD = MessagesTable.d();
                                brdrVarD.A("getCloudSyncMessageIds");
                                brdrVarD.h(new Function() { // from class: cdxd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        brec brecVar = (brec) obj2;
                                        evtg evtgVar = cdydVar4.d;
                                        int iIntValue = MessagesTable.g().intValue();
                                        if (iIntValue < 8500) {
                                            dqru.x("cloud_sync_id", iIntValue);
                                        }
                                        brecVar.ap(new dqpm("messages.cloud_sync_id", 3, brec.as(evtgVar), false));
                                        return brecVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                return brdrVarD.b().g();
                            }
                        }, cdybVar.d);
                    }
                };
                eosc eoscVar2 = cdybVar.c;
                eiju eijuVarI = eijx.h(eooyVar, eoscVar2).i(new eooz() { // from class: cdxg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cdybVar.k((ekgb) obj2);
                    }
                }, eoscVar2);
                ejvr ejvrVar = new ejvr() { // from class: cdxh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekgb ekgbVarE;
                        final ekgb ekgbVar = (ekgb) obj2;
                        if (ekgbVar.isEmpty()) {
                            return ekoe.a;
                        }
                        cdyb cdybVar2 = cdybVar;
                        ekhv ekhvVar = new ekhv();
                        ekhvVar.j(ekgbVar);
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
                        brdrVarD.f(new Function() { // from class: cdxu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((bran) obj3).R;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brdrVarD.h(new Function() { // from class: cdxv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                brecVar.t(ekgbVar);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final brdp brdpVarB = brdrVarD.b();
                        brdr brdrVarD2 = MessagesTable.d();
                        brdrVarD2.A("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
                        brdrVarD2.c(MessagesTable.c.a);
                        brdrVarD2.h(new Function() { // from class: cdxw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                brecVar.G(brdpVarB);
                                brecVar.y(ekgbVar);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekhvVar.j(brdrVarD2.b().g());
                        bqkg bqkgVarA = bqkl.a();
                        bqkgVarA.A("+DeleteMessageHandler#getMessageIdsWithReactions");
                        bqkgVarA.f(new Function() { // from class: cdxz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bqkk bqkkVar = (bqkk) obj3;
                                bqkkVar.d(ekgbVar);
                                return bqkkVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekhvVar.j(bqkgVarA.b().f());
                        if (((Boolean) cdybVar2.o.b()).booleanValue()) {
                            String[] strArr = bqfo.a;
                            bqfj bqfjVar = new bqfj(bqfo.a);
                            bqfjVar.A("+DeleteMessageHandler#getMessageIdsOfEdits");
                            bqev bqevVar = bqfo.c.a;
                            bqfjVar.c(bqevVar);
                            bqfjVar.g(new Function() { // from class: cdxj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bqfn bqfnVar = (bqfn) obj3;
                                    ekfw ekfwVar = new ekfw();
                                    Iterator it = ekgbVar.iterator();
                                    while (it.hasNext()) {
                                        ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
                                    }
                                    bqfnVar.ap(new dqpm("message_edits.latest_message_id", 3, bqfn.as(ekfwVar.g()), true));
                                    return bqfnVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bqew bqewVar = (bqew) bqfjVar.b().q(bqevVar);
                            try {
                                ekgbVarE = bqewVar.e();
                                bqewVar.close();
                            } catch (Throwable th) {
                                try {
                                    bqewVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else {
                            ekgbVarE = ekoe.a;
                        }
                        ekhvVar.j(ekgbVarE);
                        return ((baxe) cdybVar2.i.b()).L(ekhvVar.g().g());
                    }
                };
                eosc eoscVar3 = cdybVar.d;
                final eiju eijuVarH = eijuVarI.h(ejvrVar, eoscVar3);
                final eiju eijuVarH2 = eijx.h(new eooy() { // from class: cdxi
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return cdybVar.k(ekgb.n((Collection) Collection.EL.stream(cdydVar2.c).map(new barv()).collect(Collectors.toCollection(new barw()))));
                    }
                }, eoscVar2).h(new ejvr() { // from class: cdxh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekgb ekgbVarE;
                        final List ekgbVar = (ekgb) obj2;
                        if (ekgbVar.isEmpty()) {
                            return ekoe.a;
                        }
                        cdyb cdybVar2 = cdybVar;
                        ekhv ekhvVar = new ekhv();
                        ekhvVar.j(ekgbVar);
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
                        brdrVarD.f(new Function() { // from class: cdxu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((bran) obj3).R;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brdrVarD.h(new Function() { // from class: cdxv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                brecVar.t(ekgbVar);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final brdp brdpVarB = brdrVarD.b();
                        brdr brdrVarD2 = MessagesTable.d();
                        brdrVarD2.A("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
                        brdrVarD2.c(MessagesTable.c.a);
                        brdrVarD2.h(new Function() { // from class: cdxw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                brecVar.G(brdpVarB);
                                brecVar.y(ekgbVar);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekhvVar.j(brdrVarD2.b().g());
                        bqkg bqkgVarA = bqkl.a();
                        bqkgVarA.A("+DeleteMessageHandler#getMessageIdsWithReactions");
                        bqkgVarA.f(new Function() { // from class: cdxz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bqkk bqkkVar = (bqkk) obj3;
                                bqkkVar.d(ekgbVar);
                                return bqkkVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekhvVar.j(bqkgVarA.b().f());
                        if (((Boolean) cdybVar2.o.b()).booleanValue()) {
                            String[] strArr = bqfo.a;
                            bqfj bqfjVar = new bqfj(bqfo.a);
                            bqfjVar.A("+DeleteMessageHandler#getMessageIdsOfEdits");
                            bqev bqevVar = bqfo.c.a;
                            bqfjVar.c(bqevVar);
                            bqfjVar.g(new Function() { // from class: cdxj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bqfn bqfnVar = (bqfn) obj3;
                                    ekfw ekfwVar = new ekfw();
                                    Iterator it = ekgbVar.iterator();
                                    while (it.hasNext()) {
                                        ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
                                    }
                                    bqfnVar.ap(new dqpm("message_edits.latest_message_id", 3, bqfn.as(ekfwVar.g()), true));
                                    return bqfnVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bqew bqewVar = (bqew) bqfjVar.b().q(bqevVar);
                            try {
                                ekgbVarE = bqewVar.e();
                                bqewVar.close();
                            } catch (Throwable th) {
                                try {
                                    bqewVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else {
                            ekgbVarE = ekoe.a;
                        }
                        ekhvVar.j(ekgbVarE);
                        return ((baxe) cdybVar2.i.b()).L(ekhvVar.g().g());
                    }
                }, eoscVar3);
                final eiju eijuVarB = eijx.m(eijuVarH, eijuVarH2).b(new eooy() { // from class: cdxk
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ekgb ekgbVar = (ekgb) eork.q(eijuVarH2);
                        if (ekgbVar == null) {
                            throw new NullPointerException("Null nonCloudSyncMessagesToDelete");
                        }
                        ekgb ekgbVar2 = (ekgb) eork.q(eijuVarH);
                        if (ekgbVar2 != null) {
                            return eijx.e(new cdvq(ekgbVar, ekgbVar2));
                        }
                        throw new NullPointerException("Null cloudSyncMessagesToDelete");
                    }
                }, eoscVar3);
                final eiju eijuVarH3 = eijx.k(eijuVarB, eijuVarB.i(new eooz() { // from class: cdxl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final ekhx ekhxVar = (ekhx) Collection.EL.stream(((cdya) obj2).c()).filter(new Predicate() { // from class: cdxs
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
                            public final boolean test(Object obj3) {
                                return ((MessageCoreData) obj3).cB();
                            }
                        }).map(new cdxt()).collect(ekcv.b);
                        ekhxVar.getClass();
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("BugleE2eeEtouffee");
                        brdrVarD.h(new Function() { // from class: bwlx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                int iIntValue = MessagesTable.g().intValue();
                                if (iIntValue < 48030) {
                                    dqru.x("original_message_id", iIntValue);
                                }
                                Set set = ekhxVar;
                                ekfw ekfwVar = new ekfw();
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
                                }
                                brecVar.ap(new dqpm("messages.original_message_id", 3, brec.as(ekfwVar.g()), true));
                                brecVar.A(true);
                                brecVar.M(2);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brdp brdpVarB = brdrVarD.b();
                        bwlz bwlzVar = (bwlz) cdybVar.l;
                        List listA = bwlzVar.a(brdpVarB);
                        brdr brdrVarD2 = MessagesTable.d();
                        brdrVarD2.A("BugleE2eeEtouffee");
                        brdrVarD2.h(new Function() { // from class: bwlw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                brecVar.t(ekhxVar);
                                brecVar.M(2);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Set setAv = fcva.av(fcva.ah(listA, bwlzVar.a(brdrVarD2.b())));
                        if (setAv.isEmpty()) {
                            eiju eijuVarE = eijx.e(false);
                            eijuVarE.getClass();
                            return eijuVarE;
                        }
                        cqbd cqbdVarC = bwlz.a.c();
                        cqbdVarC.I("Deleting etouffee data for messages.");
                        cqbdVarC.y("size", setAv.size());
                        cqbdVarC.r();
                        return auvw.c(bwlzVar.c, fcyi.a, fdjz.a, new bwly(bwlzVar, setAv, null));
                    }
                }, eoscVar3)).a(new Callable() { // from class: cdxm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (cdya) eork.q(eijuVarB);
                    }
                }, eoscVar2).h(new ejvr() { // from class: cdxn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Integer numValueOf;
                        cdya cdyaVar = (cdya) obj2;
                        ejxr ejxrVar = crvx.a;
                        boolean zBooleanValue = ((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue();
                        cdyb cdybVar2 = cdybVar;
                        cdyt cdytVar = null;
                        Runnable runnableA = zBooleanValue ? ((crwg) cdybVar2.p.b()).a(cdyaVar.c()) : null;
                        ekgb ekgbVarC = cdyaVar.c();
                        if (ekgbVarC.isEmpty()) {
                            cdyb.E.r("No messages retrieved to delete");
                            numValueOf = 0;
                        } else {
                            cdybVar2.f.k(ekgbVarC);
                            numValueOf = Integer.valueOf(((cdww) cdybVar2.j.b()).b((ekgb) Collection.EL.stream(ekgbVarC).map(new cdxt()).collect(ekcv.a), ((MessageCoreData) ekgbVarC.get(0)).A()));
                        }
                        fcsu fcsuVar = cdybVar2.n;
                        numValueOf.intValue();
                        if (((appk) fcsuVar.b()).a()) {
                            switch (cdydVar2.e) {
                                case 0:
                                    cdytVar = cdyt.UNSPECIFIED_DELETION;
                                    break;
                                case 1:
                                    cdytVar = cdyt.TOOLSTONE_DELETION;
                                    break;
                                case 2:
                                    cdytVar = cdyt.MESSAGE_NOT_DELIVERED_WEAR_DELETION;
                                    break;
                                case 3:
                                    cdytVar = cdyt.MESSAGE_NOT_DELIVERED_PHONE_DELETION;
                                    break;
                                case 4:
                                    cdytVar = cdyt.RICH_CARD_DELETION;
                                    break;
                                case 5:
                                    cdytVar = cdyt.EXTERNAL_API_DELETION;
                                    break;
                                case 6:
                                    cdytVar = cdyt.MESSAGE_LIST_MANUAL_DELETION;
                                    break;
                                case 7:
                                    cdytVar = cdyt.MESSAGE_LIST_CONVO_V2_MANUAL_DELETION;
                                    break;
                                case 8:
                                    cdytVar = cdyt.METATEXT_MESSAGE_MANUAL_DELETION;
                                    break;
                                case 9:
                                    cdytVar = cdyt.EMERGENCY_MESSAGE_MANUAL_DELETION;
                                    break;
                                case 10:
                                    cdytVar = cdyt.OTP_DELETION;
                                    break;
                                case 11:
                                    cdytVar = cdyt.OBJECT_EVENT_TACHYON_DELETION;
                                    break;
                                case 12:
                                    cdytVar = cdyt.DUPLICATE_MESSAGE_RESTORE_DELETION;
                                    break;
                                case 13:
                                    cdytVar = cdyt.DITTO_DELETION;
                                    break;
                                case 14:
                                    cdytVar = cdyt.ATT_CLOUD_SYNC_DELETION;
                                    break;
                                case 15:
                                    cdytVar = cdyt.SET_PROTOCOL_CHANGE_TOMBSTONE_DELETION;
                                    break;
                                case 16:
                                    cdytVar = cdyt.AFTER_MESSAGE_MOVE_TOMBSTONE_DELETION;
                                    break;
                                case 17:
                                    cdytVar = cdyt.PREVIOUS_TOMBSTONE_DELETION;
                                    break;
                                case 18:
                                    cdytVar = cdyt.UPDATE_CONVERSATION_CREATION_TOMBSTONE_DELETION;
                                    break;
                                case 19:
                                    cdytVar = cdyt.INSERT_OR_UPDATE_AT_BOTTOM_TOMBSTONE_DELETION;
                                    break;
                            }
                            if (cdytVar == null) {
                                cdytVar = cdyt.UNRECOGNIZED;
                            }
                            bmsp bmspVarA = new tob().apply(cdytVar);
                            ekgb ekgbVarC2 = cdyaVar.c();
                            int i = ((ekoe) ekgbVarC2).c;
                            for (int i2 = 0; i2 < i; i2++) {
                                ((bypl) cdybVar2.m.b()).a(((MessageCoreData) ekgbVarC2.get(i2)).C().b(), bmspVarA);
                            }
                        }
                        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() && runnableA != null) {
                            runnableA.run();
                        }
                        return numValueOf;
                    }
                }, eoscVar3);
                return eijx.m(eijuVarH3, eijuVarB).b(new eooy() { // from class: cdxo
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final cdya cdyaVar = (cdya) eork.q(eijuVarB);
                        final int iIntValue = ((Integer) eork.q(eijuVarH3)).intValue();
                        final cdyb cdybVar2 = cdybVar;
                        return eijx.g(new Callable() { // from class: cdxy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cdyb cdybVar3;
                                int i;
                                caud caudVar = (caud) caue.a.createBuilder();
                                cdyi cdyiVar = (cdyi) cdyj.a.createBuilder();
                                casu casuVar = (casu) casv.a.createBuilder();
                                cdya cdyaVar2 = cdyaVar;
                                ekgb ekgbVarC = cdyaVar2.c();
                                int i2 = ((ekoe) ekgbVarC).c;
                                int i3 = 0;
                                while (true) {
                                    cdybVar3 = cdybVar2;
                                    if (i3 >= i2) {
                                        break;
                                    }
                                    MessageCoreData messageCoreData = (MessageCoreData) ekgbVarC.get(i3);
                                    MessageIdType messageIdTypeC = messageCoreData.C();
                                    cqbd cqbdVarC = cdyb.E.c();
                                    cqbdVarC.I("Deleted local");
                                    cqbdVarC.d(messageIdTypeC);
                                    cqbdVarC.r();
                                    if (messageCoreData.cY() && !messageCoreData.de()) {
                                        cdybVar3.g.c("Bugle.Rcs.Files.Transfer.Outgoing.Cancelled.Counts");
                                    }
                                    Uri uriU = messageCoreData.u();
                                    if (uriU != null) {
                                        caudVar.a(uriU.toString());
                                    }
                                    Iterator it = messageCoreData.M().iterator();
                                    while (true) {
                                        i = i3 + 1;
                                        if (it.hasNext()) {
                                            Uri uriT = ((MessagePartCoreData) it.next()).t();
                                            if (uriT != null) {
                                                if (cdyf.a(uriT)) {
                                                    cdyiVar.a(uriT.toString());
                                                } else {
                                                    String string = uriT.toString();
                                                    caudVar.copyOnWrite();
                                                    caue caueVar = (caue) caudVar.instance;
                                                    string.getClass();
                                                    evtg evtgVar = caueVar.b;
                                                    if (!evtgVar.c()) {
                                                        caueVar.b = evsn.mutableCopy(evtgVar);
                                                    }
                                                    caueVar.b.add(string);
                                                }
                                            }
                                        }
                                    }
                                    i3 = i;
                                }
                                cdybVar3.h.b(cdybVar3.b, (String[]) Collection.EL.stream(cdyaVar2.b()).map(new Function() { // from class: cdxp
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((MessageCoreData) obj2).aj();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).filter(new Predicate() { // from class: cdxq
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
                                        return !ejwk.c((String) obj2);
                                    }
                                }).toArray(new IntFunction() { // from class: cdxr
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i4) {
                                        return new String[i4];
                                    }
                                }));
                                ekfw ekfwVar = new ekfw();
                                if (!cdyaVar2.a().isEmpty()) {
                                    ekfwVar.h(cggc.b());
                                    ekfwVar.h(cggg.c());
                                }
                                if (((caue) caudVar.instance).c.size() > 0 || ((caue) caudVar.instance).b.size() > 0) {
                                    ekfwVar.h(cbcu.f("delete_message_from_telephony", (caue) caudVar.build()));
                                }
                                if (((cdyj) cdyiVar.instance).b.size() > 0) {
                                    ekfwVar.h(cbcu.f("delete_part_cms_attachment", (cdyj) cdyiVar.build()));
                                }
                                if (((casv) casuVar.instance).b.size() > 0) {
                                    ekfwVar.h(cbcu.f("cancel_rcs_file_transfer", (casv) casuVar.build()));
                                }
                                ekrw ekrwVarH = cdyb.a.h();
                                ekrwVarH.X(eksq.a, "BugleNotifications");
                                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/message/delete/DeleteMessageHandler", "getPostProcessingWorkQueueRequests", 415, "DeleteMessageHandler.java")).q("Creating notification from DeleteMessageHandler");
                                ((cgpi) cdybVar3.k.b()).d();
                                return ekfwVar.g();
                            }
                        }, cdybVar2.d).i(new eooz() { // from class: cdxe
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                ekgb ekgbVar = (ekgb) obj2;
                                cbcv cbcvVarH = cbcw.h();
                                cbcvVarH.b(true);
                                cbcvVarH.c(false);
                                Bundle bundle = new Bundle();
                                bundle.putInt("delete_count", iIntValue);
                                caxp caxpVar = (caxp) cbcvVarH;
                                caxpVar.c = bundle;
                                if (!ekgbVar.isEmpty()) {
                                    caxpVar.a = ekgbVar;
                                }
                                return eijx.e(cbcvVarH.a());
                            }
                        }, cdybVar2.c);
                    }
                }, eoscVar2);
            }
        }, eoscVar).h(new ejvr() { // from class: cdxb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                ((ajfo) this.a.e.b()).e(dzfhVar);
                return cbcwVar;
            }
        }, eoscVar).f(Exception.class, new eooz() { // from class: cdxc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ((ajfo) this.a.e.b()).e(dzfhVar);
                return eijx.d((Exception) obj);
            }
        }, eoscVar);
    }

    public final eiju k(final ekgb ekgbVar) {
        eiju eijuVarI;
        final coia coiaVar = this.q;
        if (coiaVar.e.a()) {
            eooy eooyVar = new eooy() { // from class: cohn
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    coia coiaVar2 = coiaVar;
                    baxe baxeVar = (baxe) coiaVar2.c.c.b();
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("FileTransferDatabaseOperations#retrieveOngoingFileTransferMessages");
                    final Iterable iterable = ekgbVar;
                    brdrVarD.h(new Function() { // from class: cojn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            eksp ekspVar = cokd.a;
                            brecVar.t(iterable);
                            brecVar.J(3);
                            brecVar.ah(avbn.g);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return eijx.i(coiaVar2.c(baxeVar.K(brdrVarD.b())));
                }
            };
            eosc eoscVar = coiaVar.b;
            eijuVarI = eijx.h(eooyVar, eoscVar).h(new cohl(coiaVar), eoscVar);
        } else {
            Callable callable = new Callable() { // from class: coho
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    for (MessageIdType messageIdType : ekgbVar) {
                        coia coiaVar2 = coiaVar;
                        cokf cokfVarA = coiaVar2.c.a(messageIdType);
                        if (cokfVarA.c()) {
                            ekfwVar.h(cokfVarA);
                        } else {
                            ekrw ekrwVarN = coia.a.n();
                            ekrwVarN.X(cqnc.b, messageIdType);
                            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfersByMessageIds", 130, "CancelFileTransferHelper.java")).q("Trying to cancel a file transfer for a message that does not have a valid file transfer.");
                        }
                    }
                    return ekfwVar.g();
                }
            };
            eosc eoscVar2 = coiaVar.b;
            eijuVarI = eijx.g(callable, eoscVar2).i(new eooz() { // from class: cohp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return coiaVar.b((ekgb) obj);
                }
            }, eoscVar2);
        }
        return eijuVarI.h(new ejvr() { // from class: cdxx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarA = cdyb.E.a();
                cqbdVarA.I(String.format("Message ID of file transfers cancelled due to message deletion: %s", (ekgb) obj));
                cqbdVarA.r();
                return ekgbVar;
            }
        }, this.c);
    }
}
