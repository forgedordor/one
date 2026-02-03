package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dble implements dcir {
    final /* synthetic */ SetAsterismConsentRequest a;

    public dble(SetAsterismConsentRequest setAsterismConsentRequest) {
        this.a = setAsterismConsentRequest;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dblm dblmVar = (dblm) obj;
        dbld dbldVar = new dbld((defr) obj2);
        IAsterismApiService iAsterismApiService = (IAsterismApiService) dblmVar.w();
        Context context = dblmVar.c;
        iAsterismApiService.setAsterismConsent(dbldVar, this.a, ddlh.a());
    }
}
