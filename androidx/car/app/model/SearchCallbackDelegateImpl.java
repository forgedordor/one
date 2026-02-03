package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cpb;
import defpackage.cpf;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class SearchCallbackDelegateImpl implements cpb {
    private final ISearchCallback mStubCallback;

    /* compiled from: PG */
    @cmb
    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final cpf mCallback;

        public SearchCallbackStub(cpf cpfVar) {
            this.mCallback = cpfVar;
        }

        /* renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m231x5bd43f40(String str) {
            this.mCallback.a();
            return null;
        }

        /* renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m232xa7c97055(String str) {
            this.mCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSearchSubmitted", new crq() { // from class: cpc
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m231x5bd43f40(str);
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSearchTextChanged", new crq() { // from class: cpd
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m232xa7c97055(str);
                }
            });
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }

    public static cpb create(cpf cpfVar) {
        return new SearchCallbackDelegateImpl(cpfVar);
    }

    public void sendSearchSubmitted(String str, clr clrVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchSubmitted(str, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSearchTextChanged(String str, clr clrVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchTextChanged(str, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl(cpf cpfVar) {
        this.mStubCallback = new SearchCallbackStub(cpfVar);
    }
}
