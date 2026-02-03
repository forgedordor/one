package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcq implements bxam {
    public static final cczi a = cdag.p(172569191);

    @Override // defpackage.bxam
    public final Cursor a(Cursor cursor, dqtx dqtxVar) {
        return new bxcp(cursor);
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        dqsa dqsaVar = new dqsa() { // from class: bxcn
            @Override // defpackage.dqsa
            public final Object a(String str) {
                cczi ccziVar = bxcq.a;
                boolean z = true;
                if (str != null && !str.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        dqsb dqsbVar = ((dqov) dqtxVar).a;
        if (((Boolean) dqsbVar.b(dqsaVar)).booleanValue() || dqsbVar.c()) {
            return null;
        }
        return (eieu) dqsbVar.b(new dqtv());
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }
}
