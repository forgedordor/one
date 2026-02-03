package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cob;
import defpackage.cor;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements cor {
    private final IOnSelectedListener mStub;

    /* compiled from: PG */
    @cmb
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final cob mListener;

        public OnSelectedListenerStub(cob cobVar) {
            this.mListener = cobVar;
        }

        /* renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m230x5a7f46f5(int i) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSelectedListener", new crq() { // from class: cos
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m230x5a7f46f5(i);
                }
            });
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }

    public static cor create(cob cobVar) {
        return new OnSelectedDelegateImpl(cobVar);
    }

    public void sendSelected(int i, clr clrVar) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            iOnSelectedListener.getClass();
            iOnSelectedListener.onSelected(i, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl(cob cobVar) {
        this.mStub = new OnSelectedListenerStub(cobVar);
    }
}
