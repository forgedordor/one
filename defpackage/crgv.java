package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgv extends ejkt {
    private final ejly a;

    public crgv(ejly ejlyVar) {
        this.a = ejlyVar;
    }

    @Override // defpackage.ejkt
    public final euob a(int i, ejha ejhaVar) throws ejkv {
        try {
            new HashMap();
            int i2 = ejhaVar.b;
            if ((i2 & 1) == 0) {
                if ((i2 & 2) != 0) {
                    return euoc.a(i, euoa.a(ejhaVar.d));
                }
                throw new ejkv(a.E(ejhaVar, "FileSpec is not supported: "));
            }
            try {
                cdta cdtaVarI = this.a.i(ejhaVar);
                try {
                    euob euobVarA = euoc.a(i, Uri.parse(cdtaVarI.a()));
                    cdtaVarI.close();
                    return euobVarA;
                } finally {
                }
            } catch (Exception e) {
                if ((ejhaVar.b & 2) != 0) {
                    return euoc.a(i, euoa.a(ejhaVar.d));
                }
                throw new ejkv(e);
            }
        } catch (Exception e2) {
            throw new ejkv(e2);
        }
    }
}
