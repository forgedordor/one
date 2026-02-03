package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egda {
    private final Map a;

    public egda(Map map) {
        this.a = map;
    }

    public final ListenableFuture a(String str) {
        Map map = this.a;
        ejwl.p(map.containsKey(str), "No AddAccountHandler found for account type %s", str);
        return ((egcz) map.get(str)).a();
    }

    public final boolean b(String str) {
        Map map = this.a;
        return map.containsKey(str) && ((egcz) map.get(str)).b();
    }
}
