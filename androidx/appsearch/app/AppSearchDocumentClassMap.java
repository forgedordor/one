package androidx.appsearch.app;

import android.util.Log;
import defpackage.a;
import defpackage.csq;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppSearchDocumentClassMap {
    private static volatile Map b;
    private static final Object a = new Object();
    private static volatile Map c = new csq();

    public static Class a(Map map, String str, Class cls) {
        Class<?> cls2;
        List list = (List) map.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                String str2 = (String) list.get(i);
                try {
                    Object obj = a;
                    synchronized (obj) {
                        cls2 = (Class) c.get(str2);
                    }
                    if (cls2 == null) {
                        cls2 = Class.forName(str2);
                        synchronized (obj) {
                            c.put(str2, cls2);
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    Log.w("AppSearchDocumentClassM", a.a(str2, "Failed to load document class \"", "\". Perhaps the class was proguarded out?"));
                }
                if (cls.isAssignableFrom(cls2)) {
                    return cls2.asSubclass(cls);
                }
            }
        }
        return null;
    }
}
