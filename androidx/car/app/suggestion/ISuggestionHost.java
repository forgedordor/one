package androidx.car.app.suggestion;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.cqy;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISuggestionHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.suggestion.ISuggestionHost";

    void updateSuggestions(cqy cqyVar);

    /* compiled from: PG */
    public static abstract class Stub extends Binder implements ISuggestionHost {
        static final int TRANSACTION_updateSuggestions = 2;

        /* compiled from: PG */
        private static class Proxy implements ISuggestionHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.car.app.suggestion.ISuggestionHost
            public void updateSuggestions(cqy cqyVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    if (cqyVar != null) {
                        parcelObtain.writeInt(1);
                        cqyVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISuggestionHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISuggestionHost)) ? new Proxy(iBinder) : (ISuggestionHost) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = DESCRIPTOR;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            updateSuggestions(parcel.readInt() != 0 ? cqy.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: PG */
    public static class Default implements ISuggestionHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.suggestion.ISuggestionHost
        public void updateSuggestions(cqy cqyVar) {
        }
    }
}
