package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcts extends IReachabilityInviteLinkCallback.Stub {
    final /* synthetic */ defr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dctt c;

    public dcts(dctt dcttVar, defr defrVar, boolean z) {
        this.a = defrVar;
        this.b = z;
        this.c = dcttVar;
    }

    @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback
    public final void onFinished(Map map) {
        boolean z = this.b;
        int i = z ? 16 : 15;
        defr defrVar = this.a;
        dctt dcttVar = this.c;
        if (map == null || map.isEmpty()) {
            dcttVar.b.f(i);
            defrVar.a(new IllegalStateException("Received null or empty result from Duo Reachability Service."));
            return;
        }
        Bundle bundle = (Bundle) map.values().iterator().next();
        GenerateInviteLinkResponse generateInviteLinkResponse = new GenerateInviteLinkResponse();
        if (bundle.isEmpty() || !bundle.containsKey("INVITE_LINK")) {
            dcttVar.b.f(i);
            defrVar.a(new IllegalStateException("Result bundle is empty or does not contain invite link."));
            return;
        }
        String string = bundle.getString("INVITE_LINK");
        dclh.m(string);
        generateInviteLinkResponse.a = string;
        generateInviteLinkResponse.b = dcttVar.a.getString(R.string.generate_invite_link_default_message);
        dcttVar.b.c(z);
        defrVar.b(generateInviteLinkResponse);
    }
}
