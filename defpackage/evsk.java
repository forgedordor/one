package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsk implements Comparable {
    final evsu a;
    final int b;
    final evwh c;
    final boolean d;
    final boolean e;

    public evsk(evsu evsuVar, int i, evwh evwhVar, boolean z, boolean z2) {
        this.a = evsuVar;
        this.b = i;
        this.c = evwhVar;
        this.d = z;
        this.e = z2;
    }

    public final evwi a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((evsk) obj).b;
    }
}
