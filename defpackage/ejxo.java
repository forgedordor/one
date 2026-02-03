package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxo {
    final boolean[] a = new boolean[256];
    final Set b;

    public ejxo(Set set) {
        this.b = set;
        for (int i = 0; i < 256; i++) {
            this.a[i] = this.b.contains(Integer.valueOf(i));
        }
    }
}
