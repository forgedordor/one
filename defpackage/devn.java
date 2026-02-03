package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devn implements devf {
    public final AtomicBoolean a = new AtomicBoolean();
    private HashMap j = null;
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    public final HashMap e = new HashMap(16, 1.0f);
    public Object f = null;
    public boolean g = false;
    public String[] h = new String[0];
    public final devk i = new devk();

    public static final void e(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public static final Object f(Map map, String str, Object obj) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // defpackage.devf
    public final String a(ContentResolver contentResolver, String str, String str2) {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        e(contentResolver);
        synchronized (this) {
            c(contentResolver);
            Object obj = this.f;
            if (this.j.containsKey(str)) {
                String str3 = (String) this.j.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            for (String str4 : this.h) {
                if (str.startsWith(str4)) {
                    if (!this.g) {
                        b(contentResolver, this.h);
                        if (this.j.containsKey(str)) {
                            String str5 = (String) this.j.get(str);
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return str2;
                        }
                    }
                    return str2;
                }
            }
            try {
                uri = deve.a;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (devm unused) {
            }
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new devm("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new devm("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(1);
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } else {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        string = null;
                    }
                    if (string != null && string.equals(str2)) {
                        string = str2;
                    }
                    synchronized (this) {
                        if (obj == this.f) {
                            this.j.put(str, string);
                        }
                    }
                    return string != null ? string : str2;
                } finally {
                }
            } catch (RemoteException e) {
                throw new devm(e);
            }
        }
    }

    public final void b(ContentResolver contentResolver, String[] strArr) {
        try {
            HashMap map = (HashMap) devk.a(contentResolver, strArr, new devl() { // from class: devh
                @Override // defpackage.devl
                public final Map a(int i) {
                    return new HashMap(i, 1.0f);
                }
            });
            if (!map.isEmpty()) {
                Set setKeySet = map.keySet();
                setKeySet.removeAll(this.b.keySet());
                setKeySet.removeAll(this.c.keySet());
                setKeySet.removeAll(this.d.keySet());
                setKeySet.removeAll(this.e.keySet());
            }
            if (!map.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = map;
                } else {
                    this.j.putAll(map);
                }
            }
            this.g = true;
        } catch (devm unused) {
        }
    }

    public final void c(ContentResolver contentResolver) {
        if (this.j == null) {
            this.a.set(false);
            this.j = new HashMap(16, 1.0f);
            this.f = new Object();
            contentResolver.registerContentObserver(deve.a, true, new devj(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.j.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f = new Object();
            this.g = false;
        }
    }

    public final void d(Object obj, Map map, String str, Object obj2) {
        if (obj == this.f) {
            map.put(str, obj2);
            this.j.remove(str);
        }
    }
}
