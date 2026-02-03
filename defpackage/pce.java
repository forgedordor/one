package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pce {
    private final List d = new ArrayList();
    public final pcl a = new pcc(this);
    public int b = 0;
    public final Object c = new Object();

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((pcd) it.next()).a();
        }
    }
}
