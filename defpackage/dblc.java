package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblc implements dcir {
    final /* synthetic */ GetAsterismConsentRequest a;

    public dblc(GetAsterismConsentRequest getAsterismConsentRequest) {
        this.a = getAsterismConsentRequest;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dblm dblmVar = (dblm) obj;
        dblb dblbVar = new dblb((defr) obj2);
        IAsterismApiService iAsterismApiService = (IAsterismApiService) dblmVar.w();
        Context context = dblmVar.c;
        iAsterismApiService.getAsterismConsent(dblbVar, this.a, ddlh.a());
    }
}
