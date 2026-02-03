package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amhc implements AutoCloseable, byee {
    public final fdjx a;
    public final fcsu b;
    public cquc d;
    private final byej e;
    private final awlc f;
    public final Map c = new LinkedHashMap();
    private final Map g = new LinkedHashMap();

    public amhc(fdjx fdjxVar, byej byejVar, awlc awlcVar, fcsu fcsuVar) {
        this.a = fdjxVar;
        this.e = byejVar;
        this.f = awlcVar;
        this.b = fcsuVar;
        awlcVar.e(this);
    }

    public final ajlq a(MessageIdType messageIdType, basd basdVar) {
        messageIdType.getClass();
        basdVar.getClass();
        Integer numB = basdVar.k() ? this.e.b(basdVar) : amhe.a(messageIdType) ? this.e.a(messageIdType) : null;
        if (numB != null) {
            return anea.a(numB.intValue());
        }
        return null;
    }

    public final void b() {
        Map map = this.c;
        synchronized (map) {
            map.clear();
        }
        Map map2 = this.g;
        synchronized (map2) {
            map2.clear();
        }
    }

    @Override // defpackage.byee
    public final void c(MessageIdType messageIdType, basd basdVar) {
        List list;
        messageIdType.getClass();
        basdVar.getClass();
        if (((Boolean) ames.e.e()).booleanValue()) {
            Map map = this.g;
            synchronized (map) {
                list = (List) map.get(basdVar);
            }
            if (list == null || list.isEmpty()) {
                Map map2 = this.c;
                synchronized (map2) {
                    list = (List) map2.get(messageIdType);
                }
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            fcsu fcsuVar = this.b;
            ajlq ajlqVarA = a(messageIdType, basdVar);
            if (ajlqVarA != null) {
                if (ajlqVarA != ajlq.SENT && ajlqVarA != ajlq.DELIVERED) {
                    ajlqVarA = null;
                }
                if (ajlqVarA != null) {
                    synchronized (list) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((amec) it.next()).e(ajlqVarA);
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.f(this);
        b();
        cquc cqucVar = this.d;
        if (cqucVar != null) {
            cqub.a(cqucVar);
        }
        this.d = null;
    }

    public final ajmq e(MessageIdType messageIdType, basd basdVar, aoer aoerVar, ajlq ajlqVar, ajmw ajmwVar, long j) {
        messageIdType.getClass();
        basdVar.getClass();
        ajlqVar.getClass();
        Instant.ofEpochMilli(j).getClass();
        amec amecVar = new amec(aoerVar, ajlqVar, ajmwVar, this.b);
        if (amhe.a(messageIdType)) {
            Map map = this.c;
            synchronized (map) {
                Object objSynchronizedList = map.get(messageIdType);
                if (objSynchronizedList == null) {
                    objSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
                    objSynchronizedList.getClass();
                    map.put(messageIdType, objSynchronizedList);
                }
                ((List) objSynchronizedList).add(amecVar);
            }
        }
        if (!basdVar.k()) {
            return amecVar;
        }
        Map map2 = this.g;
        synchronized (map2) {
            Object objSynchronizedList2 = map2.get(basdVar);
            if (objSynchronizedList2 == null) {
                objSynchronizedList2 = DesugarCollections.synchronizedList(new ArrayList());
                objSynchronizedList2.getClass();
                map2.put(basdVar, objSynchronizedList2);
            }
            ((List) objSynchronizedList2).add(amecVar);
        }
        return amecVar;
    }

    @Override // defpackage.byee
    public final /* synthetic */ void fW(MessageCoreData messageCoreData) {
    }
}
