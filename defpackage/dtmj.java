package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmj extends dtmg {
    public ejwi a;
    private dtns b;
    private ejwi c;

    public dtmj() {
        ejud ejudVar = ejud.a;
        this.c = ejudVar;
        this.a = ejudVar;
    }

    @Override // defpackage.dtmg
    public final dtmh a() {
        dtns dtnsVar = this.b;
        if (dtnsVar != null) {
            return new dtmk(dtnsVar, this.c, this.a);
        }
        throw new IllegalStateException("Missing required properties: dataFileGroup");
    }

    @Override // defpackage.dtmg
    public final void b(ejwi ejwiVar) {
        if (ejwiVar == null) {
            throw new NullPointerException("Null accountOptional");
        }
        this.c = ejwiVar;
    }

    @Override // defpackage.dtmg
    public final void c(dtns dtnsVar) {
        if (dtnsVar == null) {
            throw new NullPointerException("Null dataFileGroup");
        }
        this.b = dtnsVar;
    }
}
