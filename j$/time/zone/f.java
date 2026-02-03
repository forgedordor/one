package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class f implements PrivilegedAction {
    public final /* synthetic */ ArrayList a;

    public f(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            g.b(new g());
            return null;
        }
        try {
            g gVar = (g) g.class.cast(Class.forName(property, true, g.class.getClassLoader()).newInstance());
            g.b(gVar);
            this.a.add(gVar);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
