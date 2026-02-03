package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddy {
    private static final cqce a = cqce.g("BugleNetwork", "ReceiverIdParser");

    public static ezol a(String str) {
        if (TextUtils.isEmpty(str)) {
            a.n("Empty receiver ID in firebase tickle.");
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            try {
                ezol ezolVar = (ezol) evsn.parseFrom(ezol.a, bArrDecode, evrr.a());
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Extracted receiver id from firebase tickle");
                cqbdVarC.M("receiverId", ezolVar.c);
                felm felmVarB = felm.b(ezolVar.b);
                if (felmVarB == null) {
                    felmVarB = felm.UNRECOGNIZED;
                }
                cqbdVarC.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, felmVarB);
                cqbdVarC.r();
                return ezolVar;
            } catch (evtj unused) {
                a.n("Could not decode receiver ID. Invalid protobuf.");
                return null;
            }
        } catch (IllegalArgumentException unused2) {
            a.n("Could not decode receiver ID. Invalid base64.");
            return null;
        }
    }
}
