package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class www implements wwe, vvx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final ajmh d;
    public final wre e;
    public final zwf f;
    public final wmp g;
    public final fcsu h;
    private final fcyh i;

    public www(Context context, fcyh fcyhVar, fdjx fdjxVar, ajmh ajmhVar, wre wreVar, zwf zwfVar, wmp wmpVar, fcsu fcsuVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        ajmhVar.getClass();
        wreVar.getClass();
        zwfVar.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.i = fcyhVar;
        this.c = fdjxVar;
        this.d = ajmhVar;
        this.e = wreVar;
        this.f = zwfVar;
        this.g = wmpVar;
        this.h = fcsuVar;
    }

    @Override // defpackage.vvx
    public final Object a(MessageId messageId, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.i), new wwu(null, this, messageId), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.wwe
    public final fdvc b() {
        fdpl fdplVarA = fdqq.a(new wwj(this.e.a));
        wwg wwgVar = new wwg(null, this);
        int i = fdsn.a;
        return fdtg.b(new wwm(new fdwg(wwgVar, fdplVarA), this), this.c, fdur.b, null);
    }

    public final void c() {
        vvw vvwVarA = this.e.a(new fdap() { // from class: wwf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvw.c(vvwVar, null, null, null, false, null, null, false, 0, null, 2031);
            }
        });
        ekrw ekrwVarF = a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl", "removeReplyToSync", 126, "DraftReplyUiAdapterImpl.kt")).t("Removed reply to %s", vvwVarA.e);
    }
}
