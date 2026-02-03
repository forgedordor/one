package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.RequestContext;
import com.google.android.gms.kids.TrustedContactsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdoj b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdoi(fcxy fcxyVar, cdoj cdojVar, String str) {
        super(2, fcxyVar);
        this.b = cdojVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dzub dzubVarD;
        dzub dzubVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            cdoj cdojVar = this.b;
            dzubVarD = ((dzuc) cdojVar.e.b()).d();
            ConversationIdType conversationIdTypeB = barn.b(this.c);
            this.d = dzubVarD;
            this.a = 1;
            Object objB = cdojVar.b.b();
            objB.getClass();
            obj = fdin.a(eicg.a((fcyh) objB), new cdof(null, cdojVar, conversationIdTypeB), this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            dzubVar = (dzub) this.d;
            fctl.b(obj);
            PendingIntent pendingIntent = (PendingIntent) obj;
            ((dzuc) this.b.e.b()).f(dzubVar, cdmd.b, null, dzua.SUCCESS);
            return pendingIntent;
        }
        dzubVarD = (dzub) this.d;
        fctl.b(obj);
        cdoe cdoeVar = (cdoe) obj;
        Set set = cdoeVar.a;
        Set set2 = cdoeVar.b;
        ArrayList arrayList = new ArrayList(fcva.p(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(cdoj.c((String) it.next()));
        }
        if (arrayList.isEmpty()) {
            ekrw ekrwVarJ = cdoj.a.j();
            ekrwVarJ.X(eksq.a, "BugleTrustedContacts");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.S, "TrustedContactsIntents");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/intents/TrustedContactsIntents$getApprovalDialogIntentForConversation$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 134, "TrustedContactsIntents.kt")).q("Try to create an approval dialog with no contacts");
            ((dzuc) this.b.e.b()).f(dzubVarD, cdmd.b, null, dzua.CANCEL);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(cdoj.b((String) it2.next()));
        }
        Uri[] uriArr = (Uri[]) arrayList2.toArray(new Uri[0]);
        ddhv ddhvVar = (ddhv) this.b.d.b();
        TrustedContactsRequest trustedContactsRequest = new TrustedContactsRequest();
        trustedContactsRequest.a = (IndividualContactRequest[]) arrayList.toArray(new IndividualContactRequest[0]);
        RequestContext requestContext = new RequestContext();
        requestContext.b = 1;
        requestContext.c = uriArr;
        trustedContactsRequest.b = requestContext;
        defn defnVarD = ddhvVar.d(trustedContactsRequest);
        this.d = dzubVarD;
        this.a = 2;
        obj = febo.a(defnVarD, this);
        if (obj != fcylVar) {
            dzubVar = dzubVarD;
            PendingIntent pendingIntent2 = (PendingIntent) obj;
            ((dzuc) this.b.e.b()).f(dzubVar, cdmd.b, null, dzua.SUCCESS);
            return pendingIntent2;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdoi cdoiVar = new cdoi(fcxyVar, this.b, this.c);
        cdoiVar.d = obj;
        return cdoiVar;
    }
}
