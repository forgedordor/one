package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxr implements dzxw {
    public static final Map a = new csq();
    public static final String[] b = {"key", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE};
    public final ContentResolver c;
    public final Uri d;
    private final ContentObserver e;
    private volatile Map g;
    private final Object f = new Object();
    private final List h = new ArrayList();

    private dzxr(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        this.e = new dzxq(this);
    }

    static synchronized void b() {
        Map map = a;
        for (dzxr dzxrVar : map.values()) {
            dzxrVar.c.unregisterContentObserver(dzxrVar.e);
        }
        map.clear();
    }

    public static dzxr d(ContentResolver contentResolver, Uri uri) {
        dzxr dzxrVar;
        synchronized (dzxr.class) {
            Map map = a;
            dzxrVar = (dzxr) map.get(uri);
            if (dzxrVar == null) {
                try {
                    dzxr dzxrVar2 = new dzxr(contentResolver, uri);
                    try {
                        contentResolver.registerContentObserver(uri, false, dzxrVar2.e);
                        map.put(uri, dzxrVar2);
                    } catch (SecurityException unused) {
                    }
                    dzxrVar = dzxrVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return dzxrVar;
    }

    @Override // defpackage.dzxw
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.g;
        if (map2 == null) {
            synchronized (this.f) {
                map2 = this.g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) dzxu.a(new dzxv() { // from class: dzxp
                                @Override // defpackage.dzxv
                                public final Object a() {
                                    dzxr dzxrVar = this.a;
                                    ContentResolver contentResolver = dzxrVar.c;
                                    Uri uri = dzxrVar.d;
                                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                    try {
                                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                            return Collections.EMPTY_MAP;
                                        }
                                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, dzxr.b, null, null, null);
                                        try {
                                            if (cursorQuery == null) {
                                                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                return Collections.EMPTY_MAP;
                                            }
                                            int count = cursorQuery.getCount();
                                            if (count == 0) {
                                                Map map3 = Collections.EMPTY_MAP;
                                                cursorQuery.close();
                                                return map3;
                                            }
                                            Map csqVar = count <= 256 ? new csq(count) : new HashMap(count, 1.0f);
                                            while (cursorQuery.moveToNext()) {
                                                csqVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                            }
                                            if (cursorQuery.isAfterLast()) {
                                                cursorQuery.close();
                                                return csqVar;
                                            }
                                            Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                            Map map4 = Collections.EMPTY_MAP;
                                            cursorQuery.close();
                                            return map4;
                                        } finally {
                                        }
                                    } catch (RemoteException e) {
                                        Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                        return Collections.EMPTY_MAP;
                                    } finally {
                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                    }
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                        map = Collections.EMPTY_MAP;
                    }
                    this.g = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.EMPTY_MAP;
        }
        return (String) map2.get(str);
    }

    public final void c() {
        synchronized (this.f) {
            this.g = null;
            dzzh.e();
        }
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((dzxs) it.next()).a();
            }
        }
    }
}
