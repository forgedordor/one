package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwe extends dwwy {
    public final Executor a = new eoss(dvht.b().a);
    protected final dvwh b;
    protected final dvwd c;
    protected final dvtm d;

    public dvwe(Context context, ejvr ejvrVar, dvtm dvtmVar, Uri uri, dvwh dvwhVar) {
        this.b = dvwhVar;
        this.d = dvtmVar;
        this.c = new dvwd(this, context, ejvrVar, uri);
    }

    @Override // defpackage.dwwy
    protected final synchronized void a() {
        final dvwd dvwdVar = this.c;
        dvwdVar.getClass();
        i(new Runnable() { // from class: dvvy
            @Override // java.lang.Runnable
            public final void run() {
                dvwdVar.o();
            }
        });
    }

    @Override // defpackage.dwwy
    protected final synchronized void b() {
        final dvwd dvwdVar = this.c;
        dvwdVar.getClass();
        i(new Runnable() { // from class: dvwa
            @Override // java.lang.Runnable
            public final void run() {
                dvwdVar.p();
            }
        });
    }

    @Override // defpackage.dwwy
    protected final void c(Object obj) {
        super.c(obj);
    }
}
