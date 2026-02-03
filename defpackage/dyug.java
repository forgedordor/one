package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyug extends dyun {
    public ejwi a;
    public ejwi b;
    public dyux c;
    public boolean d;
    public byte e;
    public dyum f;
    private ejwi g;
    private ejwi h;
    private ejwi i;
    private ejwi j;

    public dyug() {
        ejud ejudVar = ejud.a;
        this.g = ejudVar;
        this.h = ejudVar;
        this.a = ejudVar;
        this.b = ejudVar;
        this.i = ejudVar;
        this.j = ejudVar;
    }

    @Override // defpackage.dyun
    public final dyuo a() {
        dyux dyuxVar;
        dyum dyumVar;
        if (this.e == 1 && (dyuxVar = this.c) != null && (dyumVar = this.f) != null) {
            return new dyuh(this.g, this.h, this.a, this.b, this.i, this.j, dyuxVar, this.d, dyumVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" secondaryButtonStyleFeature");
        }
        if (this.e == 0) {
            sb.append(" supportAccountSwitching");
        }
        if (this.f == null) {
            sb.append(" customContinueButtonTextsFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyun
    public final void b(dyuj dyujVar) {
        this.i = ejwi.j(dyujVar);
    }

    @Override // defpackage.dyun
    public final void c(dyuu dyuuVar) {
        this.j = ejwi.j(dyuuVar);
    }

    @Override // defpackage.dyun
    public final void d(dyuy dyuyVar) {
        this.g = ejwi.j(dyuyVar);
    }

    public dyug(dyuo dyuoVar) {
        ejud ejudVar = ejud.a;
        this.g = ejudVar;
        this.h = ejudVar;
        this.a = ejudVar;
        this.b = ejudVar;
        this.i = ejudVar;
        this.j = ejudVar;
        dyuh dyuhVar = (dyuh) dyuoVar;
        this.g = dyuhVar.a;
        this.h = dyuhVar.b;
        this.a = dyuhVar.c;
        this.b = dyuhVar.d;
        this.i = dyuhVar.e;
        this.j = dyuhVar.f;
        this.c = dyuhVar.g;
        this.d = dyuhVar.h;
        this.f = dyuhVar.i;
        this.e = (byte) 1;
    }
}
