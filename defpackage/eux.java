package defpackage;

import androidx.compose.foundation.selection.TriStateToggleableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eux implements fdau {
    final /* synthetic */ dne a;
    final /* synthetic */ jue b;
    final /* synthetic */ boolean c;
    final /* synthetic */ jrw d;
    final /* synthetic */ fdae e;

    public eux(dne dneVar, jue jueVar, boolean z, jrw jrwVar, fdae fdaeVar) {
        this.a = dneVar;
        this.b = jueVar;
        this.c = z;
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
        ics icsVarA = dnh.a(ics.e, ebkVar, this.a).a(new TriStateToggleableElement(this.b, ebkVar, null, this.c, this.d, this.e));
        hmlVar.o();
        return icsVarA;
    }
}
