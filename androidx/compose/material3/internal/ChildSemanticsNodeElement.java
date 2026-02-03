package androidx.compose.material3.internal;

import defpackage.fdap;
import defpackage.hia;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jfz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ChildSemanticsNodeElement extends jdy<hia> {
    private final fdap a;

    public ChildSemanticsNodeElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new hia(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        hia hiaVar = (hia) icrVar;
        hiaVar.a = this.a;
        jfz.a(hiaVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChildSemanticsNodeElement) && this.a == ((ChildSemanticsNodeElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
