package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxh implements IUnusedAppRestrictionsBackportCallback {
    private final IBinder a;

    public kxh(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
    public final void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(DESCRIPTOR);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
