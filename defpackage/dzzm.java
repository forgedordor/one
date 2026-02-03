package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzm implements dzxw {
    public static final Map a = new csq();
    public final SharedPreferences b;
    public SharedPreferences.OnSharedPreferenceChangeListener c;
    public volatile Map e;
    public final Object d = new Object();
    public final List f = new ArrayList();

    public dzzm(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }

    static synchronized void b() {
        Map map = a;
        for (dzzm dzzmVar : map.values()) {
            SharedPreferences sharedPreferences = dzzmVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = dzzmVar.c;
            onSharedPreferenceChangeListener.getClass();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        map.clear();
    }

    @Override // defpackage.dzxw
    public final Object a(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.b.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
