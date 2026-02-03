package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class liw extends DataSetObserver {
    final /* synthetic */ lix a;

    public liw(lix lixVar) {
        this.a = lixVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        lix lixVar = this.a;
        lixVar.b = true;
        lixVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        lix lixVar = this.a;
        lixVar.b = false;
        lixVar.notifyDataSetInvalidated();
    }
}
