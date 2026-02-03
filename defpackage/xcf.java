package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcf extends fcyz implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ xci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcf(String str, xci xciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = str;
        this.b = xciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final String str = this.a;
        boolean z = str.length() == 0;
        if (z) {
            ekrw ekrwVarF = xci.a.f();
            ekrwVarF.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onSubjectChange$1", "invokeSuspend", 154, "SubjectUrgentUiAdapterImpl.kt")).q("Subject set to empty");
        } else {
            ekrw ekrwVarF2 = xci.a.f();
            ekrwVarF2.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarF2;
            ekrdVar.V(5, TimeUnit.SECONDS);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onSubjectChange$1", "invokeSuspend", 159, "SubjectUrgentUiAdapterImpl.kt")).t("Subject changed to %s", cqcy.b(str));
        }
        if (true == z) {
            str = null;
        }
        this.b.c.c(new fdap() { // from class: xce
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return vvw.c((vvw) obj2, null, null, str, false, null, null, false, 0, null, 2043);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xcf(this.a, this.b, fcxyVar);
    }
}
