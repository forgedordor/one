package com.google.android.rcs.client.messaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IMessaging extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMessaging {
        static final int TRANSACTION_addUserToGroup = 7;
        static final int TRANSACTION_createGroup = 5;
        static final int TRANSACTION_getGroupNotifications = 9;
        static final int TRANSACTION_getMessages = 4;
        static final int TRANSACTION_getServiceVersion = 1;
        static final int TRANSACTION_joinGroup = 6;
        static final int TRANSACTION_removeUserFromGroup = 8;
        static final int TRANSACTION_revokeMessage = 3;
        static final int TRANSACTION_sendMessage = 2;
        static final int TRANSACTION_triggerGroupNotification = 11;
        static final int TRANSACTION_updateGroup = 10;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMessaging {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.rcs.client.messaging.IMessaging");
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, addUserToGroupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                AddUserToGroupResponse addUserToGroupResponse = (AddUserToGroupResponse) sgh.a(parcelTransactAndReadException, AddUserToGroupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return addUserToGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, createGroupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                CreateGroupResponse createGroupResponse = (CreateGroupResponse) sgh.a(parcelTransactAndReadException, CreateGroupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return createGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getGroupNotificationsRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) sgh.a(parcelTransactAndReadException, GetGroupNotificationsResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return getGroupNotificationsResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getMessagesRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) sgh.a(parcelTransactAndReadException, GetMessagesResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return getMessagesResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public int getServiceVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, joinGroupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                JoinGroupResponse joinGroupResponse = (JoinGroupResponse) sgh.a(parcelTransactAndReadException, JoinGroupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return joinGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, removeUserFromGroupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                RemoveUserFromGroupResponse removeUserFromGroupResponse = (RemoveUserFromGroupResponse) sgh.a(parcelTransactAndReadException, RemoveUserFromGroupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return removeUserFromGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, revokeMessageRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                RevokeMessageResponse revokeMessageResponse = (RevokeMessageResponse) sgh.a(parcelTransactAndReadException, RevokeMessageResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return revokeMessageResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sendMessageRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                SendMessageResponse sendMessageResponse = (SendMessageResponse) sgh.a(parcelTransactAndReadException, SendMessageResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return sendMessageResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, triggerGroupNotificationRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                TriggerGroupNotificationResponse triggerGroupNotificationResponse = (TriggerGroupNotificationResponse) sgh.a(parcelTransactAndReadException, TriggerGroupNotificationResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return triggerGroupNotificationResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, updateGroupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                UpdateGroupResponse updateGroupResponse = (UpdateGroupResponse) sgh.a(parcelTransactAndReadException, UpdateGroupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return updateGroupResponse;
            }
        }

        public Stub() {
            super("com.google.android.rcs.client.messaging.IMessaging");
        }

        public static IMessaging asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.rcs.client.messaging.IMessaging");
            return iInterfaceQueryLocalInterface instanceof IMessaging ? (IMessaging) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int serviceVersion = getServiceVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceVersion);
                    return true;
                case 2:
                    SendMessageRequest sendMessageRequest = (SendMessageRequest) sgh.a(parcel, SendMessageRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    SendMessageResponse sendMessageResponseSendMessage = sendMessage(sendMessageRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, sendMessageResponseSendMessage);
                    return true;
                case 3:
                    RevokeMessageRequest revokeMessageRequest = (RevokeMessageRequest) sgh.a(parcel, RevokeMessageRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RevokeMessageResponse revokeMessageResponseRevokeMessage = revokeMessage(revokeMessageRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, revokeMessageResponseRevokeMessage);
                    return true;
                case 4:
                    GetMessagesRequest getMessagesRequest = (GetMessagesRequest) sgh.a(parcel, GetMessagesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    GetMessagesResponse messages = getMessages(getMessagesRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, messages);
                    return true;
                case 5:
                    CreateGroupRequest createGroupRequest = (CreateGroupRequest) sgh.a(parcel, CreateGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    CreateGroupResponse createGroupResponseCreateGroup = createGroup(createGroupRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, createGroupResponseCreateGroup);
                    return true;
                case 6:
                    JoinGroupRequest joinGroupRequest = (JoinGroupRequest) sgh.a(parcel, JoinGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    JoinGroupResponse joinGroupResponseJoinGroup = joinGroup(joinGroupRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, joinGroupResponseJoinGroup);
                    return true;
                case 7:
                    AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) sgh.a(parcel, AddUserToGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AddUserToGroupResponse addUserToGroupResponseAddUserToGroup = addUserToGroup(addUserToGroupRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, addUserToGroupResponseAddUserToGroup);
                    return true;
                case 8:
                    RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) sgh.a(parcel, RemoveUserFromGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RemoveUserFromGroupResponse removeUserFromGroupResponseRemoveUserFromGroup = removeUserFromGroup(removeUserFromGroupRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, removeUserFromGroupResponseRemoveUserFromGroup);
                    return true;
                case 9:
                    GetGroupNotificationsRequest getGroupNotificationsRequest = (GetGroupNotificationsRequest) sgh.a(parcel, GetGroupNotificationsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    GetGroupNotificationsResponse groupNotifications = getGroupNotifications(getGroupNotificationsRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, groupNotifications);
                    return true;
                case 10:
                    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) sgh.a(parcel, UpdateGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    UpdateGroupResponse updateGroupResponseUpdateGroup = updateGroup(updateGroupRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, updateGroupResponseUpdateGroup);
                    return true;
                case 11:
                    TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) sgh.a(parcel, TriggerGroupNotificationRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TriggerGroupNotificationResponse triggerGroupNotificationResponseTriggerGroupNotification = triggerGroupNotification(triggerGroupNotificationRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, triggerGroupNotificationResponseTriggerGroupNotification);
                    return true;
                default:
                    return false;
            }
        }
    }

    AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest);

    CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest);

    GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest);

    GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest);

    int getServiceVersion();

    JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest);

    RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest);

    RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest);

    SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest);

    TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest);

    UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest);
}
