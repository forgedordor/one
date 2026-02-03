package defpackage;

import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class airy extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisc b;
    final /* synthetic */ emsp c;
    final /* synthetic */ emsh d;
    final /* synthetic */ Integer e;
    final /* synthetic */ Duration f;
    final /* synthetic */ emsr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airy(aisc aiscVar, emsp emspVar, emsh emshVar, Integer num, Duration duration, emsr emsrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiscVar;
        this.c = emspVar;
        this.d = emshVar;
        this.e = num;
        this.f = duration;
        this.g = emsrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((airy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final aisc aiscVar = this.b;
            final Integer num = this.e;
            final Duration duration = this.f;
            final emsh emshVar = this.d;
            final emsp emspVar = this.c;
            final emsr emsrVar = this.g;
            eiju eijuVarH = aiscVar.h(new Supplier() { // from class: airx
                @Override // java.util.function.Supplier
                public final Object get() {
                    Integer numB;
                    emsf emsfVar = (emsf) emsm.a.createBuilder();
                    emsfVar.getClass();
                    emsn emsnVar = (emsn) emss.a.createBuilder();
                    emsnVar.getClass();
                    ennj.b(emspVar, emsnVar);
                    ennj.c(emsrVar, emsnVar);
                    enni.c(ennj.a(emsnVar), emsfVar);
                    enni.d(num.intValue(), emsfVar);
                    Duration duration2 = duration;
                    if (duration2 != null && (numB = aiscVar.b(duration2)) != null) {
                        enni.b(numB.intValue(), emsfVar);
                    }
                    emsh emshVar2 = emshVar;
                    emsfVar.copyOnWrite();
                    emsm emsmVar = (emsm) emsfVar.instance;
                    emsmVar.d = Integer.valueOf(emshVar2.h);
                    emsmVar.c = 102;
                    return enni.a(emsfVar);
                }
            });
            eijuVarH.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarH, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarJ = aisc.a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger$logScreenClosed$1", "invokeSuspend", 114, "ComposeNavigationEventLogger.kt")).D("Failed to log closing ComposeNavigationEvent for %s, %s", this.c, this.d);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new airy(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
