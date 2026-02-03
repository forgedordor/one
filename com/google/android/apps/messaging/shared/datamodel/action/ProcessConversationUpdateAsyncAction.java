package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.aqca;
import defpackage.aqcb;
import defpackage.aqcd;
import defpackage.axuj;
import defpackage.ayps;
import defpackage.bvfk;
import defpackage.bvkr;
import defpackage.bvpy;
import defpackage.cexq;
import defpackage.cezf;
import defpackage.cfeh;
import defpackage.cqce;
import defpackage.dzfh;
import defpackage.dzub;
import defpackage.dzuc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekrd;
import defpackage.elgm;
import defpackage.eooy;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.eoss;
import defpackage.ezjn;
import defpackage.ezol;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessConversationUpdateAsyncAction extends Action<ezjn> {
    private final fcsu A;
    private final fcsu B;
    private final Executor C;
    public final bvkr c;
    public final ains d;
    public final eosc e;
    public final eosc f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final cexq j;
    public final cezf k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final cfeh p;
    private final eosc q;
    private final fcsu r;
    private final fcsu s;
    public static final cqce a = cqce.g("BugleNetwork", "ProcessConversationUpdateAsyncAction");
    public static final dzfh b = new dzfh("ProcessConversationUpdateAsyncActionTimer");
    public static final Parcelable.Creator<Action<ezjn>> CREATOR = new axuj();

    /* compiled from: PG */
    public interface a {
        ayps bd();
    }

    public ProcessConversationUpdateAsyncAction(bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cfeh cfehVar, cexq cexqVar, fcsu fcsuVar5, cezf cezfVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, Parcel parcel, fcsu fcsuVar12) {
        super(parcel, elgm.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.c = bvkrVar;
        this.d = ainsVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.q = eoscVar3;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.p = cfehVar;
        this.j = cexqVar;
        this.l = fcsuVar5;
        this.k = cezfVar;
        this.m = fcsuVar6;
        this.s = fcsuVar9;
        this.A = fcsuVar10;
        this.B = fcsuVar11;
        this.r = fcsuVar7;
        this.n = fcsuVar8;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.C = (Executor) fcsuVar.b();
        } else {
            this.C = new eoss(eoscVar3);
        }
        this.o = fcsuVar12;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessConversationUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessConversationUpdate.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        if ((((aqcb) this.s.b()).a() || ((aqca) this.A.b()).a()) && ((bvpy) this.B.b()).b()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/shared/datamodel/action/ProcessConversationUpdateAsyncAction", "executeActionInternal", 388, "ProcessConversationUpdateAsyncAction.java")).q("Ditto Push Updates Rate limit exceeded, Ignoring Conversation Update");
            if (((aqca) this.A.b()).a()) {
                return eijx.e(null);
            }
        }
        Boolean bool = (Boolean) bvfk.a.e();
        if (bool.booleanValue()) {
            this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 15);
        }
        final dzub dzubVarD = ((dzuc) this.n.b()).d();
        eiju eijuVarE = eijx.h(new eooy() { // from class: axtx
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction = this.a;
                final ekgb ekgbVarL = processConversationUpdateAsyncAction.c.l();
                if (ekgbVarL.isEmpty()) {
                    return eijx.e(null);
                }
                eiju eijuVarB = processConversationUpdateAsyncAction.j.b(barn.b(processConversationUpdateAsyncAction.v.l("conversation_id_key")));
                eooz eoozVar = new eooz() { // from class: axui
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction2 = processConversationUpdateAsyncAction;
                        aymo aymoVar = processConversationUpdateAsyncAction2.v;
                        final ekgb ekgbVar = (ekgb) obj;
                        ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id_key"));
                        final eowt eowtVar = (eowt) eowu.a.createBuilder();
                        if (!conversationIdTypeB.b()) {
                            bajf bajfVarA = ((axgh) processConversationUpdateAsyncAction2.l.b()).a(conversationIdTypeB);
                            if (bajfVarA != null) {
                                return ((cehg) processConversationUpdateAsyncAction2.h.b()).f(bajfVarA, ekgbVar).h(new ejvr() { // from class: axuh
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        cqce cqceVar = ProcessConversationUpdateAsyncAction.a;
                                        eowt eowtVar2 = eowtVar;
                                        eowtVar2.b((eowm) obj2);
                                        return (eowu) eowtVar2.build();
                                    }
                                }, processConversationUpdateAsyncAction2.e);
                            }
                            eowtVar.b(((cehg) processConversationUpdateAsyncAction2.h.b()).l(conversationIdTypeB));
                            return eijx.e((eowu) eowtVar.build());
                        }
                        List listB = ((bapl) processConversationUpdateAsyncAction2.g.b()).b(aymoVar.e("conversation_timestamp_key", Long.MAX_VALUE));
                        cqbd cqbdVarC = ProcessConversationUpdateAsyncAction.a.c();
                        cqbdVarC.L("conversationsToUpdate", listB);
                        cqbdVarC.I("conversations need retrying.");
                        cqbdVarC.r();
                        Stream map = Collection.EL.stream(listB).map(new Function() { // from class: axuf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((cehg) processConversationUpdateAsyncAction2.h.b()).f((bajf) obj2, ekgbVar);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = ekgb.d;
                        return eijx.a((ekgb) map.collect(ekcv.a)).h(new ejvr() { // from class: axug
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cqce cqceVar = ProcessConversationUpdateAsyncAction.a;
                                eowt eowtVar2 = eowtVar;
                                eowtVar2.a((List) obj2);
                                return (eowu) eowtVar2.build();
                            }
                        }, processConversationUpdateAsyncAction2.e);
                    }
                };
                eosc eoscVar = processConversationUpdateAsyncAction.f;
                return eijuVarB.i(eoozVar, eoscVar).i(new eooz() { // from class: axty
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eowu eowuVar = (eowu) obj;
                        return ((Boolean) ((cczi) bvfd.o.get()).e()).booleanValue() ? processConversationUpdateAsyncAction.k.a(eowuVar) : eijx.e(eowuVar);
                    }
                }, processConversationUpdateAsyncAction.e).i(new eooz() { // from class: axtz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ekgb ekgbVarN;
                        eowu eowuVar = (eowu) obj;
                        ArrayList arrayList = new ArrayList();
                        if (eowuVar.b.size() <= 1) {
                            arrayList.add(eowuVar);
                            ekgbVarN = ekgb.n(arrayList);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            for (eowm eowmVar : eowuVar.b) {
                                if (eowmVar.h) {
                                    arrayList2.add(eowmVar);
                                } else {
                                    arrayList3.add(eowmVar);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                eowt eowtVar = (eowt) eowu.a.createBuilder();
                                eowtVar.a(arrayList2);
                                arrayList.add((eowu) eowtVar.build());
                            }
                            if (!arrayList3.isEmpty()) {
                                eowt eowtVar2 = (eowt) eowu.a.createBuilder();
                                eowtVar2.a(arrayList3);
                                arrayList.add((eowu) eowtVar2.build());
                            }
                            ekgbVarN = ekgb.n(arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int size = ekgbVarN.size();
                        for (int i = 0; i < size; i++) {
                            List list = ekgbVarL;
                            final ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction2 = processConversationUpdateAsyncAction;
                            final eowu eowuVar2 = (eowu) ekgbVarN.get(i);
                            arrayList4.add(bvkr.D(list, new Function() { // from class: axud
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    cfef cfefVarC;
                                    bvix bvixVar = (bvix) obj2;
                                    ezol ezolVarD = bvixVar.d();
                                    String strE = bvixVar.e();
                                    ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction3 = processConversationUpdateAsyncAction2;
                                    boolean zA = ((cdio) processConversationUpdateAsyncAction3.m.b()).a();
                                    eowu eowuVar3 = eowuVar2;
                                    if (zA) {
                                        cfefVarC = processConversationUpdateAsyncAction3.p.a(bvixVar.c(), epby.GET_UPDATES);
                                        cfefVarC.c = strE;
                                        eozc eozcVar = (eozc) eoze.a.createBuilder();
                                        eozcVar.copyOnWrite();
                                        eoze eozeVar = (eoze) eozcVar.instance;
                                        eowuVar3.getClass();
                                        eozeVar.c = eowuVar3;
                                        eozeVar.b = 2;
                                        cfefVarC.b(eozcVar.build());
                                    } else {
                                        cfefVarC = processConversationUpdateAsyncAction3.p.c(ezolVarD, Optional.empty(), epby.GET_UPDATES);
                                        cfefVarC.c = strE;
                                        eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                                        eozcVar2.copyOnWrite();
                                        eoze eozeVar2 = (eoze) eozcVar2.instance;
                                        eowuVar3.getClass();
                                        eozeVar2.c = eowuVar3;
                                        eozeVar2.b = 2;
                                        cfefVarC.b(eozcVar2.build());
                                    }
                                    if (processConversationUpdateAsyncAction3.v.z("send_push_key", false)) {
                                        cfefVarC.i = ezjh.USER;
                                        Iterator<E> it = eowuVar3.b.iterator();
                                        if (it.hasNext() && ((eowm) it.next()).h) {
                                            cfefVarC.i = ezjh.STATUS;
                                        }
                                    }
                                    cfeg cfegVarA = cfefVarC.a();
                                    fcsu fcsuVar = processConversationUpdateAsyncAction3.i;
                                    if (((Optional) fcsuVar.b()).isEmpty()) {
                                        return eijx.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                                    }
                                    eiju eijuVarA = ((cfya) ((Optional) fcsuVar.b()).get()).a(cfegVarA);
                                    cfegVarA.q(eijuVarA);
                                    return eijuVarA;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                        }
                        return eijx.a(arrayList4).h(new ejvr() { // from class: axue
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cqce cqceVar = ProcessConversationUpdateAsyncAction.a;
                                return null;
                            }
                        }, eoqg.a);
                    }
                }, eoscVar);
            }
        }, ((aqcd) this.r.b()).a() ? this.C : this.q).e(Throwable.class, new ejvr() { // from class: axua
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dzuc dzucVar = (dzuc) this.a.n.b();
                dzub dzubVar = dzubVarD;
                dzubVar.getClass();
                dzucVar.f(dzubVar, ProcessConversationUpdateAsyncAction.b, null, dzua.ERROR);
                ProcessConversationUpdateAsyncAction.a.s("Action failed.", (Throwable) obj);
                return null;
            }
        }, eoqg.a);
        ejvr ejvrVar = new ejvr() { // from class: axub
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezjn ezjnVar = (ezjn) obj;
                dzuc dzucVar = (dzuc) this.a.n.b();
                dzub dzubVar = dzubVarD;
                dzubVar.getClass();
                dzucVar.f(dzubVar, ProcessConversationUpdateAsyncAction.b, null, dzua.SUCCESS);
                return ezjnVar;
            }
        };
        eosc eoscVar = this.e;
        eiju eijuVarH = eijuVarE.h(ejvrVar, eoscVar);
        if (bool.booleanValue()) {
            eijuVarH.h(new ejvr() { // from class: axuc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ezjn ezjnVar = (ezjn) obj;
                    this.a.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 16);
                    return ezjnVar;
                }
            }, eoscVar);
        }
        return eijx.e(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessConversationUpdateAsyncAction(bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cfeh cfehVar, cexq cexqVar, fcsu fcsuVar5, cezf cezfVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, ezol ezolVar, String str, long j) {
        super(elgm.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.c = bvkrVar;
        this.d = ainsVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.q = eoscVar3;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.p = cfehVar;
        this.j = cexqVar;
        this.k = cezfVar;
        this.m = fcsuVar6;
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.l = fcsuVar5;
        this.v.s("conversation_timestamp_key", j);
        this.s = fcsuVar10;
        this.A = fcsuVar11;
        this.B = fcsuVar12;
        this.r = fcsuVar7;
        this.n = fcsuVar8;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.C = (Executor) fcsuVar.b();
        } else {
            this.C = new eoss(eoscVar3);
        }
        this.o = fcsuVar9;
    }

    public ProcessConversationUpdateAsyncAction(bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cfeh cfehVar, cexq cexqVar, fcsu fcsuVar5, cezf cezfVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, ezol ezolVar, String str, ConversationIdType conversationIdType, boolean z) {
        super(elgm.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.c = bvkrVar;
        this.d = ainsVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.q = eoscVar3;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.p = cfehVar;
        this.j = cexqVar;
        this.l = fcsuVar5;
        this.k = cezfVar;
        this.m = fcsuVar6;
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.v("conversation_id_key", conversationIdType.a());
        this.v.p("send_push_key", z);
        this.s = fcsuVar10;
        this.A = fcsuVar11;
        this.B = fcsuVar12;
        this.r = fcsuVar7;
        this.n = fcsuVar8;
        if (((aqcd) fcsuVar7.b()).a()) {
            this.C = (Executor) fcsuVar.b();
        } else {
            this.C = new eoss(eoscVar3);
        }
        this.o = fcsuVar9;
    }
}
