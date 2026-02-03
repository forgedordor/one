package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgl implements cdfg {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final dhes d;
    public final crny e;
    public final fcsu f;
    private final eosc g;
    private final eosc h;
    private final cqhy i;
    private final aqvy j;

    public cdgl(Context context, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, dhes dhesVar, crny crnyVar, cqhy cqhyVar, aqvy aqvyVar, fcsu fcsuVar3) {
        this.a = context;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = dhesVar;
        this.e = crnyVar;
        this.i = cqhyVar;
        this.j = aqvyVar;
        this.f = fcsuVar3;
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        return eijx.e("");
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        final cqhy cqhyVar = this.i;
        Callable callable = new Callable() { // from class: cdgi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                map.put("isDeviceConnectedToWifi", String.valueOf(dhhi.b(cqhyVar.a)));
                return map;
            }
        };
        eosc eoscVar = this.h;
        return eijx.i(ekgb.w(eijx.g(callable, eoscVar), eijx.g(new Callable() { // from class: cdge
            /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws android.content.pm.PackageManager.NameNotFoundException {
                /*
                    r5 = this;
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    cdgl r1 = r5.a
                    android.content.Context r1 = r1.a
                    android.content.pm.PackageManager r2 = r1.getPackageManager()
                    java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
                    r3 = 0
                    android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
                    android.content.pm.ApplicationInfo r2 = r1.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
                    android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
                    java.lang.String[] r1 = r1.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
                    java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
                    goto L24
                L21:
                    r2 = 0
                L22:
                    java.lang.String r1 = "Unable to get package"
                L24:
                    if (r2 == 0) goto L38
                    java.lang.String r3 = "com.android.vending.derived.apk.id"
                    boolean r4 = r2.containsKey(r3)
                    if (r4 != 0) goto L2f
                    goto L38
                L2f:
                    int r2 = r2.getInt(r3)
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    goto L3a
                L38:
                    java.lang.String r2 = "APK not generated or signed by Play"
                L3a:
                    java.lang.String r3 = "installedSplits"
                    r0.put(r3, r1)
                    java.lang.String r1 = "derivedApkId"
                    r0.put(r1, r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cdge.call():java.lang.Object");
            }
        }, eoscVar), eijx.g(new Callable() { // from class: cdgh
            @Override // java.util.concurrent.Callable
            public final Object call() throws Resources.NotFoundException {
                HashMap map = new HashMap();
                cdgl cdglVar = this.a;
                boolean zJ = ((cgbn) cdglVar.b.b()).J();
                map.put("NotificationsEnabled", String.valueOf(zJ));
                if (zJ) {
                    NotificationChannel notificationChannelF = ((cqzr) cdglVar.c.b()).f();
                    boolean z = false;
                    if (notificationChannelF != null && notificationChannelF.getImportance() > 2) {
                        z = true;
                    }
                    map.put("DefaultNotificationChannelEnabled", String.valueOf(z));
                }
                return map;
            }
        }, eoscVar), eijx.g(new Callable() { // from class: cdgj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                map.put("AndroidId", String.valueOf(devd.b(this.a.a.getContentResolver(), "android_id", 0L)));
                return map;
            }
        }, this.g), ((eoth) ((aqvu) this.j).a.b()).a("bugle.sim_subscription_info_retriever_to_fill_feedback_psd_map") ? eijx.g(new Callable() { // from class: cdgf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekgi ekgiVar = new ekgi();
                cdgl cdglVar = this.a;
                fcsu fcsuVar = cdglVar.f;
                cmmb cmmbVarA = ((cmlb) fcsuVar.b()).a();
                ekgiVar.i("Number of Sim Slots", Integer.toString(cdglVar.e.e()));
                ekgiVar.i("Voice Sim Equal to Data Sim", true != cmmbVarA.c.equals(cmmbVarA.e) ? "False" : "True");
                for (cmmh cmmhVar : ((cmlb) fcsuVar.b()).p()) {
                    ekgiVar.i(String.format("GID%s", Integer.valueOf(cmmhVar.e)), cmmhVar.t);
                }
                return ekgiVar.c();
            }
        }, eoscVar) : eijx.g(new Callable() { // from class: cdgg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cdgl cdglVar = this.a;
                crny crnyVar = cdglVar.e;
                return ekgp.n("Number of Sim Slots", Integer.toString(crnyVar.e()), "Voice Sim Equal to Data Sim", crnyVar.b() == crnyVar.d() ? "True" : "False", "GID1", cdglVar.d.i());
            }
        }, eoscVar), eijx.e(ekoj.a))).h(new ejvr() { // from class: cdgb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream streamFilter = Collection.EL.stream((List) obj).filter(new Predicate() { // from class: cdgk
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
                        return Objects.nonNull((Map) obj2);
                    }
                });
                int i = ekgb.d;
                Collector collector = ekcv.a;
                return (List) Collection.EL.stream((ekgb) streamFilter.collect(collector)).map(new Function() { // from class: cdgc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return cdfd.a((Map) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: cdgd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Collection.EL.stream((ekgb) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(collector);
            }
        }, eoscVar);
    }
}
