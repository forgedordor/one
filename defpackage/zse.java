package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zse extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ aldp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zse(ztv ztvVar, aldp aldpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = aldpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zse) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ztv ztvVar = this.b;
            crif crifVar = (crif) ztvVar.u.b();
            SuggestionData suggestionData = (SuggestionData) this.c;
            crifVar.n(suggestionData, ezai.CLICKED);
            crbi crbiVar = (crbi) ztvVar.t.b();
            elqn elqnVar = elqn.P2P_SUGGESTION_CLICK;
            eyzv eyzvVar = eyzv.CONVERSATION_VIEW;
            boolean z = ((daoe) ztvVar.B.b()).b;
            this.a = 1;
            if (crbiVar.h(suggestionData, elqnVar, eyzvVar, z, 0.0f, false, false, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zse(this.b, this.c, fcxyVar);
    }
}
