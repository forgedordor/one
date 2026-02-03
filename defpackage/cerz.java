package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.GetIidTokenResponse;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cerz {
    public static final cqce a = cqce.g("Bugle", "ConstellationClientHelperImpl");
    public final dcoc b;
    public final ains c;
    private final Context d;
    private final dcdt e;
    private volatile Boolean f;

    public cerz(Context context, dcdt dcdtVar, dcoc dcocVar, ains ainsVar) {
        this.d = context;
        this.e = dcdtVar;
        this.b = dcocVar;
        this.c = ainsVar;
    }

    public final eiju a() {
        boolean zBooleanValue;
        if (this.f != null) {
            zBooleanValue = this.f.booleanValue();
        } else {
            this.f = Boolean.valueOf(this.e.h(this.d, 12200000) == 0);
            zBooleanValue = this.f.booleanValue();
        }
        if (zBooleanValue) {
            return eiju.g(kol.a(new koi() { // from class: cery
                @Override // defpackage.koi
                public final Object a(final kog kogVar) {
                    final cerz cerzVar = this.a;
                    cerzVar.c.c("Bugle.Constellation.IIDToken.Requested");
                    GetIidTokenRequest getIidTokenRequest = new GetIidTokenRequest(466216207879L);
                    dciz dcizVar = new dciz();
                    dcizVar.a = new dcoa(getIidTokenRequest);
                    dcizVar.b = new Feature[]{dcod.e};
                    dcizVar.c = 11903;
                    defn defnVarJ = cerzVar.b.j(dcizVar.a());
                    defnVarJ.t(new defe() { // from class: cerw
                        @Override // defpackage.defe
                        public final void d(Exception exc) {
                            cqbd cqbdVarA = cerz.a.a();
                            cqbdVarA.I("C11N token request failed. Returning empty optional.");
                            cqbdVarA.s(exc);
                            cerzVar.c.c("Bugle.Constellation.IIDToken.Request.Failed");
                            kogVar.b(Optional.empty());
                        }
                    });
                    defnVarJ.a(new defh() { // from class: cerx
                        @Override // defpackage.defh
                        public final void e(Object obj) {
                            String str = ((GetIidTokenResponse) obj).a;
                            cqbd cqbdVarA = cerz.a.a();
                            cqbdVarA.I("C11N token request succeeded.");
                            cqbdVarA.A("token", str);
                            cqbdVarA.r();
                            cerzVar.c.c("Bugle.Constellation.IIDToken.Request.Succeeded");
                            kogVar.b(Optional.ofNullable(str));
                        }
                    });
                    return "Requesting IIDToken from Constellation API.";
                }
            }));
        }
        a.r("Google Play Service is not available, C11N IIDToken request not sent.");
        this.c.c("Bugle.Constellation.IIDToken.Request.Skipped.API.Unavailable");
        return eijx.e(Optional.empty());
    }
}
