package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nin {
    public final int a;
    public final mtl[] b;
    public final nif[] c;
    public final mcs d;
    public final Object e;

    public nin(mtl[] mtlVarArr, nif[] nifVarArr, mcs mcsVar, Object obj) {
        int length = mtlVarArr.length;
        mee.a(length == nifVarArr.length);
        this.b = mtlVarArr;
        this.c = (nif[]) nifVarArr.clone();
        this.d = mcsVar;
        this.e = obj;
        this.a = length;
    }

    public final boolean a(nin ninVar, int i) {
        return ninVar != null && Objects.equals(this.b[i], ninVar.b[i]) && Objects.equals(this.c[i], ninVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
