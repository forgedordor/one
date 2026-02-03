package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfru {
    private final Context a;
    private final Executor b;
    private final diep c;
    private final eosc d;
    private final ebja e;
    private final eblg f;
    private final dgxf g;
    private final dfvy h;
    private final dgwa i;
    private final dfxx j;
    private final crmx k;
    private final dfrs l;
    private final eosd m;
    private final dfrq n;
    private final dfrn o;
    private final dhgr p;
    private final dhes q;
    private final dgrs r;
    private final dfwc s;
    private final dfty t;

    public dfru(Context context, Executor executor, diep diepVar, eosc eoscVar, ebja ebjaVar, eblg eblgVar, dgxf dgxfVar, dfvy dfvyVar, dgwa dgwaVar, dfxx dfxxVar, crmx crmxVar, dfrs dfrsVar, eosd eosdVar, dfrq dfrqVar, dfrn dfrnVar, dhgr dhgrVar, dhes dhesVar, dgrs dgrsVar, dfwc dfwcVar, dfty dftyVar) {
        this.a = context;
        this.b = executor;
        this.c = diepVar;
        this.d = eoscVar;
        this.e = ebjaVar;
        this.f = eblgVar;
        this.g = dgxfVar;
        this.h = dfvyVar;
        this.i = dgwaVar;
        this.j = dfxxVar;
        this.k = crmxVar;
        this.l = dfrsVar;
        this.m = eosdVar;
        this.n = dfrqVar;
        this.o = dfrnVar;
        this.p = dhgrVar;
        this.q = dhesVar;
        this.r = dgrsVar;
        this.s = dfwcVar;
        this.t = dftyVar;
    }

    public final dfrv a() {
        dfqs dfqsVar = new dfqs();
        dfqsVar.a = this.a;
        dfqsVar.b = this.b;
        dfqsVar.c = this.c;
        dfqsVar.d = this.d;
        dfqsVar.e = this.e;
        eblg eblgVar = this.f;
        eblgVar.getClass();
        dfqsVar.f = eblgVar;
        dfqsVar.g = this.g;
        dfqsVar.h = this.h;
        dgwa dgwaVar = this.i;
        dgwaVar.getClass();
        dfqsVar.i = dgwaVar;
        dfqsVar.j = this.j;
        dfqsVar.k = this.k;
        dfrs dfrsVar = this.l;
        dfrsVar.getClass();
        dfqsVar.l = dfrsVar;
        dfqsVar.m = this.m;
        dfqsVar.n = this.n;
        dfqsVar.o = this.o;
        dfqsVar.p = this.p;
        dfqsVar.q = this.q;
        dfqsVar.r = this.r;
        dfqsVar.t = this.t;
        dfwc dfwcVar = this.s;
        dfwcVar.getClass();
        dfqsVar.s = dfwcVar;
        return dfqsVar;
    }

    public final ListenableFuture b(AddUserToGroupRequest addUserToGroupRequest) {
        dfrv dfrvVarA = a();
        dfrvVarA.b(addUserToGroupRequest);
        return ((dfqu) dfrvVarA.a()).U.d();
    }

    public final ListenableFuture c(CreateGroupRequest createGroupRequest) {
        dfrv dfrvVarA = a();
        dfrvVarA.b(createGroupRequest);
        return ((dfqu) dfrvVarA.a()).Y.d();
    }

    public final ListenableFuture d(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        dfrv dfrvVarA = a();
        dfrvVarA.b(removeUserFromGroupRequest);
        return ((dfqu) dfrvVarA.a()).af.d();
    }

    public final ListenableFuture e(SendMessageRequest sendMessageRequest) {
        dfrv dfrvVarA = a();
        dfrvVarA.b(sendMessageRequest);
        return ((dfqu) dfrvVarA.a()).d.d();
    }

    public final ListenableFuture f(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        dfrv dfrvVarA = a();
        dfrvVarA.b(triggerGroupNotificationRequest);
        return ((dfqu) dfrvVarA.a()).am.d();
    }

    public final ListenableFuture g(UpdateGroupRequest updateGroupRequest) {
        dfrv dfrvVarA = a();
        dfrvVarA.b(updateGroupRequest);
        return ((dfqu) dfrvVarA.a()).aq.d();
    }
}
