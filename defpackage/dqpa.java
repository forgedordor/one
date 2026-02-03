package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqpa extends dqyf {
    public dqsb a;
    public String b;
    public dqyg c;
    private boolean d;
    private boolean e;
    private boolean f;
    private ekhv g;
    private ekhx h;
    private int i;
    private byte j;

    public dqpa() {
    }

    @Override // defpackage.dqyf
    public final dqyh a() {
        dqsb dqsbVar;
        ekhv ekhvVar = this.g;
        if (ekhvVar != null) {
            this.h = ekhvVar.g();
        } else if (this.h == null) {
            this.h = ekon.a;
        }
        if (this.j == 15 && (dqsbVar = this.a) != null) {
            return new dqpb(this.d, this.e, this.f, dqsbVar, this.b, this.h, this.i, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" disableTableFilters");
        }
        if ((this.j & 2) == 0) {
            sb.append(" omitUnchangedRows");
        }
        if ((this.j & 4) == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.a == null) {
            sb.append(" loggingTag");
        }
        if ((this.j & 8) == 0) {
            sb.append(" conflictAlgorithm");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqyf
    public final ekhv b() {
        if (this.g == null) {
            if (this.h == null) {
                this.g = new ekhv();
            } else {
                ekhv ekhvVar = new ekhv();
                this.g = ekhvVar;
                ekhvVar.j(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.dqyf
    public final void c(int i) {
        this.i = i;
        this.j = (byte) (this.j | 8);
    }

    @Override // defpackage.dqyf
    public final void d(boolean z) {
        this.d = z;
        this.j = (byte) (this.j | 1);
    }

    @Override // defpackage.dqyf
    public final void e(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 4);
    }

    @Override // defpackage.dqyf
    public final void f(boolean z) {
        this.e = z;
        this.j = (byte) (this.j | 2);
    }

    public dqpa(dqyh dqyhVar) {
        dqpb dqpbVar = (dqpb) dqyhVar;
        this.d = dqpbVar.a;
        this.e = dqpbVar.b;
        this.f = dqpbVar.c;
        this.a = dqpbVar.d;
        this.b = dqpbVar.e;
        this.h = dqpbVar.f;
        this.i = dqpbVar.g;
        this.c = dqpbVar.h;
        this.j = (byte) 15;
    }
}
