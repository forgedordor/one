package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpt implements abpm, cqto {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/dittosatellite/jsbridge/ReportSettledHandler");
    private static final cqce d = cqce.g("Bugle", "ReportSettledHandler");
    public final fcsu a;
    public final cqtq b;
    private final Optional e;
    private final eosc f;
    private final fcsu g;
    private final abru h;

    public abpt(Optional optional, abru abruVar, eosc eoscVar, cqtp cqtpVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = optional;
        this.h = abruVar;
        this.f = eoscVar;
        this.a = fcsuVar;
        this.g = fcsuVar2;
        this.b = cqtpVar.a(this);
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        cqce cqceVar = d;
        cqceVar.p("Received ReportSettledRequest from Ditto");
        eieu eieuVarK = eiiy.k("Received ReportSettledRequest Callback");
        try {
            this.b.b(null, eieuVarK);
            eieuVarK.close();
            String str = eppiVar.d;
            eppjVar.copyOnWrite();
            eppl epplVar = (eppl) eppjVar.instance;
            eppl epplVar2 = eppl.a;
            str.getClass();
            epplVar.d = str;
            exmt exmtVar = exmt.OK;
            eppjVar.copyOnWrite();
            ((eppl) eppjVar.instance).e = exmtVar.a();
            evrl evrlVar = evrl.a;
            eppjVar.copyOnWrite();
            eppl epplVar3 = (eppl) eppjVar.instance;
            evrlVar.getClass();
            epplVar3.c = evrlVar;
            epplVar3.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            final eppl epplVarBuild = eppjVar.build();
            Optional optional = this.e;
            if (!optional.isPresent()) {
                return eijx.e(epplVarBuild);
            }
            if ((eppiVar.b == 101 ? (eppf) eppiVar.c : eppf.a).e) {
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "DittoSatellite");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/dittosatellite/jsbridge/ReportSettledHandler", "handleRequest", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ReportSettledHandler.java")).q("Ditto is in Offline Mode");
                ((ains) this.g.b()).c("Bugle.Satellite.OfflineMode.ReportSettled.Count");
                return eijx.e(epplVarBuild);
            }
            String str2 = (eppiVar.b == 101 ? (eppf) eppiVar.c : eppf.a).d;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.A("New sourceId", str2);
            cqbdVarA.r();
            if (true == TextUtils.isEmpty(str2)) {
                str2 = "empty_source_id";
            }
            boolean z = (eppiVar.b == 101 ? (eppf) eppiVar.c : eppf.a).b;
            if (!z) {
                this.h.b();
            }
            abfv abfvVar = (abfv) optional.get();
            char c2 = 3;
            ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
            listenableFutureArr[0] = abfvVar.k(str2);
            listenableFutureArr[1] = abfvVar.g(Boolean.valueOf(z));
            int i = (eppiVar.b == 101 ? (eppf) eppiVar.c : eppf.a).c;
            if (i == 0) {
                c2 = 2;
            } else if (i != 1) {
                c2 = i != 2 ? i != 3 ? (char) 0 : (char) 5 : (char) 4;
            }
            listenableFutureArr[2] = optional.isEmpty() ? eijx.e(null) : (z && (c2 != 0 ? c2 : (char) 1) == 5) ? ((abfv) optional.get()).i(abft.PAIRED) : ((abfv) optional.get()).i(abft.NOT_PAIRED);
            return eijx.m(listenableFutureArr).a(new Callable() { // from class: abps
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((abdl) this.a.a.b()).m();
                    return epplVarBuild;
                }
            }, this.f);
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fJ() {
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fK() {
    }
}
