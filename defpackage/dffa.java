package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dffa implements dfif {
    protected final Context a;
    protected final dfes b;

    public dffa(Context context, dfes dfesVar) {
        this.a = context;
        this.b = dfesVar;
    }

    protected abstract String a();

    @Override // defpackage.dfif
    public void c(dfek dfekVar) {
        String strA = a();
        dhja.c("HTTP file transfer failed for pendingTransferKey %s, fileTransferError %s", strA, dfekVar);
        dfer dferVar = (dfer) this.b;
        dferVar.f.remove(strA);
        if (dfek.f.equals(dfekVar)) {
            dferVar.i.a.onReconfigurationRequested();
        }
    }
}
