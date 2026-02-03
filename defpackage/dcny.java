package defpackage;

import android.content.Context;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.internal.IConstellationApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcny implements dcir {
    final /* synthetic */ VerifyPhoneNumberRequest a;

    public dcny(VerifyPhoneNumberRequest verifyPhoneNumberRequest) {
        this.a = verifyPhoneNumberRequest;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dcos dcosVar = (dcos) obj;
        dcnx dcnxVar = new dcnx((defr) obj2);
        IConstellationApiService iConstellationApiService = (IConstellationApiService) dcosVar.w();
        Context context = dcosVar.c;
        iConstellationApiService.verifyPhoneNumber(dcnxVar, this.a, ddlh.a());
    }
}
