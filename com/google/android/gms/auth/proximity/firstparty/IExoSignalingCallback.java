package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExoSignalingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExoSignalingCallback {
        static final int TRANSACTION_getLaunchIntentForUser = 11;
        static final int TRANSACTION_getPendingIntentForUser = 9;
        static final int TRANSACTION_onAssociationDialogShown = 10;
        static final int TRANSACTION_onAssociationResultMessage = 8;
        static final int TRANSACTION_onAssociationState = 7;
        static final int TRANSACTION_onStreamedAppChanged = 12;
        static final int TRANSACTION_sendSignalingMessage = 2;
        static final int TRANSACTION_streamStarted = 5;
        static final int TRANSACTION_streamStopped = 4;
        static final int TRANSACTION_tearDownSignaling = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExoSignalingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public Intent getLaunchIntentForUser(String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                Intent intent = (Intent) sgh.a(parcelTransactAndReadException, Intent.CREATOR);
                parcelTransactAndReadException.recycle();
                return intent;
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public PendingIntent getPendingIntentForUser(Intent intent, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcelTransactAndReadException, PendingIntent.CREATOR);
                parcelTransactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onAssociationDialogShown(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onAssociationResultMessage(boolean z, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onAssociationState(boolean z, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onStreamedAppChanged(String str, String str2, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void sendSignalingMessage(String str, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void streamStarted(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void streamStopped(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void tearDownSignaling() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
        }

        public static IExoSignalingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
            return iInterfaceQueryLocalInterface instanceof IExoSignalingCallback ? (IExoSignalingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    String string = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    sendSignalingMessage(string, bArrCreateByteArray);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    tearDownSignaling();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    streamStopped(string2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    streamStarted(string3);
                    parcel2.writeNoException();
                    return true;
                case 6:
                default:
                    return false;
                case 7:
                    boolean zG = sgh.g(parcel);
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onAssociationState(zG, string4);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    boolean zG2 = sgh.g(parcel);
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onAssociationResultMessage(zG2, string5, string6);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    PendingIntent pendingIntentForUser = getPendingIntentForUser(intent, i3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, pendingIntentForUser);
                    return true;
                case 10:
                    String string7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onAssociationDialogShown(string7);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    String string8 = parcel.readString();
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Intent launchIntentForUser = getLaunchIntentForUser(string8, i4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, launchIntentForUser);
                    return true;
                case 12:
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onStreamedAppChanged(string9, string10, i5);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    Intent getLaunchIntentForUser(String str, int i);

    PendingIntent getPendingIntentForUser(Intent intent, int i);

    void onAssociationDialogShown(String str);

    void onAssociationResultMessage(boolean z, String str, String str2);

    void onAssociationState(boolean z, String str);

    void onStreamedAppChanged(String str, String str2, int i);

    void sendSignalingMessage(String str, byte[] bArr);

    void streamStarted(String str);

    void streamStopped(String str);

    void tearDownSignaling();
}
