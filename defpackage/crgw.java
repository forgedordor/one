package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgw extends ejku {
    private final ejly a;

    public crgw(ejly ejlyVar) {
        this.a = ejlyVar;
    }

    @Override // defpackage.ejku
    public final Optional a(ejha ejhaVar, Map map) throws ejkv {
        try {
            int i = ejhaVar.b;
            if ((i & 1) != 0) {
                try {
                    cdta cdtaVarI = this.a.i(ejhaVar);
                    try {
                        Optional optionalOf = Optional.of(euog.a(Uri.parse(cdtaVarI.a()), map));
                        cdtaVarI.close();
                        return optionalOf;
                    } catch (Throwable th) {
                        try {
                            cdtaVarI.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    if ((ejhaVar.b & 2) == 0) {
                        return Optional.empty();
                    }
                    return Optional.of(euog.a(euoa.a(ejhaVar.d), map));
                } catch (Exception e) {
                    if ((ejhaVar.b & 2) != 0) {
                        return Optional.of(euog.a(euoa.a(ejhaVar.d), map));
                    }
                    throw new ejkv(e);
                }
            }
            if ((i & 2) != 0) {
                return Optional.of(euog.a(euoa.a(ejhaVar.d), map));
            }
            ejhc ejhcVar = ejhaVar.c;
            if (ejhcVar == null) {
                ejhcVar = ejhc.a;
            }
            String str = ejhcVar.c;
            ejhc ejhcVar2 = ejhaVar.c;
            if (ejhcVar2 == null) {
                ejhcVar2 = ejhc.a;
            }
            throw new ejkv("FileSpec is not supported: MDD id: " + str + " MDD group: " + ejhcVar2.d + " file pat1h: " + ejhaVar.d);
        } catch (Exception e2) {
            throw new ejkv(e2);
        }
    }
}
