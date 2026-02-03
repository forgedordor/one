package defpackage;

import android.content.Context;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.internal.IConstellationApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoa implements dcir {
    final /* synthetic */ GetIidTokenRequest a;

    public dcoa(GetIidTokenRequest getIidTokenRequest) {
        this.a = getIidTokenRequest;
    }

    @Override // defpackage.dcir
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dcos dcosVar = (dcos) obj;
        dcnz dcnzVar = new dcnz((defr) obj2);
        IConstellationApiService iConstellationApiService = (IConstellationApiService) dcosVar.w();
        Context context = dcosVar.c;
        iConstellationApiService.getIidToken(dcnzVar, this.a, ddlh.a());
    }
}
