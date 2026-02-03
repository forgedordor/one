package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class codc implements Comparator {
    private static final long a(cnyz cnyzVar) {
        if (cnyzVar == null) {
            return 0L;
        }
        if (cobt.e(cnyzVar)) {
            return 1L;
        }
        if (cobt.f(cnyzVar)) {
            evvp evvpVar = (cnyzVar.c == 4 ? (cnyr) cnyzVar.d : cnyr.a).c;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            return evvpVar.b;
        }
        if (!cobt.g(cnyzVar)) {
            return 0L;
        }
        evvp evvpVar2 = (cnyzVar.c == 5 ? (cnyt) cnyzVar.d : cnyt.a).f;
        if (evvpVar2 == null) {
            evvpVar2 = evvp.a;
        }
        return evvpVar2.b;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(a((cnyz) obj) - a((cnyz) obj2));
    }
}
