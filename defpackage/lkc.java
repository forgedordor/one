package defpackage;

import java.io.File;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkc {
    public static final lkb a(lmj lmjVar, lne lneVar, List list, fdjx fdjxVar, fdae fdaeVar) {
        llx llxVar = new llx(lmjVar, new fdap() { // from class: llw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                File file = (File) obj;
                Set set = llx.a;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new lmu();
            }
        }, fdaeVar);
        ljs lndVar = lneVar;
        if (lneVar == null) {
            lndVar = new lnd();
        }
        return new llo(llxVar, fcva.b(new ljv(list, null)), lndVar, fdjxVar);
    }
}
