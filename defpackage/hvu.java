package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvu implements Iterator, fdcn {
    public final hvs a;

    public hvu(hvr hvrVar) {
        hwh[] hwhVarArr = new hwh[8];
        for (int i = 0; i < 8; i++) {
            hwhVarArr[i] = new hwl(this);
        }
        this.a = new hvs(hvrVar, hwhVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
