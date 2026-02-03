package com.google.android.gms.common.audience.dynamite;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAudienceView extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAudienceView {
        static final int TRANSACTION_getView = 8;
        static final int TRANSACTION_initialize = 2;
        static final int TRANSACTION_onRestoreInstanceState = 7;
        static final int TRANSACTION_onSaveInstanceState = 6;
        static final int TRANSACTION_setAudience = 5;
        static final int TRANSACTION_setEditMode = 3;
        static final int TRANSACTION_setIsUnderageAccount = 9;
        static final int TRANSACTION_setShowEmptyText = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAudienceView {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceView");
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public IObjectWrapper getView() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void initialize(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IAudienceViewCallbacks iAudienceViewCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAudienceViewCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void onRestoreInstanceState(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public Bundle onSaveInstanceState() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setAudience(Audience audience) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, audience);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setEditMode(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setIsUnderageAccount(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setShowEmptyText(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.audience.dynamite.IAudienceView");
        }

        public static IAudienceView asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            return iInterfaceQueryLocalInterface instanceof IAudienceView ? (IAudienceView) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IAudienceViewCallbacks iAudienceViewCallbacksAsInterface = IAudienceViewCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initialize(iObjectWrapperAsInterface, iObjectWrapperAsInterface2, iAudienceViewCallbacksAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setEditMode(i3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setShowEmptyText(zG);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    Audience audience = (Audience) sgh.a(parcel, Audience.CREATOR);
                    enforceNoDataAvail(parcel);
                    setAudience(audience);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    Bundle bundleOnSaveInstanceState = onSaveInstanceState();
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleOnSaveInstanceState);
                    return true;
                case 7:
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRestoreInstanceState(bundle);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    IObjectWrapper view = getView();
                    parcel2.writeNoException();
                    sgh.f(parcel2, view);
                    return true;
                case 9:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setIsUnderageAccount(zG2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper getView();

    void initialize(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IAudienceViewCallbacks iAudienceViewCallbacks);

    void onRestoreInstanceState(Bundle bundle);

    Bundle onSaveInstanceState();

    void setAudience(Audience audience);

    void setEditMode(int i);

    void setIsUnderageAccount(boolean z);

    void setShowEmptyText(boolean z);
}
