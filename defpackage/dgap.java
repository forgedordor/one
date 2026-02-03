package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgap implements dfyy {
    private final eosd a;
    private final Context b;
    private final dhes c;
    private final deyw d;
    private final deym e;
    private final dfzz f;
    private final fcsu g;
    private final dfyp h;

    public dgap(Context context, dhes dhesVar, dfyp dfypVar, deyw deywVar, deym deymVar, eosd eosdVar, dfzz dfzzVar, fcsu fcsuVar) {
        this.b = context;
        this.c = dhesVar;
        this.h = dfypVar;
        this.d = deywVar;
        this.e = deymVar;
        this.a = eosdVar;
        this.f = dfzzVar;
        this.g = fcsuVar;
    }

    @Override // defpackage.dfyy
    public final dfyx a(String str, dfyr dfyrVar, dgfs dgfsVar, dhjt dhjtVar, dfzi dfziVar, eblg eblgVar, ebkz ebkzVar, dgit dgitVar, dgim dgimVar, dfcg dfcgVar, fcsu fcsuVar, dhip dhipVar) {
        dhip dhipVar2 = new dhip(String.format("%s [%s]", dhipVar, "SR"));
        Object objB = fcsuVar.b();
        Context context = this.b;
        deyw deywVar = this.d;
        dgbu dgbuVar = new dgbu(context, deywVar);
        dgak dgakVar = new dgak(context, deywVar);
        dgal dgalVar = new dgal(context, deywVar);
        fcsu fcsuVar2 = this.g;
        deym deymVar = this.e;
        eosd eosdVar = this.a;
        dfyp dfypVar = this.h;
        return new dgao(dhipVar2, new dgbo(context, dfziVar, eblgVar, this.f, ebkzVar, this.c, dhipVar2, eosdVar, dfypVar, dgitVar, dgimVar, (InstantMessageConfiguration) objB, dfcgVar, dgbuVar, dgakVar, dhjtVar, deymVar, dgalVar, fcsuVar2), dfypVar, dgitVar, dgimVar, deymVar);
    }
}
