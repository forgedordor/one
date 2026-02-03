package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajpv implements ajpu {
    public static final eksp a = eksp.c("BugleDataModel");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public ajpv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    private final Action g(int i, MessageCoreData messageCoreData, long j) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.r, messageCoreData.A().toString());
        ekslVar.X(cqnc.a, messageCoreData.C().b());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "prepareToSendScheduledMessage", 221, "MessageControllerImpl.java")).q("Send Scheduled Message");
        return ((aypg) this.b.b()).a(messageCoreData, false, elny.SCHEDULED_SEND, null, i, Optional.empty(), j, false);
    }

    @Override // defpackage.ajpu
    public final eiju a(List list) {
        return ((cdys) this.d.b()).c(list);
    }

    @Override // defpackage.ajpu
    public final eiju b(List list, cdyt cdytVar) {
        cdys cdysVar = (cdys) this.d.b();
        if (!cdysVar.c.a()) {
            return cdysVar.c(list);
        }
        cdye cdyeVar = cdysVar.a;
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.a((Iterable) Collection.EL.stream(list).map(new cdyl()).collect(Collectors.toCollection(new cdym())));
        cdycVar.copyOnWrite();
        cdyd cdydVar = (cdyd) cdycVar.instance;
        cdydVar.e = cdytVar.a();
        cdydVar.b |= 1;
        eiju eijuVarA = cdyeVar.a((cdyd) cdycVar.build());
        cdyp cdypVar = new cdyp();
        eosd eosdVar = cdysVar.b;
        return eijuVarA.i(cdypVar, eosdVar).h(new cdyq(), eosdVar);
    }

    @Override // defpackage.ajpu
    public final eiju c(int i, MessageCoreData messageCoreData, long j) {
        return eiju.g(g(i, messageCoreData, j).s());
    }

    @Override // defpackage.ajpu
    public final eiju d(int i, MessageCoreData messageCoreData, long j, cldb cldbVar) {
        return eiju.g(g(i, messageCoreData, j).q(cldbVar));
    }

    @Override // defpackage.ajpu
    public final void e(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.a, messageIdType.b());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "resendMessageAsync", 246, "MessageControllerImpl.java")).q("Resend Message");
        ((aypm) this.c.b()).b(messageIdType, messageUsageStatisticsData);
    }

    @Override // defpackage.ajpu
    public final void f(aoer aoerVar, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        Optional optionalOf = Optional.of(Integer.valueOf(aoerVar.b()));
        ((MessageData) messageCoreData).k = messageUsageStatisticsData;
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.r, messageCoreData.A().toString());
        ekslVar.X(cqnc.a, messageCoreData.C() == null ? "" : messageCoreData.C().b());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "prepareToSendMessage", 169, "MessageControllerImpl.java")).q("Send Message");
        (optionalOf.isEmpty() ? ((aypg) this.b.b()).a(messageCoreData, false, ((MessageUsageStatisticsDataImpl) messageUsageStatisticsData).a, null, -1, Optional.of(Integer.valueOf(((crny) this.e.b()).c())), j, false) : ((aypg) this.b.b()).a(messageCoreData, false, ((MessageUsageStatisticsDataImpl) messageUsageStatisticsData).a, null, ((Integer) optionalOf.get()).intValue(), Optional.empty(), j, false)).s();
    }
}
