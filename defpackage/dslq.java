package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslq implements dskm {
    private final dskp a;

    public dslq(dskp dskpVar) {
        this.a = dskpVar;
    }

    public static final void f(ecnw ecnwVar, etot etotVar) {
        ecnwVar.b("(node_id = ?");
        ecnwVar.d(String.valueOf(ekis.j(etotVar.c)));
        ecnwVar.b(" AND action = ?)");
        etor etorVarB = etor.b(etotVar.d);
        if (etorVarB == null) {
            etorVarB = etor.UNKNOWN;
        }
        ecnwVar.d(String.valueOf(etorVarB.e));
    }

    public static final String g(String str) {
        return str != null ? str : "signedout";
    }

    private final ListenableFuture h(final ecnt ecntVar) {
        return this.a.d.c(new ecny() { // from class: dslo
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) {
                return Integer.valueOf(ecoaVar.a(ecntVar));
            }
        });
    }

    private final ListenableFuture i(ejvr ejvrVar) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT node_id_path,action, COUNT(*) as event_count");
        ecnwVar.b(" FROM visual_element_events_table");
        ecnwVar.b(" GROUP BY node_id_path,action");
        return this.a.d.a(ecnwVar.a()).e(new eopo() { // from class: dsln
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                ekgi ekgiVar = new ekgi();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("node_id_path"));
                    int i = cursor.getInt(cursor.getColumnIndexOrThrow(GroupManagementRequest.ACTION_TAG));
                    int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("event_count"));
                    etos etosVar = (etos) etot.a.createBuilder();
                    etor etorVarB = etor.b(i);
                    etosVar.copyOnWrite();
                    etot etotVar = (etot) etosVar.instance;
                    etotVar.d = etorVarB.e;
                    etotVar.b |= 1;
                    String[] strArrSplit = TextUtils.split(string, ",");
                    ArrayList arrayList = new ArrayList();
                    for (String str : strArrSplit) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    }
                    etosVar.a(arrayList);
                    ekgiVar.i((etot) etosVar.build(), Integer.valueOf(i2));
                }
                return ekgiVar.c();
            }
        }, eoqg.a).g();
    }

    @Override // defpackage.dskm
    public final ListenableFuture a(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("timestamp_ms <= ?");
        arrayList.add(String.valueOf(j));
        return h(ecnu.a("visual_element_events_table", sb, arrayList));
    }

    @Override // defpackage.dskm
    public final ListenableFuture b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add("signedout");
        return h(dskv.a("visual_element_events_table", arrayList));
    }

    @Override // defpackage.dskm
    public final ListenableFuture c() {
        return h(ecnu.a("visual_element_events_table", new StringBuilder(), new ArrayList()));
    }

    @Override // defpackage.dskm
    public final ListenableFuture d(final String str) {
        return i(new ejvr() { // from class: dslp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ecnw ecnwVar = (ecnw) obj;
                ecnwVar.b(" WHERE (account = ?");
                ecnwVar.d(dslq.g(str));
                ecnwVar.b(")");
                return null;
            }
        });
    }

    @Override // defpackage.dskm
    public final ListenableFuture e(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return !it.hasNext() ? eork.i(ekoj.a) : i(new ejvr() { // from class: dslm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Iterator it2 = it;
                ecnw ecnwVar = (ecnw) obj;
                if (it2.hasNext()) {
                    ecnwVar.b(" WHERE (account = ?");
                    ecnwVar.d(dslq.g(null));
                    ecnwVar.b(" AND (");
                    dslq.f(ecnwVar, (etot) it2.next());
                    while (it2.hasNext()) {
                        ecnwVar.b(" OR ");
                        dslq.f(ecnwVar, (etot) it2.next());
                    }
                    ecnwVar.b("))");
                }
                return null;
            }
        });
    }
}
