package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxn {
    static final void a(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    static final void b(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    static final void c(ejxo ejxoVar, Set set) {
        for (Integer num : ejxoVar.b) {
            num.intValue();
            set.add(num);
        }
    }
}
