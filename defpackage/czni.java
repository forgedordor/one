package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czni implements eind {
    final /* synthetic */ czmx a;

    public czni(czmx czmxVar) {
        this.a = czmxVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        boolean z = ((czpd) einbVar).a;
        czmx czmxVar = this.a;
        if (z) {
            if (czmxVar.aa) {
                czmxVar.G.setVisibility(8);
            } else {
                czmxVar.y.setVisibility(8);
            }
            czmxVar.z.setVisibility(8);
        } else {
            if (czmxVar.aa) {
                czmxVar.G.setVisibility(true == czmxVar.y() ? 0 : 8);
            } else {
                czmxVar.y.setVisibility(true == czmxVar.y() ? 0 : 8);
            }
            czmxVar.z.setVisibility(0);
        }
        return eine.a;
    }
}
