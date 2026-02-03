package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agt {
    private List d = new ArrayList();
    private List e = new ArrayList();
    private Bundle f = new Bundle();
    private List g = new ArrayList();
    public final css a = new css();
    public Bundle b = new Bundle();
    private Bundle h = new Bundle();
    private List i = new ArrayList();
    private List j = new ArrayList();
    private List k = new ArrayList();
    private int l = 10;
    public int c = 2;
    private List m = new ArrayList();
    private boolean n = false;

    public final agu a() {
        if (!this.h.isEmpty()) {
            throw new IllegalArgumentException("Property weights are only compatible with the RANKING_STRATEGY_RELEVANCE_SCORE and RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION ranking strategies.");
        }
        this.n = true;
        return new agu(this.c, this.d, this.e, this.f, this.g, this.l, this.b, this.h, new ArrayList(this.a), this.i, this.m, this.j, this.k);
    }

    public final void b() {
        if (this.n) {
            this.d = new ArrayList(this.d);
            this.f = ake.a(this.f);
            this.e = new ArrayList(this.e);
            this.g = new ArrayList(this.g);
            this.b = ake.a(this.b);
            this.h = ake.a(this.h);
            this.i = new ArrayList(this.i);
            this.m = new ArrayList(this.m);
            this.j = new ArrayList(this.j);
            this.k = new ArrayList(this.k);
            this.n = false;
        }
    }

    public final void c(Collection collection) {
        lcg.i(collection);
        b();
        this.d.addAll(collection);
    }

    public final void d(int i) {
        lcg.f(i, 0, 10000, "resultCountPerPage");
        b();
        this.l = i;
    }
}
