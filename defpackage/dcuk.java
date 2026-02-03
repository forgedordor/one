package defpackage;

import android.os.Bundle;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.RemoteUserReachability;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcuk extends IReachabilityQueryNoCacheCallback.Stub {
    final /* synthetic */ LookupSingleRemoteReachabilityRequest a;
    final /* synthetic */ defr b;
    final /* synthetic */ dcul c;

    public dcuk(dcul dculVar, LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest, defr defrVar) {
        this.a = lookupSingleRemoteReachabilityRequest;
        this.b = defrVar;
        this.c = dculVar;
    }

    @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback
    public final void onFinished(Map map) {
        LookupSingleRemoteReachabilityResponse lookupSingleRemoteReachabilityResponse = new LookupSingleRemoteReachabilityResponse();
        defr defrVar = this.b;
        LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = this.a;
        dcul dculVar = this.c;
        if (map == null || map.isEmpty()) {
            dculVar.a.f(14);
            RemoteUserReachability remoteUserReachability = new RemoteUserReachability();
            remoteUserReachability.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability.b = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability;
            defrVar.b(lookupSingleRemoteReachabilityResponse);
            return;
        }
        Bundle bundle = (Bundle) map.values().iterator().next();
        if (bundle.isEmpty()) {
            dculVar.a.f(14);
            RemoteUserReachability remoteUserReachability2 = new RemoteUserReachability();
            remoteUserReachability2.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability2.b = 0;
            remoteUserReachability2.c = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability2;
            defrVar.b(lookupSingleRemoteReachabilityResponse);
            return;
        }
        RemoteUserReachability remoteUserReachability3 = new RemoteUserReachability();
        remoteUserReachability3.a = lookupSingleRemoteReachabilityRequest.a;
        int i = bundle.getInt("IS_USER_REACHABLE", 0);
        remoteUserReachability3.b = i;
        int i2 = bundle.getInt("IS_USER_MEET_REACHABLE", 0);
        remoteUserReachability3.c = i2;
        dcsz dcszVar = dculVar.a;
        eyaj eyajVar = (eyaj) eyak.a.createBuilder();
        eyajVar.copyOnWrite();
        ((eyak) eyajVar.instance).b = i;
        eyajVar.copyOnWrite();
        ((eyak) eyajVar.instance).c = i2;
        dcszVar.d((eyak) eyajVar.build());
        lookupSingleRemoteReachabilityResponse.a = remoteUserReachability3;
        defrVar.b(lookupSingleRemoteReachabilityResponse);
    }
}
