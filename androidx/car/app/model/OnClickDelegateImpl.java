package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.coj;
import defpackage.col;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements coj {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: PG */
    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final col mOnClickListener;

        public OnClickListenerStub(col colVar) {
            this.mOnClickListener = colVar;
        }

        /* renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        public /* synthetic */ Object m227xba9c2d94() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onClick", new crq() { // from class: cok
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m227xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }

    public static coj create(col colVar) {
        return new OnClickDelegateImpl(colVar, colVar instanceof ParkedOnlyOnClickListener);
    }

    @Override // defpackage.coj
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(clr clrVar) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            iOnClickListener.getClass();
            iOnClickListener.onClick(new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl(col colVar, boolean z) {
        this.mListener = new OnClickListenerStub(colVar);
        this.mIsParkedOnly = z;
    }
}
