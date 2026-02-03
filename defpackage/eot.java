package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eot implements eos, ixp {
    private final eoe a;
    private final izm b;
    private final eoi c;
    private final cuh d;

    /* JADX WARN: Type inference failed for: r1v2, types: [eoi, java.lang.Object] */
    public eot(eoe eoeVar, izm izmVar) {
        this.a = eoeVar;
        this.b = izmVar;
        this.c = eoeVar.b.invoke();
        cuh cuhVar = ctk.a;
        this.d = new cuh((byte[]) null);
    }

    @Override // defpackage.eos
    public final List a(int i, long j) {
        cuh cuhVar = this.d;
        List list = (List) cuhVar.a(i);
        if (list != null) {
            return list;
        }
        eoi eoiVar = this.c;
        Object objD = eoiVar.d(i);
        List listA = this.b.a(objD, this.a.b(i, objD, eoiVar.c(i)));
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ixk) listA.get(i2)).e(j));
        }
        cuhVar.f(i, arrayList);
        return arrayList;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.b.ee();
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return this.b.eg(j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return this.b.eh(f);
    }

    @Override // defpackage.ixp
    public final ixn ej(int i, int i2, Map map, fdap fdapVar) {
        return this.b.ej(i, i2, map, fdapVar);
    }

    @Override // defpackage.eos, defpackage.kio
    public final float el(int i) {
        return this.b.el(i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return this.b.em(j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return this.b.en(f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return this.b.eo(j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return this.b.ep(f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return this.b.eq(j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return this.b.er(j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return this.b.es(f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return this.b.et(f);
    }

    @Override // defpackage.ixp
    public final ixn eu(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2) {
        return this.b.eu(i, i2, map, fdapVar, fdapVar2);
    }

    @Override // defpackage.ivu
    public final boolean ev() {
        return this.b.ev();
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.b.q();
    }
}
