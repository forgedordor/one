package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddos extends dcfm implements ddnn {
    static final dcfd a;
    public static final dcfe b;

    static {
        dcfd dcfdVar = new dcfd();
        a = dcfdVar;
        b = new dcfe("LocationServices.API", new ddoq(), dcfdVar);
    }

    public ddos(Context context) {
        super(context, b, dcfa.q, dcfl.a);
    }

    @Override // defpackage.ddnn
    public final defn a(final CurrentLocationRequest currentLocationRequest, final deem deemVar) {
        if (deemVar != null) {
            dclh.b(!((deeo) deemVar).a.l(), "cancellationToken may not be already canceled");
        }
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddon
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                final ddpm ddpmVar = (ddpm) obj;
                dcfe dcfeVar = ddos.b;
                Feature feature = ddnm.j;
                boolean zN = ddpmVar.N(feature);
                deem deemVar2 = deemVar;
                CurrentLocationRequest currentLocationRequest2 = currentLocationRequest;
                if (zN) {
                    final ICancelToken currentLocationWithCallback = ((IGoogleLocationManagerService) ddpmVar.w()).getCurrentLocationWithCallback(currentLocationRequest2, new LocationReceiver(4, null, new ddpb((defr) obj2), null, null));
                    if (deemVar2 != null) {
                        deemVar2.a(new defk() { // from class: ddot
                            @Override // defpackage.defk
                            public final void a() {
                                try {
                                    currentLocationWithCallback.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (ddpmVar.N(ddnm.e)) {
                    final ICancelToken currentLocation = ((IGoogleLocationManagerService) ddpmVar.w()).getCurrentLocation(currentLocationRequest2, new ddpb((defr) obj2));
                    if (deemVar2 != null) {
                        deemVar2.a(new defk() { // from class: ddou
                            @Override // defpackage.defk
                            public final void a() {
                                try {
                                    currentLocation.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                final defr defrVar = (defr) obj2;
                dcib dcibVarC = dcic.c(new ddoy(ddpmVar, defrVar), eoqg.a, "GetCurrentLocation");
                final dchz dchzVar = dcibVarC.b;
                dchzVar.getClass();
                ddoz ddozVar = new ddoz(dcibVarC, defrVar);
                defr defrVar2 = new defr();
                ddnv ddnvVar = new ddnv(currentLocationRequest2.c, 0L);
                ddnvVar.e(0L);
                ddnvVar.b(currentLocationRequest2.d);
                ddnvVar.c(currentLocationRequest2.b);
                ddnvVar.d(currentLocationRequest2.a);
                ddnvVar.b = currentLocationRequest2.e;
                ddnvVar.g(currentLocationRequest2.f);
                boolean z = true;
                ddnvVar.a = true;
                ddnvVar.c = currentLocationRequest2.g;
                LocationRequest locationRequestA = ddnvVar.a();
                dchz dchzVar2 = ddozVar.a.b;
                dchzVar2.getClass();
                boolean zN2 = ddpmVar.N(feature);
                cvw cvwVar = ddpmVar.v;
                synchronized (cvwVar) {
                    ddpi ddpiVar = (ddpi) cvwVar.get(dchzVar2);
                    if (ddpiVar == null) {
                        z = zN2;
                    } else if (!zN2) {
                        throw new IllegalStateException();
                    }
                    ddpi ddpiVar2 = new ddpi(ddozVar);
                    cvwVar.put(dchzVar2, ddpiVar2);
                    if (z) {
                        ((IGoogleLocationManagerService) ddpmVar.w()).registerLocationClient(LocationReceiver.a(ddpiVar, ddpiVar2, dchzVar2.a()), locationRequestA, new ddpa(null, defrVar2));
                    } else {
                        ((IGoogleLocationManagerService) ddpmVar.w()).updateLocationRequest(new LocationRequestUpdateData(1, new LocationRequestInternal(locationRequestA, null, false, false, false, false, Long.MAX_VALUE), null, ddpiVar2, null, new ddox(defrVar2, ddpiVar2), dchzVar2.a()));
                    }
                }
                defrVar2.a.s(new defb() { // from class: ddov
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        if (defnVar.m()) {
                            return;
                        }
                        defr defrVar3 = defrVar;
                        Exception excH = defnVar.h();
                        excH.getClass();
                        defrVar3.c(excH);
                    }
                });
                if (deemVar2 != null) {
                    deemVar2.a(new defk() { // from class: ddow
                        @Override // defpackage.defk
                        public final void a() {
                            try {
                                ddpmVar.M(dchzVar, true, new defr());
                            } catch (RemoteException unused) {
                            }
                        }
                    });
                }
            }
        };
        dcizVar.c = 2415;
        defn defnVarJ = j(dcizVar.a());
        if (deemVar == null) {
            return defnVarJ;
        }
        final defr defrVar = new defr(deemVar);
        defnVarJ.b(new deeq() { // from class: ddoo
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                dcfe dcfeVar = ddos.b;
                defr defrVar2 = defrVar;
                if (defnVar.m()) {
                    defrVar2.d((Location) defnVar.i());
                    return null;
                }
                Exception excH = defnVar.h();
                excH.getClass();
                defrVar2.c(excH);
                return null;
            }
        });
        return defrVar.a;
    }

    @Override // defpackage.ddnn
    public final defn b(LocationRequest locationRequest, Executor executor, ddnu ddnuVar) {
        return e(locationRequest, dcic.c(ddnuVar, executor, "ddnu"));
    }

    @Override // defpackage.ddnn
    public final defn c(int i) {
        ddnh ddnhVar = new ddnh();
        ddnhVar.c(i);
        return a(ddnhVar.a(), (deem) null);
    }

    @Override // defpackage.ddnn
    public final void d(ddnu ddnuVar) {
        l(dcic.a(ddnuVar, "ddnu"), 2418).c(new Executor() { // from class: ddop
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new deeq() { // from class: ddom
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                dcfe dcfeVar = ddos.b;
                return null;
            }
        });
    }

    public final defn e(final LocationRequest locationRequest, dcib dcibVar) {
        final ddor ddorVar = new ddor(this, dcibVar);
        dcir dcirVar = new dcir() { // from class: ddol
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ddpl ddplVar;
                ddpm ddpmVar = (ddpm) obj;
                dcfe dcfeVar = ddos.b;
                ddor ddorVar2 = ddorVar;
                dcib dcibVarB = ddorVar2.b();
                dchz dchzVar = dcibVarB.b;
                dchzVar.getClass();
                boolean zN = ddpmVar.N(ddnm.j);
                cvw cvwVar = ddpmVar.a;
                synchronized (cvwVar) {
                    ddpl ddplVar2 = (ddpl) cvwVar.get(dchzVar);
                    if (ddplVar2 == null || zN) {
                        ddpl ddplVar3 = new ddpl(ddorVar2);
                        cvwVar.put(dchzVar, ddplVar3);
                        ddplVar = ddplVar3;
                    } else {
                        ddplVar2.a.c(dcibVarB);
                        ddplVar = ddplVar2;
                        ddplVar2 = null;
                    }
                    LocationRequest locationRequest2 = locationRequest;
                    if (zN) {
                        ((IGoogleLocationManagerService) ddpmVar.w()).registerLocationClient(LocationReceiver.b(ddplVar2, ddplVar, dchzVar.a()), locationRequest2, new ddpa(null, (defr) obj2));
                    } else {
                        ((IGoogleLocationManagerService) ddpmVar.w()).updateLocationRequest(new LocationRequestUpdateData(1, new LocationRequestInternal(locationRequest2, null, false, false, false, false, Long.MAX_VALUE), ddplVar, null, null, new ddpd((defr) obj2, ddplVar), dchzVar.a()));
                    }
                }
            }
        };
        dcip dcipVar = new dcip();
        dcipVar.a = dcirVar;
        dcipVar.b = ddorVar;
        dcipVar.c = dcibVar;
        dcipVar.e = 2435;
        return k(dcipVar.a());
    }
}
