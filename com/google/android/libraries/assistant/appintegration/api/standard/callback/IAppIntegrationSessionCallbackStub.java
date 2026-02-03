package com.google.android.libraries.assistant.appintegration.api.standard.callback;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager$KeyguardDismissCallback;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.dibx;
import defpackage.diby;
import defpackage.dica;
import defpackage.dicb;
import defpackage.dicq;
import defpackage.dicr;
import defpackage.dicv;
import defpackage.dicx;
import defpackage.dicy;
import defpackage.dicz;
import defpackage.didd;
import defpackage.dide;
import defpackage.didf;
import defpackage.didh;
import defpackage.didi;
import defpackage.didj;
import defpackage.ejud;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.evrr;
import defpackage.evsl;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.evuq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class IAppIntegrationSessionCallbackStub extends IAppIntegrationSessionCallback.Stub {
    private dicb b;
    private boolean c;
    protected dibx callback;
    private KeyguardManager$KeyguardDismissCallback d;
    private final evrr e;
    dicr systemUiManager;
    private final Handler a = new Handler(Looper.getMainLooper());
    ejwi<Runnable> resetStatesTask = ejud.a;
    protected SettableFuture<dicz> navigationStateChangeComplete = SettableFuture.create();

    public IAppIntegrationSessionCallbackStub(Context context) {
        this.systemUiManager = new dicr(context);
        this.navigationStateChangeComplete.set(dicz.a);
        int i = didj.a;
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        evrr evrrVar2 = new evrr();
        evrrVar2.c(didf.a);
        evrrVar2.c(didi.a);
        this.e = evrrVar2;
    }

    private final void a(dide dideVar) {
        int iA = didd.a(dideVar.b);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        switch (i) {
            case 1:
                Log.v("AIClientCbStub", "#onUpdate(): VOICE_PLATE_OPENED");
                break;
            case 2:
                Log.v("AIClientCbStub", "#onUpdate(): VOICE_PLATE_CLOSED");
                break;
            case 3:
                Log.i("AIClientCbStub", "#onUpdate(): VOICE_PLATE_STATE_CHANGED");
                evsl evslVar = didi.a;
                evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
                dideVar.d(evslVarCheckIsLite);
                if (!dideVar.r.o(evslVarCheckIsLite.d)) {
                    Log.w("AIClientCbStub", String.format("#onUpdate(): extension not set for VOICE_PLATE_STATE_CHANGED event: %s", dideVar));
                    break;
                } else {
                    evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
                    dideVar.d(evslVarCheckIsLite2);
                    Object objL = dideVar.r.l(evslVarCheckIsLite2.d);
                    dicy dicyVar = (dicy) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL));
                    int iA2 = dicx.a(dicyVar.b);
                    if (iA2 == 0) {
                        iA2 = 1;
                    }
                    Log.d("AIClientCbStub", "VOICE_PLATE_STATE ".concat(Integer.toString(iA2 - 1)));
                    diby dibyVar = (diby) this.callback;
                    int iA3 = dicx.a(dicyVar.b);
                    if (iA3 == 0) {
                        iA3 = 1;
                    }
                    int iA4 = dicv.a(dicyVar.c);
                    if (iA4 == 0 || iA4 != 4) {
                        dibyVar.c(dicyVar);
                        break;
                    } else {
                        if (this.resetStatesTask.g()) {
                            this.a.removeCallbacks((Runnable) this.resetStatesTask.c());
                            this.resetStatesTask = ejud.a;
                        }
                        if (iA3 == 2) {
                            dicr dicrVar = this.systemUiManager;
                            boolean z = dicyVar.d;
                            Log.d("SystemUiManager", String.format("#adjustSystemNavigationUi(%b)", Boolean.valueOf(z)));
                            if (dicrVar.c.g()) {
                                ((dicq) dicrVar.c.c()).a();
                                if (dicrVar.e()) {
                                    ((dicq) dicrVar.c.c()).c();
                                }
                            }
                            if (dicrVar.d.g()) {
                                ((dicq) dicrVar.d.c()).a();
                                if (dicrVar.e()) {
                                    ((dicq) dicrVar.d.c()).c();
                                }
                            }
                            int iF = dicr.f(z);
                            dicrVar.a.compareAndSet(false, z);
                            Integer numValueOf = Integer.valueOf(iF);
                            Log.d("SystemUiManager", String.format("#updateSystemUiVisibility(%d)", numValueOf));
                            if (dicrVar.c.g()) {
                                ((dicq) dicrVar.c.c()).f(iF);
                            }
                            if (dicrVar.d.g()) {
                                ((dicq) dicrVar.d.c()).f(iF);
                            }
                            dicrVar.f = ejwi.j(numValueOf);
                            if (!this.c) {
                                this.c = true;
                            }
                        } else if (this.c) {
                            this.systemUiManager.c();
                            this.c = false;
                        }
                        dibyVar.c(dicyVar);
                        break;
                    }
                }
            case 4:
            case 5:
            default:
                Log.w("AIClientCbStub", String.format("#onUpdate(): unrecognized callback event: %d", Integer.valueOf(i)));
                break;
            case 6:
                Log.v("AIClientCbStub", "#onUpdate(): ASSISTANT_CONNECTION_LOST");
                resetStates();
                break;
            case 7:
                Log.v("AIClientCbStub", "#onUpdate(): ASSISTANT_CONVERSATION_STATE_CHANGED");
                evsl evslVar2 = didf.a;
                evsl evslVarCheckIsLite3 = evsn.checkIsLite(evslVar2);
                dideVar.d(evslVarCheckIsLite3);
                if (!dideVar.r.o(evslVarCheckIsLite3.d)) {
                    Log.w("AIClientCbStub", "#onUpdate(): extension not set for ASSISTANT_CONVERSATION_STATE_CHANGED event.");
                    break;
                } else {
                    evsl evslVarCheckIsLite4 = evsn.checkIsLite(evslVar2);
                    dideVar.d(evslVarCheckIsLite4);
                    Object objL2 = dideVar.r.l(evslVarCheckIsLite4.d);
                    int i2 = ((didh) (objL2 == null ? evslVarCheckIsLite4.b : evslVarCheckIsLite4.c(objL2))).b;
                    break;
                }
            case 8:
                Log.v("AIClientCbStub", "#onUpdate(): REQUEST_DISMISS_KEYGUARD");
                if (!getActivityOptional().g()) {
                    Log.w("AIClientCbStub", "#onUpdate(): REQUEST_DISMISS_KEYGUARD - no registered activity.");
                    break;
                } else {
                    KeyguardManager keyguardManager = (KeyguardManager) ((Activity) getActivityOptional().c()).getSystemService("keyguard");
                    if (this.d == null) {
                        this.d = new dica(this);
                    }
                    keyguardManager.requestDismissKeyguard((Activity) getActivityOptional().c(), this.d);
                    break;
                }
            case 9:
                Log.v("AIClientCbStub", "#onUpdate(): NAVIGATION_STATE_CHANGE_COMPLETE");
                this.navigationStateChangeComplete.set(dicz.a);
                break;
        }
    }

    public ejwi<Activity> getActivityOptional() {
        return this.systemUiManager.b;
    }

    public dibx getCallback() {
        return this.callback;
    }

    public SettableFuture<dicz> getNavigationStateChangeComplete() {
        return this.navigationStateChangeComplete;
    }

    public ejwi<Window> getPopupWindowOptional() {
        return this.systemUiManager.d.b(new ejvr() { // from class: dice
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dicq) obj).a;
            }
        });
    }

    public boolean isMorrisVoicePlateOpened() {
        return this.c;
    }

    public void onServiceConnected() {
        this.callback.a();
    }

    public void onServiceDisconnected() {
        this.callback.b();
    }

    public void onUpdate(dide dideVar) {
        Log.d("AIClientCbStub", "#onUpdate()");
        dibx dibxVar = this.callback;
        if (dibxVar instanceof diby) {
            a(dideVar);
        } else {
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", dibxVar));
        }
    }

    public void resetNavigationStateChangeComplete() {
        if (!this.navigationStateChangeComplete.isDone()) {
            Log.w("AIClientCbStub", "#resetNavigationStateChangeComplete(): cancelled in-progress state change.");
            this.navigationStateChangeComplete.cancel(true);
        }
        this.navigationStateChangeComplete = SettableFuture.create();
    }

    public void resetStates() {
        Log.v("AIClientCbStub", "#resetStates(): isMorrisVoicePlateOpened = %b " + this.c);
        if (this.resetStatesTask.g()) {
            this.a.removeCallbacks((Runnable) this.resetStatesTask.c());
            this.resetStatesTask = ejud.a;
        }
        if (this.c) {
            this.systemUiManager.c();
            this.c = false;
        }
    }

    public void resetStatesDelayed(long j) {
        Log.v("AIClientCbStub", "#resetStatesDelayed(): isMorrisVoicePlateOpened = %b " + this.c);
        if (this.c) {
            ejwi<Runnable> ejwiVarJ = ejwi.j(new Runnable() { // from class: dibz
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.resetStates();
                }
            });
            this.resetStatesTask = ejwiVarJ;
            this.a.postDelayed((Runnable) ejwiVarJ.c(), j);
        }
    }

    public void setActivityOptional(ejwi<Activity> ejwiVar) {
        Log.d("AIClientCbStub", String.format("#setActivityOptional(): isMorrisVoicePlateOpened = %b", Boolean.valueOf(this.c)));
        if (this.c) {
            this.systemUiManager.a();
        }
        final dicr dicrVar = this.systemUiManager;
        dicrVar.b = ejwiVar;
        dicrVar.c = ejwiVar.b(new ejvr() { // from class: dicd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dicq(dicrVar, ((Activity) obj).getWindow());
            }
        });
        if (dicrVar.c.g()) {
            Log.d("SystemUiManager", String.format("#setActivityOptional(): set new activity window = %s", ((dicq) dicrVar.c.c()).a));
        } else {
            Log.w("SystemUiManager", "#setActivityOptional(): activity window not present");
        }
        if (this.c) {
            dicr dicrVar2 = this.systemUiManager;
            Log.d("SystemUiManager", String.format("#updateActivitySystemUi(): activityWindow.isPresent() = %b", Boolean.valueOf(dicrVar2.c.g())));
            if (dicrVar2.c.g()) {
                dicrVar2.d((dicq) dicrVar2.c.c());
            }
        }
    }

    public void setCallback(dibx dibxVar) {
        this.callback = dibxVar;
    }

    public void setKeyguardDismissStatusListener(dicb dicbVar) {
        this.b = dicbVar;
    }

    public void setPopupWindowOptional(ejwi<Window> ejwiVar) {
        Log.v("AIClientCbStub", String.format("#setPopupWindowOptional(): isMorrisVoicePlateOpened = %b", Boolean.valueOf(this.c)));
        if (this.c) {
            this.systemUiManager.b();
        }
        final dicr dicrVar = this.systemUiManager;
        dicrVar.d = ejwiVar.b(new ejvr() { // from class: dicc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dicq(dicrVar, (Window) obj);
            }
        });
        if (this.c) {
            dicr dicrVar2 = this.systemUiManager;
            Log.d("SystemUiManager", String.format("#updatePopupWindowSystemUi(): popupWindowOptional.isPresent() = %b", Boolean.valueOf(dicrVar2.d.g())));
            if (dicrVar2.d.g()) {
                dicrVar2.d((dicq) dicrVar2.d.c());
            }
        }
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback
    public void onUpdate(byte[] bArr) {
        Log.i("AIClientCbStub", "#onUpdate()");
        dibx dibxVar = this.callback;
        if (!(dibxVar instanceof diby)) {
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", dibxVar));
            return;
        }
        try {
            a((dide) evsn.parseFrom(dide.a, bArr, this.e));
        } catch (evtj unused) {
            Log.w("AIClientCbStub", "#onUpdate(): failed to parse bytes to AppIntegrationCallbackEvent");
        }
    }
}
