package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idg extends fdbr implements fdav {
    final /* synthetic */ idh a;
    final /* synthetic */ jse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idg(idh idhVar, jse jseVar) {
        super(4);
        this.a = idhVar;
        this.b = jseVar;
    }

    @Override // defpackage.fdav
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        idh idhVar = this.a;
        Rect rect = idhVar.e;
        rect.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        jcr jcrVar = (jcr) this.b;
        idhVar.i.a.requestAutofill(idhVar.b, jcrVar.c, rect);
        return fctx.a;
    }
}
