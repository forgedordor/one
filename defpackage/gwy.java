package defpackage;

import androidx.compose.material3.TabIndicatorModifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwy implements gwd {
    public final hox a = new hpl(fcvo.a, hsi.a);
    final /* synthetic */ dew b;

    public gwy(dew dewVar) {
        this.b = dewVar;
    }

    @Override // defpackage.gwd
    public final ics a(ics icsVar, final fdav fdavVar) {
        return iwl.a(icsVar, new fdau() { // from class: gwx
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                return (ixn) fdavVar.a((ixp) obj, (ixk) obj2, (kil) obj3, this.a.a());
            }
        });
    }

    @Override // defpackage.gwd
    public final ics b(int i) {
        return new TabIndicatorModifier(this.a, i, this.b);
    }
}
