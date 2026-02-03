package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egop {
    private final Object a;
    private final Map b;
    private final ahkg c;

    public egop(ahkg ahkgVar) {
        ahkgVar.getClass();
        this.c = ahkgVar;
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public final egoo a(Class cls) {
        egoo egooVar;
        cls.getClass();
        synchronized (this.a) {
            Map map = this.b;
            Object obj = map.get(cls);
            if (obj == null) {
                ahkn ahknVar = this.c.a.a;
                egoo egooVar2 = new egoo((Context) ahknVar.t.b(), (egog) ahknVar.bH.b(), (eosd) ahknVar.p.b(), (NotificationManager) ahknVar.bI.b(), ahknVar.ei(), cls);
                map.put(cls, egooVar2);
                obj = egooVar2;
            }
            egooVar = (egoo) obj;
        }
        return egooVar;
    }
}
