package androidx.car.app.utils;

import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.a;
import defpackage.cll;
import defpackage.clr;
import defpackage.cma;
import defpackage.cqy;
import defpackage.crq;
import defpackage.crr;
import defpackage.csa;
import defpackage.csb;
import defpackage.lvc;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RemoteUtils {

    /* compiled from: PG */
    /* renamed from: androidx.car.app.utils.RemoteUtils$1, reason: invalid class name */
    public class AnonymousClass1 extends IOnDoneCallback.Stub {
        final /* synthetic */ clr val$callback;

        public AnonymousClass1(clr clrVar) {
            this.val$callback = clrVar;
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onFailure(cqy cqyVar) {
            this.val$callback.a();
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onSuccess(cqy cqyVar) {
            this.val$callback.b();
        }
    }

    /* compiled from: PG */
    public static class SurfaceCallbackStub extends ISurfaceCallback.Stub {
        private final lvc mLifecycle;
        private cma mSurfaceCallback;

        SurfaceCallbackStub(lvc lvcVar, cma cmaVar) {
            this.mLifecycle = lvcVar;
            this.mSurfaceCallback = cmaVar;
            lvcVar.c(new csa(this));
        }

        /* renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m236xa15b6dc7(float f, float f2) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.a();
            return null;
        }

        /* renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m237xdfc586b5(float f, float f2) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.b();
            return null;
        }

        /* renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m238x6ea0bd66(float f, float f2, float f3) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.c();
            return null;
        }

        /* renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m239x3d2f790d(float f, float f2) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.d();
            return null;
        }

        /* renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m240x93973048(Rect rect) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.e();
            return null;
        }

        /* renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m241x37c861a2(cqy cqyVar) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.f();
            return null;
        }

        /* renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m242xde96e8ef(cqy cqyVar) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.g();
            return null;
        }

        /* renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m243xaf1354a8(Rect rect) {
            cma cmaVar = this.mSurfaceCallback;
            if (cmaVar == null) {
                return null;
            }
            cmaVar.h();
            return null;
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onClick(final float f, final float f2) {
            RemoteUtils.c(this.mLifecycle, "onClick", new crq() { // from class: crt
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m236xa15b6dc7(f, f2);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onFling(final float f, final float f2) {
            RemoteUtils.c(this.mLifecycle, "onFling", new crq() { // from class: crx
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m237xdfc586b5(f, f2);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScale(final float f, final float f2, final float f3) {
            RemoteUtils.c(this.mLifecycle, "onScale", new crq() { // from class: cry
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m238x6ea0bd66(f, f2, f3);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onScroll(final float f, final float f2) {
            RemoteUtils.c(this.mLifecycle, "onScroll", new crq() { // from class: crw
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m239x3d2f790d(f, f2);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onStableAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new crq() { // from class: crz
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m240x93973048(rect);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceAvailable(final cqy cqyVar, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new crq() { // from class: crv
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m241x37c861a2(cqyVar);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onSurfaceDestroyed(final cqy cqyVar, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new crq() { // from class: crs
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m242xde96e8ef(cqyVar);
                }
            });
        }

        @Override // androidx.car.app.ISurfaceCallback
        public void onVisibleAreaChanged(final Rect rect, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.d(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new crq() { // from class: cru
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m243xaf1354a8(rect);
                }
            });
        }
    }

    public static Object a(String str, crr crrVar) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", a.a(str, "Dispatching call ", " to host"));
            }
            return crrVar.a();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new cll(a.a(str, "Remote ", " call failed"), e2);
        }
    }

    public static void b(final IOnDoneCallback iOnDoneCallback, final String str, final crq crqVar) {
        csb.b(new Runnable() { // from class: cro
            @Override // java.lang.Runnable
            public final void run() {
                IOnDoneCallback iOnDoneCallback2 = iOnDoneCallback;
                String str2 = str;
                try {
                    RemoteUtils.g(iOnDoneCallback2, str2, crqVar.a());
                } catch (cre e) {
                    RemoteUtils.f(iOnDoneCallback2, str2, e);
                } catch (RuntimeException e2) {
                    RemoteUtils.f(iOnDoneCallback2, str2, e2);
                    throw new RuntimeException(e2);
                }
            }
        });
    }

    public static void c(final lvc lvcVar, final String str, final crq crqVar) {
        csb.b(new Runnable() { // from class: crl
            @Override // java.lang.Runnable
            public final void run() {
                lvc lvcVar2 = lvcVar;
                crq crqVar2 = crqVar;
                if (lvcVar2 != null) {
                    try {
                        if (lvcVar2.a().a(lvb.c)) {
                            crqVar2.a();
                            return;
                        }
                    } catch (cre e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", a.l(crqVar2, "Lifecycle is not at least created when dispatching "));
            }
        });
    }

    public static void d(final lvc lvcVar, final IOnDoneCallback iOnDoneCallback, final String str, final crq crqVar) {
        csb.b(new Runnable() { // from class: crp
            @Override // java.lang.Runnable
            public final void run() {
                IOnDoneCallback iOnDoneCallback2 = iOnDoneCallback;
                String str2 = str;
                lvc lvcVar2 = lvcVar;
                crq crqVar2 = crqVar;
                if (lvcVar2 != null && lvcVar2.a().a(lvb.c)) {
                    RemoteUtils.b(iOnDoneCallback2, str2, crqVar2);
                } else {
                    Objects.toString(crqVar2);
                    RemoteUtils.f(iOnDoneCallback2, str2, new IllegalStateException("Lifecycle is not at least created when dispatching ".concat(crqVar2.toString())));
                }
            }
        });
    }

    public static void e(String str, crr crrVar) {
        try {
            a(str, crrVar);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void f(final IOnDoneCallback iOnDoneCallback, final String str, final Throwable th) {
        e(str.concat(" onFailure"), new crr() { // from class: crn
            @Override // defpackage.crr
            public final Object a() {
                try {
                    iOnDoneCallback.onFailure(new cqy(new FailureResponse(th)));
                    return null;
                } catch (cre e) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e);
                    return null;
                }
            }
        });
    }

    public static void g(final IOnDoneCallback iOnDoneCallback, final String str, final Object obj) {
        e(str.concat(" onSuccess"), new crr() { // from class: crm
            @Override // defpackage.crr
            public final Object a() {
                cqy cqyVar;
                IOnDoneCallback iOnDoneCallback2 = iOnDoneCallback;
                Object obj2 = obj;
                if (obj2 == null) {
                    cqyVar = null;
                } else {
                    try {
                        cqyVar = new cqy(obj2);
                    } catch (cre e) {
                        RemoteUtils.f(iOnDoneCallback2, str, e);
                    }
                }
                iOnDoneCallback2.onSuccess(cqyVar);
                return null;
            }
        });
    }
}
