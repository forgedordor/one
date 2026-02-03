package androidx.compose.material3.internal;

import defpackage.fdap;
import defpackage.hjn;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jfz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ParentSemanticsNodeElement extends jdy<hjn> {
    private final fdap a;

    public ParentSemanticsNodeElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new hjn(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        hjn hjnVar = (hjn) icrVar;
        hjnVar.a = this.a;
        jfz.a(hjnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSemanticsNodeElement) && this.a == ((ParentSemanticsNodeElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
