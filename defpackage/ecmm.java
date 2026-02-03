package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecmm implements SQLiteTransactionListener {
    final /* synthetic */ ecmn a;

    public ecmm(ecmn ecmnVar) {
        this.a = ecmnVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (!this.a.a) {
            throw new ecns();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
