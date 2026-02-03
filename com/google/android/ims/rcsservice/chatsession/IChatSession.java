package com.google.android.ims.rcsservice.chatsession;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.group.GroupInfo;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IChatSession extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IChatSession {
        static final int TRANSACTION_addUserToSession = 16;
        static final int TRANSACTION_endSession = 13;
        static final int TRANSACTION_getActiveSessionIds = 2;
        static final int TRANSACTION_getGroupInfo = 5;
        static final int TRANSACTION_getPreferredSessionByUser = 7;
        static final int TRANSACTION_getRemoteUserId = 3;
        static final int TRANSACTION_getSessionState = 6;
        static final int TRANSACTION_getSessionsByUser = 8;
        static final int TRANSACTION_getUpdatedGroupInfo = 28;
        static final int TRANSACTION_getUsersInSession = 4;
        static final int TRANSACTION_isGroupSession = 1;
        static final int TRANSACTION_isMessageRevocationSupported = 29;
        static final int TRANSACTION_joinSession = 14;
        static final int TRANSACTION_leaveSession = 15;
        static final int TRANSACTION_removeUserFromSession = 17;
        static final int TRANSACTION_reportRbmSpam = 25;
        static final int TRANSACTION_revokeMessage = 27;
        static final int TRANSACTION_sendGroupReport = 26;
        static final int TRANSACTION_sendIndicator = 21;
        static final int TRANSACTION_sendMessage = 18;
        static final int TRANSACTION_sendMessageTo = 19;
        static final int TRANSACTION_sendPrivateIndicator = 22;
        static final int TRANSACTION_sendPrivateMessage = 20;
        static final int TRANSACTION_sendReport = 23;
        static final int TRANSACTION_sendSuggestionPostBack = 24;
        static final int TRANSACTION_startGroupSession = 10;
        static final int TRANSACTION_startGroupSessionWithMessage = 11;
        static final int TRANSACTION_startGroupSessionWithMessageAndSubject = 12;
        static final int TRANSACTION_startSessionWithMessage = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IChatSession {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.chatsession.IChatSession");
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult addUserToSession(long j, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(16, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult endSession(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(13, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public long[] getActiveSessionIds() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                long[] jArrCreateLongArray = parcelTransactAndReadException.createLongArray();
                parcelTransactAndReadException.recycle();
                return jArrCreateLongArray;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public GroupInfo getGroupInfo(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                GroupInfo groupInfo = (GroupInfo) sgh.a(parcelTransactAndReadException, GroupInfo.CREATOR);
                parcelTransactAndReadException.recycle();
                return groupInfo;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public long getPreferredSessionByUser(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                long j = parcelTransactAndReadException.readLong();
                parcelTransactAndReadException.recycle();
                return j;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public String getRemoteUserId(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult getSessionState(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public long[] getSessionsByUser(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                long[] jArrCreateLongArray = parcelTransactAndReadException.createLongArray();
                parcelTransactAndReadException.recycle();
                return jArrCreateLongArray;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(28, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public String[] getUsersInSession(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                String[] strArrCreateStringArray = parcelTransactAndReadException.createStringArray();
                parcelTransactAndReadException.recycle();
                return strArrCreateStringArray;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public boolean isGroupSession(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public MessageRevocationSupportedResult isMessageRevocationSupported(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(29, parcelObtainAndWriteInterfaceToken);
                MessageRevocationSupportedResult messageRevocationSupportedResult = (MessageRevocationSupportedResult) sgh.a(parcelTransactAndReadException, MessageRevocationSupportedResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return messageRevocationSupportedResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult joinSession(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(14, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult leaveSession(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(15, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult removeUserFromSession(long j, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult reportRbmSpam(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(25, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult revokeMessage(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(27, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeLong(j2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(26, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendIndicator(long j, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(21, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, chatMessage);
                Parcel parcelTransactAndReadException = transactAndReadException(18, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, chatMessage);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(22, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, chatMessage);
                Parcel parcelTransactAndReadException = transactAndReadException(20, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(23, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeString(str5);
                Parcel parcelTransactAndReadException = transactAndReadException(24, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startGroupSession(String[] strArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, chatMessage);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, chatMessage);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, chatMessage);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) sgh.a(parcelTransactAndReadException, ChatSessionServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return chatSessionServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.chatsession.IChatSession");
        }

        public static IChatSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.chatsession.IChatSession");
            return iInterfaceQueryLocalInterface instanceof IChatSession ? (IChatSession) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    boolean zIsGroupSession = isGroupSession(j);
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsGroupSession ? 1 : 0);
                    return true;
                case 2:
                    long[] activeSessionIds = getActiveSessionIds();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(activeSessionIds);
                    return true;
                case 3:
                    long j2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    String remoteUserId = getRemoteUserId(j2);
                    parcel2.writeNoException();
                    parcel2.writeString(remoteUserId);
                    return true;
                case 4:
                    long j3 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    String[] usersInSession = getUsersInSession(j3);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(usersInSession);
                    return true;
                case 5:
                    long j4 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    GroupInfo groupInfo = getGroupInfo(j4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, groupInfo);
                    return true;
                case 6:
                    long j5 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sessionState = getSessionState(j5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, sessionState);
                    return true;
                case 7:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    long preferredSessionByUser = getPreferredSessionByUser(string);
                    parcel2.writeNoException();
                    parcel2.writeLong(preferredSessionByUser);
                    return true;
                case 8:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    long[] sessionsByUser = getSessionsByUser(string2);
                    parcel2.writeNoException();
                    parcel2.writeLongArray(sessionsByUser);
                    return true;
                case 9:
                    String string3 = parcel.readString();
                    ChatMessage chatMessage = (ChatMessage) sgh.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultStartSessionWithMessage = startSessionWithMessage(string3, chatMessage);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultStartSessionWithMessage);
                    return true;
                case 10:
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultStartGroupSession = startGroupSession(strArrCreateStringArray);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultStartGroupSession);
                    return true;
                case 11:
                    String[] strArrCreateStringArray2 = parcel.createStringArray();
                    ChatMessage chatMessage2 = (ChatMessage) sgh.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultStartGroupSessionWithMessage = startGroupSessionWithMessage(strArrCreateStringArray2, chatMessage2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultStartGroupSessionWithMessage);
                    return true;
                case 12:
                    String[] strArrCreateStringArray3 = parcel.createStringArray();
                    ChatMessage chatMessage3 = (ChatMessage) sgh.a(parcel, ChatMessage.CREATOR);
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultStartGroupSessionWithMessageAndSubject = startGroupSessionWithMessageAndSubject(strArrCreateStringArray3, chatMessage3, string4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultStartGroupSessionWithMessageAndSubject);
                    return true;
                case 13:
                    long j6 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultEndSession = endSession(j6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultEndSession);
                    return true;
                case 14:
                    long j7 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultJoinSession = joinSession(j7);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultJoinSession);
                    return true;
                case 15:
                    long j8 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultLeaveSession = leaveSession(j8);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultLeaveSession);
                    return true;
                case 16:
                    long j9 = parcel.readLong();
                    String string5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultAddUserToSession = addUserToSession(j9, string5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultAddUserToSession);
                    return true;
                case 17:
                    long j10 = parcel.readLong();
                    String string6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultRemoveUserFromSession = removeUserFromSession(j10, string6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultRemoveUserFromSession);
                    return true;
                case 18:
                    long j11 = parcel.readLong();
                    ChatMessage chatMessage4 = (ChatMessage) sgh.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendMessage = sendMessage(j11, chatMessage4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendMessage);
                    return true;
                case 19:
                    String string7 = parcel.readString();
                    ChatMessage chatMessage5 = (ChatMessage) sgh.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendMessageTo = sendMessageTo(string7, chatMessage5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendMessageTo);
                    return true;
                case 20:
                    long j12 = parcel.readLong();
                    String string8 = parcel.readString();
                    ChatMessage chatMessage6 = (ChatMessage) sgh.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendPrivateMessage = sendPrivateMessage(j12, string8, chatMessage6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendPrivateMessage);
                    return true;
                case 21:
                    long j13 = parcel.readLong();
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendIndicator = sendIndicator(j13, i4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendIndicator);
                    return true;
                case 22:
                    long j14 = parcel.readLong();
                    String string9 = parcel.readString();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendPrivateIndicator = sendPrivateIndicator(j14, string9, i5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendPrivateIndicator);
                    return true;
                case 23:
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    long j15 = parcel.readLong();
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendReport = sendReport(string10, string11, string12, j15, i6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendReport);
                    return true;
                case 24:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    String string17 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendSuggestionPostBack = sendSuggestionPostBack(string13, string14, string15, string16, string17);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendSuggestionPostBack);
                    return true;
                case 25:
                    String string18 = parcel.readString();
                    String string19 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultReportRbmSpam = reportRbmSpam(string18, string19);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultReportRbmSpam);
                    return true;
                case 26:
                    long j16 = parcel.readLong();
                    String string20 = parcel.readString();
                    String string21 = parcel.readString();
                    long j17 = parcel.readLong();
                    int i7 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultSendGroupReport = sendGroupReport(j16, string20, string21, j17, i7);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultSendGroupReport);
                    return true;
                case 27:
                    String string22 = parcel.readString();
                    String string23 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult chatSessionServiceResultRevokeMessage = revokeMessage(string22, string23);
                    parcel2.writeNoException();
                    sgh.e(parcel2, chatSessionServiceResultRevokeMessage);
                    break;
                case 28:
                    String string24 = parcel.readString();
                    String string25 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult updatedGroupInfo = getUpdatedGroupInfo(string24, string25);
                    parcel2.writeNoException();
                    sgh.e(parcel2, updatedGroupInfo);
                    break;
                case 29:
                    long j18 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    MessageRevocationSupportedResult messageRevocationSupportedResultIsMessageRevocationSupported = isMessageRevocationSupported(j18);
                    parcel2.writeNoException();
                    sgh.e(parcel2, messageRevocationSupportedResultIsMessageRevocationSupported);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    ChatSessionServiceResult addUserToSession(long j, String str);

    ChatSessionServiceResult endSession(long j);

    long[] getActiveSessionIds();

    GroupInfo getGroupInfo(long j);

    long getPreferredSessionByUser(String str);

    String getRemoteUserId(long j);

    ChatSessionServiceResult getSessionState(long j);

    long[] getSessionsByUser(String str);

    ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2);

    String[] getUsersInSession(long j);

    boolean isGroupSession(long j);

    MessageRevocationSupportedResult isMessageRevocationSupported(long j);

    ChatSessionServiceResult joinSession(long j);

    ChatSessionServiceResult leaveSession(long j);

    ChatSessionServiceResult removeUserFromSession(long j, String str);

    ChatSessionServiceResult reportRbmSpam(String str, String str2);

    ChatSessionServiceResult revokeMessage(String str, String str2);

    ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i);

    ChatSessionServiceResult sendIndicator(long j, int i);

    ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage);

    ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage);

    ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i);

    ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage);

    ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i);

    ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5);

    ChatSessionServiceResult startGroupSession(String[] strArr);

    ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage);

    ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str);

    ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage);
}
