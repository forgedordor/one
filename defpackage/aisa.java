package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aisa extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisc b;
    final /* synthetic */ emsp c;
    final /* synthetic */ emsj d;
    final /* synthetic */ Integer e;
    final /* synthetic */ Duration f;
    final /* synthetic */ emsl g;
    final /* synthetic */ emsr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisa(aisc aiscVar, emsp emspVar, emsj emsjVar, Integer num, Duration duration, emsl emslVar, emsr emsrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiscVar;
        this.c = emspVar;
        this.d = emsjVar;
        this.e = num;
        this.f = duration;
        this.g = emslVar;
        this.h = emsrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            final emsj emsjVar = this.d;
            final emsl emslVar = this.g;
            final emsp emspVar = this.c;
            final emsr emsrVar = this.h;
            eiju eijuVarH = aiscVar.h(new Supplier() { // from class: airz
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
                    Integer num2 = num;
                    if (num2 != null) {
                        num2.intValue();
                        enni.d(0, emsfVar);
                    }
                    Duration duration2 = duration;
                    if (duration2 != null && (numB = aiscVar.b(duration2)) != null) {
                        enni.b(numB.intValue(), emsfVar);
                    }
                    emsl emslVar2 = emslVar;
                    emsj emsjVar2 = emsjVar;
                    emsfVar.copyOnWrite();
                    emsm emsmVar = (emsm) emsfVar.instance;
                    emsmVar.d = Integer.valueOf(emsjVar2.r);
                    emsmVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                    emsfVar.copyOnWrite();
                    emsm emsmVar2 = (emsm) emsfVar.instance;
                    emsmVar2.f = Integer.valueOf(emslVar2.f);
                    emsmVar2.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
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
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger$logScreenOpened$1", "invokeSuspend", 79, "ComposeNavigationEventLogger.kt")).D("Failed to log opening ComposeNavigationEvent for %s, %s", this.c, this.d);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aisa(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
