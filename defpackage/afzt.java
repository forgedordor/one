package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzt implements afzc, afza {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/NavigationRouterImpl");
    private final agal b;
    private final fcsu c;
    private final Set d;
    private final fduf e;

    public afzt(agal agalVar, fcsu fcsuVar) {
        agalVar.getClass();
        this.b = agalVar;
        this.c = fcsuVar;
        this.d = new LinkedHashSet();
        this.e = fdvf.a(true);
    }

    @Override // defpackage.afza
    public final fdvc a() {
        return this.b.a();
    }

    @Override // defpackage.afza
    public final void b(int i) {
        agal agalVar = this.b;
        agalVar.c(i);
        agalVar.b();
    }

    @Override // defpackage.afza
    public final void c(int i, Object obj) {
        agal agalVar = this.b;
        agalVar.d(i, obj);
        agalVar.b();
    }

    @Override // defpackage.afza
    public final void d(int i) {
        this.b.e(i);
    }

    @Override // defpackage.afza
    public final void e(afzy afzyVar, boolean z) {
        fcsu fcsuVar = this.c;
        Optional optional = (Optional) fcsuVar.b();
        final fdap fdapVar = new fdap() { // from class: afzp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ahbj) obj).k());
            }
        };
        if (((Boolean) optional.map(new Function() { // from class: afzq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ((ahbj) ((Optional) fcsuVar.b()).get()).e(afzyVar, z);
            return;
        }
        if (z) {
            this.d.remove(afzyVar);
        } else {
            this.d.add(afzyVar);
        }
        if (fdbq.f(afzyVar, agbf.a)) {
            this.e.f(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    @Override // defpackage.afzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.afzx r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            ekrg r0 = defpackage.afzt.a
            ekrw r1 = r0.e()
            r2 = 82
            java.lang.String r3 = "com/google/android/apps/messaging/navigation/NavigationRouterImpl"
            java.lang.String r4 = "navigate"
            java.lang.String r5 = "NavigationRouterImpl.kt"
            ekrw r1 = r1.h(r3, r4, r2, r5)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "Navigation requested to %s"
            r1.t(r2, r8)
            fcyk r1 = new fcyk
            fcxy r2 = defpackage.fcym.c(r9)
            fcyl r6 = defpackage.fcyl.b
            r1.<init>(r2, r6)
            java.util.Set r2 = r7.d
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L4a
            ekrw r8 = r0.j()
            r0 = 86
            ekrw r8 = r8.h(r3, r4, r0, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r0 = "Attempting to navigate to disabled navigation target."
            r8.q(r0)
            afzb r8 = new afzb
            r8.<init>()
            java.lang.Object r8 = defpackage.fctl.a(r8)
            r1.w(r8)
            goto L71
        L4a:
            agal r0 = r7.b     // Catch: java.lang.Exception -> L50
            r0.g(r8, r1)     // Catch: java.lang.Exception -> L50
            goto L71
        L50:
            r8 = move-exception
            ekrg r0 = defpackage.afzt.a
            ekrw r0 = r0.j()
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r0 = r0.g(r8)
            r2 = 100
            ekrw r0 = r0.h(r3, r4, r2, r5)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r2 = "Navigation request failed."
            r0.q(r2)
            java.lang.Object r8 = defpackage.fctl.a(r8)
            r1.w(r8)
        L71:
            java.lang.Object r8 = r1.result
            fcyl r0 = defpackage.fcyl.b
            if (r8 != r0) goto L84
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.fcyk.a
            fcyl r2 = defpackage.fcyl.a
            boolean r8 = defpackage.fcyj.a(r8, r1, r0, r2)
            if (r8 == 0) goto L82
            goto L90
        L82:
            java.lang.Object r8 = r1.result
        L84:
            fcyl r0 = defpackage.fcyl.c
            if (r8 != r0) goto L8b
            fcyl r2 = defpackage.fcyl.a
            goto L90
        L8b:
            boolean r0 = r8 instanceof defpackage.fctj
            if (r0 != 0) goto L98
            r2 = r8
        L90:
            fcyl r8 = defpackage.fcyl.a
            if (r2 != r8) goto L97
            r9.getClass()
        L97:
            return r2
        L98:
            fctj r8 = (defpackage.fctj) r8
            java.lang.Throwable r8 = r8.a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzt.f(afzx, fcxy):java.lang.Object");
    }

    @Override // defpackage.afzc
    public final fdvc g() {
        fcsu fcsuVar = this.c;
        Optional optional = (Optional) fcsuVar.b();
        final fdap fdapVar = new fdap() { // from class: afzl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ahbj) obj).k());
            }
        };
        return ((Boolean) optional.map(new Function() { // from class: afzm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() ? ((ahbj) ((Optional) fcsuVar.b()).get()).g() : this.e;
    }

    @Override // defpackage.afzc
    public final void h(afzv afzvVar) throws afzb {
        ekrg ekrgVar = a;
        ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 43, "NavigationRouterImpl.kt")).t("Navigation requested to %s", afzvVar);
        fcsu fcsuVar = this.c;
        Optional optional = (Optional) fcsuVar.b();
        final fdap fdapVar = new fdap() { // from class: afzj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ahbj) obj).k());
            }
        };
        if (((Boolean) optional.map(new Function() { // from class: afzk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ((ahbj) ((Optional) fcsuVar.b()).get()).h(afzvVar);
        } else {
            if (this.d.contains(afzvVar)) {
                ((ekrd) ekrgVar.j().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "navigate", 50, "NavigationRouterImpl.kt")).q("Attempting to navigate to disabled navigation target.");
                throw new afzb();
            }
            this.b.f(afzvVar);
        }
    }

    @Override // defpackage.afzc
    public final boolean i(afzy afzyVar) {
        fcsu fcsuVar = this.c;
        Optional optional = (Optional) fcsuVar.b();
        final fdap fdapVar = new fdap() { // from class: afzr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ahbj) obj).k());
            }
        };
        return ((Boolean) optional.map(new Function() { // from class: afzs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() ? ((ahbj) ((Optional) fcsuVar.b()).get()).i(afzyVar) : !this.d.contains(afzyVar);
    }

    @Override // defpackage.afzc
    public final boolean j(afzv afzvVar) {
        ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "tryNavigate", 61, "NavigationRouterImpl.kt")).t("Navigation requested to %s", afzvVar);
        fcsu fcsuVar = this.c;
        Optional optional = (Optional) fcsuVar.b();
        final fdap fdapVar = new fdap() { // from class: afzn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ahbj) obj).k());
            }
        };
        if (((Boolean) optional.map(new Function() { // from class: afzo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            return ((ahbj) ((Optional) fcsuVar.b()).get()).j(afzvVar);
        }
        try {
            h(afzvVar);
            return true;
        } catch (Exception e) {
            ((ekrd) ((ekrd) a.j()).g(e).h("com/google/android/apps/messaging/navigation/NavigationRouterImpl", "tryNavigate", 71, "NavigationRouterImpl.kt")).q("Navigation request failed.");
            return false;
        }
    }
}
