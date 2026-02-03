package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.net.tachyonrefresh.TachyonRefreshWorker;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgab implements cldw {
    public static final cqce a = cqce.g("BugleNetwork", "TachyonRefreshManagerImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl");
    public final Context c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    private final fcsu g;

    public cgab(Context context, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = context;
        this.d = eoscVar;
        this.g = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
    }

    @Override // defpackage.cldw
    public final eiju d(boolean z) {
        if (z) {
            return eijx.e(null);
        }
        a.p("No longer default SMS app. Update Tachyon registrations");
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.TACHYON_PHONE);
        cmggVarC.f(cevr.a);
        cmggVarC.b(true);
        cmggVarC.c(new Supplier() { // from class: cfzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cfzr();
            }
        });
        eiju eijuVarH = ((cmgk) this.g.b()).a(cmggVarC.a()).g().h(new ejvr() { // from class: cfzw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((ekgp) obj).keySet();
            }
        }, eoqg.a);
        eooz eoozVar = new eooz() { // from class: cfzx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekhx ekhxVar = (ekhx) obj;
                ekrw ekrwVarH = cgab.b.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshManagerImpl", "refreshForAllPhoneNumbers", 102, "TachyonRefreshManagerImpl.java")).r("Found %s registrations in settings", ekhxVar.size());
                Stream stream = Collection.EL.stream(ekhxVar);
                final cgab cgabVar = this.a;
                Stream map = stream.map(new Function() { // from class: cfzz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final String str = (String) obj2;
                        cqbd cqbdVarC = cgab.a.c();
                        cqbdVarC.I("Updating registration");
                        cqbdVarC.x("number", str, 2);
                        cqbdVarC.B("allowReregister", false);
                        cqbdVarC.r();
                        final cgab cgabVar2 = cgabVar;
                        eiju eijuVarI = ((cejj) cgabVar2.e.b()).c(str).i(new eooz() { // from class: cfzs
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return ((cejg) obj3).m(cedo.REFRESH_WITHOUT_REREGISTER);
                            }
                        }, cgabVar2.d);
                        ejvr ejvrVar = new ejvr() { // from class: cfzt
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        return eijuVarI.h(ejvrVar, eoqgVar).e(Throwable.class, new ejvr() { // from class: cfzu
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Throwable th = (Throwable) obj3;
                                boolean zD = cems.d(th);
                                String str2 = str;
                                if (zD) {
                                    cgab cgabVar3 = cgabVar2;
                                    ezok ezokVar = (ezok) ezol.a.createBuilder();
                                    ezokVar.copyOnWrite();
                                    ezol ezolVar = (ezol) ezokVar.instance;
                                    str2.getClass();
                                    ezolVar.c = str2;
                                    felm felmVar = felm.PHONE_NUMBER;
                                    ezokVar.copyOnWrite();
                                    ((ezol) ezokVar.instance).b = felmVar.a();
                                    ezokVar.copyOnWrite();
                                    ((ezol) ezokVar.instance).d = "RCS";
                                    ezol ezolVar2 = (ezol) ezokVar.build();
                                    cqbd cqbdVarA = TachyonRefreshWorker.e.a();
                                    cqbdVarA.I("Scheduling refresh retry");
                                    cqbdVarA.A("app", ezolVar2.d);
                                    cqbdVarA.r();
                                    qau qauVar = new qau(TachyonRefreshWorker.class);
                                    qauVar.d("tachyon_refresh_worker");
                                    pzh pzhVar = new pzh();
                                    pzhVar.c = true;
                                    pzhVar.c(2);
                                    qauVar.g(pzhVar.a());
                                    pzn pznVar = new pzn();
                                    pznVar.e("tachyon_refresh_app", ezolVar2.d);
                                    pznVar.e("tachyon_refresh_id", ezolVar2.c);
                                    qauVar.j(pznVar.a());
                                    qauVar.h(((Long) TachyonRefreshWorker.f.e()).longValue(), TimeUnit.SECONDS);
                                    qav qavVar = (qav) qauVar.b();
                                    qbq.a(cgabVar3.c).g("tachyon_refresh_" + ezolVar2.d + ezolVar2.c, pzz.a, qavVar);
                                }
                                cqbd cqbdVarE = cgab.a.e();
                                cqbdVarE.I("Failed to update registration");
                                cqbdVarE.x("number", str2, 2);
                                cqbdVarE.s(th);
                                return null;
                            }
                        }, eoqgVar);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return eijx.j((ekgb) map.collect(ekcv.a)).a(new Callable() { // from class: cgaa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, eoqg.a);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: cfzy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ains) this.a.f.b()).e("Bugle.DefaultSmsChanged.Tachyon.State.Counts", 1);
                return null;
            }
        }, eoscVar);
    }
}
