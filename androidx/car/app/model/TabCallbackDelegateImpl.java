package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cpk;
import defpackage.cpo;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements cpk {
    private final ITabCallback mStubCallback;

    /* compiled from: PG */
    @cmb
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final cpo mCallback;

        public TabCallbackStub(cpo cpoVar) {
            this.mCallback = cpoVar;
        }

        /* renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m233x7d0e011a(String str) {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onTabSelected", new crq() { // from class: cpl
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m233x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }

    public static cpk create(cpo cpoVar) {
        return new TabCallbackDelegateImpl(cpoVar);
    }

    public void sendTabSelected(String str, clr clrVar) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            iTabCallback.getClass();
            iTabCallback.onTabSelected(str, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl(cpo cpoVar) {
        this.mStubCallback = new TabCallbackStub(cpoVar);
    }
}
