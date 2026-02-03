package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.fgaa;
import defpackage.fgab;
import defpackage.fgac;
import internal.J.N;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private fgac mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* compiled from: PG */
    public interface Delegate {
        void proxySettingsChanged();
    }

    private ProxyChangeListener() {
        Looper looperMyLooper = Looper.myLooper();
        this.mLooper = looperMyLooper;
        this.mHandler = new Handler(looperMyLooper);
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fgab extractNewProxy(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return fgab.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private fgab getProxyConfig(Intent intent) {
        fgab fgabVarA = fgab.a(((ConnectivityManager) ffxu.a.getSystemService("connectivity")).getDefaultProxy());
        if (fgabVarA == null) {
            return fgab.a;
        }
        if (Build.VERSION.SDK_INT < 29 || !fgabVarA.b.equals("localhost") || fgabVarA.c != -1) {
            return fgabVarA;
        }
        fgab fgabVarExtractNewProxy = extractNewProxy(intent);
        ffyc.h(TAG, "configFromConnectivityManager = %s, configFromIntent = %s", fgabVarA, fgabVarExtractNewProxy);
        if (fgabVarExtractNewProxy == null) {
            return null;
        }
        String str = fgabVarA.d;
        String[] strArr = fgabVarA.e;
        return new fgab(fgabVarExtractNewProxy.b, fgabVarExtractNewProxy.c, str, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDelegateForTesting$0(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$1(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return $assertionsDisabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(fgab fgabVar) {
        Delegate delegate = this.mDelegate;
        if (delegate != null) {
            delegate.proxySettingsChanged();
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        if (fgabVar == null) {
            N.MCIk73GZ(j, this);
            return;
        }
        String[] strArr = fgabVar.e;
        String str = fgabVar.d;
        N.MyoFZt$2(j, this, fgabVar.b, fgabVar.c, str, strArr);
    }

    private void registerBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new fgac(this);
        if (!ffxu.b()) {
            ffxu.c(ffxu.a, this.mProxyReceiver, new IntentFilter(), 4);
        }
        this.mRealProxyReceiver = new fgaa(this);
        ffxu.a(ffxu.a, this.mRealProxyReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    private void unregisterBroadcastReceiver() {
        ffxu.a.unregisterReceiver(this.mProxyReceiver);
        BroadcastReceiver broadcastReceiver = this.mRealProxyReceiver;
        if (broadcastReceiver != null) {
            ffxu.a.unregisterReceiver(broadcastReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public void start(long j) {
        TraceEvent traceEventA = TraceEvent.a("ProxyChangeListener.start");
        try {
            this.mNativePtr = j;
            registerBroadcastReceiver();
            if (traceEventA != null) {
                traceEventA.close();
            }
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void stop() {
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$updateProxyConfigFromConnectivityManager$1(intent);
            }
        });
    }

    private void assertOnThread() {
    }
}
