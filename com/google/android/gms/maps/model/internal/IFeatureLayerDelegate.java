package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IOnFeatureClickListener;
import com.google.android.gms.maps.model.internal.IStyleFactory;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeatureLayerDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeatureLayerDelegate {
        static final int TRANSACTION_addOnFeatureClickListener = 4;
        static final int TRANSACTION_getDatasetId = 6;
        static final int TRANSACTION_getFeatureType = 1;
        static final int TRANSACTION_isAvailable = 2;
        static final int TRANSACTION_removeOnFeatureClickListener = 5;
        static final int TRANSACTION_setFeatureStyle = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeatureLayerDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnFeatureClickListener);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public String getDatasetId() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public String getFeatureType() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public boolean isAvailable() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnFeatureClickListener);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public void setFeatureStyle(IStyleFactory iStyleFactory) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStyleFactory);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
        }

        public static IFeatureLayerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
            return iInterfaceQueryLocalInterface instanceof IFeatureLayerDelegate ? (IFeatureLayerDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String featureType = getFeatureType();
                    parcel2.writeNoException();
                    parcel2.writeString(featureType);
                    return true;
                case 2:
                    boolean zIsAvailable = isAvailable();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsAvailable ? 1 : 0);
                    return true;
                case 3:
                    IStyleFactory iStyleFactoryAsInterface = IStyleFactory.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setFeatureStyle(iStyleFactoryAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IOnFeatureClickListener iOnFeatureClickListenerAsInterface = IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addOnFeatureClickListener(iOnFeatureClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IOnFeatureClickListener iOnFeatureClickListenerAsInterface2 = IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    removeOnFeatureClickListener(iOnFeatureClickListenerAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    String datasetId = getDatasetId();
                    parcel2.writeNoException();
                    parcel2.writeString(datasetId);
                    return true;
                default:
                    return false;
            }
        }
    }

    void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener);

    String getDatasetId();

    String getFeatureType();

    boolean isAvailable();

    void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener);

    void setFeatureStyle(IStyleFactory iStyleFactory);
}
