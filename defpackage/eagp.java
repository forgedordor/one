package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagp implements eagv {
    private final eagw a;
    private final Map b = new ConcurrentHashMap();

    public eagp(eagw eagwVar) {
        this.a = eagwVar;
    }

    private final synchronized void b(String str) {
        ObjectInputStream objectInputStream;
        List list;
        Map map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        try {
            InputStream resourceAsStream = eagn.class.getResourceAsStream(str);
            if (resourceAsStream == null) {
                eagn.a.log(Level.WARNING, String.format("File %s not found", str));
            }
            if (resourceAsStream == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ObjectInputStream objectInputStream2 = null;
                try {
                    try {
                        objectInputStream = new ObjectInputStream(resourceAsStream);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    eage eageVar = new eage();
                    eageVar.readExternal(objectInputStream);
                    List list2 = eageVar.a;
                    if (list2.isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    eago.a(objectInputStream);
                    list = list2;
                } catch (IOException e2) {
                    e = e2;
                    throw new IllegalStateException("Unable to parse metadata file", e);
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        eago.a(objectInputStream2);
                    } else {
                        eago.a(resourceAsStream);
                    }
                    throw th;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.a((eagd) it.next());
            }
            map.put(str, str);
        } catch (IllegalArgumentException | IllegalStateException e3) {
            throw new IllegalStateException("Failed to read file ".concat(str), e3);
        }
    }

    @Override // defpackage.eagv
    public final eagw a(String str) {
        if (!this.b.containsKey(str)) {
            b(str);
        }
        return this.a;
    }
}
