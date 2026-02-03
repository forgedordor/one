package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/dittosatellite/appcontrol/SatelliteAppActionManager");
    public final fcsu b;
    public final fcyh c;
    public final fdjx d;
    public final eipe e;
    private final Activity f;
    private final didn g;

    public abdu(Activity activity, fcsu fcsuVar, fcyh fcyhVar, fdjx fdjxVar) {
        activity.getClass();
        fcsuVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.f = activity;
        this.b = fcsuVar;
        this.c = fcyhVar;
        this.d = fdjxVar;
        int i = didn.b;
        ekfw ekfwVar = new ekfw();
        eipz eipzVar = eiqs.a;
        eipt eiptVar = new eipt(eiqs.b);
        eiptVar.a = "send";
        eiwb eiwbVar = new eiwb(eiqr.class);
        eiwbVar.b(eiqr.SEND);
        eiwbVar.b = true;
        eivy eivyVar = (eivy) eiwbVar.a();
        eiwb eiwbVar2 = new eiwb(eivyVar.b);
        if (!eivyVar.a.isEmpty()) {
            for (eiwc eiwcVar : eivyVar.a) {
                eiwcVar.b();
                eiwcVar.b();
                eiwbVar2.b(eiwcVar.a());
            }
        }
        eiwbVar2.b = true;
        eiwbVar2.c = true;
        eiptVar.b = new eiqe(eiwbVar2.a());
        final Consumer consumer = new Consumer() { // from class: abdr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((eixz) obj).getClass();
                ekrw ekrwVarH = abdu.a.h();
                ekrwVarH.X(eksq.a, "BugleSatelliteAppMgr");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/dittosatellite/appcontrol/SatelliteAppActionManager", "handleSendAction", 87, "SatelliteAppActionManager.kt")).q("Voice Assistant Send Action");
                abdu abduVar = this.a;
                auvh.h(auvw.c(abduVar.d, fcyi.a, fdjz.a, new abdt(abduVar, null)));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        eiptVar.c = new eiqm(new didr(new Function() { // from class: didq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                consumer.accept(obj);
                return eipz.c().a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        eiptVar.b.getClass();
        eiptVar.c.getClass();
        ekfwVar.h(new eivh(eiptVar.d, Optional.ofNullable(eiptVar.a), eiptVar.b, eiptVar.c, Optional.ofNullable(null), new Executor() { // from class: eips
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }));
        didn didnVar = new didn(ekfwVar.g());
        this.g = didnVar;
        this.e = new eipe(this.f, didnVar);
    }
}
