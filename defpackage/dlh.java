package defpackage;

import androidx.compose.foundation.CombinedClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlh implements fdau {
    final /* synthetic */ dne a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jrw c;
    final /* synthetic */ fdae d;
    final /* synthetic */ fdae e;

    public dlh(dne dneVar, boolean z, jrw jrwVar, fdae fdaeVar, fdae fdaeVar2) {
        this.a = dneVar;
        this.b = z;
        this.c = jrwVar;
        this.d = fdaeVar;
        this.e = fdaeVar2;
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
        ics icsVarA = dnh.a(ics.e, ebkVar, this.a).a(new CombinedClickableElement(ebkVar, null, false, this.b, this.c, this.d, this.e));
        hmlVar.o();
        return icsVarA;
    }
}
