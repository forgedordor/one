package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpr implements abpm {
    public static final cqce a = cqce.g("Bugle", "ReportInitializedHandler");
    public final Context b;
    private final cdbq c;
    private final abhr d;
    private final eosc e;

    public abpr(Context context, cdbq cdbqVar, abhr abhrVar, eosc eoscVar) {
        this.b = context;
        this.c = cdbqVar;
        this.d = abhrVar;
        this.e = eoscVar;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, final eppj eppjVar) {
        a.p("Ditto JSBridge Reported Initialized");
        final abhr abhrVar = this.d;
        final eiju eijuVarA = this.c.a();
        final eiju eijuVarI = abhrVar.a().i(new eooz() { // from class: abhq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(Optional.empty());
                }
                final abhr abhrVar2 = abhrVar;
                efwo efwoVar = (efwo) optional.get();
                final eiju eijuVarG = eiju.g(abhrVar2.b.c(efwoVar));
                final eiju eijuVarG2 = eiju.g(abhrVar2.c.b(efwoVar));
                eooz eoozVar = new eooz() { // from class: abho
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        String str = ((egbe) obj2).b().g;
                        abhr abhrVar3 = abhrVar2;
                        return eiju.g(abhrVar3.e.g(str, 32)).h(new ejvr() { // from class: abhl
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Bitmap bitmap = (Bitmap) obj3;
                                if (bitmap == null) {
                                    return evqs.b;
                                }
                                evqs evqsVar = evqs.b;
                                evqr evqrVar = new evqr();
                                bitmap.compress(Bitmap.CompressFormat.PNG, 0, evqrVar);
                                return evqrVar.b();
                            }
                        }, abhrVar3.a);
                    }
                };
                eosc eoscVar = abhrVar2.d;
                final eiju eijuVarI2 = eijuVarG.i(eoozVar, eoscVar);
                return eijx.m(eijuVarG, eijuVarG2, eijuVarI2).a(new Callable() { // from class: abhp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        egbe egbeVar = (egbe) eork.q(eijuVarG);
                        String str = (String) eork.q(eijuVarG2);
                        str.getClass();
                        evqs evqsVar = (evqs) eork.q(eijuVarI2);
                        epnt epntVar = (epnt) epnu.a.createBuilder();
                        epntVar.copyOnWrite();
                        ((epnu) epntVar.instance).b = str;
                        String str2 = egbeVar.b().d;
                        epntVar.copyOnWrite();
                        epnu epnuVar = (epnu) epntVar.instance;
                        str2.getClass();
                        epnuVar.c = str2;
                        epntVar.copyOnWrite();
                        epnu epnuVar2 = (epnu) epntVar.instance;
                        evqsVar.getClass();
                        epnuVar2.d = evqsVar;
                        epntVar.copyOnWrite();
                        ((epnu) epntVar.instance).e = "image/png";
                        return (epnu) epntVar.build();
                    }
                }, eoscVar).h(new ejvr() { // from class: abhm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Optional.of((epnu) obj2);
                    }
                }, eoscVar);
            }
        }, abhrVar.d);
        return eijx.m(eijuVarA, eijuVarI).a(new Callable() { // from class: abpp
            @Override // java.util.concurrent.Callable
            public final Object call() throws PackageManager.NameNotFoundException {
                String str = (String) eork.q(eijuVarA);
                Optional optional = (Optional) eork.q(eijuVarI);
                final eppa eppaVar = (eppa) eppb.a.createBuilder();
                String strE = cpge.e(this.a.b);
                eppaVar.copyOnWrite();
                eppb eppbVar = (eppb) eppaVar.instance;
                strE.getClass();
                eppbVar.c = strE;
                if (str != null) {
                    eppaVar.copyOnWrite();
                    ((eppb) eppaVar.instance).d = str;
                }
                eppj eppjVar2 = eppjVar;
                eppaVar.getClass();
                optional.ifPresent(new Consumer() { // from class: abpq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        eppa eppaVar2 = eppaVar;
                        epnu epnuVar = (epnu) obj;
                        eppaVar2.copyOnWrite();
                        eppb eppbVar2 = (eppb) eppaVar2.instance;
                        eppb eppbVar3 = eppb.a;
                        epnuVar.getClass();
                        eppbVar2.e = epnuVar;
                        eppbVar2.b |= 1;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                cqbd cqbdVarC = abpr.a.c();
                cqbdVarC.A("payloadValue", eppaVar.build());
                cqbdVarC.r();
                eppjVar2.copyOnWrite();
                eppl epplVar = (eppl) eppjVar2.instance;
                eppb eppbVar2 = (eppb) eppaVar.build();
                eppl epplVar2 = eppl.a;
                eppbVar2.getClass();
                epplVar.c = eppbVar2;
                epplVar.b = 100;
                return eppjVar2.build();
            }
        }, this.e);
    }
}
