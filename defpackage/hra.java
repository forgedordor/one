package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hra implements Iterable, ibh, fdcn {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public cuh j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(hlv hlvVar) {
        if (this.f) {
            hmz.j("Use active SlotWriter to determine anchor location instead");
        }
        if (!hlvVar.a()) {
            hpq.a("Anchor refers to a group that was removed");
        }
        return hlvVar.a;
    }

    public final hof b(int i) {
        int i2;
        HashMap map = this.i;
        if (map != null) {
            if (this.f) {
                hmz.j("use active SlotWriter to crate an anchor for location instead");
            }
            hlv hlvVarF = (i < 0 || i >= (i2 = this.b)) ? null : hrc.f(this.h, i, i2);
            if (hlvVarF != null) {
                return (hof) map.get(hlvVarF);
            }
        }
        return null;
    }

    public final hqz c() {
        if (this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new hqz(this);
    }

    public final hre d() {
        if (this.f) {
            hmz.j("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            hmz.j("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new hre(this);
    }

    public final void e() {
        this.j = new cuh((byte[]) null);
    }

    public final void f() {
        this.i = new HashMap();
    }

    public final void g(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap map, cuh cuhVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = map;
        this.j = cuhVar;
    }

    public final boolean h(hlv hlvVar) {
        int iD;
        return hlvVar.a() && (iD = hrc.d(this.h, hlvVar.a, this.b)) >= 0 && fdbq.f(this.h.get(iD), hlvVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hoe(this, 0, this.b);
    }
}
