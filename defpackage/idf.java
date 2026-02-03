package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idf extends fdbr implements fdav {
    final /* synthetic */ idh a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idf(idh idhVar, int i) {
        super(4);
        this.a = idhVar;
        this.b = i;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Rect rect = new Rect(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        idh idhVar = this.a;
        idhVar.i.a.notifyViewEntered(idhVar.b, this.b, rect);
        return fctx.a;
    }
}
