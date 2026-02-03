package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.com;
import defpackage.coo;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements com {
    private final IOnContentRefreshListener mListener;

    /* compiled from: PG */
    @cmb
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final coo mOnContentRefreshListener;

        public OnContentRefreshListenerStub(coo cooVar) {
            this.mOnContentRefreshListener = cooVar;
        }

        /* renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub, reason: not valid java name */
        public /* synthetic */ Object m228xff9c1a9c() {
            this.mOnContentRefreshListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onClick", new crq() { // from class: con
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m228xff9c1a9c();
                }
            });
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }

    public static com create(coo cooVar) {
        return new OnContentRefreshDelegateImpl(cooVar);
    }

    public void sendContentRefreshRequested(clr clrVar) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            iOnContentRefreshListener.getClass();
            iOnContentRefreshListener.onContentRefreshRequested(new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl(coo cooVar) {
        this.mListener = new OnContentRefreshListenerStub(cooVar);
    }
}
