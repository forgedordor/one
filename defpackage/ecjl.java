package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecjl {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Executor c;
    private final ecev d;
    private final eooz e;
    private final Map f;
    private final eclv g;

    public ecjl(Executor executor, ecev ecevVar, eclv eclvVar, Map map) {
        executor.getClass();
        this.c = executor;
        ecevVar.getClass();
        this.d = ecevVar;
        this.g = eclvVar;
        this.f = map;
        ejwl.a(!map.isEmpty());
        this.e = new eooz() { // from class: ecjk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eork.i("");
            }
        };
    }

    public final synchronized ecjh a(ecjj ecjjVar) {
        ecjh ecjhVar;
        Uri uri = ((ecia) ecjjVar).a;
        Map map = this.a;
        ecjhVar = (ecjh) map.get(uri);
        boolean z = true;
        if (ecjhVar == null) {
            ejwl.f(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            String strB = ejwk.b(uri.getLastPathSegment());
            int iLastIndexOf = strB.lastIndexOf(46);
            ejwl.f((iLastIndexOf == -1 ? "" : strB.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            ejwl.b(true, "Proto schema cannot be null");
            ejwl.b(((ecia) ecjjVar).c != null, "Handler cannot be null");
            eclb eclbVar = ((ecia) ecjjVar).e;
            Map map2 = this.f;
            String strB2 = eclbVar.b();
            eclo ecloVar = (eclo) map2.get(strB2);
            if (ecloVar == null) {
                z = false;
            }
            ejwl.f(z, "No XDataStoreVariantFactory registered for ID %s", strB2);
            String strB3 = ejwk.b(uri.getLastPathSegment());
            int iLastIndexOf2 = strB3.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strB3 = strB3.substring(0, iLastIndexOf2);
            }
            ListenableFuture listenableFutureG = eooq.g(eork.i(uri), this.e, eoqg.a);
            Executor executor = this.c;
            ecln eclnVarA = ecloVar.a(ecjjVar, strB3, executor, this.d);
            eclv eclvVar = this.g;
            ecloVar.b();
            ecjh ecjhVar2 = new ecjh(eclnVarA, eclvVar, listenableFutureG, false);
            ekgb ekgbVar = ((ecia) ecjjVar).d;
            if (!ekgbVar.isEmpty()) {
                ecjhVar2.d(new ecjg(ekgbVar, executor));
            }
            map.put(uri, ecjhVar2);
            this.b.put(uri, ecjjVar);
            ecjhVar = ecjhVar2;
        } else {
            ecjj ecjjVar2 = (ecjj) this.b.get(uri);
            if (!ecjjVar.equals(ecjjVar2)) {
                evuh evuhVar = ((ecia) ecjjVar).b;
                String strA = ejxq.a("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", evuhVar.getClass().getSimpleName(), uri);
                ejwl.f(uri.equals(ecjjVar2.a()), strA, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                ejwl.f(evuhVar.equals(ecjjVar2.e()), strA, "schema");
                ejwl.f(((ecia) ecjjVar).c.equals(ecjjVar2.c()), strA, "handler");
                ejwl.f(ekjz.h(((ecia) ecjjVar).d, ecjjVar2.d()), strA, "migrations");
                ejwl.f(((ecia) ecjjVar).e.equals(ecjjVar2.b()), strA, "variantConfig");
                ejwl.f(((ecia) ecjjVar).f == ecjjVar2.f(), strA, "useGeneratedExtensionRegistry");
                ecjjVar2.g();
                ejwl.f(true, strA, "enableTracing");
                throw new IllegalArgumentException(ejxq.a(strA, "unknown"));
            }
        }
        return ecjhVar;
    }
}
