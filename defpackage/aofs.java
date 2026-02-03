package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aofs {
    public static final aofr a(Optional optional) {
        if (optional.isEmpty()) {
            return null;
        }
        String strP = ((btzd) optional.get()).p();
        Uri uriN = ((btzd) optional.get()).n();
        if (strP == null && uriN == null) {
            return null;
        }
        if (uriN == null) {
            uriN = Uri.EMPTY;
        }
        if (strP == null) {
            strP = "";
        }
        uriN.getClass();
        return new aofr(strP, uriN);
    }
}
