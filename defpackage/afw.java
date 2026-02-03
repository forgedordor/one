package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afw {
    public Map b;
    public ArrayList a = new ArrayList();
    public boolean c = false;

    public afw() {
        c(true);
    }

    public final afy a(String str) {
        Map map = this.b;
        if (map == null) {
            throw new IllegalStateException("GetSchemaResponse is not configured withvisibility setting support");
        }
        afy afyVar = (afy) map.get(str);
        if (afyVar != null) {
            return afyVar;
        }
        afy afyVar2 = new afy(str);
        this.b.put(str, afyVar2);
        return afyVar2;
    }

    public final void b() {
        if (this.c) {
            this.a = new ArrayList(this.a);
            this.c = false;
        }
    }

    public final void c(boolean z) {
        this.b = z ? new csq() : null;
    }
}
