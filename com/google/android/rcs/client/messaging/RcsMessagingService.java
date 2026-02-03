package com.google.android.rcs.client.messaging;

import android.content.Context;
import android.os.RemoteException;
import defpackage.cqca;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efao;
import defpackage.efaq;
import defpackage.efar;
import defpackage.efff;
import defpackage.effg;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RcsMessagingService extends efaj<IMessaging> implements efff {
    public static final dfny h = dfnv.b("rcs_messaging_service_connection_deprecated");

    public RcsMessagingService(Context context, efaq efaqVar) {
        super(IMessaging.class, context, efaqVar, 1, Optional.empty());
    }

    @Override // defpackage.efff
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) throws efar {
        b();
        try {
            return h().addUserToGroup(addUserToGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling addUserToGroup: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling addUserToGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efaj
    protected final void b() {
        try {
            super.b();
        } catch (efao e) {
            throw new effg(e.getMessage(), e);
        }
    }

    @Override // defpackage.efff
    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) throws efar {
        b();
        try {
            return h().createGroup(createGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling createGroup: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling createGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) throws efar {
        b();
        try {
            return h().getGroupNotifications(getGroupNotificationsRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling getGroupNotifications: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling getGroupNotifications: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) throws efar {
        b();
        try {
            return h().getMessages(getMessagesRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling getMessages: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling getMessages: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "MessagingSessionServiceVersions";
    }

    protected final IMessaging h() {
        try {
            return (IMessaging) super.a();
        } catch (efao e) {
            throw new effg(e.getMessage(), e);
        }
    }

    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) throws efar {
        b();
        try {
            return h().joinGroup(joinGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling joinGroup: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling joinGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efff
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) throws efar {
        b();
        try {
            return h().removeUserFromGroup(removeUserFromGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling removeUserFromGroup: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling removeUserFromGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efff
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) throws efar {
        b();
        try {
            return h().revokeMessage(revokeMessageRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling revokeMessage: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling revokeMessage: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) throws efar {
        b();
        try {
            return h().sendMessage(sendMessageRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling sendMessage: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling sendMessage: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efff
    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) throws efar {
        b();
        try {
            return h().triggerGroupNotification(triggerGroupNotificationRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling triggerGroupNotification: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling triggerGroupNotification: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.efff
    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) throws efar {
        b();
        try {
            return h().updateGroup(updateGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.f("RcsClientLib", "Error while calling updateGroup: ".concat(String.valueOf(e.getMessage())));
            throw new effg("Error while calling updateGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
