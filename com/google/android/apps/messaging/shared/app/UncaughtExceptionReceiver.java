package com.google.android.apps.messaging.shared.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aolm;
import defpackage.aolq;
import defpackage.cden;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.ejvr;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eyhi;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UncaughtExceptionReceiver extends aolm {
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver");
    public cden d;
    public eigp e;

    @Override // defpackage.aolm, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final Throwable nullPointerException;
        String str;
        final BroadcastReceiver.PendingResult pendingResultGoAsync;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((aolq) eyhi.a(context)).hx(this);
                    this.a = true;
                }
            }
        }
        eieh eiehVarC = this.e.c("UncaughtExceptionReceiver Receive broadcast", "com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "onReceive", 61);
        String string = null;
        try {
            try {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        nullPointerException = new NullPointerException("UncaughtExceptionReceiver: Can't process uncaught exception: extras are missing");
                    } else {
                        Object obj = extras.get("throwable");
                        if (obj == null) {
                            nullPointerException = new NullPointerException("UncaughtExceptionReceiver: Can't process uncaught exception: throwable is missing");
                        } else {
                            String name = obj.getClass().getName();
                            try {
                                string = obj.toString();
                                nullPointerException = (Throwable) obj;
                                ekrw ekrwVarH = c.h();
                                ekrwVarH.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(nullPointerException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 83, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: reporting uncaught exception");
                            } catch (ClassCastException e) {
                                nullPointerException = e;
                                str = string;
                                string = name;
                                ekrw ekrwVarJ = c.j();
                                ekrwVarJ.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(nullPointerException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 87, "UncaughtExceptionReceiver.java")).D("UncaughtExceptionReceiver: Can't report uncaught exception: %s \"%s\" is not a Throwable. Reporting deserialization exception instead.", string, str);
                                pendingResultGoAsync = goAsync();
                                eiju eijuVarB = this.d.b(nullPointerException);
                                eooz eoozVar = new eooz() { // from class: aoln
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        Throwable th = nullPointerException;
                                        RuntimeException runtimeException = (RuntimeException) obj2;
                                        if (th instanceof CancellationException) {
                                            return eijx.d(th);
                                        }
                                        UncaughtExceptionReceiver uncaughtExceptionReceiver = this.a;
                                        ekrw ekrwVarJ2 = UncaughtExceptionReceiver.c.j();
                                        ekrwVarJ2.X(eksq.a, "Bugle");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 115, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception while processing %s in uncaught exception handler. Processing that instead.", th);
                                        return uncaughtExceptionReceiver.d.b(runtimeException);
                                    }
                                };
                                eoqg eoqgVar = eoqg.a;
                                eijuVarB.f(RuntimeException.class, eoozVar, eoqgVar).e(RuntimeException.class, new ejvr() { // from class: aolo
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        Throwable th = nullPointerException;
                                        RuntimeException runtimeException = (RuntimeException) obj2;
                                        if (th instanceof CancellationException) {
                                            return null;
                                        }
                                        ekrw ekrwVarJ2 = UncaughtExceptionReceiver.c.j();
                                        ekrwVarJ2.X(eksq.a, "Bugle");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 128, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Second Exception while processing %s in uncaught exception handler. Giving up.", th);
                                        return null;
                                    }
                                }, eoqgVar).b(new Runnable() { // from class: aolp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ekrw ekrwVarG = UncaughtExceptionReceiver.c.g();
                                        ekrwVarG.X(eksq.a, "Bugle");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarG).g(nullPointerException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 137, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Finishing UncaughtExceptionReceiver for");
                                        pendingResultGoAsync.finish();
                                    }
                                }, eoqgVar);
                                eiehVarC.close();
                            }
                        }
                    }
                } catch (RuntimeException e2) {
                    ekrw ekrwVarJ2 = c.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", ']', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Can't report uncaught exception: Exception thrown during deserialization. Reporting deserialization exception instead.");
                    nullPointerException = e2;
                }
            } catch (ClassCastException e3) {
                nullPointerException = e3;
                str = string;
            }
            pendingResultGoAsync = goAsync();
            try {
                eiju eijuVarB2 = this.d.b(nullPointerException);
                eooz eoozVar2 = new eooz() { // from class: aoln
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Throwable th = nullPointerException;
                        RuntimeException runtimeException = (RuntimeException) obj2;
                        if (th instanceof CancellationException) {
                            return eijx.d(th);
                        }
                        UncaughtExceptionReceiver uncaughtExceptionReceiver = this.a;
                        ekrw ekrwVarJ22 = UncaughtExceptionReceiver.c.j();
                        ekrwVarJ22.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ22).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 115, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception while processing %s in uncaught exception handler. Processing that instead.", th);
                        return uncaughtExceptionReceiver.d.b(runtimeException);
                    }
                };
                eoqg eoqgVar2 = eoqg.a;
                eijuVarB2.f(RuntimeException.class, eoozVar2, eoqgVar2).e(RuntimeException.class, new ejvr() { // from class: aolo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Throwable th = nullPointerException;
                        RuntimeException runtimeException = (RuntimeException) obj2;
                        if (th instanceof CancellationException) {
                            return null;
                        }
                        ekrw ekrwVarJ22 = UncaughtExceptionReceiver.c.j();
                        ekrwVarJ22.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ22).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 128, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Second Exception while processing %s in uncaught exception handler. Giving up.", th);
                        return null;
                    }
                }, eoqgVar2).b(new Runnable() { // from class: aolp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ekrw ekrwVarG = UncaughtExceptionReceiver.c.g();
                        ekrwVarG.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarG).g(nullPointerException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 137, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Finishing UncaughtExceptionReceiver for");
                        pendingResultGoAsync.finish();
                    }
                }, eoqgVar2);
            } catch (RuntimeException e4) {
                ekrw ekrwVarI = c.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e4)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 143, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception scheduling uncaught exception processing work for %s", nullPointerException);
                pendingResultGoAsync.finish();
            }
            eiehVarC.close();
        } finally {
        }
    }
}
