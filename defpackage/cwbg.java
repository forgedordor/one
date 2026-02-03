package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwbg extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cwbh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwbg(cwbh cwbhVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cwbhVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cwbg cwbgVar = new cwbg(this.c, (fcxy) obj3);
        cwbgVar.a = (ajlk) obj;
        cwbgVar.b = (ekgb) obj2;
        return cwbgVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String strA;
        ResolvedRecipient resolvedRecipient;
        alqm alqmVarG;
        alqj alqjVarF;
        fctl.b(obj);
        ?? r11 = this.a;
        ?? r0 = this.b;
        String strM = r11.m();
        ajlj ajljVarC = r11.c();
        cwbh cwbhVar = this.c;
        ajlj ajljVar = ajlj.GROUP;
        String str = null;
        if (ajljVarC == ajljVar || (cwbhVar.c instanceof PenpalBotConversationId)) {
            strA = null;
        } else {
            if (cwbhVar.f.a() && (r11.z() || ((ekgb) r0).isEmpty())) {
                ekrw ekrwVarJ = cwbh.a.j();
                ekrwVarJ.X(eksq.a, "BugleCdp");
                ((ekrd) ((ekrd) ekrwVarJ).g(eiip.b(cwbh.b)).h("com/google/android/apps/messaging/ui/conversation/details/header/title/TitleUiAdapterImpl", "getConversationSubtitle", 96, "TitleUiAdapterImpl.kt")).q("Attempting to open CDP header for a deleted conversation");
            } else {
                ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) fcva.P(r0);
                if (resolvedRecipient2 != null) {
                    if (resolvedRecipient2.A()) {
                        strA = cwbhVar.d.d(resolvedRecipient2.g().F().toString());
                    } else {
                        String strY = resolvedRecipient2.y();
                        if (strY != null) {
                            String strA2 = aqbw.a() ? cssf.a(strY) : cwbhVar.d.d(strY);
                            strA2.getClass();
                            strA = chsk.a(strA2);
                        }
                    }
                }
            }
            strA = null;
        }
        cwbi cwbiVar = new cwbi(((asgm) cwbhVar.e.b()).a());
        if (r11.c() != ajljVar && (resolvedRecipient = (ResolvedRecipient) fcva.P(r0)) != null && (alqmVarG = resolvedRecipient.g()) != null && (alqjVarF = alqmVarG.F()) != null) {
            str = alqjVarF.a;
        }
        return new cwbj(strM, strA, str, cwbiVar);
    }
}
