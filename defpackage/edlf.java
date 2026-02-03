package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edlf {
    private final edlu a;
    private final Map b = new HashMap();

    public edlf(edlu edluVar) {
        this.a = edluVar;
    }

    public final edlt a(String str) {
        Map map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, this.a.a(3, ejwi.j(str), exwf.OBAKE_GOOGLE_PHOTOS_CLUSTER_PHOTO_SUGGESTIONS, exwf.OBAKE_GOOGLE_PHOTOS_PROMOTABLE_CLUSTER_PHOTO_SUGGESTIONS));
        }
        return (edlt) map.get(str);
    }
}
