package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrm extends fcyz implements fdat {
    int a;
    final /* synthetic */ wrt b;
    final /* synthetic */ vvw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrm(fcxy fcxyVar, wrt wrtVar, vvw vvwVar) {
        super(2, fcxyVar);
        this.b = wrtVar;
        this.c = vvwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wrm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ekrw ekrwVarE = wrt.a.e();
                ekrwVarE.X(eksq.a, "BugleComposeRow2");
                ekrd ekrdVar = (ekrd) ekrwVarE;
                final wrt wrtVar = this.b;
                ekrdVar.X(cqnc.t, wrtVar.b);
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$save$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 81, "ConversationDraftPersistence.kt");
                final vvw vvwVar = this.c;
                ekrdVar2.t("Persistence saving draft %s", vvwVar);
                this.a = 1;
                eiju eijuVarM = wrtVar.a(new fdap() { // from class: wrf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        bpbl bpblVar = (bpbl) obj3;
                        bpblVar.getClass();
                        Iterator it = wrtVar.e.iterator();
                        while (it.hasNext()) {
                            ((wsl) it.next()).c(bpblVar, vvwVar);
                        }
                        return fctx.a;
                    }
                }).m();
                eijuVarM.getClass();
                Object objC = fdxs.c(eijuVarM, this);
                if (objC != obj2) {
                    objC = fctx.a;
                }
                if (objC == obj2) {
                    return obj2;
                }
            }
        } catch (SQLiteConstraintException e) {
            ekrw ekrwVarJ = wrt.a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$save$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 88, "ConversationDraftPersistence.kt")).q("Draft was not persisted because conversation was already deleted");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wrm wrmVar = new wrm(fcxyVar, this.b, this.c);
        wrmVar.d = obj;
        return wrmVar;
    }
}
