package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hs implements IMediaControllerCallback {
    private final IBinder a;

    public hs(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onCaptioningEnabledChanged(boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onEvent(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeString(str);
            ht.b(parcelObtain, bundle);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onExtrasChanged(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(parcelObtain, bundle);
            this.a.transact(7, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onMetadataChanged(hp hpVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(parcelObtain, hpVar);
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onPlaybackStateChanged(ig igVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(parcelObtain, igVar);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onQueueChanged(List<hx> list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int size = list.size();
                parcelObtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    ht.b(parcelObtain, list.get(i));
                }
            }
            this.a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                parcelObtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onRepeatModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            this.a.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onSessionDestroyed() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onSessionReady() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            this.a.transact(13, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onShuffleModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            this.a.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onShuffleModeChangedRemoved(boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onVolumeInfoChanged(ic icVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(parcelObtain, icVar);
            this.a.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
