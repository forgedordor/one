package androidx.compose.animation;

import defpackage.dba;
import defpackage.ddb;
import defpackage.dde;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SkipToLookaheadElement extends jdy<ddb> {
    private final dba a;
    private final fdae b;

    public SkipToLookaheadElement(dba dbaVar, fdae fdaeVar) {
        this.a = dbaVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ddb(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ddb ddbVar = (ddb) icrVar;
        ddbVar.a.b(this.a);
        ddbVar.b.b(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return fdbq.f(this.a, skipToLookaheadElement.a) && fdbq.f(this.b, skipToLookaheadElement.b);
    }

    public final int hashCode() {
        dba dbaVar = this.a;
        return ((dbaVar == null ? 0 : dbaVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.a + ", isEnabled=" + this.b + ')';
    }

    public SkipToLookaheadElement() {
        this(null, dde.a);
    }
}
