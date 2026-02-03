package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsco implements dsbr {
    private static final eksp a = eksp.c("GnpSdk");
    private final dxgg b;
    private final diep c;

    public dsco(dxgg dxggVar, diep diepVar) {
        this.b = dxggVar;
        this.c = diepVar;
    }

    private static String g(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    private final void h(dsbi dsbiVar, String str) {
        ethk ethkVarC = dsbiVar.c();
        String strE = dsbiVar.e();
        if (fbck.b()) {
            dsdd dsddVar = (dsdd) dsde.a.createBuilder();
            dsddVar.copyOnWrite();
            dsde dsdeVar = (dsde) dsddVar.instance;
            ethkVarC.getClass();
            dsdeVar.c = ethkVarC;
            dsdeVar.b |= 1;
            long epochMilli = this.c.f().toEpochMilli();
            dsddVar.copyOnWrite();
            dsde dsdeVar2 = (dsde) dsddVar.instance;
            dsdeVar2.b |= 4;
            dsdeVar2.e = epochMilli;
            dsddVar.copyOnWrite();
            dsde dsdeVar3 = (dsde) dsddVar.instance;
            str.getClass();
            dsdeVar3.b |= 8;
            dsdeVar3.f = str;
            if (strE != null) {
                dsddVar.copyOnWrite();
                dsde dsdeVar4 = (dsde) dsddVar.instance;
                dsdeVar4.b |= 2;
                dsdeVar4.d = strE;
            }
            ((dski) this.b.a(strE)).d(UUID.randomUUID().toString(), (dsde) dsddVar.build());
        }
    }

    @Override // defpackage.dsbr
    public final void a(dsbi dsbiVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        eksl ekslVar = (eksl) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logDebug", 103, "PromoEvalLoggerImpl.java");
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ekslVar.w("Promo ID [%s]: %s", ethtVar.b, strG);
        h(dsbiVar, strG);
    }

    @Override // defpackage.dsbr
    public final void b(dsbi dsbiVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        eksl ekslVar = (eksl) ((eksl) a.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logError", 38, "PromoEvalLoggerImpl.java");
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ekslVar.w("Promo ID [%s]: %s", ethtVar.b, strG);
        h(dsbiVar, strG);
    }

    @Override // defpackage.dsbr
    public final void c(dsbi dsbiVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        eksl ekslVar = (eksl) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logVerbose", 90, "PromoEvalLoggerImpl.java");
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ekslVar.w("Promo ID [%s]: %s", ethtVar.b, strG);
        h(dsbiVar, strG);
    }

    @Override // defpackage.dsbr
    public final void d(dsbi dsbiVar, String str, Object... objArr) {
        String strG = g(str, objArr);
        eksl ekslVar = (eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logWarning", 63, "PromoEvalLoggerImpl.java");
        etht ethtVar = ((dsbc) dsbiVar).a.c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ekslVar.w("Promo ID [%s]: %s", ethtVar.b, strG);
        h(dsbiVar, strG);
    }

    @Override // defpackage.dsbr
    public final void e(dsbi dsbiVar, Throwable th, Object... objArr) {
        String strG = g("Unexpected exception while rendering promotion.", objArr);
        eksl ekslVar = (eksl) ((eksl) ((eksl) a.i()).g(th)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logError", 52, "PromoEvalLoggerImpl.java");
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ekslVar.w("Promo ID [%s]: %s", ethtVar.b, strG);
        h(dsbiVar, strG);
    }

    @Override // defpackage.dsbr
    public final void f(dsbi dsbiVar, Throwable th, Object... objArr) {
        String strG = g("getPackageInfo(%s) failed", objArr);
        eksl ekslVar = (eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logWarning", 77, "PromoEvalLoggerImpl.java");
        etht ethtVar = ((dsbc) dsbiVar).a.c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ekslVar.w("Promo ID [%s]: %s", ethtVar.b, strG);
        h(dsbiVar, strG);
    }
}
