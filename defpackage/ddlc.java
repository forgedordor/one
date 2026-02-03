package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.internal.training.IInAppTrainer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddlc implements ddjd {
    private final IInAppTrainer a;

    public ddlc(IInAppTrainer iInAppTrainer) {
        this.a = iInAppTrainer;
    }

    public static defn c(final Context context, final Executor executor, final InAppTrainerOptions inAppTrainerOptions) {
        final defr defrVar = new defr();
        executor.execute(new Runnable() { // from class: ddkx
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Context context2 = context;
                defr defrVar2 = defrVar;
                Executor executor2 = executor;
                InAppTrainerOptions inAppTrainerOptions2 = inAppTrainerOptions;
                if (!ebca.c) {
                    synchronized (ddis.a) {
                        z = ddis.b;
                    }
                    if (!z) {
                        Class<?> cls = context2.getApplicationContext().getClass();
                        if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                            defrVar2.c(new dcff(new Status(10, a.R(cls, "Cannot create in-app trainer: android.app.Application class has been subclassed (", ") and BrellaInit.myAppCanHandleMultipleProcesses() was not called"))));
                            return;
                        }
                    }
                }
                try {
                    IInAppTrainer iInAppTrainer = (IInAppTrainer) ddki.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", new ddkh() { // from class: ddky
                        @Override // defpackage.ddkh
                        public final IInterface a(IBinder iBinder) {
                            return IInAppTrainer.Stub.asInterface(iBinder);
                        }
                    });
                    ddkz ddkzVar = new ddkz(defrVar2, iInAppTrainer);
                    try {
                        if (iInAppTrainer.initY2023W12(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                            return;
                        }
                        if (!inAppTrainerOptions2.l.isEmpty()) {
                            defrVar2.c(new dcff(new Status(10, "Input resources are not supported.")));
                            return;
                        }
                        try {
                            if (iInAppTrainer.initY2022W24(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                                return;
                            }
                            if (ddlc.d(inAppTrainerOptions2.k) || ddlc.d(inAppTrainerOptions2.i) || ddlc.d(inAppTrainerOptions2.f)) {
                                defrVar2.c(new dcff(new Status(10, "appdata Uri scheme is not supported.")));
                                return;
                            }
                            try {
                                if (iInAppTrainer.initY2020W36(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                                    return;
                                }
                                if (inAppTrainerOptions2.k != null) {
                                    defrVar2.c(new dcff(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                                    return;
                                }
                                try {
                                    if (iInAppTrainer.initY2020W30(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                                        return;
                                    }
                                    if (inAppTrainerOptions2.a().length > 0) {
                                        defrVar2.c(new dcff(new Status(10, "Context data is not supported.")));
                                        return;
                                    }
                                    try {
                                        if (iInAppTrainer.initY2020W18(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                                            return;
                                        }
                                        if (inAppTrainerOptions2.d != null && inAppTrainerOptions2.j != null) {
                                            defrVar2.c(new dcff(new Status(10, "Training interval is not supported for federated computation.")));
                                            return;
                                        }
                                        try {
                                            if (iInAppTrainer.initW24(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                                                return;
                                            }
                                            int i = inAppTrainerOptions2.e;
                                            if (i != 0 && i != 1) {
                                                defrVar2.c(new dcff(new Status(10, "Unsupported AttestationMode")));
                                                return;
                                            }
                                            try {
                                                if (iInAppTrainer.initV26(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor2), inAppTrainerOptions2, ddkzVar)) {
                                                    return;
                                                }
                                                defrVar2.c(new dcff(new Status(17, "Failed to init impl")));
                                            } catch (RemoteException e) {
                                                defrVar2.c(new dcff(new Status(8, ejxy.a(e))));
                                            }
                                        } catch (RemoteException e2) {
                                            defrVar2.c(new dcff(new Status(8, ejxy.a(e2))));
                                        }
                                    } catch (RemoteException e3) {
                                        defrVar2.c(new dcff(new Status(8, ejxy.a(e3))));
                                    }
                                } catch (RemoteException e4) {
                                    defrVar2.c(new dcff(new Status(8, ejxy.a(e4))));
                                }
                            } catch (RemoteException e5) {
                                defrVar2.c(new dcff(new Status(8, ejxy.a(e5))));
                            }
                        } catch (RemoteException e6) {
                            defrVar2.c(new dcff(new Status(8, ejxy.a(e6))));
                        }
                    } catch (RemoteException e7) {
                        defrVar2.c(new dcff(new Status(8, ejxy.a(e7))));
                    }
                } catch (ddkg e8) {
                    defrVar2.c(new dcff(new Status(17, "Cannot create in-app trainer: ".concat(String.valueOf(e8.getMessage())))));
                }
            }
        });
        return defrVar.a;
    }

    public static boolean d(Uri uri) {
        return uri != null && "appdir".equals(uri.getScheme());
    }

    @Override // defpackage.ddjd
    public final defn a() {
        defr defrVar = new defr();
        try {
            this.a.stop(new ddlb(defrVar));
        } catch (RemoteException e) {
            defrVar.c(new dcff(new Status(8, ejxy.a(e))));
        }
        return defrVar.a;
    }

    @Override // defpackage.ddjd
    public final defn b() {
        defr defrVar = new defr();
        try {
            this.a.start(0, new ddla(defrVar));
        } catch (RemoteException e) {
            defrVar.c(new dcff(new Status(8, ejxy.a(e))));
        }
        return defrVar.a;
    }
}
