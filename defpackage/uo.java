package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uo extends DataSetObserver {
    final /* synthetic */ us a;

    public uo(us usVar) {
        this.a = usVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        us usVar = this.a;
        if (usVar.x()) {
            usVar.v();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.m();
    }
}
