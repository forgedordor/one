package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cnk;
import defpackage.cnl;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class AlertCallbackDelegateImpl implements cnl {
    private final IAlertCallback mCallback;

    /* compiled from: PG */
    @cmb
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final cnk mCallback;

        public AlertCallbackStub(cnk cnkVar) {
            this.mCallback = cnkVar;
        }

        /* renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m222x74881a4b(int i) {
            this.mCallback.b();
            return null;
        }

        /* renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m223xeacf1252() {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onCancel", new crq() { // from class: cnn
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m222x74881a4b(i);
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onDismiss", new crq() { // from class: cnm
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m223xeacf1252();
                }
            });
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }

    public static cnl create(cnk cnkVar) {
        return new AlertCallbackDelegateImpl(cnkVar);
    }

    public void sendCancel(int i, clr clrVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertCancelled(i, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDismiss(clr clrVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertDismissed(new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl(cnk cnkVar) {
        this.mCallback = new AlertCallbackStub(cnkVar);
    }
}
