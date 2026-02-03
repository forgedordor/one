package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.CpmGroupManagement;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementDeserializer;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfuc extends dgym {
    public final ListenableFuture a = kol.a(new koi() { // from class: dfua
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.d = kogVar;
            return "groupManagementOperation";
        }
    });
    public final UpdateGroupRequest b;
    public final String c;
    public kog d;
    private final dgzn e;
    private final String f;
    private final eosd g;
    private ListenableFuture h;
    private final dfuw i;

    public dfuc(eosd eosdVar, dfuw dfuwVar, UpdateGroupRequest updateGroupRequest, String str, String str2, dgzn dgznVar) {
        this.b = updateGroupRequest;
        this.c = str;
        this.f = str2;
        this.e = dgznVar;
        this.g = eosdVar;
        this.i = dfuwVar;
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void a(dgyx dgyxVar, int i) {
        if (this.c.equals(dgyxVar.k)) {
            MessagingResult messagingResultA = this.i.apply(this.e.S);
            efcb efcbVar = new efcb();
            efcbVar.b(this.b.b());
            efcbVar.c(messagingResultA);
            r(efcbVar.a());
        }
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void b(dgyx dgyxVar) {
        if (this.c.equals(dgyxVar.k)) {
            this.h = this.g.schedule(new Callable() { // from class: dfub
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dfuc dfucVar = this.a;
                    dhja.q("Timeout while waiting for group management response for message: %s", dfucVar.c);
                    efcb efcbVar = new efcb();
                    efcbVar.b(dfucVar.b.b());
                    efcbVar.c(MessagingResult.g);
                    GroupOperationResult groupOperationResultA = efcbVar.a();
                    dfucVar.r(groupOperationResultA);
                    return groupOperationResultA;
                }
            }, ((Long) dfpk.a().b.k.a()).longValue(), TimeUnit.SECONDS);
        }
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void c(dgyx dgyxVar) {
        Optional optionalD = ((Boolean) dfud.a.a()).booleanValue() ? d(dgyxVar) : q(dgyxVar);
        if (optionalD.isEmpty()) {
            dhja.c("Not response of this message %s, ignore it.", this.f);
            return;
        }
        try {
            ListenableFuture listenableFuture = this.h;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            this.e.aU(this);
            Optional<GroupData> groupData = ((CpmGroupManagement) optionalD.get()).getGroupData();
            if (!((Boolean) dfud.a.a()).booleanValue()) {
                if (groupData.isPresent() && groupData.get().getRequestOrResponse().getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
                    efcb efcbVar = new efcb();
                    efcbVar.b(this.b.b());
                    efcbVar.c(MessagingResult.d);
                    r(efcbVar.a());
                    return;
                }
                return;
            }
            if (groupData.isEmpty() || !GroupManagementRequestOrResponse.Kind.RESPONSE.equals(groupData.get().getRequestOrResponse().getKind())) {
                dhja.q("%s: Unexpected response to CpmGroupManagement request", this.c);
                efcb efcbVar2 = new efcb();
                efcbVar2.b(this.b.b());
                effe effeVarD = MessagingResult.d();
                effeVarD.c(15);
                efcbVar2.c(effeVarD.e());
                r(efcbVar2.a());
                return;
            }
            int responseCode = groupData.get().getRequestOrResponse().response().getResponseCode();
            if (responseCode == 200) {
                efcb efcbVar3 = new efcb();
                efcbVar3.b(this.b.b());
                efcbVar3.c(MessagingResult.d);
                r(efcbVar3.a());
                return;
            }
            dhja.q("%s: CpmGroupManagement request failed with response code %d", this.c, Integer.valueOf(responseCode));
            efcb efcbVar4 = new efcb();
            efcbVar4.b(this.b.b());
            effe effeVarD2 = MessagingResult.d();
            effeVarD2.c(15);
            efcbVar4.c(effeVarD2.e());
            r(efcbVar4.a());
        } catch (Throwable th) {
            this.e.aU(this);
            throw th;
        }
    }

    final Optional d(dgyx dgyxVar) {
        String str = dgyxVar.h;
        byte[] bArrI = dgyxVar.f;
        if ("message/cpim".equals(str)) {
            try {
                efgz efgzVar = ((efgn) efhe.a(dgyxVar.f)).c;
                str = (String) efgzVar.g().orElse(str);
                bArrI = ((efgp) efgzVar).a.I();
            } catch (IOException unused) {
                return Optional.empty();
            }
        }
        if (!GroupManagementContentType.CPM_GROUP_DATA_CONTENT_TYPE.h(str)) {
            return Optional.empty();
        }
        try {
            CpmGroupManagement cpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(bArrI);
            return !this.f.equals(cpmGroupManagement.getMessageId()) ? Optional.empty() : Optional.of(cpmGroupManagement);
        } catch (IOException | XmlPullParserException e) {
            dhja.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
            return Optional.empty();
        }
    }

    final Optional q(dgyx dgyxVar) {
        if (!GroupManagementContentType.CONTENT_TYPE.equals(dgyxVar.h)) {
            return Optional.empty();
        }
        try {
            CpmGroupManagement cpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(dgyxVar.f);
            return !this.f.equals(cpmGroupManagement.getMessageId()) ? Optional.empty() : Optional.of(cpmGroupManagement);
        } catch (IOException | XmlPullParserException e) {
            dhja.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
            return Optional.empty();
        }
    }

    public final void r(GroupOperationResult groupOperationResult) {
        kog kogVar = this.d;
        kogVar.getClass();
        kogVar.b(groupOperationResult);
    }
}
