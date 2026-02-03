package defpackage;

import com.google.communication.synapse.security.scytale.EventPublisher;
import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwkq extends EventPublisher {
    public final fcsu a;
    public final Optional b;
    private final Executor c;

    public bwkq(fcsu fcsuVar, Optional optional, Executor executor) {
        this.a = fcsuVar;
        this.b = optional;
        this.c = executor;
    }

    @Override // com.google.communication.synapse.security.scytale.EventPublisher
    public final void onScytaleEvent(final ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
        auvh.h(eijx.f(new Runnable() { // from class: bwkp
            @Override // java.lang.Runnable
            public final void run() {
                eieu eieuVarK = eiiy.k("ScytaleEventPublisher::onScytaleEvent");
                ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent2 = scytaleLoggingProto$ScytaleEvent;
                bwkq bwkqVar = this.a;
                try {
                    elsq elsqVar = (elsq) elst.a.createBuilder();
                    elsqVar.copyOnWrite();
                    elst elstVar = (elst) elsqVar.instance;
                    scytaleLoggingProto$ScytaleEvent2.getClass();
                    elstVar.d = scytaleLoggingProto$ScytaleEvent2;
                    elstVar.b |= 2;
                    elvg elvgVar = cqbe.a;
                    elsqVar.copyOnWrite();
                    elst elstVar2 = (elst) elsqVar.instance;
                    elstVar2.e = elvgVar.x;
                    elstVar2.b |= 4;
                    Optional optional = bwkqVar.b;
                    if (optional.isPresent()) {
                        Object obj = optional.get();
                        elsqVar.copyOnWrite();
                        elst elstVar3 = (elst) elsqVar.instance;
                        elstVar3.c = ((elss) obj).i;
                        elstVar3.b |= 1;
                    }
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.BUGLE_SCYTALE_EVENT;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b |= 1;
                    elst elstVar4 = (elst) elsqVar.build();
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    elstVar4.getClass();
                    ellhVar2.O = elstVar4;
                    ellhVar2.c |= 8192;
                    ((aill) bwkqVar.a.b()).j(ellgVar);
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
        }, this.c));
    }
}
