package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egja implements ehwh {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    static final long b = TimeUnit.DAYS.toMillis(30);
    public final diep c;
    public final egcd d;
    public final egcq e;
    public final egca f;
    public final eosc g;
    public final eosc h;
    public final egin i;
    private final eoqr j;

    public egja(diep diepVar, egcd egcdVar, egcq egcqVar, egca egcaVar, eosc eoscVar, eosc eoscVar2, egin eginVar, eoqr eoqrVar) {
        this.c = diepVar;
        this.d = egcdVar;
        this.e = egcqVar;
        this.f = egcaVar;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.i = eginVar;
        this.j = eoqrVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        eooy eooyVarC = eiid.c(new eooy() { // from class: egiw
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final egja egjaVar = this.a;
                egcq egcqVar = egjaVar.e;
                final ListenableFuture listenableFutureB = egjaVar.b();
                ListenableFuture listenableFutureG = eooq.g(eoqt.t(egcqVar.e()), eiid.d(new eooz() { // from class: egis
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        egcx egcxVar = (egcx) obj;
                        int i = egcxVar.b & 1;
                        egja egjaVar2 = egjaVar;
                        return (i == 0 || Math.abs(egjaVar2.c.f().toEpochMilli() - egcxVar.c) >= egja.b) ? eooq.f(egjaVar2.f.b(), eiid.a(new ejvr() { // from class: egiz
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ekrg ekrgVar = egja.a;
                                return true;
                            }
                        }), eoqg.a) : eork.i(false);
                    }
                }), egjaVar.h);
                eooz eoozVarD = eiid.d(new eooz() { // from class: egit
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((Boolean) obj).booleanValue() ? egjaVar.b() : eork.i(null);
                    }
                });
                eosc eoscVar = egjaVar.g;
                final ListenableFuture listenableFutureG2 = eooq.g(listenableFutureG, eoozVarD, eoscVar);
                return eork.b(listenableFutureB, listenableFutureG2).a(eiid.l(new Callable() { // from class: egiu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekrg ekrgVar = egja.a;
                        eork.q(listenableFutureB);
                        eork.q(listenableFutureG2);
                        return null;
                    }
                }), eoscVar);
            }
        });
        eosc eoscVar = this.g;
        return eooh.f(eork.n(eooyVarC, eoscVar), Throwable.class, eiid.a(new ejvr() { // from class: egix
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) egja.a.i()).g((Throwable) obj)).h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 'Z', "WipeoutAccountsSynclet.java")).q("Wipeout accounts task failed.");
                return null;
            }
        }), eoscVar);
    }

    final ListenableFuture b() {
        return this.j.b(eiid.c(new eooy() { // from class: egiy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final egja egjaVar = this.a;
                ekgb ekgbVarB = egjaVar.i.b(true);
                ekhv ekhvVar = new ekhv();
                int i = ((ekoe) ekgbVarB).c;
                for (int i2 = 0; i2 < i; i2++) {
                    File file = (File) ekgbVarB.get(i2);
                    try {
                        ekhvVar.c(Integer.valueOf(Integer.parseInt(file.getName())));
                    } catch (NumberFormatException e) {
                        ((ekrd) ((ekrd) ((ekrd) egja.a.i()).g(e)).h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", 172, "WipeoutAccountsSynclet.java")).t("Account directory name is malformed. Directory name: %s", file.getName());
                    }
                }
                final ekhx ekhxVarG = ekhvVar.g();
                return eooq.g(egjaVar.d.i(), eiid.d(new eooz() { // from class: egiv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ekhx ekhxVarF = ekpg.b(ekhxVarG, (Set) obj).f();
                        egin eginVar = egjaVar.i;
                        return eginVar.c(eginVar.a(ekhxVarF, null, true));
                    }
                }), egjaVar.h);
            }
        }), this.h);
    }
}
