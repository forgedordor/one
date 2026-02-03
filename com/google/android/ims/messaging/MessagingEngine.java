package com.google.android.ims.messaging;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.IMessaging;
import com.google.android.rcs.client.messaging.JoinGroupRequest;
import com.google.android.rcs.client.messaging.JoinGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import defpackage.deza;
import defpackage.dfny;
import defpackage.dfru;
import defpackage.dfux;
import defpackage.dfvj;
import defpackage.dfvk;
import defpackage.dfwi;
import defpackage.dfwl;
import defpackage.dfxf;
import defpackage.dfxl;
import defpackage.dfxo;
import defpackage.dfxr;
import defpackage.dhip;
import defpackage.dhja;
import defpackage.efbm;
import defpackage.efbs;
import defpackage.efbw;
import defpackage.efby;
import defpackage.efcf;
import defpackage.efcq;
import defpackage.efcv;
import defpackage.efcz;
import defpackage.efdb;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.eork;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.fhaz;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MessagingEngine extends IMessaging.Stub {
    private static final dhip a = new dhip("MessagingEngine");
    private final eosc b;
    private final fcsu c;
    private final dfvj d;
    private final fcsu e;
    private final deza f;
    private final dfux g;
    private final dfxl h;
    private final dfwl i;
    private final dfwi j;
    private final dfxf k;
    private final dfxr l;
    private final dfxo m;

    public MessagingEngine(eosc eoscVar, fcsu<dfvk> fcsuVar, dfvj dfvjVar, dfxl dfxlVar, dfwl dfwlVar, dfwi dfwiVar, dfxf dfxfVar, dfxr dfxrVar, dfxo dfxoVar, fcsu<dfru> fcsuVar2, deza dezaVar, dfux dfuxVar) {
        this.b = eoscVar;
        this.c = fcsuVar;
        this.d = dfvjVar;
        this.e = fcsuVar2;
        this.f = dezaVar;
        this.h = dfxlVar;
        this.i = dfwlVar;
        this.j = dfwiVar;
        this.k = dfxfVar;
        this.l = dfxrVar;
        this.m = dfxoVar;
        this.g = dfuxVar;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        dhja.l(a, "addUserToGroup, conversationId:{%s}", addUserToGroupRequest.b().b());
        eork.r(((dfru) this.e.b()).b(addUserToGroupRequest), this.j.a(addUserToGroupRequest), this.b);
        efbm efbmVar = new efbm();
        efbmVar.b(MessagingResult.e);
        return efbmVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
        dhja.l(a, "createGroup, conversationId:{%s}", createGroupRequest.d());
        eork.r(((dfru) this.e.b()).c(createGroupRequest), this.i.a(createGroupRequest), this.b);
        efbs efbsVar = new efbs();
        efbsVar.b(MessagingResult.e);
        return efbsVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
        ekgb ekgbVarG;
        dhja.l(a, "getGroupNotifications, limit:{%s}", Integer.valueOf(getGroupNotificationsRequest.a()));
        efbw efbwVar = new efbw();
        efbwVar.c(MessagingResult.d);
        int iA = getGroupNotificationsRequest.a();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        dfvj dfvjVar = this.d;
        if (iA <= 0) {
            synchronized (dfvjVar.a) {
                Queue queue = dfvjVar.b;
                dhja.c("Group notifications queue: pop operation, popCount:{%s}, queueSize:{0}", Integer.valueOf(queue.size()));
                ekfwVar.j(queue);
                queue.clear();
                ekgbVarG = ekfwVar.g();
            }
        } else {
            synchronized (dfvjVar.a) {
                int i2 = 0;
                while (i2 < iA) {
                    GroupNotification groupNotification = (GroupNotification) dfvjVar.b.poll();
                    if (groupNotification == null) {
                        break;
                    }
                    ekfwVar.h(groupNotification);
                    i2++;
                }
                dhja.c("Group notifications queue: pop operation, popCount:{%s}, queueSize:{%s}", Integer.valueOf(i2), Integer.valueOf(dfvjVar.b.size()));
            }
            ekgbVarG = ekfwVar.g();
        }
        efbwVar.b(ekgbVarG);
        return efbwVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
        ekgb ekgbVarG;
        dhja.l(a, "getMessages, limit:{%s}", Integer.valueOf(getMessagesRequest.a()));
        efby efbyVar = new efby();
        efbyVar.c(MessagingResult.d);
        dfvk dfvkVar = (dfvk) this.c.b();
        int iA = getMessagesRequest.a();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (iA < 0) {
            synchronized (dfvkVar.a) {
                Queue queue = dfvkVar.b;
                dhja.c("Messages queue: pop operation, popCount:{%s}, queueSize:{0}.", Integer.valueOf(queue.size()));
                ekfwVar.j(queue);
                queue.clear();
            }
            ekgbVarG = ekfwVar.g();
        } else {
            synchronized (dfvkVar.a) {
                int i2 = 0;
                while (i2 < iA) {
                    MessageNotification messageNotification = (MessageNotification) dfvkVar.b.poll();
                    if (messageNotification == null) {
                        break;
                    }
                    ekfwVar.h(messageNotification);
                    i2++;
                }
                dhja.c("Messages queue: pop operation, popCount:{%s}, queueSize:{%s}.", Integer.valueOf(i2), Integer.valueOf(dfvkVar.b.size()));
            }
            ekgbVarG = ekfwVar.g();
        }
        efbyVar.b(ekgbVarG);
        return efbyVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public int getServiceVersion() {
        return 1;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
        dhja.l(a, "joinGroup, conversationId:{%s}", joinGroupRequest.b().b());
        efcf efcfVar = new efcf();
        efcfVar.b(MessagingResult.d);
        return efcfVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        dhja.l(a, "removeUserFromGroup, conversationId:{%s}", removeUserFromGroupRequest.b().b());
        eork.r(((dfru) this.e.b()).d(removeUserFromGroupRequest), this.k.a(removeUserFromGroupRequest), this.b);
        efcq efcqVar = new efcq();
        efcqVar.b(MessagingResult.e);
        return efcqVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        String strH = sendMessageRequest.c().h();
        dhja.l(a, "sendMessage, messageId:{%s}, messageClass:{%s}", strH, sendMessageRequest.d());
        dfny dfnyVar = deza.b;
        if (((Boolean) dfnyVar.a()).booleanValue()) {
            this.f.f((fhaz) this.g.fM(sendMessageRequest.h()), strH, 5);
        }
        eork.r(((dfru) this.e.b()).e(sendMessageRequest), this.h.a(sendMessageRequest), this.b);
        if (((Boolean) dfnyVar.a()).booleanValue()) {
            this.f.f((fhaz) this.g.fM(sendMessageRequest.h()), strH, 6);
        }
        efcv efcvVar = new efcv();
        efcvVar.b(MessagingResult.e);
        return efcvVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        dhja.l(a, "triggerGroupNotification, conversationId:{%s}", triggerGroupNotificationRequest.b().b());
        eork.r(((dfru) this.e.b()).f(triggerGroupNotificationRequest), this.m.a(triggerGroupNotificationRequest), this.b);
        efcz efczVar = new efcz();
        efczVar.b(MessagingResult.e);
        return efczVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
        dhja.l(a, "updateGroup, conversationId:{%s}", updateGroupRequest.b().b());
        eork.r(((dfru) this.e.b()).g(updateGroupRequest), this.l.a(updateGroupRequest), this.b);
        efdb efdbVar = new efdb();
        efdbVar.b(MessagingResult.e);
        return efdbVar.a();
    }
}
