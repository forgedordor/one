package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dskr implements eora {
    final /* synthetic */ dsks a;

    public dskr(dsks dsksVar) {
        this.a = dsksVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Map map = (Map) obj;
        dsks dsksVar = this.a;
        synchronized (dsksVar) {
            if (!dsksVar.b) {
                dsksVar.a = new HashMap(map);
            }
            dsksVar.d = null;
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dsks dsksVar = this.a;
        synchronized (dsksVar) {
            dsksVar.d = null;
        }
    }
}
