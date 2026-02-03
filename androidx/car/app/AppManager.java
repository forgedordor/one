package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.IAppManager;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.RemoteUtils;
import defpackage.ckd;
import defpackage.clg;
import defpackage.clh;
import defpackage.clk;
import defpackage.clw;
import defpackage.cmo;
import defpackage.crq;
import defpackage.lvc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppManager implements cmo {
    public final clg a;
    public final IAppManager.Stub b;
    public final clk c;
    public final lvc d;
    final HandlerThread e = new HandlerThread("LocationUpdateThread");
    public final ckd f = new LocationListener() { // from class: ckd
        @Override // android.location.LocationListener
        public final void onLocationChanged(final Location location) {
            this.a.c.b("sendLocation", new clh() { // from class: ckc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.clh
                public final void a(Object obj) {
                    obj.sendLocation(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* compiled from: PG */
    /* renamed from: androidx.car.app.AppManager$1, reason: invalid class name */
    public class AnonymousClass1 extends IAppManager.Stub {
        final /* synthetic */ clg val$carContext;

        public AnonymousClass1(clg clgVar) {
            this.val$carContext = clgVar;
        }

        public static /* synthetic */ Object lambda$onBackPressed$0(clg clgVar) {
            clgVar.a.d();
            return null;
        }

        public static /* synthetic */ Object lambda$startLocationUpdates$1(clg clgVar) {
            AppManager appManager = (AppManager) clgVar.a(AppManager.class);
            appManager.b();
            ((LocationManager) appManager.a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, appManager.f, appManager.e.getLooper());
            return null;
        }

        public static /* synthetic */ Object lambda$stopLocationUpdates$2(clg clgVar) {
            ((AppManager) clgVar.a(AppManager.class)).b();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            final clw clwVar = (clw) this.val$carContext.a(clw.class);
            clwVar.getClass();
            RemoteUtils.d(AppManager.this.d, iOnDoneCallback, "getTemplate", new crq() { // from class: ckf
                @Override // defpackage.crq
                public final Object a() {
                    TemplateWrapper templateWrapper;
                    csb.a();
                    clw clwVar2 = clwVar;
                    clu cluVarA = clwVar2.a();
                    if (Log.isLoggable("CarApp", 3)) {
                        Objects.toString(cluVarA);
                        Log.d("CarApp", "Requesting template from Screen ".concat(cluVarA.toString()));
                    }
                    cpp cppVarA = cluVarA.a();
                    TemplateWrapper templateWrapperWrap = (!cluVarA.c || (templateWrapper = cluVarA.b) == null) ? TemplateWrapper.wrap(cppVarA) : TemplateWrapper.wrap(cppVarA, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
                    cluVarA.c = false;
                    cluVarA.b = templateWrapperWrap;
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", a.i(cluVarA, cppVarA, "Returning ", " from screen "));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (clu cluVar : clwVar2.a) {
                        if (cluVar.b == null) {
                            cluVar.b = TemplateWrapper.wrap(cluVar.a());
                        }
                        arrayList.add(new TemplateInfo(cluVar.b.getTemplate().getClass(), cluVar.b.getId()));
                    }
                    templateWrapperWrap.setTemplateInfosForScreenStack(arrayList);
                    return templateWrapperWrap;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            final clg clgVar = this.val$carContext;
            RemoteUtils.d(AppManager.this.d, iOnDoneCallback, "onBackPressed", new crq() { // from class: cke
                @Override // defpackage.crq
                public final Object a() {
                    AppManager.AnonymousClass1.lambda$onBackPressed$0(clgVar);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            clg clgVar = this.val$carContext;
            PackageManager packageManager = clgVar.getPackageManager();
            int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", clgVar.getPackageName());
            int iCheckPermission2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName());
            if (iCheckPermission == -1 && iCheckPermission2 == -1) {
                RemoteUtils.f(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
            }
            AppManager appManager = AppManager.this;
            final clg clgVar2 = this.val$carContext;
            RemoteUtils.d(appManager.d, iOnDoneCallback, "startLocationUpdates", new crq() { // from class: ckh
                @Override // defpackage.crq
                public final Object a() {
                    AppManager.AnonymousClass1.lambda$startLocationUpdates$1(clgVar2);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            final clg clgVar = this.val$carContext;
            RemoteUtils.d(AppManager.this.d, iOnDoneCallback, "stopLocationUpdates", new crq() { // from class: ckg
                @Override // defpackage.crq
                public final Object a() {
                    AppManager.AnonymousClass1.lambda$stopLocationUpdates$2(clgVar);
                    return null;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ckd] */
    public AppManager(clg clgVar, clk clkVar, lvc lvcVar) {
        this.a = clgVar;
        this.c = clkVar;
        this.d = lvcVar;
        this.b = new AnonymousClass1(clgVar);
    }

    public final void a() {
        this.c.b("invalidate", new clh() { // from class: ckb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.clh
            public final void a(Object obj) {
                obj.invalidate();
            }
        });
    }

    final void b() {
        ((LocationManager) this.a.getSystemService("location")).removeUpdates(this.f);
    }
}
