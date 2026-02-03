package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cvjb extends wv implements lvj {
    protected final lvc s;
    private List t;

    public cvjb(lvc lvcVar, View view) {
        super(view);
        this.s = lvcVar;
    }

    public final void C(Object obj) {
        cqaz.g();
        cqaz.g();
        if (this.t == null) {
            this.t = new ArrayList();
        }
        List list = this.t;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lvv) it.next()).l(this);
        }
        list.clear();
        E(obj);
    }

    protected final void D(lvv lvvVar, lvz lvzVar) {
        cqaz.g();
        lvvVar.f(this, lvzVar);
        this.t.add(lvvVar);
    }

    protected abstract void E(Object obj);

    @Override // defpackage.lvj
    public final lvc P() {
        return this.s;
    }
}
