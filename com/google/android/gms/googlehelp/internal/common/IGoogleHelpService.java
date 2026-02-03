package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleHelpService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleHelpService {
        static final int TRANSACTION_disablePipInCallingApp = 6;
        static final int TRANSACTION_getEscalationOptions = 14;
        static final int TRANSACTION_getRealtimeSupportStatus = 18;
        static final int TRANSACTION_getSuggestions = 13;
        static final int TRANSACTION_hidePipInCallingApp = 5;
        static final int TRANSACTION_processC2cSupportRequest = 12;
        static final int TRANSACTION_processChatSupportRequest = 11;
        static final int TRANSACTION_processGoogleHelp = 1;
        static final int TRANSACTION_processGoogleHelpAndPip = 2;
        static final int TRANSACTION_processInProductHelpAndPip = 17;
        static final int TRANSACTION_processTogglingPip = 3;
        static final int TRANSACTION_requestC2cSupport = 16;
        static final int TRANSACTION_requestChatSupport = 15;
        static final int TRANSACTION_saveAsyncFeedbackPsbd = 10;
        static final int TRANSACTION_saveAsyncFeedbackPsd = 9;
        static final int TRANSACTION_saveAsyncHelpPsd = 8;
        static final int TRANSACTION_showPipInCallingApp = 4;
        static final int TRANSACTION_showPipInCallingAppForActivityTitle = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleHelpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void disablePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void getEscalationOptions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void getRealtimeSupportStatus(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void getSuggestions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void hidePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processC2cSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processChatSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processGoogleHelp(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processGoogleHelpAndPip(GoogleHelp googleHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.d(parcelObtainAndWriteInterfaceToken, bitmap);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processInProductHelpAndPip(InProductHelp inProductHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, inProductHelp);
                sgh.d(parcelObtainAndWriteInterfaceToken, bitmap);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processTogglingPip(Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bitmap);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void requestC2cSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, supportRequestHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void requestChatSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, supportRequestHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, feedbackOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void saveAsyncFeedbackPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void saveAsyncHelpPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void showPipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void showPipInCallingAppForActivityTitle(String str, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        }

        public static IGoogleHelpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            return iInterfaceQueryLocalInterface instanceof IGoogleHelpService ? (IGoogleHelpService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    GoogleHelp googleHelp = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processGoogleHelp(googleHelp, iGoogleHelpCallbacksAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    GoogleHelp googleHelp2 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    Bitmap bitmap = (Bitmap) sgh.a(parcel, Bitmap.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface2 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processGoogleHelpAndPip(googleHelp2, bitmap, iGoogleHelpCallbacksAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Bitmap bitmap2 = (Bitmap) sgh.a(parcel, Bitmap.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface3 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processTogglingPip(bitmap2, iGoogleHelpCallbacksAsInterface3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface4 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    showPipInCallingApp(iGoogleHelpCallbacksAsInterface4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface5 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    hidePipInCallingApp(iGoogleHelpCallbacksAsInterface5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface6 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    disablePipInCallingApp(iGoogleHelpCallbacksAsInterface6);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    String string = parcel.readString();
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface7 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    showPipInCallingAppForActivityTitle(string, iGoogleHelpCallbacksAsInterface7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    long j = parcel.readLong();
                    GoogleHelp googleHelp3 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface8 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAsyncHelpPsd(bundle, j, googleHelp3, iGoogleHelpCallbacksAsInterface8);
                    return true;
                case 9:
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    long j2 = parcel.readLong();
                    GoogleHelp googleHelp4 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface9 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsd(bundle2, j2, googleHelp4, iGoogleHelpCallbacksAsInterface9);
                    return true;
                case 10:
                    FeedbackOptions feedbackOptions = (FeedbackOptions) sgh.a(parcel, FeedbackOptions.CREATOR);
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    long j3 = parcel.readLong();
                    GoogleHelp googleHelp5 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface10 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsbd(feedbackOptions, bundle3, j3, googleHelp5, iGoogleHelpCallbacksAsInterface10);
                    return true;
                case 11:
                    GoogleHelp googleHelp6 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface11 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processChatSupportRequest(googleHelp6, string2, string3, iGoogleHelpCallbacksAsInterface11);
                    return true;
                case 12:
                    GoogleHelp googleHelp7 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface12 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processC2cSupportRequest(googleHelp7, string4, string5, iGoogleHelpCallbacksAsInterface12);
                    return true;
                case 13:
                    GoogleHelp googleHelp8 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface13 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSuggestions(googleHelp8, iGoogleHelpCallbacksAsInterface13);
                    return true;
                case 14:
                    GoogleHelp googleHelp9 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface14 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getEscalationOptions(googleHelp9, iGoogleHelpCallbacksAsInterface14);
                    return true;
                case 15:
                    SupportRequestHelp supportRequestHelp = (SupportRequestHelp) sgh.a(parcel, SupportRequestHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface15 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestChatSupport(supportRequestHelp, iGoogleHelpCallbacksAsInterface15);
                    return true;
                case 16:
                    SupportRequestHelp supportRequestHelp2 = (SupportRequestHelp) sgh.a(parcel, SupportRequestHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface16 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestC2cSupport(supportRequestHelp2, iGoogleHelpCallbacksAsInterface16);
                    return true;
                case 17:
                    InProductHelp inProductHelp = (InProductHelp) sgh.a(parcel, InProductHelp.CREATOR);
                    Bitmap bitmap3 = (Bitmap) sgh.a(parcel, Bitmap.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface17 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processInProductHelpAndPip(inProductHelp, bitmap3, iGoogleHelpCallbacksAsInterface17);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    GoogleHelp googleHelp10 = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks iGoogleHelpCallbacksAsInterface18 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRealtimeSupportStatus(googleHelp10, iGoogleHelpCallbacksAsInterface18);
                    return true;
                default:
                    return false;
            }
        }
    }

    @Deprecated
    void disablePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void getEscalationOptions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void getRealtimeSupportStatus(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void getSuggestions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void hidePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void processC2cSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void processChatSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void processGoogleHelp(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void processGoogleHelpAndPip(GoogleHelp googleHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void processInProductHelpAndPip(InProductHelp inProductHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void processTogglingPip(Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void requestC2cSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void requestChatSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void saveAsyncFeedbackPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void saveAsyncHelpPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void showPipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void showPipInCallingAppForActivityTitle(String str, IGoogleHelpCallbacks iGoogleHelpCallbacks);
}
