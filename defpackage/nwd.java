package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nwd implements nva {
    private final List a;

    public nwd(List list) {
        this.a = list;
    }

    @Override // defpackage.nva
    public final int a() {
        return 1;
    }

    @Override // defpackage.nva
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.nva
    public final long c(int i) {
        mee.a(i == 0);
        return 0L;
    }

    @Override // defpackage.nva
    public final List e(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }
}
