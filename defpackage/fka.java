package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fka {
    public final long a;
    public final long b;
    public final ivy c;
    public final boolean d;
    public final fil e;
    public final Comparator f;
    public final cuk g;
    public final List h;
    public int i;
    public int j;
    public int k;

    public fka(long j, long j2, ivy ivyVar, boolean z, fil filVar, Comparator comparator) {
        this.a = j;
        this.b = j2;
        this.c = ivyVar;
        this.d = z;
        this.e = filVar;
        this.f = comparator;
        int i = ctr.a;
        this.g = new cuk((byte[]) null);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        int iA = fkc.a(i2, i3) - 1;
        if (iA == 0) {
            return this.k - 1;
        }
        if (iA != 1) {
            return -1;
        }
        return this.k;
    }
}
