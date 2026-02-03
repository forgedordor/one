package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alev extends fcyz implements fdat {
    final /* synthetic */ aley a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alev(aley aleyVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aleyVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alev) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fcsu fcsuVar = this.a.b;
        SuggestionData suggestionData = (SuggestionData) fdct.b(((crif) fcsuVar.b()).d(this.b));
        if (suggestionData == null) {
            return null;
        }
        ((crif) fcsuVar.b()).n(suggestionData, ezai.CLICKED);
        return suggestionData;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alev(this.a, this.b, fcxyVar);
    }
}
