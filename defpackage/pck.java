package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pck {
    private final List c = new ArrayList();
    public final wf a = new pci(this);
    public final pcv b = new pcj(this);

    public final void a(pcl pclVar) {
        this.c.add(pclVar);
    }

    final void b() {
        for (pcl pclVar : this.c) {
            if (pclVar.k()) {
                pclVar.g();
            }
        }
    }
}
