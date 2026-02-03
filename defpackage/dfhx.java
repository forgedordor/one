package defpackage;

import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.CpmGroupManagement;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementDeserializer;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfhx implements dfhz {
    private final dfdv a;

    public dfhx(dfdv dfdvVar) {
        this.a = dfdvVar;
    }

    @Override // defpackage.dfhz
    public final void a(dgyx dgyxVar, long j, String str) {
        try {
            CpmGroupManagement cpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(dgyxVar.f);
            String messageId = cpmGroupManagement.getMessageId();
            Optional<GroupData> groupData = cpmGroupManagement.getGroupData();
            if (groupData.isPresent() && groupData.get().getRequestOrResponse().getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
                GroupManagementResponse groupManagementResponseResponse = groupData.get().getRequestOrResponse().response();
                Optional<String> responseText = groupManagementResponseResponse.getResponseText();
                dhja.c("Sending CHATSESSION_CPM_GROUP_MANAGEMENT_RESPONSE_RECEIVED with sessionId: %d, messageId: %s, responseCode: %d", Long.valueOf(j), messageId, Integer.valueOf(groupManagementResponseResponse.getResponseCode()));
                final dhbu dhbuVar = new dhbu(50048, j, groupManagementResponseResponse.getResponseCode());
                dhbuVar.g = Optional.of(messageId);
                responseText.ifPresent(new Consumer() { // from class: dfhw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Optional optionalOf = Optional.of((String) obj);
                        dhbu dhbuVar2 = dhbuVar;
                        dhbuVar2.h = optionalOf;
                        new GroupChatSessionEvent(dhbuVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                this.a.c(new GroupChatSessionEvent(dhbuVar), dhjl.GROUP_MANAGEMENT_MESSAGE_FILTER);
            }
        } catch (IOException | XmlPullParserException e) {
            dhja.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
        }
    }
}
