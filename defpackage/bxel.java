package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxel implements bxam {
    static final cczv a = cdag.p(172089041);
    public final cogw b;
    public final ains c;

    public bxel(cogw cogwVar, ains ainsVar) {
        this.b = cogwVar;
        this.c = ainsVar;
    }

    @Override // defpackage.bxam
    public final int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        return new bxek(this, dqtxVar);
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
