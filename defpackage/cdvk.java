package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.Geller;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdvk implements eyif {
    public static drcw a(Context context, Geller geller, String str, String str2, final dqzt dqztVar, duzr duzrVar, final drdk drdkVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map) {
        evrj evrjVar = cdvj.a;
        drcv drcvVar = new drcv(geller, str2, duzrVar, ekon.a, executorService, executorService3, executorService2);
        drcvVar.m = context;
        drcvVar.l = ekgp.j(map);
        drcvVar.h = new ejvr() { // from class: drct
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return dqztVar;
            }
        };
        drcvVar.k = str;
        drcvVar.i = cdvj.a;
        drcvVar.c = new ejvr() { // from class: drcu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return drdkVar;
            }
        };
        ejwl.m(drcvVar.c != null, "A SyncContextGenerator must be set for Geller");
        return new drcw(drcvVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
