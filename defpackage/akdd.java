package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akdd extends fcyz implements fdat {
    int a;
    final /* synthetic */ akdg b;
    final /* synthetic */ BugleConversation c;
    final /* synthetic */ akcy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdd(akdg akdgVar, BugleConversation bugleConversation, akcy akcyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akdgVar;
        this.c = bugleConversation;
        this.d = akcyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akdd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final akdg akdgVar = this.b;
            final BugleConversation bugleConversation = this.c;
            final akcy akcyVar = this.d;
            akdgVar.d.b("RichThemeControllerImpl#outgoingRichThemeUpdate", new Runnable() { // from class: akdc
                @Override // java.lang.Runnable
                public final void run() {
                    BugleConversation bugleConversation2 = bugleConversation;
                    akcy akcyVar2 = akcyVar;
                    akdg.f(bugleConversation2, akcyVar2);
                    akdg akdgVar2 = akdgVar;
                    fcsu fcsuVar = akdgVar2.c;
                    ((bycx) fcsuVar.b()).e(akdg.e(bugleConversation2), akdgVar2.d(akcyVar2));
                }
            });
            this.a = 1;
            Object objA = fdin.a(eicg.a(akdgVar.b), new akde(null, bugleConversation, akdgVar, akcyVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akdd(this.b, this.c, this.d, fcxyVar);
    }
}
