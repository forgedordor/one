package defpackage;

import androidx.car.app.model.Alert;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aior {
    private final ainw a;
    private final dbyl b;
    private final Map c = new LinkedHashMap();

    public aior(ainw ainwVar, dbyl dbylVar) {
        this.a = ainwVar;
        this.b = dbylVar;
    }

    public final synchronized dbzq a(String str) {
        Object obj;
        Map map = this.c;
        obj = map.get(str);
        if (obj == null) {
            dbzq dbzqVar = new dbzq(this.b, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
            dbzqVar.i(this.a.b(str));
            map.put(str, dbzqVar);
            obj = dbzqVar;
        }
        return (dbzq) obj;
    }
}
