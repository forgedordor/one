package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrg implements Iterator {
    int a = 0;
    final /* synthetic */ fgrh b;

    public fgrg(fgrh fgrhVar) {
        this.b = fgrhVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgrf next() {
        fgrh fgrhVar = this.b;
        String[] strArr = fgrhVar.b;
        int i = this.a;
        fgrf fgrfVar = new fgrf(strArr[i], (String) fgrhVar.c[i], fgrhVar);
        this.a++;
        return fgrfVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        fgrh fgrhVar;
        while (true) {
            int i = this.a;
            fgrhVar = this.b;
            if (i >= fgrhVar.a || !fgrh.o(fgrhVar.b[i])) {
                break;
            }
            this.a++;
        }
        return this.a < fgrhVar.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a - 1;
        this.a = i;
        this.b.k(i);
    }
}
