package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzu implements dfyy {
    private final Context a;
    private final dhej b;
    private final dgwa c;
    private final dfcg d;
    private final deym e;
    private final dgve f;
    private final ebqx g;
    private final dfzr h;
    private final dfzz i;

    public dfzu(Context context, dhej dhejVar, dgwa dgwaVar, dfcg dfcgVar, deym deymVar, dgve dgveVar, ebqx ebqxVar, dfzr dfzrVar, dfzz dfzzVar) {
        this.a = context;
        this.b = dhejVar;
        this.c = dgwaVar;
        this.d = dfcgVar;
        this.e = deymVar;
        this.f = dgveVar;
        this.g = ebqxVar;
        this.h = dfzrVar;
        this.i = dfzzVar;
    }

    @Override // defpackage.dfyy
    public final dfyx a(String str, dfyr dfyrVar, dgfs dgfsVar, dhjt dhjtVar, dfzi dfziVar, eblg eblgVar, ebkz ebkzVar, dgit dgitVar, dgim dgimVar, dfcg dfcgVar, fcsu fcsuVar, dhip dhipVar) {
        Optional optionalOfNullable;
        dhja.l(dhipVar, "Creating RegistrationEngine.", new Object[0]);
        dhjtVar.b.a = Optional.of("-regv2");
        dfzr dfzrVar = this.h;
        dhip dhipVar2 = dfzrVar.b;
        dhja.d(dhipVar2, "Creating ImsNetworkInterfaces.", new Object[0]);
        Context context = dfzrVar.a;
        devs devsVar = new devs(context);
        deym deymVar = dfzrVar.c;
        dfzp dfzpVar = new dfzp(context, 1, devsVar, dhipVar2, deymVar);
        Map map = dfzrVar.d;
        map.put(0, dfzpVar);
        map.put(1, new dfzp(context, 2, new devt(), dhipVar2, deymVar));
        map.put(17, new dfzp(context, 5, new devs(context), dhipVar2, deymVar));
        dfcg dfcgVar2 = this.d;
        dhej dhejVar = this.b;
        deym deymVar2 = this.e;
        dgve dgveVar = this.f;
        Context context2 = this.a;
        dgfi dgfiVar = new dgfi(context2, str, eblgVar, this.i, dgitVar, dgimVar, this.c, ebkzVar, dfzrVar, dgfsVar, dfziVar, dfyrVar, dhipVar, dfcgVar2, dhejVar, deymVar2, dgveVar, this.g, dhjtVar, fcsuVar);
        synchronized (dfdr.a) {
            optionalOfNullable = Optional.ofNullable(dfdr.b);
        }
        eosc eoscVarS = ((dfdp) optionalOfNullable.get()).s();
        return new dgcs(dgitVar, dgimVar, fcsuVar, dgfiVar, new dgfn(context2, eoscVarS), eoscVarS, dhipVar);
    }
}
