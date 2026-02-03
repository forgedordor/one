package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dexg implements dfhz {
    final /* synthetic */ dexn a;

    public dexg(dexn dexnVar) {
        this.a = dexnVar;
    }

    @Override // defpackage.dfhz
    public final void a(dgyx dgyxVar, long j, String str) {
        dexn dexnVar = this.a;
        ConcurrentHashMap concurrentHashMap = dexnVar.e;
        Long lValueOf = Long.valueOf(j);
        dgzn dgznVar = (dgzn) concurrentHashMap.get(lValueOf);
        if (dgznVar == null) {
            dhja.q("Session %d not found: %s", lValueOf, dgyxVar.c());
            return;
        }
        dexnVar.k.b(dgznVar, str);
        dexnVar.s(dgyxVar, j, str, dgznVar);
        dhja.c("Timestamp for MESSAGE_PROCESSED: %d", dhkl.a());
    }
}
