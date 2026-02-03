package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Map;
import java.util.Comparator;
import java.util.Map;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesb implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = cesc.a;
        String name = ((CronetProvider) obj).getName();
        name.getClass();
        Integer numValueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
        Integer num = (Integer) Map.EL.getOrDefault(map, name, numValueOf);
        String name2 = ((CronetProvider) obj2).getName();
        name2.getClass();
        return fcxl.a(num, (Integer) Map.EL.getOrDefault(map, name2, numValueOf));
    }
}
