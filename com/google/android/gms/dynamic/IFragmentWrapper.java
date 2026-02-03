package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFragmentWrapper {
        static final int TRANSACTION_getActivity = 2;
        static final int TRANSACTION_getArguments = 3;
        static final int TRANSACTION_getId = 4;
        static final int TRANSACTION_getParentFragment = 5;
        static final int TRANSACTION_getResources = 6;
        static final int TRANSACTION_getRetainInstance = 7;
        static final int TRANSACTION_getTag = 8;
        static final int TRANSACTION_getTargetFragment = 9;
        static final int TRANSACTION_getTargetRequestCode = 10;
        static final int TRANSACTION_getUserVisibleHint = 11;
        static final int TRANSACTION_getView = 12;
        static final int TRANSACTION_isAdded = 13;
        static final int TRANSACTION_isDetached = 14;
        static final int TRANSACTION_isHidden = 15;
        static final int TRANSACTION_isInLayout = 16;
        static final int TRANSACTION_isRemoving = 17;
        static final int TRANSACTION_isResumed = 18;
        static final int TRANSACTION_isVisible = 19;
        static final int TRANSACTION_registerForContextMenu = 20;
        static final int TRANSACTION_setHasOptionsMenu = 21;
        static final int TRANSACTION_setMenuVisibility = 22;
        static final int TRANSACTION_setRetainInstance = 23;
        static final int TRANSACTION_setUserVisibleHint = 24;
        static final int TRANSACTION_startActivity = 25;
        static final int TRANSACTION_startActivityForResult = 26;
        static final int TRANSACTION_unregisterForContextMenu = 27;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFragmentWrapper {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IObjectWrapper getActivity() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public Bundle getArguments() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public int getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IFragmentWrapper getParentFragment() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                IFragmentWrapper iFragmentWrapperAsInterface = Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iFragmentWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IObjectWrapper getResources() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean getRetainInstance() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public String getTag() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IFragmentWrapper getTargetFragment() {
                Parcel parcelTransactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                IFragmentWrapper iFragmentWrapperAsInterface = Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iFragmentWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public int getTargetRequestCode() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean getUserVisibleHint() {
                Parcel parcelTransactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IObjectWrapper getView() {
                Parcel parcelTransactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isAdded() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isDetached() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isHidden() {
                Parcel parcelTransactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isInLayout() {
                Parcel parcelTransactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isRemoving() {
                Parcel parcelTransactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isResumed() {
                Parcel parcelTransactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void registerForContextMenu(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setHasOptionsMenu(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setMenuVisibility(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setRetainInstance(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setUserVisibleHint(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void startActivity(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void startActivityForResult(Intent intent, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IObjectWrapper activity = getActivity();
                    parcel2.writeNoException();
                    sgh.f(parcel2, activity);
                    return true;
                case 3:
                    Bundle arguments = getArguments();
                    parcel2.writeNoException();
                    sgh.e(parcel2, arguments);
                    return true;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    return true;
                case 5:
                    IFragmentWrapper parentFragment = getParentFragment();
                    parcel2.writeNoException();
                    sgh.f(parcel2, parentFragment);
                    return true;
                case 6:
                    IObjectWrapper resources = getResources();
                    parcel2.writeNoException();
                    sgh.f(parcel2, resources);
                    return true;
                case 7:
                    boolean retainInstance = getRetainInstance();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(retainInstance ? 1 : 0);
                    return true;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    IFragmentWrapper targetFragment = getTargetFragment();
                    parcel2.writeNoException();
                    sgh.f(parcel2, targetFragment);
                    return true;
                case 10:
                    int targetRequestCode = getTargetRequestCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(targetRequestCode);
                    return true;
                case 11:
                    boolean userVisibleHint = getUserVisibleHint();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(userVisibleHint ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper view = getView();
                    parcel2.writeNoException();
                    sgh.f(parcel2, view);
                    return true;
                case 13:
                    boolean zIsAdded = isAdded();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsAdded ? 1 : 0);
                    return true;
                case 14:
                    boolean zIsDetached = isDetached();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsDetached ? 1 : 0);
                    return true;
                case 15:
                    boolean zIsHidden = isHidden();
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zIsHidden ? 1 : 0);
                    return true;
                case 16:
                    boolean zIsInLayout = isInLayout();
                    parcel2.writeNoException();
                    int i8 = sgh.a;
                    parcel2.writeInt(zIsInLayout ? 1 : 0);
                    return true;
                case 17:
                    boolean zIsRemoving = isRemoving();
                    parcel2.writeNoException();
                    int i9 = sgh.a;
                    parcel2.writeInt(zIsRemoving ? 1 : 0);
                    return true;
                case 18:
                    boolean zIsResumed = isResumed();
                    parcel2.writeNoException();
                    int i10 = sgh.a;
                    parcel2.writeInt(zIsResumed ? 1 : 0);
                    return true;
                case 19:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    int i11 = sgh.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerForContextMenu(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setHasOptionsMenu(zG);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMenuVisibility(zG2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setRetainInstance(zG3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zG4 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setUserVisibleHint(zG4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    startActivity(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    int i12 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    startActivityForResult(intent2, i12);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterForContextMenu(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper getActivity();

    Bundle getArguments();

    int getId();

    IFragmentWrapper getParentFragment();

    IObjectWrapper getResources();

    boolean getRetainInstance();

    String getTag();

    IFragmentWrapper getTargetFragment();

    int getTargetRequestCode();

    boolean getUserVisibleHint();

    IObjectWrapper getView();

    boolean isAdded();

    boolean isDetached();

    boolean isHidden();

    boolean isInLayout();

    boolean isRemoving();

    boolean isResumed();

    boolean isVisible();

    void registerForContextMenu(IObjectWrapper iObjectWrapper);

    void setHasOptionsMenu(boolean z);

    void setMenuVisibility(boolean z);

    void setRetainInstance(boolean z);

    void setUserVisibleHint(boolean z);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterForContextMenu(IObjectWrapper iObjectWrapper);
}
