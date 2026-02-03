package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwir extends dwpp {
    private dwpk a;
    private dwpw b;

    @Override // defpackage.dwpp
    public final dwpx a() {
        dwpw dwpwVar;
        dwpk dwpkVar = this.a;
        if (dwpkVar != null && (dwpwVar = this.b) != null) {
            return new dwnc(dwpkVar, dwpwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" owner");
        }
        if (this.b == null) {
            sb.append(" oneOfId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwpp
    public final void b(dwpw dwpwVar) {
        this.b = dwpwVar;
    }

    @Override // defpackage.dwpp
    public final void c(dwpk dwpkVar) {
        if (dwpkVar == null) {
            throw new NullPointerException("Null owner");
        }
        this.a = dwpkVar;
    }
}
