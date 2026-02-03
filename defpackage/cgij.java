package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgij extends cayl {
    public static final eksp a = eksp.c("BugleNotifications");
    public final kwx b;
    public final eosc c;
    public final eosc d;
    public final cgjf e;
    public final cglm f;
    public final cgkb g;
    public final Map h;
    public final Optional i;
    public final Optional j;
    public final fcsu k;
    public final dzuc l;
    public final cogw m;
    public final crnp n;
    private final Map o;
    private final cgio p;
    private final fcsu q;
    private final fcsu r;
    private final arpv s;

    public cgij(Map map, Context context, eosc eoscVar, eosc eoscVar2, cgjf cgjfVar, cglm cglmVar, cgkb cgkbVar, Map map2, Optional optional, Optional optional2, cgio cgioVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, arpv arpvVar, dzuc dzucVar, cogw cogwVar, crnp crnpVar) {
        this.b = new kwx(context);
        this.o = map;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = cgjfVar;
        this.f = cglmVar;
        this.g = cgkbVar;
        this.h = map2;
        this.i = optional;
        this.j = optional2;
        this.p = cgioVar;
        this.q = fcsuVar;
        this.r = fcsuVar2;
        this.k = fcsuVar3;
        this.l = dzucVar;
        this.m = cogwVar;
        this.n = crnpVar;
        this.s = arpvVar;
    }

    public static cbcw k(List list) {
        cbcw cbcwVarI = cbcw.i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cbcw cbcwVar = (cbcw) it.next();
            if (cbcwVar == cbcw.m()) {
                return cbcw.m();
            }
            if (cbcwVar == cbcw.k()) {
                cbcwVarI = cbcw.k();
            }
        }
        return cbcwVarI;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    @Override // defpackage.cayl, defpackage.cazg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.caya a() {
        /*
            r3 = this;
            caxz r0 = defpackage.caya.l()
            fcsu r1 = r3.q
            java.lang.Object r1 = r1.b()
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            int r1 = r1.intValue()
            r0.c(r1)
            fcsu r1 = r3.r
            java.lang.Object r1 = r1.b()
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            int r1 = r1.intValue()
            r0.d(r1)
            arpv r1 = r3.s
            arpp r1 = (defpackage.arpp) r1
            fcsu r1 = r1.a
            java.lang.Object r1 = r1.b()
            eoth r1 = (defpackage.eoth) r1
            java.lang.String r2 = "bugle.use_wakelock_for_pwq"
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L62
            kwx r1 = r3.b
            boolean r1 = r1.i()
            if (r1 == 0) goto L62
            cgkb r1 = r3.g
            android.app.NotificationChannel r2 = r1.f()
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L51
            goto L62
        L51:
            caze r1 = defpackage.caze.FOREGROUND_SERVICE
            r0.b(r1)
            cgio r1 = r3.p
            android.app.Notification r1 = r1.a()
            r2 = r0
            caxk r2 = (defpackage.caxk) r2
            r2.b = r1
            goto L67
        L62:
            caze r1 = defpackage.caze.WAKELOCK
            r0.b(r1)
        L67:
            caya r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgij.a():caya");
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CreateNotificationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cgkl.a.getParserForType();
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final String f() {
        return "shared_notification_queue_name";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, ekgb ekgbVar) {
        EnumMap enumMap = new EnumMap(cglf.class);
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            cgkl cgklVar = (cgkl) ekgbVar.get(i);
            cglf cglfVarB = cglf.b(cgklVar.e);
            if (cglfVarB == null) {
                cglfVarB = cglf.NT_UNKNOWN;
            }
            List arrayList = (List) enumMap.get(cglfVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(cgklVar);
            enumMap.put((EnumMap) cglfVarB, (cglf) arrayList);
        }
        ekfw ekfwVar = new ekfw();
        for (Map.Entry entry : enumMap.entrySet()) {
            final cglf cglfVar = (cglf) entry.getKey();
            Map map = this.o;
            if (map.containsKey(cglfVar)) {
                List list = (List) entry.getValue();
                if (list.isEmpty()) {
                    eksl ekslVar = (eksl) a.j();
                    ekslVar.X(cgey.n, cglfVar);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createAllNotifications", 219, "CreateNotificationHandler.java")).q("Missing inputs for notification type, not creating notification");
                } else {
                    final cgiw cgiwVar = (cgiw) map.get(cglfVar);
                    cgiwVar.getClass();
                    ekgb ekgbVarB = cgiwVar.c().b(ekgb.n(list));
                    this.l.e(dzfh.c("CreateNotificationLatency_", cglfVar));
                    eiju eijuVarE = eijx.e(cbcw.i());
                    final ArrayList arrayList2 = new ArrayList();
                    int size = ekgbVarB.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        final cgkl cgklVar2 = (cgkl) ekgbVarB.get(i2);
                        eijuVarE = eijuVarE.i(new eooz() { // from class: cghq
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                arrayList2.add((cbcw) obj);
                                final cgij cgijVar = this.a;
                                final cglf cglfVar2 = cglfVar;
                                final cgiw cgiwVar2 = cgiwVar;
                                final cgkl cgklVar3 = cgklVar2;
                                eiju eijuVarL = cgijVar.l(cgiwVar2);
                                eooz eoozVar = new eooz() { // from class: cgho
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                        cglf cglfVar3 = cglfVar2;
                                        if (!zBooleanValue) {
                                            eksl ekslVar2 = (eksl) cgij.a.h();
                                            ekslVar2.X(cgey.n, cglfVar3);
                                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createNotificationFromInputData", 299, "CreateNotificationHandler.java")).q("shouldShow=false, so not creating notification");
                                            return eijx.e(cbcw.k());
                                        }
                                        cgkl cgklVar4 = cgklVar3;
                                        final cgiw cgiwVar3 = cgiwVar2;
                                        final cgij cgijVar2 = cgijVar;
                                        eiju eijuVarA = cgiwVar3.a((List) Collection.EL.stream((List) Collection.EL.stream(cgijVar2.f.c(cglfVar3)).filter(new cgig()).collect(Collectors.toCollection(new cgif()))).map(new Function() { // from class: cghv
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                eksp ekspVar = cgij.a;
                                                return ((StatusBarNotification) obj3).getNotification().extras;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(Collectors.toCollection(new cgif())), cgiwVar3.c().c(cgklVar4));
                                        final boolean z = cgklVar4.f;
                                        return eijuVarA.i(new eooz() { // from class: cgid
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
                                            /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
                                            /* JADX WARN: Removed duplicated region for block: B:50:0x02af  */
                                            @Override // defpackage.eooz
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r29) {
                                                /*
                                                    Method dump skipped, instructions count: 914
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.cgid.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                                            }
                                        }, cgijVar2.d);
                                    }
                                };
                                eosc eoscVar = cgijVar.c;
                                return eijuVarL.i(eoozVar, eoscVar).e(Exception.class, new ejvr() { // from class: cghz
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        ((eksl) ((eksl) ((eksl) cgij.a.j()).g((Exception) obj2)).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createNotificationFromInputData", 323, "CreateNotificationHandler.java")).q("createNotification call failed finished");
                                        cglv cglvVar = (cglv) cgijVar.k.b();
                                        cglf cglfVarD = cgiwVar2.d();
                                        cglfVarD.getClass();
                                        ((ains) cglvVar.a.b()).e("Bugle.Notifications2o.FailedToPost.Count", cglfVarD.j);
                                        return cbcw.m();
                                    }
                                }, eoscVar);
                            }
                        }, this.c);
                    }
                    ekfwVar.h(eijuVarE.h(new ejvr() { // from class: cghr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            List list2 = arrayList2;
                            list2.add((cbcw) obj);
                            dzuc dzucVar = this.a.l;
                            cglf cglfVar2 = cglfVar;
                            cbcw cbcwVarK = cgij.k(list2);
                            dzucVar.g(dzfh.c("CreateNotificationLatency_", cglfVar2), null, null, dzua.SUCCESS);
                            return cbcwVarK;
                        }
                    }, this.c));
                }
            } else {
                eksl ekslVar2 = (eksl) a.j();
                ekslVar2.X(cgey.n, cglfVar);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createAllNotifications", 210, "CreateNotificationHandler.java")).q("No blueprint for notification type, not creating notification");
            }
        }
        final ekgb ekgbVarG = ekfwVar.g();
        return eijx.l(ekgbVarG).a(new Callable() { // from class: cghs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = cgij.a;
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                while (true) {
                    ekgb ekgbVar2 = ekgbVarG;
                    if (i3 >= ((ekoe) ekgbVar2).c) {
                        return cgij.k(arrayList3);
                    }
                    arrayList3.add((cbcw) eork.q((eiju) ekgbVar2.get(i3)));
                    i3++;
                }
            }
        }, this.c);
    }

    public final eiju l(final cgiw cgiwVar) {
        return eijx.g(new Callable() { // from class: cgib
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cgij cgijVar = this.a;
                Optional optional = cgijVar.i;
                if (optional.isPresent() && ((ctcf) ((fcsu) optional.get()).b()).a() == 1) {
                    ((eksl) ((eksl) cgij.a.h()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 664, "CreateNotificationHandler.java")).q("Notification disabled for TMO Digits-enabled wear device");
                    return false;
                }
                Optional optional2 = cgijVar.j;
                if (optional2.isPresent() && !((ctbt) ((fcsu) optional2.get()).b()).a()) {
                    ((eksl) ((eksl) cgij.a.h()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 674, "CreateNotificationHandler.java")).q("Notification disabled for wear device");
                    return false;
                }
                if (cgijVar.n.d()) {
                    return Boolean.valueOf(cgijVar.b.i());
                }
                ((eksl) ((eksl) cgij.a.h()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 680, "CreateNotificationHandler.java")).q("Notification disabled as it's not default sms app");
                return false;
            }
        }, this.d).i(new eooz() { // from class: cgic
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cgij.a;
                return !((Boolean) obj).booleanValue() ? eijx.e(false) : cgiwVar.e();
            }
        }, eoqg.a);
    }
}
