package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuy implements wum {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/info/DraftInfoUiAdapterImpl");
    public final Context b;
    public final doht c;
    public final wpn d;
    public final wjc e;
    private final fdjx f;
    private final fduj g;

    public wuy(Context context, fdjx fdjxVar, doht dohtVar, wpn wpnVar, wjc wjcVar, fduj fdujVar) {
        context.getClass();
        fdjxVar.getClass();
        wjcVar.getClass();
        fdujVar.getClass();
        this.b = context;
        this.f = fdjxVar;
        this.c = dohtVar;
        this.d = wpnVar;
        this.e = wjcVar;
        this.g = fdujVar;
    }

    @Override // defpackage.wum
    public final fdvc a() {
        fdpl fdplVarA = fdqq.a(new wuu(new wur(this.g)));
        wuo wuoVar = new wuo(null, this);
        int i = fdsn.a;
        return fdtg.b(new fdwg(wuoVar, fdplVarA), this.f, fdur.b, null);
    }
}
