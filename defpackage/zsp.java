package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsp extends fcyz implements fdat {
    final /* synthetic */ ztv a;
    final /* synthetic */ SmartSuggestionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsp(ztv ztvVar, SmartSuggestionData smartSuggestionData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ztvVar;
        this.b = smartSuggestionData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ztv ztvVar = this.a;
        ((afzc) ztvVar.s.b()).h(new aggy(new zso(this.b, ztvVar, null), 1));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsp(this.a, this.b, fcxyVar);
    }
}
