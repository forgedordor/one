package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecna implements eora {
    final /* synthetic */ ecng a;

    public ecna(ecng ecngVar) {
        this.a = ecngVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
            return;
        }
        ecng ecngVar = this.a;
        synchronized (ecngVar.j) {
            ecngVar.e();
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
