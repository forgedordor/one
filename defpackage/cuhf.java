package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuhf {
    private final Map a;

    public cuhf(Map map) {
        map.getClass();
        this.a = map;
    }

    public final Optional a() {
        for (cuhg cuhgVar : cuhg.values()) {
            cuhh cuhhVar = (cuhh) this.a.get(cuhgVar);
            Optional optionalA = cuhhVar != null ? cuhhVar.a() : null;
            if (optionalA != null && optionalA.isPresent()) {
                return optionalA;
            }
        }
        return Optional.empty();
    }
}
