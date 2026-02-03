package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcn implements vdy {
    public final Context a;
    public final afzc b;
    public final fdpl c;
    private final fdjx d;
    private final Set e;

    public cwcn(Context context, afzc afzcVar, fdpl fdplVar, fdpl fdplVar2, fdjx fdjxVar, Optional optional) {
        context.getClass();
        afzcVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = afzcVar;
        this.d = fdjxVar;
        fdpl fdplVarA = auyk.a(fdplVar, "conversationRecipient");
        cwdc cwdcVar = (cwdc) fdct.b(optional);
        fdpl cwcmVar = cwdcVar != null ? new cwcm(cwdcVar.b) : new fdpu(null);
        cwdc cwdcVar2 = (cwdc) fdct.b(optional);
        this.c = avac.g(fdplVarA, cwcmVar, cwdcVar2 != null ? cwdcVar2.c : new fdpu(null), fdjxVar, new cwcj(this, null));
        this.e = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
