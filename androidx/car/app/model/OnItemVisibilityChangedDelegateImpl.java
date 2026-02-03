package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.coa;
import defpackage.cop;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements cop {
    private final IOnItemVisibilityChangedListener mStub;

    /* compiled from: PG */
    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final coa mListener;

        public OnItemVisibilityChangedListenerStub(coa coaVar) {
            this.mListener = coaVar;
        }

        /* renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m229xb730acdb(int i, int i2) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onItemVisibilityChanged", new crq() { // from class: coq
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m229xb730acdb(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }

    public static cop create(coa coaVar) {
        return new OnItemVisibilityChangedDelegateImpl(coaVar);
    }

    public void sendItemVisibilityChanged(int i, int i2, clr clrVar) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            iOnItemVisibilityChangedListener.getClass();
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl(coa coaVar) {
        this.mStub = new OnItemVisibilityChangedListenerStub(coaVar);
    }
}
