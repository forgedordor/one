package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgtd extends fguu {
    final ArrayList a;
    int b;

    public fgtd() {
        this.b = 0;
        this.a = new ArrayList();
    }

    final void c() {
        this.b = this.a.size();
    }

    public fgtd(Collection collection) {
        this();
        this.a.addAll(collection);
        c();
    }
}
