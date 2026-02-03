package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crcf extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ SuggestionData c;
    final /* synthetic */ elqn d;
    final /* synthetic */ eyzv e;
    final /* synthetic */ boolean f;
    final /* synthetic */ float g;
    final /* synthetic */ Boolean h;
    final /* synthetic */ Boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crcf(crcm crcmVar, SuggestionData suggestionData, elqn elqnVar, eyzv eyzvVar, boolean z, float f, Boolean bool, Boolean bool2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = suggestionData;
        this.d = elqnVar;
        this.e = eyzvVar;
        this.f = z;
        this.g = f;
        this.h = bool;
        this.i = bool2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crcf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        crcm crcmVar = this.b;
        SuggestionData suggestionData = this.c;
        elqn elqnVar = this.d;
        eyzv eyzvVar = this.e;
        boolean z = this.f;
        float f = this.g;
        Boolean bool = this.h;
        Boolean bool2 = this.i;
        this.a = 1;
        if (crcmVar.h(suggestionData, elqnVar, eyzvVar, z, f, bool, bool2, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crcf(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
    }
}
