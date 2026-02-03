package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efot extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efiv efivVar = (efiv) obj;
        cjhj cjhjVar = (cjhj) cjhm.a.createBuilder();
        cjgl cjglVar = (cjgl) efpv.a.fH().fM(efivVar.b());
        cjhjVar.copyOnWrite();
        cjhm cjhmVar = (cjhm) cjhjVar.instance;
        cjglVar.getClass();
        cjhmVar.c = cjglVar;
        cjhmVar.b |= 1;
        c(efivVar, cjhjVar);
        return (cjhm) cjhjVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        Uri uri;
        cjhm cjhmVar = (cjhm) obj;
        efhm efhmVar = new efhm();
        if ((cjhmVar.b & 1) != 0) {
            ejvj ejvjVar = efpv.a;
            cjgl cjglVar = cjhmVar.c;
            if (cjglVar == null) {
                cjglVar = cjgl.a;
            }
            ContentType contentType = (ContentType) ejvjVar.fM(cjglVar);
            if (contentType == null) {
                throw new NullPointerException("Null contentType");
            }
            efhmVar.a = contentType;
        }
        if ((cjhmVar.b & 2) != 0) {
            d(cjhmVar, efhmVar);
        }
        ContentType contentType2 = efhmVar.a;
        if (contentType2 != null && (uri = efhmVar.b) != null) {
            return new efhn(contentType2, uri);
        }
        StringBuilder sb = new StringBuilder();
        if (efhmVar.a == null) {
            sb.append(" contentType");
        }
        if (efhmVar.b == null) {
            sb.append(" contentUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract void c(efiv efivVar, cjhj cjhjVar);

    public abstract void d(cjhm cjhmVar, efiu efiuVar);
}
