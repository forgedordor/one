package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byaq implements byap {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final Random e;

    public byaq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Random random) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        random.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = random;
    }

    private final boolean g() {
        Object objE = ccze.F.e();
        objE.getClass();
        return this.e.nextDouble() <= Math.min(1.0d, Math.max(0.0d, ((Number) objE).doubleValue()));
    }

    private final void h(int i, int i2, int i3, int i4, int i5) {
        elml elmlVar = (elml) elmm.a.createBuilder();
        int i6 = i2 != 1 ? i2 != 2 ? 4 : 3 : 2;
        elmlVar.copyOnWrite();
        elmm elmmVar = (elmm) elmlVar.instance;
        elmmVar.c = i6 - 1;
        elmmVar.b |= 1;
        elmlVar.copyOnWrite();
        elmm elmmVar2 = (elmm) elmlVar.instance;
        elmmVar2.d = i4 - 1;
        elmmVar2.b |= 2;
        elmlVar.copyOnWrite();
        elmm elmmVar3 = (elmm) elmlVar.instance;
        elmmVar3.e = i - 1;
        elmmVar3.b |= 4;
        elmlVar.copyOnWrite();
        elmm elmmVar4 = (elmm) elmlVar.instance;
        elmmVar4.b |= 8;
        elmmVar4.f = i3;
        cczi ccziVar = byao.a;
        if (((Boolean) byao.a.e()).booleanValue()) {
            return;
        }
        if (((aqdi) this.c.b()).a()) {
            elmlVar.copyOnWrite();
            elmm elmmVar5 = (elmm) elmlVar.instance;
            elmmVar5.g = i5 - 1;
            elmmVar5.b |= 16;
        }
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        elmm elmmVar6 = (elmm) elmlVar.build();
        elmmVar6.getClass();
        ellhVar.G = elmmVar6;
        ellhVar.b |= 1073741824;
        ellf ellfVar = ellf.BUGLE_INDEXING;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.j = ellfVar.f11do;
        ellhVar2.b |= 1;
        aillVar.k(ellgVar, emxt.BUGLE_INDEXING);
    }

    private final void i(int i, int i2, String str) {
        cczi ccziVar = byao.a;
        if (((Boolean) byao.b.e()).booleanValue()) {
            return;
        }
        elme elmeVar = (elme) elmh.a.createBuilder();
        elmeVar.copyOnWrite();
        elmh elmhVar = (elmh) elmeVar.instance;
        elmhVar.f = 1;
        elmhVar.b |= 16;
        elmeVar.copyOnWrite();
        elmh elmhVar2 = (elmh) elmeVar.instance;
        elmhVar2.c = i - 1;
        elmhVar2.b |= 1;
        elmeVar.copyOnWrite();
        elmh elmhVar3 = (elmh) elmeVar.instance;
        int i3 = 2;
        elmhVar3.b |= 2;
        elmhVar3.d = i2;
        byan.a.intValue();
        if (i2 != 8) {
            i3 = 1;
        } else if (!str.contains("TransactionTooLargeException")) {
            i3 = str.contains("Connection timed out") ? 3 : str.contains("API failed to connect while resuming") ? 4 : str.contains("Not authorized to read requested corpora") ? 5 : str.contains("Found no matching corpora for package") ? 9 : str.contains("DeadObjectException") ? 6 : str.contains("RemoteException") ? 7 : 8;
        }
        elmeVar.copyOnWrite();
        elmh elmhVar4 = (elmh) elmeVar.instance;
        elmhVar4.e = i3 - 1;
        elmhVar4.b = 8 | elmhVar4.b;
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        elmh elmhVar5 = (elmh) elmeVar.build();
        elmhVar5.getClass();
        ellhVar.K = elmhVar5;
        ellhVar.c |= 128;
        ellf ellfVar = ellf.BUGLE_ICING_SEARCH;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.j = ellfVar.f11do;
        ellhVar2.b |= 1;
        aillVar.k(ellgVar, emxt.BUGLE_ICING_SEARCH);
    }

    @Override // defpackage.byap
    public final void a(String str, int i, int i2, int i3) {
        if (g()) {
            h(3, i, i3, i2, 3);
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSearch");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(bxze.k, str);
            ekrdVar.X(bxze.h, Integer.valueOf(i));
            ekrdVar.X(bxze.i, String.valueOf(i2 - 1));
            ekrdVar.X(bxze.j, "Failure");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logAppSearchIndexingFailure", 207, "IcingClearcutLoggerImpl.kt")).q("AppSearch indexing call is done.");
        }
    }

    @Override // defpackage.byap
    public final void b(String str, int i, int i2, int i3) {
        if (g()) {
            h(2, i, i3, i2, 3);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSearch");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(bxze.k, str);
            ekrdVar.X(bxze.h, Integer.valueOf(i));
            ekrdVar.X(bxze.i, String.valueOf(i2 - 1));
            ekrdVar.X(bxze.j, "Success");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logAppSearchIndexingSuccess", 182, "IcingClearcutLoggerImpl.kt")).q("AppSearch indexing call is done.");
        }
    }

    @Override // defpackage.byap
    public final void c(String str, int i, int i2, Exception exc) {
        str.getClass();
        exc.getClass();
        if (g()) {
            h(3, i, exc instanceof dcff ? ((dcff) exc).a() : 13, i2, 2);
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleSearch");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(exc);
            ekrdVar.X(bxze.k, str);
            ekrdVar.X(bxze.h, Integer.valueOf(i));
            ekrdVar.X(bxze.i, String.valueOf(i2 - 1));
            ekrdVar.X(bxze.j, "Failure");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logIcingIndexingFailure", 107, "IcingClearcutLoggerImpl.kt")).q("Icing indexing call is done.");
        }
    }

    @Override // defpackage.byap
    public final void d(String str, int i, int i2) {
        str.getClass();
        if (g()) {
            h(2, i, 0, i2, 2);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSearch");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(bxze.k, str);
            ekrdVar.X(bxze.h, Integer.valueOf(i));
            ekrdVar.X(bxze.i, String.valueOf(i2 - 1));
            ekrdVar.X(bxze.j, "Success");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logIcingIndexingSuccess", 79, "IcingClearcutLoggerImpl.kt")).q("Icing indexing call is done.");
        }
    }

    @Override // defpackage.byap
    public final void e(Exception exc) {
        if (exc == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSearch");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logIcingQueryFailure", 122, "IcingClearcutLoggerImpl.kt")).q("Icing query failed without exception.");
        } else {
            int iA = exc instanceof dcff ? ((dcff) exc).a() : 13;
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            i(3, iA, message);
        }
    }

    @Override // defpackage.byap
    public final void f() {
        i(2, Status.a.g, "Success");
    }
}
