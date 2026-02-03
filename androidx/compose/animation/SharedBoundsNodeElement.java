package androidx.compose.animation;

import defpackage.dbg;
import defpackage.dbm;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends jdy<dbg> {
    private final dbm a;

    public SharedBoundsNodeElement(dbm dbmVar) {
        this.a = dbmVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dbg(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dbg dbgVar = (dbg) icrVar;
        dbm dbmVar = dbgVar.b;
        dbm dbmVar2 = this.a;
        if (fdbq.f(dbmVar2, dbmVar)) {
            return;
        }
        dbgVar.b = dbmVar2;
        if (dbgVar.C) {
            dbgVar.u();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && fdbq.f(this.a, ((SharedBoundsNodeElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ')';
    }
}
