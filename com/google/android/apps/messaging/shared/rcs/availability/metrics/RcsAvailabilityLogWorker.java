package com.google.android.apps.messaging.shared.rcs.availability.metrics;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.apwu;
import defpackage.apxc;
import defpackage.chzy;
import defpackage.chzz;
import defpackage.cmlb;
import defpackage.dggp;
import defpackage.dhes;
import defpackage.dhip;
import defpackage.dhja;
import defpackage.dhki;
import defpackage.dhkw;
import defpackage.ehli;
import defpackage.eijx;
import defpackage.ejwl;
import defpackage.enwr;
import defpackage.eooy;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.qaq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RcsAvailabilityLogWorker extends qaq {
    public static final dhip e = new dhip("RcsAvailabilityLogWorker");
    public final fcsu f;
    public final eosc g;
    public final cmlb h;
    private final chzz i;
    private final eosc j;
    private final dhkw k;
    private final dhes l;
    private final apxc m;
    private final fcsu n;

    /* compiled from: PG */
    public interface a {
        eosc A();

        apxc aw();

        chzz ck();

        cmlb cr();

        dhes ds();

        dhkw dt();

        fcsu ge();

        fcsu gm();

        eosc q();
    }

    public RcsAvailabilityLogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.f = aVar.ge();
        this.i = aVar.ck();
        this.j = aVar.q();
        this.g = aVar.A();
        this.k = aVar.dt();
        this.l = aVar.ds();
        this.h = aVar.cr();
        this.m = aVar.aw();
        this.n = aVar.gm();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        dhja.d(e, "%s is started", "RcsAvailabilityLogWorker");
        return ((apwu) this.n.b()).a() ? eijx.h(new eooy() { // from class: chzt
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final RcsAvailabilityLogWorker rcsAvailabilityLogWorker = this.a;
                return rcsAvailabilityLogWorker.h.d().h(new ejvr() { // from class: chzw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        for (cmmh cmmhVar : (Set) obj) {
                            RcsAvailabilityLogWorker rcsAvailabilityLogWorker2 = rcsAvailabilityLogWorker;
                            rcsAvailabilityLogWorker2.c(((chza) ((cqbm) rcsAvailabilityLogWorker2.f.b()).a()).v(new dggp(cmmhVar.c)), Optional.of(cmmhVar));
                        }
                        return new qao();
                    }
                }, rcsAvailabilityLogWorker.g);
            }
        }, this.g) : this.m.a() ? eijx.h(new eooy() { // from class: chzr
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final RcsAvailabilityLogWorker rcsAvailabilityLogWorker = this.a;
                return rcsAvailabilityLogWorker.h.e(cmla.a).h(new ejvr() { // from class: chzq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        final Optional optional = (Optional) obj;
                        final RcsAvailabilityLogWorker rcsAvailabilityLogWorker2 = rcsAvailabilityLogWorker;
                        optional.ifPresentOrElse(new Consumer() { // from class: chzo
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                RcsAvailabilityLogWorker rcsAvailabilityLogWorker3 = rcsAvailabilityLogWorker2;
                                rcsAvailabilityLogWorker3.c(((chza) ((cqbm) rcsAvailabilityLogWorker3.f.b()).a()).v(new dggp(((cmmh) obj2).c)), optional);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Runnable() { // from class: chzp
                            @Override // java.lang.Runnable
                            public final void run() {
                                dhja.d(RcsAvailabilityLogWorker.e, "%s No default SimSubscriptionInfoFound. Skipping availability update.", "RcsAvailabilityLogWorker");
                            }
                        });
                        return new qao();
                    }
                }, rcsAvailabilityLogWorker.g);
            }
        }, this.g) : eijx.g(new Callable() { // from class: chzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RcsAvailabilityLogWorker rcsAvailabilityLogWorker = this.a;
                rcsAvailabilityLogWorker.c(((chza) ((cqbm) rcsAvailabilityLogWorker.f.b()).a()).w(), Optional.empty());
                return new qao();
            }
        }, this.j);
    }

    public final void c(enwr enwrVar, Optional optional) {
        if (this.m.a()) {
            ejwl.b(optional.isPresent(), "No SimSubscriptionInfo present.");
        }
        Optional map = optional.map(new Function() { // from class: chzu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmmh) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dhes dhesVar = this.l;
        dggp dggpVar = new dggp((String) map.orElse(dhesVar.l()));
        dhki dhkiVarA = this.k.a(((Integer) optional.map(new Function() { // from class: chzv
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
        }).orElse(Integer.valueOf(dhesVar.b()))).intValue());
        this.i.h(new chzy(enwrVar, enwrVar), dhki.SINGLE_REG.equals(dhkiVarA) ? 5 : dhki.DUAL_REG.equals(dhkiVarA) ? 4 : 1, dggpVar);
    }
}
