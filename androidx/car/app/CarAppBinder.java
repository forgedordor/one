package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import androidx.car.app.ICarApp;
import androidx.car.app.utils.RemoteUtils;
import defpackage.a;
import defpackage.cku;
import defpackage.clg;
import defpackage.clk;
import defpackage.clu;
import defpackage.clw;
import defpackage.cly;
import defpackage.crq;
import defpackage.csb;
import defpackage.csd;
import defpackage.cse;
import defpackage.lva;
import defpackage.lvb;
import defpackage.lvc;
import defpackage.lvn;
import java.util.Deque;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CarAppBinder extends ICarApp.Stub {
    private cly mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private csd mHostValidator;
    private cku mService;

    public CarAppBinder(cku ckuVar, SessionInfo sessionInfo) {
        this.mService = ckuVar;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private lvc getCurrentLifecycle() {
        cly clyVar = this.mCurrentSession;
        if (clyVar == null) {
            return null;
        }
        return clyVar.a;
    }

    private csd getHostValidator() {
        if (this.mHostValidator == null) {
            cku ckuVar = this.mService;
            ckuVar.getClass();
            this.mHostValidator = ckuVar.b();
        }
        return this.mHostValidator;
    }

    private void onConfigurationChangedInternal(cly clyVar, Configuration configuration) {
        csb.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
            Log.d("CarApp", "onCarConfigurationChanged configuration: ".concat(String.valueOf(configuration)));
        }
        clg clgVar = clyVar.b;
        clgVar.c(configuration);
        clgVar.getResources().getConfiguration();
    }

    private void onNewIntentInternal(cly clyVar, Intent intent) {
        csb.a();
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            cku ckuVar = this.mService;
            ckuVar.getClass();
            RemoteUtils.g(iOnDoneCallback, "getAppInfo", ckuVar.fj());
        } catch (IllegalArgumentException e) {
            RemoteUtils.f(iOnDoneCallback, "getAppInfo", e);
        }
    }

    cku getCarAppService() {
        return this.mService;
    }

    cly getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        csb.b(new Runnable() { // from class: ckn
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m212lambda$getManager$7$androidxcarappCarAppBinder(str, iOnDoneCallback);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m212lambda$getManager$7$androidxcarappCarAppBinder(java.lang.String r5, androidx.car.app.IOnDoneCallback r6) {
        /*
            r4 = this;
            cly r0 = r4.mCurrentSession
            r0.getClass()
            int r1 = r5.hashCode()
            r2 = 96801(0x17a21, float:1.35647E-40)
            r3 = 1
            if (r1 == r2) goto L1f
            r2 = 1862666772(0x6f060a14, float:4.1483175E28)
            if (r1 == r2) goto L15
            goto L29
        L15:
            java.lang.String r1 = "navigation"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L29
            r1 = r3
            goto L2a
        L1f:
            java.lang.String r1 = "app"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L29
            r1 = 0
            goto L2a
        L29:
            r1 = -1
        L2a:
            java.lang.String r2 = "getManager"
            if (r1 == 0) goto L64
            if (r1 == r3) goto L52
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "CarApp"
            java.lang.String r3 = "%s is not a valid manager"
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.e(r1, r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException
            java.lang.String r1 = " is not a valid manager type"
            java.lang.String r5 = r5.concat(r1)
            r0.<init>(r5)
            androidx.car.app.utils.RemoteUtils.f(r6, r2, r0)
            return
        L52:
            clg r5 = r0.a()
            java.lang.Class<androidx.car.app.navigation.NavigationManager> r0 = androidx.car.app.navigation.NavigationManager.class
            java.lang.Object r5 = r5.a(r0)
            androidx.car.app.navigation.NavigationManager r5 = (androidx.car.app.navigation.NavigationManager) r5
            androidx.car.app.navigation.INavigationManager$Stub r5 = r5.a
            androidx.car.app.utils.RemoteUtils.g(r6, r2, r5)
            return
        L64:
            clg r5 = r0.a()
            java.lang.Class<androidx.car.app.AppManager> r0 = androidx.car.app.AppManager.class
            java.lang.Object r5 = r5.a(r0)
            androidx.car.app.AppManager r5 = (androidx.car.app.AppManager) r5
            androidx.car.app.IAppManager$Stub r5 = r5.b
            androidx.car.app.utils.RemoteUtils.g(r6, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.CarAppBinder.m212lambda$getManager$7$androidxcarappCarAppBinder(java.lang.String, androidx.car.app.IOnDoneCallback):void");
    }

    /* renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m213lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) {
        cku ckuVar = this.mService;
        ckuVar.getClass();
        cly clyVarFi = this.mCurrentSession;
        if (clyVarFi == null || clyVarFi.a.c == lvb.a) {
            this.mCurrentSessionInfo.getClass();
            clyVarFi = ckuVar.fi();
            this.mCurrentSession = clyVarFi;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        handshakeInfo.getClass();
        ckuVar.b.getClass();
        clg clgVar = clyVarFi.b;
        clgVar.c = handshakeInfo.getHostCarAppApiLevel();
        clgVar.b(ckuVar, configuration);
        csb.a();
        clk clkVar = clgVar.b;
        iCarHost.getClass();
        csb.a();
        clkVar.a();
        clkVar.a = iCarHost;
        lvn lvnVar = clyVarFi.a;
        lvb lvbVar = lvnVar.c;
        int size = ((clw) clyVarFi.a().a(clw.class)).a.size();
        if (lvbVar.a(lvb.c) && size > 0) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "onAppCreate the app was already created");
            }
            onNewIntentInternal(clyVarFi, intent);
            return null;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate the app was not yet created or the screen stack was empty state: " + lvnVar.c + ", stack size: " + size);
        }
        clyVarFi.b(lva.ON_CREATE);
        clw clwVar = (clw) clyVarFi.a().a(clw.class);
        clu cluVarC = clyVarFi.c();
        csb.a();
        lvn lvnVar2 = (lvn) clwVar.c;
        lvb lvbVar2 = lvnVar2.c;
        lvb lvbVar3 = lvb.a;
        if (lvbVar2.equals(lvbVar3)) {
            if (!Log.isLoggable("CarApp", 3)) {
                return null;
            }
            Log.d("CarApp", "Pushing screens after the DESTROYED state is a no-op");
            return null;
        }
        if (cluVarC.a.c.equals(lvbVar3)) {
            throw new IllegalStateException(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", cluVarC));
        }
        cluVarC.getClass();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", a.h(cluVarC, "Pushing screen ", " to the top of the screen stack"));
        }
        Deque deque = clwVar.a;
        if (!deque.contains(cluVarC)) {
            clu cluVar = (clu) deque.peek();
            clwVar.b(cluVarC, true);
            if (!deque.contains(cluVarC)) {
                return null;
            }
            if (cluVar != null) {
                clw.c(cluVar, false);
            }
            if (!lvnVar2.c.a(lvb.e)) {
                return null;
            }
            cluVarC.b(lva.ON_RESUME);
            return null;
        }
        clu cluVar2 = (clu) deque.peek();
        if (cluVar2 == null || cluVar2 == cluVarC) {
            return null;
        }
        deque.remove(cluVarC);
        clwVar.b(cluVarC, false);
        clw.c(cluVar2, false);
        if (!lvnVar2.c.a(lvb.e)) {
            return null;
        }
        cluVarC.b(lva.ON_RESUME);
        return null;
    }

    /* renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m214lambda$onAppPause$3$androidxcarappCarAppBinder() {
        cly clyVar = this.mCurrentSession;
        clyVar.getClass();
        clyVar.b(lva.ON_PAUSE);
        return null;
    }

    /* renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m215lambda$onAppResume$2$androidxcarappCarAppBinder() {
        cly clyVar = this.mCurrentSession;
        clyVar.getClass();
        clyVar.b(lva.ON_RESUME);
        return null;
    }

    /* renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m216lambda$onAppStart$1$androidxcarappCarAppBinder() {
        cly clyVar = this.mCurrentSession;
        clyVar.getClass();
        clyVar.b(lva.ON_START);
        return null;
    }

    /* renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m217lambda$onAppStop$4$androidxcarappCarAppBinder() {
        cly clyVar = this.mCurrentSession;
        clyVar.getClass();
        clyVar.b(lva.ON_STOP);
        return null;
    }

    /* renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m218lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) {
        cly clyVar = this.mCurrentSession;
        clyVar.getClass();
        onConfigurationChangedInternal(clyVar, configuration);
        return null;
    }

    /* renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m219lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) {
        cly clyVar = this.mCurrentSession;
        clyVar.getClass();
        onNewIntentInternal(clyVar, intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
            Log.d("CarApp", "onAppCreate intent: ".concat(String.valueOf(intent)));
        }
        RemoteUtils.b(iOnDoneCallback, "onAppCreate", new crq() { // from class: ckm
            @Override // defpackage.crq
            public final Object a() {
                this.a.m213lambda$onAppCreate$0$androidxcarappCarAppBinder(iCarHost, configuration, intent);
                return null;
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new crq() { // from class: ckj
            @Override // defpackage.crq
            public final Object a() {
                this.a.m214lambda$onAppPause$3$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new crq() { // from class: ckp
            @Override // defpackage.crq
            public final Object a() {
                this.a.m215lambda$onAppResume$2$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new crq() { // from class: ckk
            @Override // defpackage.crq
            public final Object a() {
                this.a.m216lambda$onAppStart$1$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new crq() { // from class: ckl
            @Override // defpackage.crq
            public final Object a() {
                this.a.m217lambda$onAppStop$4$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    public void onAutoDriveEnabled() {
        cly clyVar = this.mCurrentSession;
        if (clyVar != null) {
            csb.a();
            if (Log.isLoggable("CarApp.Nav", 3)) {
                Log.d("CarApp.Nav", "Executing onAutoDriveEnabled");
            }
            Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new crq() { // from class: cki
            @Override // defpackage.crq
            public final Object a() {
                this.a.m218lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(configuration);
                return null;
            }
        });
    }

    public void onDestroyLifecycle() {
        cly clyVar = this.mCurrentSession;
        if (clyVar != null) {
            clyVar.b(lva.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TRY_LEAVE, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e A[PHI: r0
      0x012e: PHI (r0v40 boolean) = (r0v20 boolean), (r0v21 boolean) binds: [B:74:0x012c, B:133:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154 A[Catch: IllegalArgumentException -> 0x023a, cre | IllegalArgumentException -> 0x023c, TryCatch #4 {cre | IllegalArgumentException -> 0x023c, blocks: (B:109:0x01f7, B:112:0x020d, B:115:0x0220, B:116:0x022f, B:20:0x0074, B:108:0x01e6, B:23:0x007c, B:25:0x0080, B:35:0x00a9, B:106:0x01cf, B:36:0x00b5, B:38:0x00bc, B:50:0x00dc, B:53:0x00e1, B:55:0x00e9, B:57:0x00f1, B:73:0x0124, B:82:0x014e, B:84:0x0154, B:86:0x015b, B:89:0x0165, B:91:0x016c, B:94:0x0176, B:96:0x017d, B:98:0x0185, B:100:0x018c, B:101:0x0192, B:76:0x0133, B:78:0x0138, B:81:0x0149, B:61:0x00fe, B:63:0x0103, B:65:0x010b, B:67:0x0110, B:70:0x011d, B:102:0x01aa, B:103:0x01c3, B:104:0x01c4, B:41:0x00c3, B:42:0x00cc, B:44:0x00d0, B:47:0x00d6, B:27:0x008b, B:29:0x008f, B:30:0x0097, B:33:0x009f, B:15:0x0069, B:18:0x006e), top: B:132:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    @Override // androidx.car.app.ICarApp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onHandshakeCompleted(defpackage.cqy r21, androidx.car.app.IOnDoneCallback r22) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.CarAppBinder.onHandshakeCompleted(cqy, androidx.car.app.IOnDoneCallback):void");
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.d(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new crq() { // from class: cko
            @Override // defpackage.crq
            public final Object a() {
                this.a.m219lambda$onNewIntent$5$androidxcarappCarAppBinder(intent);
                return null;
            }
        });
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel <= 0 || hostCarAppApiLevel > cse.a()) {
            throw new IllegalArgumentException(a.g(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }
}
