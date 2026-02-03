package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edto extends edtr {
    public edts a;
    public ejwi b = ejud.a;
    private edtt c;
    private edtm d;
    private boolean e;
    private eygg f;
    private int g;
    private int h;
    private byte i;

    @Override // defpackage.edtr
    public final edtu a() {
        edtt edttVar;
        edtm edtmVar;
        eygg eyggVar;
        edts edtsVar;
        if (this.i == 7 && (edttVar = this.c) != null && (edtmVar = this.d) != null && (eyggVar = this.f) != null && (edtsVar = this.a) != null) {
            return new edtp(edttVar, edtmVar, this.e, eyggVar, this.g, this.h, edtsVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" kind");
        }
        if (this.d == null) {
            sb.append(" fragmentStartMode");
        }
        if ((this.i & 1) == 0) {
            sb.append(" enabled");
        }
        if (this.f == null) {
            sb.append(" fragmentLazy");
        }
        if ((this.i & 2) == 0) {
            sb.append(" tabNameRes");
        }
        if ((this.i & 4) == 0) {
            sb.append(" visualElementId");
        }
        if (this.a == null) {
            sb.append(" iconApplier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edtr
    public final void b(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.edtr
    public final void c(eygg eyggVar) {
        if (eyggVar == null) {
            throw new NullPointerException("Null fragmentLazy");
        }
        this.f = eyggVar;
    }

    @Override // defpackage.edtr
    public final void d(edtm edtmVar) {
        if (edtmVar == null) {
            throw new NullPointerException("Null fragmentStartMode");
        }
        this.d = edtmVar;
    }

    @Override // defpackage.edtr
    public final void e(edtt edttVar) {
        if (edttVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.c = edttVar;
    }

    @Override // defpackage.edtr
    public final void f(int i) {
        this.g = i;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.edtr
    public final void g(int i) {
        this.h = i;
        this.i = (byte) (this.i | 4);
    }
}
