package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.internal.IAuthService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbra extends dcfm {
    public dbra(Context context, dboh dbohVar) {
        super(context, dbog.b, dbohVar, dcfl.a);
    }

    public final defn a() {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dbqy
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ((IAuthService) ((dbqs) obj).w()).getSpatulaHeader(new dbqz((defr) obj2));
            }
        };
        dcizVar.c = 1520;
        return j(dcizVar.a());
    }
}
