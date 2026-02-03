package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dexh implements dfhz {
    final /* synthetic */ dexn a;

    public dexh(dexn dexnVar) {
        this.a = dexnVar;
    }

    @Override // defpackage.dfhz
    public final void a(dgyx dgyxVar, long j, String str) throws IOException {
        dexn dexnVar = this.a;
        ConcurrentHashMap concurrentHashMap = dexnVar.e;
        Long lValueOf = Long.valueOf(j);
        dgzn dgznVar = (dgzn) concurrentHashMap.get(lValueOf);
        if (dgznVar == null) {
            dhja.q("Session %d not found: %s", lValueOf, dgyxVar.c());
            return;
        }
        byte[] bArr = dgyxVar.f;
        dhaa dhaaVar = dexnVar.k;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                dgzy dgzyVarA = new dhah().a(byteArrayInputStream);
                dhja.c("Received composing event for %s: %s", dhiz.USER_ID.c(str), dgzyVarA);
                if (dgzyVarA.a) {
                    dhab dhabVar = dhaaVar.b;
                    dhabVar.getClass();
                    dhabVar.a(dgznVar, str, true);
                    long j2 = dgzyVarA.b;
                    if (j2 != 0) {
                        dhaaVar.a(dgznVar, j2, str);
                    } else {
                        dhaaVar.a(dgznVar, 30L, str);
                    }
                } else {
                    dhaaVar.b(dgznVar, str);
                }
                byteArrayInputStream.close();
            } finally {
            }
        } catch (Exception e) {
            dhja.i(e, "Can't parse is-composing event", new Object[0]);
        }
    }
}
