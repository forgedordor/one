package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwp implements cdfg {
    private final dbge c;
    private final dhes d;
    private final cmlb e;
    private final fcsu f;
    private final eosc g;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/fi/FiFeedbackDataProvider");
    public static final cczv a = cdag.f(cdag.b, "fi_psd_client_timeout_ms", 5000);

    public abwp(Context context, dhes dhesVar, cmlb cmlbVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2) {
        this.c = new dbge(context, eoscVar);
        this.d = dhesVar;
        this.e = cmlbVar;
        this.f = fcsuVar;
        this.g = eoscVar2;
    }

    public final /* synthetic */ List a() {
        try {
            final dbge dbgeVar = this.c;
            return (List) dbgeVar.a(new dbgc() { // from class: dbfu
                @Override // defpackage.dbgc
                public final void a(IBinder iBinder, Consumer consumer, Consumer consumer2) {
                    IFiProductSpecificDataService.Stub.asInterface(iBinder).getFiProductSpecificBinaryData(dbgeVar.a.getPackageName(), new dbfx(consumer, consumer2));
                }
            }, Duration.ofMillis(((Long) a.e()).longValue()));
        } catch (dbgd e) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", (char) 166, "FiFeedbackDataProvider.java")).q("Failed to load Fi PSBD");
            return new ArrayList();
        } catch (InterruptedException e2) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e2)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", (char) 170, "FiFeedbackDataProvider.java")).q("Interrupted while loading Fi PSBD");
            return new ArrayList();
        } catch (TimeoutException e3) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e3)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", (char) 168, "FiFeedbackDataProvider.java")).q("Timeout while loading Fi PSBD");
            return new ArrayList();
        }
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        if (((aqst) this.f.b()).a()) {
            if (Collection.EL.stream(this.e.q()).noneMatch(new abwk())) {
                int i = ekgb.d;
                return eijx.e(ekoe.a);
            }
        } else if (!this.d.t()) {
            int i2 = ekgb.d;
            return eijx.e(ekoe.a);
        }
        return eijx.g(new Callable() { // from class: abwn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        }, this.g);
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        if (((aqst) this.f.b()).a()) {
            if (Collection.EL.stream(this.e.q()).noneMatch(new abwk())) {
                int i = ekgb.d;
                return eijx.e(ekoe.a);
            }
        } else if (!this.d.t()) {
            int i2 = ekgb.d;
            return eijx.e(ekoe.a);
        }
        return eijx.g(new Callable() { // from class: abwo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.e();
            }
        }, this.g);
    }

    public final /* synthetic */ List e() {
        try {
            if (!((aqst) this.f.b()).a()) {
                return (List) Collection.EL.stream(this.c.b(Duration.ofMillis(((Long) a.e()).longValue()))).map(new Function() { // from class: abwh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Pair pair = (Pair) obj;
                        cczv cczvVar = abwp.a;
                        cdew cdewVar = new cdew();
                        cdewVar.b("Fi_".concat(String.valueOf((String) pair.first)));
                        cdewVar.c((String) pair.second);
                        return cdewVar.a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: abwi
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
            }
            final List list = (List) Collection.EL.stream(this.e.q()).filter(new abwk()).map(new Function() { // from class: abwl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((cmmh) obj).d);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: abwi
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            return (List) Collection.EL.stream(this.c.b(Duration.ofMillis(((Long) a.e()).longValue()))).map(new Function() { // from class: abwm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Pair pair = (Pair) obj;
                    cczv cczvVar = abwp.a;
                    cdew cdewVar = new cdew();
                    cdewVar.b("Fi_" + String.format("SubIds[%s]_", Collection.EL.stream(list).map(new Function() { // from class: abwj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((Integer) obj2).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(","))) + ((String) pair.first));
                    cdewVar.c((String) pair.second);
                    return cdewVar.a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: abwi
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
        } catch (dbgd e) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'f', "FiFeedbackDataProvider.java")).q("Failed to load Fi PSD");
            return new ArrayList();
        } catch (InterruptedException e2) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e2)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'j', "FiFeedbackDataProvider.java")).q("Interrupted while loading Fi PSD");
            return new ArrayList();
        } catch (TimeoutException e3) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e3)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'h', "FiFeedbackDataProvider.java")).q("Timeout while loading Fi PSD");
            return new ArrayList();
        }
    }
}
