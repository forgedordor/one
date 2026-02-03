package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrb implements Iterable, ibh, fdcn {
    private final hra a;
    private final int b;
    private final int c;

    public hrb(hra hraVar, int i, int i2) {
        this.a = hraVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        hra hraVar = this.a;
        if (hraVar.g != this.c) {
            hrc.g();
        }
        int i = this.b;
        return hraVar.b(i) != null ? new hsd() : new hoe(hraVar, i + 1, i + hrc.a(hraVar.a, i));
    }
}
