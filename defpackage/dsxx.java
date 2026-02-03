package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxx implements dsxw {
    public final List a;
    public final int b;
    private final int c;

    public dsxx(int i, List list, int i2) {
        this.b = i;
        this.a = DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            ejwl.a(i2 == -1);
        } else {
            ejwl.a(i2 != -1);
        }
    }

    @Override // defpackage.dsxw
    public final /* synthetic */ dsvq a() {
        return dsxv.a(this);
    }

    @Override // defpackage.dsxw
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        ejwl.l(z);
        return this.c;
    }
}
