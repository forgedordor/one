package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pki implements pjt {
    public final Context a;
    public final String b;
    public final pjp c;
    public final boolean d;
    public final boolean e;
    public final fctc f = fctd.a(new fdae() { // from class: pkc
        @Override // defpackage.fdae
        public final Object invoke() {
            pkh pkhVar;
            pki pkiVar = this.a;
            String str = pkiVar.b;
            if (str == null || !pkiVar.d) {
                pkhVar = new pkh(pkiVar.a, str, new pkd(), pkiVar.c, pkiVar.e);
            } else {
                Context context = pkiVar.a;
                File noBackupFilesDir = context.getNoBackupFilesDir();
                noBackupFilesDir.getClass();
                pkhVar = new pkh(context, new File(noBackupFilesDir, str).getAbsolutePath(), new pkd(), pkiVar.c, pkiVar.e);
            }
            pkhVar.setWriteAheadLoggingEnabled(pkiVar.g);
            return pkhVar;
        }
    });
    public boolean g;

    public pki(Context context, String str, pjp pjpVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = pjpVar;
        this.d = z;
        this.e = z2;
    }

    public final pkh a() {
        return (pkh) this.f.a();
    }

    @Override // defpackage.pjt
    public final pjo b() {
        return a().b();
    }

    @Override // defpackage.pjt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f.b()) {
            a().close();
        }
    }
}
