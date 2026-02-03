package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyeu extends dygo {
    public dyhk a;
    public dygj b;
    public ejwi c = ejud.a;
    public dygm d;

    @Override // defpackage.dygo
    public final dygp a() {
        dygj dygjVar;
        dygm dygmVar;
        dyhk dyhkVar = this.a;
        if (dyhkVar != null && (dygjVar = this.b) != null && (dygmVar = this.d) != null) {
            return new dyev(dyhkVar, dygjVar, this.c, dygmVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" cardIcon");
        }
        if (this.b == null) {
            sb.append(" titleData");
        }
        if (this.d == null) {
            sb.append(" visualElementsInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
