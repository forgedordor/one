package defpackage;

import androidx.compose.foundation.ClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlg implements fdau {
    final /* synthetic */ dne a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ jrw d;
    final /* synthetic */ fdae e;

    public dlg(dne dneVar, boolean z, String str, jrw jrwVar, fdae fdaeVar) {
        this.a = dneVar;
        this.b = z;
        this.c = str;
        this.d = jrwVar;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-1525724089);
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new ebk();
            hmlVar.y(objF);
        }
        ebk ebkVar = (ebk) objF;
        ics icsVarA = dnh.a(ics.e, ebkVar, this.a).a(new ClickableElement(ebkVar, null, false, this.b, this.c, this.d, this.e));
        hmlVar.o();
        return icsVarA;
    }
}
