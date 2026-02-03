package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yby {
    public final djcy a;
    public final djdm b;
    public final ybn c;
    public final djfn d;
    public final djga e;
    private final boolean f;

    public yby(djcy djcyVar, ybn ybnVar, byte[] bArr) {
        this.a = djcyVar;
        this.b = null;
        this.c = ybnVar;
        this.d = new djfn(fcvo.a, null, new fdap() { // from class: ybx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((djex) obj).getClass();
                return fctx.a;
            }
        });
        boolean z = ((ybm) ybnVar).a;
        this.f = z;
        boolean z2 = true;
        if (!z && !fdbq.f(ybnVar, ybl.a)) {
            z2 = false;
        }
        this.e = new djga(z2, false, false, true, false, z, 22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yby)) {
            return false;
        }
        yby ybyVar = (yby) obj;
        if (!fdbq.f(this.a, ybyVar.a)) {
            return false;
        }
        djdm djdmVar = ybyVar.b;
        return fdbq.f(null, null) && fdbq.f(this.c, ybyVar.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.c.hashCode();
    }

    public final String toString() {
        return "FullScreenComposeRowUiData(draft=" + this.a + ", inputs=null, theme=" + this.c + ")";
    }

    public /* synthetic */ yby(djcy djcyVar, ybn ybnVar) {
        this(djcyVar, ybnVar, null);
    }
}
