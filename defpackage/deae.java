package defpackage;

import android.content.Context;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deae extends dcfm {
    public deae(Context context) {
        super(context, deaa.c, dcfa.q, dcfl.a);
    }

    public final defn a() {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: deab
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                deah deahVar = (deah) obj;
                IPseudonymousIdService iPseudonymousIdService = (IPseudonymousIdService) deahVar.w();
                deac deacVar = new deac((defr) obj2);
                Context context = deahVar.c;
                iPseudonymousIdService.getToken(deacVar, ddlh.a());
            }
        };
        dcizVar.c = 3901;
        return j(dcizVar.a());
    }
}
