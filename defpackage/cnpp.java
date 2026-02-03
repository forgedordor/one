package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpp {
    static final ejxr a = cdag.v("log_rcs_message_id_with_duplicate_rcs_message_id_event");
    public final fcsu b;

    public cnpp(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    public static enpb a(MessageCoreData messageCoreData, MessageCoreData messageCoreData2) {
        Duration durationOfMillis = Duration.ofMillis(messageCoreData2.o() - messageCoreData.o());
        enpb enpbVar = (enpb) enpf.a.createBuilder();
        evrj evrjVarA = evwz.a(durationOfMillis);
        enpbVar.copyOnWrite();
        enpf enpfVar = (enpf) enpbVar.instance;
        evrjVarA.getClass();
        enpfVar.c = evrjVarA;
        enpfVar.b |= 1;
        enpd enpdVar = enpd.a;
        enpc enpcVar = (enpc) enpdVar.createBuilder();
        int iK = messageCoreData.k();
        enpcVar.copyOnWrite();
        enpd enpdVar2 = (enpd) enpcVar.instance;
        enpdVar2.b |= 1;
        enpdVar2.c = iK;
        int iA = toa.a(messageCoreData.X());
        enpcVar.copyOnWrite();
        enpd enpdVar3 = (enpd) enpcVar.instance;
        enpdVar3.d = iA - 1;
        enpdVar3.b |= 2;
        enpbVar.copyOnWrite();
        enpf enpfVar2 = (enpf) enpbVar.instance;
        enpd enpdVar4 = (enpd) enpcVar.build();
        enpdVar4.getClass();
        enpfVar2.d = enpdVar4;
        enpfVar2.b |= 2;
        enpc enpcVar2 = (enpc) enpdVar.createBuilder();
        int iK2 = messageCoreData2.k();
        enpcVar2.copyOnWrite();
        enpd enpdVar5 = (enpd) enpcVar2.instance;
        enpdVar5.b |= 1;
        enpdVar5.c = iK2;
        int iA2 = toa.a(messageCoreData2.X());
        enpcVar2.copyOnWrite();
        enpd enpdVar6 = (enpd) enpcVar2.instance;
        enpdVar6.d = iA2 - 1;
        enpdVar6.b |= 2;
        enpbVar.copyOnWrite();
        enpf enpfVar3 = (enpf) enpbVar.instance;
        enpd enpdVar7 = (enpd) enpcVar2.build();
        enpdVar7.getClass();
        enpfVar3.e = enpdVar7;
        enpfVar3.b |= 4;
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            evqs evqsVarA = evqs.A(messageCoreData.F().f());
            enpbVar.copyOnWrite();
            enpf enpfVar4 = (enpf) enpbVar.instance;
            enpfVar4.b |= 8;
            enpfVar4.f = evqsVarA;
        }
        return enpbVar;
    }
}
