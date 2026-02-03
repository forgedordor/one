package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfo implements cwfe {
    public final Context a;
    public final fdjx b;
    public final afzc c;
    public final efwo d;
    public final cssf e;
    public final anty f;
    public final ajln g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final aref k;
    public final cwfk l;
    public final cwfa m;
    private final fdjx n;
    private final fdpl o;
    private final fdpl p;

    public cwfo(Context context, fdjx fdjxVar, fdjx fdjxVar2, fdpl fdplVar, fdpl fdplVar2, afzc afzcVar, efwo efwoVar, cssf cssfVar, cwfa cwfaVar, anty antyVar, ajln ajlnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aref arefVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        afzcVar.getClass();
        efwoVar.getClass();
        cssfVar.getClass();
        cwfaVar.getClass();
        antyVar.getClass();
        ajlnVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = context;
        this.n = fdjxVar;
        this.b = fdjxVar2;
        this.o = fdplVar;
        this.p = fdplVar2;
        this.c = afzcVar;
        this.d = efwoVar;
        this.e = cssfVar;
        this.m = cwfaVar;
        this.f = antyVar;
        this.g = ajlnVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = arefVar;
        this.l = new cwfk(this);
    }

    public static final Uri b(Uri uri) {
        return uri.buildUpon().appendQueryParameter("sz", cpbl.b.c).build();
    }

    @Override // defpackage.cwfe
    public final fdvc a() {
        fdpl fdplVar = this.p;
        cwfa cwfaVar = this.m;
        fduf fdufVar = cwfaVar.a;
        fdpl fdplVarA = auyk.a(this.o, "ConversationProperties");
        fdvc fdvcVarB = auyk.b(fdufVar, "AvatarClicked");
        fdvc fdvcVarB2 = auyk.b(cwfaVar.b, "SelectedGroupRecipient");
        fdpl fdplVarA2 = auyk.a(fdplVar, "Recipients");
        cwfl cwflVar = new cwfl(this, null);
        fdjx fdjxVar = this.n;
        return fdtg.b(avac.h(fdplVarA, fdvcVarB, fdvcVarB2, fdplVarA2, fdjxVar, cwflVar), fdjxVar, fdur.a(0L, 3), null);
    }
}
