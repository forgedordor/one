package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agg {
    private ArrayList a = new ArrayList();
    private ArrayList b = new ArrayList();
    private boolean c = false;

    public final agh a() {
        this.c = true;
        css cssVar = new css();
        for (int i = 0; i < this.a.size(); i++) {
            cssVar.add(((afv) this.a.get(i)).k());
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            afv afvVar = (afv) this.b.get(i2);
            if (cssVar.contains(afvVar.k())) {
                throw new IllegalArgumentException("Document id " + afvVar.k() + " cannot exist in both taken action and normal document");
            }
        }
        return new agh(this.a, this.b);
    }

    public final void b() {
        if (this.c) {
            this.a = new ArrayList(this.a);
            this.b = new ArrayList(this.b);
            this.c = false;
        }
    }

    public final void c(Collection collection) {
        lcg.i(collection);
        b();
        this.a.addAll(collection);
    }

    public final void d(afv... afvVarArr) {
        b();
        c(Arrays.asList(afvVarArr));
    }
}
