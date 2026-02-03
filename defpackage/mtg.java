package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mtg extends mov {
    public static final /* synthetic */ int e = 0;
    public final int b;
    public final mcl[] c;
    public final Object[] d;
    private final int f;
    private final int[] g;
    private final int[] h;
    private final HashMap i;

    /* JADX WARN: Illegal instructions before constructor call */
    public mtg(Collection collection, ngf ngfVar) {
        mcl[] mclVarArr = new mcl[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            mclVarArr[i2] = ((msj) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((msj) it2.next()).b();
            i++;
        }
        this(mclVarArr, objArr, ngfVar);
    }

    @Override // defpackage.mcl
    public final int b() {
        return this.f;
    }

    @Override // defpackage.mcl
    public final int c() {
        return this.b;
    }

    @Override // defpackage.mov
    protected final int r(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.mov
    protected final int s(int i) {
        return mgb.b(this.g, i + 1, false, false);
    }

    @Override // defpackage.mov
    protected final int t(int i) {
        return mgb.b(this.h, i + 1, false, false);
    }

    @Override // defpackage.mov
    protected final int u(int i) {
        return this.g[i];
    }

    @Override // defpackage.mov
    protected final int v(int i) {
        return this.h[i];
    }

    @Override // defpackage.mov
    protected final mcl w(int i) {
        return this.c[i];
    }

    @Override // defpackage.mov
    protected final Object z(int i) {
        return this.d[i];
    }

    public mtg(mcl[] mclVarArr, Object[] objArr, ngf ngfVar) {
        super(ngfVar);
        this.c = mclVarArr;
        int length = mclVarArr.length;
        this.g = new int[length];
        this.h = new int[length];
        this.d = objArr;
        this.i = new HashMap();
        int i = 0;
        int iC = 0;
        int iB = 0;
        int i2 = 0;
        while (i < mclVarArr.length) {
            mcl mclVar = mclVarArr[i];
            this.c[i2] = mclVar;
            this.h[i2] = iC;
            this.g[i2] = iB;
            iC += mclVar.c();
            iB += this.c[i2].b();
            this.i.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.b = iC;
        this.f = iB;
    }
}
