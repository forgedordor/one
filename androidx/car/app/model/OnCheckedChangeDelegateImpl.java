package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.utils.RemoteUtils;
import defpackage.clr;
import defpackage.cmb;
import defpackage.coh;
import defpackage.cpr;
import defpackage.crq;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements coh {
    private final IOnCheckedChangeListener mStub;

    /* compiled from: PG */
    @cmb
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final cpr mListener;

        public OnCheckedChangeListenerStub(cpr cprVar) {
            this.mListener = cprVar;
        }

        /* renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m226xd37d5aa3(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onCheckedChange", new crq() { // from class: coi
                @Override // defpackage.crq
                public final Object a() {
                    return this.a.m226xd37d5aa3(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }

    public static coh create(cpr cprVar) {
        return new OnCheckedChangeDelegateImpl(cprVar);
    }

    public void sendCheckedChange(boolean z, clr clrVar) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            iOnCheckedChangeListener.getClass();
            iOnCheckedChangeListener.onCheckedChange(z, new RemoteUtils.AnonymousClass1(clrVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl(cpr cprVar) {
        this.mStub = new OnCheckedChangeListenerStub(cprVar);
    }
}
