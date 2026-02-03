package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fddr implements Iterable, fdcn {
    public final long a = -4611686018427387903L;
    public final long b = 4611686018427387903L;
    private final long c = 1;

    public boolean equals(Object obj) {
        if (!(obj instanceof fddr)) {
            return false;
        }
        fddr fddrVar = (fddr) obj;
        long j = fddrVar.a;
        long j2 = fddrVar.b;
        long j3 = fddrVar.c;
        return true;
    }

    public int hashCode() {
        return (int) (-9223368974543092798L);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new fdds();
    }

    public String toString() {
        return "-4611686018427387903..4611686018427387903 step 1";
    }
}
