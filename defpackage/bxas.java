package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxas implements bxam {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();

    @Override // defpackage.bxam
    public final Cursor a(Cursor cursor, dqtx dqtxVar) {
        for (bxaq bxaqVar : this.c) {
            if (bxaqVar.b().test(dqtxVar)) {
                return (Cursor) bxaqVar.a().apply(cursor);
            }
        }
        return cursor;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            aky$$ExternalSyntheticApiModelOutline0.m177m(it.next()).accept(dqtxVar);
        }
        for (bxar bxarVar : this.a) {
            if (bxarVar.b().test(dqtxVar)) {
                throw new bxan(bxarVar.a().apply(dqtxVar));
            }
        }
        for (bxap bxapVar : this.d) {
            if (bxapVar.b().test(dqtxVar)) {
                throw bxapVar.a();
            }
        }
        for (bxao bxaoVar : this.e) {
            if (bxaoVar.b().test(dqtxVar)) {
                throw bxaoVar.a();
            }
        }
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return bxal.a();
    }

    @Override // defpackage.bxam
    public final void n(SQLiteDatabase sQLiteDatabase) {
    }
}
