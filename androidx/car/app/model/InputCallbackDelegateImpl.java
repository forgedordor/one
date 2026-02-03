package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.cnu;
import defpackage.cnv;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements cnv {
    private final IInputCallback mCallback;

    /* compiled from: PG */
    @cmb
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final cnu mCallback;

        public OnInputCallbackStub(cnu cnuVar) {
            this.mCallback = cnuVar;
        }

        /* renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m224x52ef688c(String str) {
            this.mCallback.a();
            return null;
        }

        /* renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m225x16cfd85f(String str) {
            this.mCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onInputSubmitted", new crq() { // from class: cnx
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m224x52ef688c(str);
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onInputTextChanged", new crq() { // from class: cnw
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m225x16cfd85f(str);
                }
            });
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }

    public static cnv create(cnu cnuVar) {
        cnuVar.getClass();
        return new InputCallbackDelegateImpl(cnuVar);
    }

    public void sendInputSubmitted(String str, clr clrVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputSubmitted(str, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(String str, clr clrVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputTextChanged(str, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl(cnu cnuVar) {
        this.mCallback = new OnInputCallbackStub(cnuVar);
    }
}
