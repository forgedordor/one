package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfqt implements eyik {
    private final dfqu a;
    private final int b;

    public dfqt(dfqu dfquVar, int i) {
        this.a = dfquVar;
        this.b = i;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        switch (this.b) {
            case 0:
                return eyjt.a(this.a.g, eyim.a);
            case 1:
                dfqu dfquVar = this.a;
                dfny dfnyVar = dftq.a;
                SendMessageRequest sendMessageRequest = (SendMessageRequest) dfquVar.a;
                sendMessageRequest.getClass();
                return sendMessageRequest;
            case 2:
                dfqu dfquVar2 = this.a;
                return new dfuv(dfquVar2.b, (dgwa) ((eyig) dfquVar2.k).a, new efnm(new efob()), new ebcm((Context) ((eyig) dfquVar2.c).a));
            case 3:
                dfqu dfquVar3 = this.a;
                return new dfrr(dfquVar3.c, dfquVar3.r);
            case 4:
                return new dfuw();
            case 5:
                efdi efdiVar = (efdi) this.a.a;
                efdiVar.getClass();
                return efdiVar;
            case 6:
                dfqu dfquVar4 = this.a;
                return new dfrh(dfquVar4.H, dfquVar4.k, dfquVar4.I, dfquVar4.J, dfquVar4.K);
            case 7:
                efft efftVar = (efft) this.a.a;
                efftVar.getClass();
                return efftVar;
            case 8:
                AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) this.a.a;
                addUserToGroupRequest.getClass();
                return addUserToGroupRequest;
            case 9:
                CreateGroupRequest createGroupRequest = (CreateGroupRequest) this.a.a;
                createGroupRequest.getClass();
                return createGroupRequest;
            case 10:
                RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) this.a.a;
                removeUserFromGroupRequest.getClass();
                return removeUserFromGroupRequest;
            case 11:
                TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) this.a.a;
                triggerGroupNotificationRequest.getClass();
                return triggerGroupNotificationRequest;
            case 12:
                dfqu dfquVar5 = this.a;
                int i = dfud.b;
                UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) dfquVar5.a;
                updateGroupRequest.getClass();
                return updateGroupRequest;
            default:
                dfqu dfquVar6 = this.a;
                return new dfuf(dfquVar6.av, dfquVar6.r);
        }
    }
}
