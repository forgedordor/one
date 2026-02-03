package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxb implements Comparator, Serializable {
    public static final evxb a;
    private static final /* synthetic */ evxb[] b;

    static {
        evxb evxbVar = new evxb();
        a = evxbVar;
        b = new evxb[]{evxbVar};
    }

    private evxb() {
    }

    public static final int a(evvp evvpVar, evvp evvpVar2) {
        evxc.i(evvpVar);
        evxc.i(evvpVar2);
        int iCompare = Long.compare(evvpVar.b, evvpVar2.b);
        return iCompare != 0 ? iCompare : Integer.compare(evvpVar.c, evvpVar2.c);
    }

    public static evxb[] values() {
        return (evxb[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((evvp) obj, (evvp) obj2);
    }
}
