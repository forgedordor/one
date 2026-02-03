package defpackage;

import androidx.compose.foundation.selection.SelectableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eus implements fdau {
    final /* synthetic */ dne a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ jrw d;
    final /* synthetic */ fdae e;

    public eus(dne dneVar, boolean z, boolean z2, jrw jrwVar, fdae fdaeVar) {
        this.a = dneVar;
        this.b = z;
        this.c = z2;
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
        ics icsVarA = dnh.a(ics.e, ebkVar, this.a).a(new SelectableElement(this.b, ebkVar, null, false, this.c, this.d, this.e));
        hmlVar.o();
        return icsVarA;
    }
}
