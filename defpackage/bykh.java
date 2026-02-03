package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bykh implements bykf {
    private final fcsu a;

    public bykh(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    private static final cbog d(byiv byivVar, boolean z, Duration duration) {
        boolean z2 = true;
        if (!duration.isZero() && !z) {
            z2 = false;
        }
        ejwl.m(z2, "initialDelay should only be set for retries");
        caxr caxrVar = new caxr();
        caxrVar.b = byivVar.c + "," + byivVar.d + "," + byivVar.e + "," + byivVar.f;
        caxrVar.a = byivVar.g ? "initial" : z ? "incremental-retry" : (byivVar.f & bzas.a(33)) == bzas.a(33) ? "incremental-update" : "incremental";
        caxrVar.c = duration;
        return caxrVar.a();
    }

    @Override // defpackage.bykf
    public final int a() {
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("countInitialBackupWork");
        cbfdVarA.e(new Function() { // from class: bykg
            public final /* synthetic */ String a = "cms_backup-initial";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.g(this.a);
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return cbfdVarA.b().h();
    }

    @Override // defpackage.bykf
    public final cbcu b(byiv byivVar, Duration duration) {
        return cbcu.g("cms_backup", byivVar, d(byivVar, true, duration));
    }

    @Override // defpackage.bykf
    public final void c(byiv byivVar) {
        ((cazj) ((byjc) this.a.b()).a.b()).a(cbcu.g("cms_backup", byivVar, d(byivVar, false, Duration.ZERO)));
    }
}
