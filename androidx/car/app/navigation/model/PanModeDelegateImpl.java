package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cqo;
import defpackage.cqq;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements cqo {
    private final IPanModeListener mStub;

    /* compiled from: PG */
    @cmb
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final cqq mListener;

        public PanModeListenerStub(cqq cqqVar) {
            this.mListener = cqqVar;
        }

        /* renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m235xa5766d47(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onPanModeChanged", new crq() { // from class: cqp
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m235xa5766d47(z);
                }
            });
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }

    public static cqo create(cqq cqqVar) {
        return new PanModeDelegateImpl(cqqVar);
    }

    public void sendPanModeChanged(boolean z, clr clrVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            iPanModeListener.getClass();
            iPanModeListener.onPanModeChanged(z, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl(cqq cqqVar) {
        this.mStub = new PanModeListenerStub(cqqVar);
    }
}
