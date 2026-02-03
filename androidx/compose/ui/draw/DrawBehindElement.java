package androidx.compose.ui.draw;

import defpackage.fdap;
import defpackage.icr;
import defpackage.iey;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawBehindElement extends jdy<iey> {
    private final fdap a;

    public DrawBehindElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iey(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((iey) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && this.a == ((DrawBehindElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
