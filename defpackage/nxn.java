package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxn {
    public static final Comparator a = new Comparator() { // from class: nxm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((nxn) obj).b.b, ((nxn) obj2).b.b);
        }
    };
    public final nxo b;
    public final int c;

    public nxn(nxo nxoVar, int i) {
        this.b = nxoVar;
        this.c = i;
    }
}
