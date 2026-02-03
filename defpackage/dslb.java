package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslb implements dskf {
    private final dskp a;
    private final diep b;

    public dslb(dskp dskpVar, diep diepVar) {
        this.a = dskpVar;
        this.b = diepVar;
    }

    public static String g(String str) {
        return str != null ? str : "signedout";
    }

    public static final void h(ecnw ecnwVar, etkl etklVar) {
        ecnwVar.b("(log_source = ?");
        ecnwVar.d(String.valueOf(etklVar.c));
        ecnwVar.b(" AND event_code = ?");
        ecnwVar.d(String.valueOf(etklVar.d));
        ecnwVar.b(" AND package_name = ?)");
        ecnwVar.d(etklVar.e);
    }

    private final ListenableFuture i(final ecnt ecntVar) {
        return this.a.d.c(new ecny() { // from class: dskw
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) {
                return Integer.valueOf(ecoaVar.a(ecntVar));
            }
        });
    }

    private final ListenableFuture j(ejvr ejvrVar) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT log_source,event_code, package_name, COUNT(*) as event_count");
        ecnwVar.b(" FROM clearcut_events_table");
        ecnwVar.b(" GROUP BY log_source,event_code, package_name");
        return this.a.d.a(ecnwVar.a()).e(new eopo() { // from class: dskz
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashMap mapH = ekmi.h(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = cursor.getInt(cursor.getColumnIndexOrThrow("log_source"));
                    int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("event_code"));
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("package_name"));
                    int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("event_count"));
                    etkk etkkVar = (etkk) etkl.a.createBuilder();
                    etkkVar.copyOnWrite();
                    etkl etklVar = (etkl) etkkVar.instance;
                    etklVar.b |= 1;
                    etklVar.c = i;
                    etkkVar.copyOnWrite();
                    etkl etklVar2 = (etkl) etkkVar.instance;
                    etklVar2.b |= 2;
                    etklVar2.d = i2;
                    etkkVar.copyOnWrite();
                    etkl etklVar3 = (etkl) etkkVar.instance;
                    string.getClass();
                    etklVar3.b |= 4;
                    etklVar3.e = string;
                    mapH.put((etkl) etkkVar.build(), Integer.valueOf(i3));
                }
                return DesugarCollections.unmodifiableMap(mapH);
            }
        }, eoqg.a).g();
    }

    @Override // defpackage.dskf
    public final ListenableFuture a(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("timestamp_ms <= ?");
        arrayList.add(String.valueOf(j));
        return i(ecnu.a("clearcut_events_table", sb, arrayList));
    }

    @Override // defpackage.dskf
    public final ListenableFuture b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add("signedout");
        return i(dskv.a("clearcut_events_table", arrayList));
    }

    @Override // defpackage.dskf
    public final ListenableFuture c() {
        return i(ecnu.a("clearcut_events_table", new StringBuilder(), new ArrayList()));
    }

    @Override // defpackage.dskf
    public final ListenableFuture d(final String str) {
        return j(new ejvr() { // from class: dsky
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ecnw ecnwVar = (ecnw) obj;
                ecnwVar.b(" WHERE (account = ?");
                ecnwVar.d(dslb.g(str));
                ecnwVar.b(")");
                return null;
            }
        });
    }

    @Override // defpackage.dskf
    public final ListenableFuture e(etkl etklVar) {
        final dsmw dsmwVar = new dsmw(etklVar.c, etklVar.d, etklVar.e, this.b.f().toEpochMilli());
        return this.a.d.d(new ecnz() { // from class: dskx
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) throws InterruptedException {
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("account", dslb.g(null));
                dsmw dsmwVar2 = (dsmw) dsmwVar;
                contentValues.put("timestamp_ms", Long.valueOf(dsmwVar2.d));
                contentValues.put("log_source", Integer.valueOf(dsmwVar2.a));
                contentValues.put("event_code", Integer.valueOf(dsmwVar2.b));
                contentValues.put("package_name", dsmwVar2.c);
                ecoaVar.c("clearcut_events_table", contentValues, 0);
            }
        });
    }

    @Override // defpackage.dskf
    public final ListenableFuture f(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return !it.hasNext() ? eork.i(Collections.EMPTY_MAP) : j(new ejvr() { // from class: dsla
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Iterator it2 = it;
                ecnw ecnwVar = (ecnw) obj;
                if (it2.hasNext()) {
                    ecnwVar.b(" WHERE (account = ?");
                    ecnwVar.d(dslb.g(null));
                    ecnwVar.b(" AND (");
                    dslb.h(ecnwVar, (etkl) it2.next());
                    while (it2.hasNext()) {
                        ecnwVar.b(" OR ");
                        dslb.h(ecnwVar, (etkl) it2.next());
                    }
                    ecnwVar.b("))");
                }
                return null;
            }
        });
    }
}
