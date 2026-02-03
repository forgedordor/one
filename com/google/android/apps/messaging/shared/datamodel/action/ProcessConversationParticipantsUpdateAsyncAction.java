package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationParticipantsUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.axtv;
import defpackage.axtw;
import defpackage.aymo;
import defpackage.bapl;
import defpackage.barn;
import defpackage.bvfk;
import defpackage.bvix;
import defpackage.bvkr;
import defpackage.ceos;
import defpackage.cexq;
import defpackage.cfeh;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijw;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekgb;
import defpackage.ekph;
import defpackage.ekqh;
import defpackage.elgm;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eora;
import defpackage.eosc;
import defpackage.ezjn;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class ProcessConversationParticipantsUpdateAsyncAction extends Action<List<ezjn>> {
    public final fcsu b;
    public final ains c;
    public final fcsu d;
    public final cfeh e;
    private final eora f;
    private final fcsu g;
    private final bvkr h;
    private final eosc i;
    private final eosc j;
    private final cexq k;
    public static final cqce a = cqce.g("BugleAction", "ProcessConversationParticipantsUpdateAsyncAction");
    public static final Parcelable.Creator<Action<List<ezjn>>> CREATOR = new axtv();

    /* compiled from: PG */
    public interface a {
        axtw hS();
    }

    public ProcessConversationParticipantsUpdateAsyncAction(Parcel parcel, fcsu fcsuVar, fcsu fcsuVar2, ceos ceosVar, cfeh cfehVar, bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, cexq cexqVar, fcsu fcsuVar3) {
        super(parcel, elgm.PROCESS_CONVERSATION_PARTICIPANTS_UPDATE_ACTION);
        this.g = fcsuVar;
        this.b = fcsuVar2;
        this.f = ceosVar;
        this.e = cfehVar;
        this.h = bvkrVar;
        this.c = ainsVar;
        this.i = eoscVar;
        this.j = eoscVar2;
        this.k = cexqVar;
        this.d = fcsuVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessConversationParticipantsUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessConversationParticipantUpdate.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        eiju eijuVarA;
        Boolean bool = (Boolean) bvfk.a.e();
        if (bool.booleanValue()) {
            this.c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 17);
        }
        ekgb ekgbVarL = this.h.l();
        if (ekgbVarL.isEmpty()) {
            eijuVarA = eijx.e(Collections.EMPTY_LIST);
        } else {
            aymo aymoVar = this.v;
            Set<BugleConversationId> ekphVar = aymoVar.x("conversation_id_key") ? new ekph(new BugleConversationId(barn.b(aymoVar.l("conversation_id_key")))) : (Set) Collection.EL.stream(((bapl) this.g.b()).b(aymoVar.e("conversation_timestamp_key", Long.MAX_VALUE))).map(new Function() { // from class: axtq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bajf) obj).J();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: axtr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new BugleConversationId((ConversationIdType) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: axts
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new css();
                }
            }));
            eieu eieuVarK = eiiy.k("ProcessConversationParticipantsUpdateAsyncAction::workOnAllActiveDesktops_dsdrGroupsFlag");
            try {
                ArrayList arrayList = new ArrayList();
                for (final BugleConversationId bugleConversationId : ekphVar) {
                    cexq cexqVar = this.k;
                    final eiju eijuVarC = cexqVar.c(bugleConversationId);
                    final eiju eijuVarA2 = cexqVar.a(bugleConversationId);
                    eijw eijwVarM = eijx.m(eijuVarC, eijuVarA2);
                    Callable callable = new Callable() { // from class: axtt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cqce cqceVar = ProcessConversationParticipantsUpdateAsyncAction.a;
                            eozc eozcVar = (eozc) eoze.a.createBuilder();
                            eowo eowoVar = (eowo) eowp.a.createBuilder();
                            String strA = bugleConversationId.a.a();
                            eowoVar.copyOnWrite();
                            eowp eowpVar = (eowp) eowoVar.instance;
                            strA.getClass();
                            eowpVar.b = strA;
                            eowoVar.a((Iterable) eork.q(eijuVarC));
                            eowoVar.a((Iterable) eork.q(eijuVarA2));
                            eozcVar.copyOnWrite();
                            eoze eozeVar = (eoze) eozcVar.instance;
                            eowp eowpVar2 = (eowp) eowoVar.build();
                            eowpVar2.getClass();
                            eozeVar.c = eowpVar2;
                            eozeVar.b = 8;
                            return (eoze) eozcVar.build();
                        }
                    };
                    eosc eoscVar = this.j;
                    eiju eijuVarA3 = eijwVarM.a(callable, eoscVar);
                    ekqh it = ekgbVarL.iterator();
                    while (it.hasNext()) {
                        final bvix bvixVar = (bvix) it.next();
                        final String strE = bvixVar.e();
                        if (TextUtils.isEmpty(strE)) {
                            a.r("Skip desktop due to empty request id");
                        } else {
                            arrayList.add(eijuVarA3.i(new eooz() { // from class: axtu
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    cfeg cfegVarA;
                                    bvix bvixVar2 = bvixVar;
                                    eoze eozeVar = (eoze) obj;
                                    ezol ezolVarD = bvixVar2.d();
                                    ProcessConversationParticipantsUpdateAsyncAction processConversationParticipantsUpdateAsyncAction = this.a;
                                    boolean zA = ((cdio) processConversationParticipantsUpdateAsyncAction.d.b()).a();
                                    String str = strE;
                                    if (zA) {
                                        cfef cfefVarA = processConversationParticipantsUpdateAsyncAction.e.a(bvixVar2.c(), epby.GET_UPDATES);
                                        cfefVarA.c = str;
                                        cfefVarA.b(eozeVar);
                                        cfegVarA = cfefVarA.a();
                                    } else {
                                        cfef cfefVarC = processConversationParticipantsUpdateAsyncAction.e.c(ezolVarD, Optional.empty(), epby.GET_UPDATES);
                                        cfefVarC.c = str;
                                        cfefVarC.b(eozeVar);
                                        cfegVarA = cfefVarC.a();
                                    }
                                    fcsu fcsuVar = processConversationParticipantsUpdateAsyncAction.b;
                                    if (((Optional) fcsuVar.b()).isEmpty()) {
                                        return eijx.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                                    }
                                    eiju eijuVarA4 = ((cfya) ((Optional) fcsuVar.b()).get()).a(cfegVarA);
                                    cfegVarA.q(eijuVarA4);
                                    return eijuVarA4;
                                }
                            }, eoscVar));
                        }
                    }
                }
                eijuVarA = eijx.a(arrayList);
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ejvr ejvrVar = new ejvr() { // from class: axto
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ProcessConversationParticipantsUpdateAsyncAction.a.s("Action failed.", (Throwable) obj);
                int i = ekgb.d;
                return ekoe.a;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarE = eijuVarA.e(Throwable.class, ejvrVar, eoqgVar);
        if (bool.booleanValue()) {
            eijuVarE = eijuVarE.h(new ejvr() { // from class: axtp
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    this.a.c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 18);
                    return list;
                }
            }, this.i);
        }
        eijuVarE.k(this.f, eoqgVar);
        return eijuVarE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
