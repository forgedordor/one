package androidx.compose.ui.platform;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jok;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TestTagElement extends jdy<jok> {
    private final String a;

    public TestTagElement(String str) {
        this.a = str;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new jok(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((jok) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return fdbq.f(this.a, ((TestTagElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
