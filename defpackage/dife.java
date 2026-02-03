package defpackage;

import android.content.Context;
import com.google.android.libraries.communications.mobileconfiguration.sync.CleanupWorker;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dife implements diff {
    public static final ekrg a = ekrg.c("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi");
    public final eosc b;
    public final eosc c;
    public final digf d;
    public final digw e;
    public final ceao f;
    private final Context g;
    private final difi h;

    public dife(Context context, eosc eoscVar, eosc eoscVar2, digf digfVar, difi difiVar, ceao ceaoVar, digw digwVar) {
        this.g = context;
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = digfVar;
        this.h = difiVar;
        this.f = ceaoVar;
        this.e = digwVar;
    }

    @Override // defpackage.diff
    public final Optional a(String str) {
        return this.h.a(str);
    }

    @Override // defpackage.diff
    public final void b() {
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "forceSyncConfigurations", 148, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync mobile configuration");
        if (!fbgc.c(this.g)) {
            this.e.a();
            return;
        }
        eosc eoscVar = this.b;
        final digf digfVar = this.d;
        digfVar.getClass();
        ListenableFuture listenableFutureG = eooq.g(eoscVar.submit(new Callable() { // from class: diew
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return digfVar.c();
            }
        }), new eooz() { // from class: diex
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ((ekrd) ((ekrd) dife.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "resetAllConfigValidities", 172, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync aborted because failed to get parameters");
                    return eorv.a;
                }
                ekgp ekgpVar = (ekgp) optional.get();
                if (ekgpVar.isEmpty()) {
                    ((ekrd) ((ekrd) dife.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "resetAllConfigValidities", 178, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync aborted because no parameters are stored");
                    return eorv.a;
                }
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
                while (true) {
                    final dife difeVar = this.a;
                    if (!ekqgVarListIterator.hasNext()) {
                        return eork.a(ekfwVar.g()).a(new Callable() { // from class: difa
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, difeVar.c);
                    }
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    final String str = (String) entry.getKey();
                    digh dighVar = (digh) entry.getValue();
                    etsc etscVar = dighVar.d;
                    if (etscVar == null) {
                        etscVar = etsc.a;
                    }
                    digg diggVar = (digg) dighVar.toBuilder();
                    etsb etsbVar = (etsb) etscVar.toBuilder();
                    evrj evrjVar = evwy.a;
                    etsbVar.copyOnWrite();
                    etsc etscVar2 = (etsc) etsbVar.instance;
                    evrjVar.getClass();
                    etscVar2.f = evrjVar;
                    etscVar2.b |= 1;
                    diggVar.copyOnWrite();
                    digh dighVar2 = (digh) diggVar.instance;
                    etsc etscVar3 = (etsc) etsbVar.build();
                    etscVar3.getClass();
                    dighVar2.d = etscVar3;
                    dighVar2.b |= 2;
                    final digh dighVar3 = (digh) diggVar.build();
                    ListenableFuture listenableFutureSubmit = difeVar.b.submit(new Callable() { // from class: diez
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            difeVar.d.e(str, dighVar3);
                            return null;
                        }
                    });
                    ekfwVar.h(listenableFutureSubmit);
                    difeVar.c(listenableFutureSubmit, "MobileConfigurationApi: force sync failed to store configs");
                }
            }
        }, eoscVar);
        c(listenableFutureG, "MobileConfigurationApi: force sync failed to reset config validities");
        final digw digwVar = this.e;
        listenableFutureG.b(new Runnable() { // from class: diey
            @Override // java.lang.Runnable
            public final void run() {
                digwVar.a();
            }
        }, this.c);
    }

    public final void c(ListenableFuture listenableFuture, String str) {
        eork.r(listenableFuture, new difd(str), this.c);
    }

    @Override // defpackage.diff
    public final void d(final ekgp ekgpVar) {
        eork.r(eoqt.t(this.b.submit(new Callable() { // from class: difb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dife difeVar = this.a;
                ekgp ekgpVar2 = ekgpVar;
                if (ekgpVar2.isEmpty()) {
                    ((ekrd) ((ekrd) dife.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersSuccessNoParameters", 134, "MobileConfigurationApi.java")).q("registerParameters called with no parameters");
                    difeVar.f.a(difj.a(0, 3));
                    return null;
                }
                try {
                    ekhx ekhxVarA = difeVar.d.a(ekgpVar2);
                    int i = ((ekoj) ekgpVar2).d;
                    ((ekrd) ((ekrd) dife.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersSuccessWithParameters", 121, "MobileConfigurationApi.java")).r("registerParameters successfully stored %d parameters", i);
                    difeVar.f.a(difj.a(i, 4));
                    if (!ekhxVarA.isEmpty()) {
                        difeVar.e.b(pzz.a);
                        return null;
                    }
                } catch (difk e) {
                    int i2 = ((ekoj) ekgpVar2).d;
                    ((ekrd) ((ekrd) ((ekrd) dife.a.j()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersFailure", (char) 128, "MobileConfigurationApi.java")).q("registerParameters failed to store parameters");
                    difeVar.f.a(difj.a(i2, 5));
                }
                difeVar.e.b(pzz.b);
                return null;
            }
        })), new difc(), this.c);
        Context context = this.g;
        qbr qbrVarA = qbq.a(context);
        fbgc fbgcVar = fbgc.a;
        if (!fbgcVar.get().h(context)) {
            qbrVarA.a("CLEANUP");
            return;
        }
        pzh pzhVar = new pzh();
        pzhVar.a = true;
        pzj pzjVarA = pzhVar.a();
        qbg qbgVar = new qbg(CleanupWorker.class, fbgcVar.get().b(context), TimeUnit.SECONDS);
        qbgVar.g(pzjVarA);
        qbgVar.f(pza.b, fbgcVar.get().d(context), TimeUnit.SECONDS);
        qbgVar.d("CLEANUP");
        qbrVarA.f("CLEANUP", pzy.b, (qbh) qbgVar.b());
    }
}
