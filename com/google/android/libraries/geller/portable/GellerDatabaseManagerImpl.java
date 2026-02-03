package com.google.android.libraries.geller.portable;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.drel;
import defpackage.drev;
import defpackage.drey;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ejwk;
import defpackage.ejxk;
import defpackage.ekjc;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eway;
import defpackage.ewut;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class GellerDatabaseManagerImpl implements drel {
    private static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl");
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final ejwi d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final Context h;
    private final boolean i;
    private final eway j;

    public GellerDatabaseManagerImpl(Context context, eway ewayVar, boolean z, ejwi ejwiVar, Map map, Map map2, Map map3) {
        new HashMap();
        new HashMap();
        this.h = context;
        this.j = ewayVar;
        this.d = ejwiVar;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.i = z;
    }

    private final synchronized void c(String str, GellerDatabase gellerDatabase) {
        Map map = this.b;
        if (map.containsKey(str)) {
            long jLongValue = ((Long) map.get(str)).longValue();
            map.remove(str);
            nativeDestroyDatabase(jLongValue);
        }
        if (gellerDatabase != null) {
            gellerDatabase.c();
        }
    }

    private final synchronized boolean d(String str) {
        boolean z;
        z = false;
        for (Map.Entry entry : this.e.entrySet()) {
            ewut ewutVar = (ewut) entry.getKey();
            if (!((Map) entry.getValue()).containsKey(str)) {
                try {
                    ((Map) entry.getValue()).put(str, (drev) ((ListenableFuture) ((ejvr) this.f.get(ewutVar)).apply(str)).get(3000L, TimeUnit.MILLISECONDS));
                    z = true;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 130, "GellerDatabaseManagerImpl.java")).D("Failed to create custom Geller storage for corpus %s and user %s", ewutVar.name(), str);
                } catch (ExecutionException e2) {
                    e = e2;
                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 124, "GellerDatabaseManagerImpl.java")).D("Failed to create custom Geller storage for corpus %s and user %s", ewutVar.name(), str);
                } catch (TimeoutException e3) {
                    e = e3;
                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 124, "GellerDatabaseManagerImpl.java")).D("Failed to create custom Geller storage for corpus %s and user %s", ewutVar.name(), str);
                }
            }
        }
        return z;
    }

    private final synchronized GellerDatabase e(String str) {
        boolean z;
        Context context;
        boolean z2;
        ejwi ejwiVar;
        eway ewayVar;
        HashMap map;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(":memory:", (SQLiteDatabase.CursorFactory) null);
        String strStringForQuery = DatabaseUtils.stringForQuery(sQLiteDatabaseOpenOrCreateDatabase, "SELECT sqlite_version()", null);
        sQLiteDatabaseOpenOrCreateDatabase.close();
        boolean z3 = false;
        try {
            Iterator it = ejxk.d(".").g(strStringForQuery).iterator();
            Iterator it2 = ejxk.d(".").g("3.25.0").iterator();
            while (true) {
                if (!it.hasNext() && !it2.hasNext()) {
                    break;
                }
                try {
                    int iCompare = Integer.compare(Integer.parseInt((String) ekjc.g(it, "0")), Integer.parseInt((String) ekjc.g(it2, "0")));
                    if (iCompare != 0) {
                        if (iCompare < 0) {
                            z3 = true;
                        }
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        } catch (IllegalArgumentException unused) {
            ((ekrd) ((ekrd) drey.c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isLegacySQLite", 1736, "GellerDatabaseImpl.java")).t("Unable to parse SQLite version %s. Assuming legacy version.", strStringForQuery);
        }
        z = z3;
        context = this.h;
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (str == null) {
            throw new NullPointerException("Null databaseId");
        }
        z2 = this.i;
        ejwiVar = this.d;
        if (ejwiVar == null) {
            throw new NullPointerException("Null optionalGddStorage");
        }
        ewayVar = this.j;
        if (ewayVar == null) {
            throw new NullPointerException("Null flags");
        }
        map = new HashMap();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((Map) entry.getValue()).containsKey(str)) {
                map.put(((ewut) entry.getKey()).name(), (drev) ((Map) entry.getValue()).get(str));
            }
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            map.put(((ewut) entry2.getKey()).name(), (drev) entry2.getValue());
        }
        return new drey(context, str, z2, z, 9, ejwiVar, map, ewayVar);
    }

    private native long nativeCreateDatabase(GellerDatabase gellerDatabase, String str);

    private native void nativeDestroyDatabase(long j);

    @Override // defpackage.drel
    public final synchronized long a(String str) {
        Long l;
        Map map = this.b;
        String strB = ejwk.b(str);
        l = (Long) map.get(strB);
        if (l == null) {
            long jNativeCreateDatabase = nativeCreateDatabase(b(strB), strB);
            Long lValueOf = Long.valueOf(jNativeCreateDatabase);
            lValueOf.getClass();
            if (jNativeCreateDatabase != 0) {
                map.put(strB, lValueOf);
            } else {
                ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getNativeGellerDatabase", 174, "GellerDatabaseManagerImpl.java")).q("Failed to create native geller database, returning empty response/default value.");
            }
            l = lValueOf;
        }
        return l.longValue();
    }

    @Override // defpackage.drel
    public final synchronized GellerDatabase b(String str) {
        Throwable th;
        GellerDatabase gellerDatabaseE;
        Map map = this.c;
        GellerDatabase gellerDatabase = (GellerDatabase) map.get(str);
        if (!d(str) && gellerDatabase != null) {
            return gellerDatabase;
        }
        c(str, gellerDatabase);
        try {
            gellerDatabaseE = e(str);
            try {
                map.put(str, gellerDatabaseE);
            } catch (SQLiteException | IllegalStateException e) {
                th = e;
                ((ekrd) ((ekrd) ((ekrd) a.i()).g(th)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getGellerDatabase", 'g', "GellerDatabaseManagerImpl.java")).q("Failed to create/open geller database, returning empty response/default value.");
                return gellerDatabaseE;
            }
        } catch (SQLiteException | IllegalStateException e2) {
            th = e2;
            gellerDatabaseE = null;
        }
        return gellerDatabaseE;
    }
}
