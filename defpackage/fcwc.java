package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcwc extends fcwb {
    public static final int a(int i) {
        return i >= 0 ? i < 3 ? i + 1 : i >= 1073741824 ? Alert.DURATION_SHOW_INDEFINITELY : (int) ((i / 0.75f) + 1.0f) : i;
    }

    public static final Map b(Map map) {
        map.getClass();
        return ((fcxe) map).e();
    }

    public static final Map c(fcti fctiVar) {
        fctiVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(fctiVar.a, fctiVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static final Map d(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
