package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementSerializer;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfue extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;
    private final eyir g;

    public dfue(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5, eyir eyirVar6) {
        super(eyikVar2, new eyji(dfue.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
        this.g = eyje.c(eyirVar6);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) throws dgzc {
        List list = (List) obj;
        UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) list.get(0);
        dfvw dfvwVar = (dfvw) list.get(1);
        dfuv dfuvVar = (dfuv) list.get(2);
        crmx crmxVar = (crmx) list.get(3);
        dfuw dfuwVar = (dfuw) list.get(4);
        dfuf dfufVar = (dfuf) list.get(5);
        int i = dfud.b;
        if (dfvwVar.d().isEmpty()) {
            Optional map = dfvwVar.c().map(dfuwVar);
            effe effeVarD = MessagingResult.d();
            effeVarD.c(16);
            MessagingResult messagingResult = (MessagingResult) map.orElse(effeVarD.e());
            efcb efcbVar = new efcb();
            efcbVar.c(messagingResult);
            efcbVar.b(updateGroupRequest.b());
            return eork.i(efcbVar.a());
        }
        Object obj2 = dfvwVar.d().get();
        String strB = dhil.b();
        String string = Long.toString(new Random().nextInt(Alert.DURATION_SHOW_INDEFINITELY));
        if (updateGroupRequest.d().isEmpty()) {
            throw new IllegalArgumentException("Only subject modification allowed");
        }
        String str = (String) updateGroupRequest.d().get();
        byte[] bArrCreateGroupSubjectDeleteXml = str.isEmpty() ? GroupManagementSerializer.createGroupSubjectDeleteXml(string) : GroupManagementSerializer.createGroupSubjectChangeXml(string, str);
        String strO = dhjv.o(((dgzu) ((dgwe) obj2).i).r(), crmxVar);
        efjr efjrVarI = Message.i();
        efjrVarI.f(strB);
        efhg efhgVar = new efhg();
        efhgVar.b(evqs.x(bArrCreateGroupSubjectDeleteXml));
        efhgVar.c(ContentType.e(GroupManagementContentType.CONTENT_TYPE));
        efjrVarI.k(AutoOneOf_Message_MessageContent.a(efhgVar.a()));
        efid efidVar = new efid();
        efidVar.c(1);
        efidVar.b(strO);
        efjrVarI.i(efidVar.a());
        dgyx dgyxVarB = dfuvVar.b(updateGroupRequest.b(), efjrVarI.a(), Optional.empty(), efkm.MESSAGING_METHOD_CHAT);
        eosd eosdVar = (eosd) ((eyig) dfufVar.a).a;
        dfuw dfuwVar2 = (dfuw) dfufVar.b.b();
        updateGroupRequest.getClass();
        string.getClass();
        dgzn dgznVar = (dgzn) obj2;
        dfuc dfucVar = new dfuc(eosdVar, dfuwVar2, updateGroupRequest, strB, string, dgznVar);
        dgznVar.aF(dfucVar);
        dgznVar.aV(dgyxVarB);
        return dfucVar.a;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.g;
        eyir eyirVar2 = this.f;
        eyir eyirVar3 = this.e;
        eyir eyirVar4 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar4.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
