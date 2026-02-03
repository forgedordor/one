package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class loh implements Runnable {
    private final List a;
    private final Throwable b;
    private final int c;

    public loh(Collection collection, int i, Throwable th) {
        lcg.j(collection, "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.c = i;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        if (i != 1) {
            while (i2 < size) {
                ((log) list.get(i2)).a(this.b);
                i2++;
            }
        } else {
            while (i2 < size) {
                ((log) list.get(i2)).b();
                i2++;
            }
        }
    }
}
