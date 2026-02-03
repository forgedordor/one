package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtl {
    private final ConcurrentMap a = new ConcurrentHashMap();
    private final Context b;

    public dvtl(Context context) {
        this.b = context;
    }

    public final synchronized SharedPreferences a(dwje dwjeVar) {
        Long lValueOf = Long.valueOf(dwjeVar.a());
        ConcurrentMap concurrentMap = this.a;
        if (concurrentMap.containsKey(lValueOf)) {
            return (SharedPreferences) concurrentMap.get(lValueOf);
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences(String.format("lighter_messaging_prefs_%d.xml", lValueOf), 0);
        return (SharedPreferences) ejwi.i((SharedPreferences) concurrentMap.putIfAbsent(lValueOf, sharedPreferences)).e(sharedPreferences);
    }
}
