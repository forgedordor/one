package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drst extends drth {
    public byte a;
    private String b;
    private int c;
    private int d;
    private int e;
    private ekgb f;
    private boolean g;
    private boolean h;

    public drst() {
    }

    @Override // defpackage.drth
    public final drti a() {
        if (this.a == 63 && this.b != null && this.f != null) {
            return new drti(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" emoji");
        }
        if ((this.a & 1) == 0) {
            sb.append(" positionInCategory");
        }
        if ((this.a & 2) == 0) {
            sb.append(" categoryIndex");
        }
        if ((this.a & 4) == 0) {
            sb.append(" categorySize");
        }
        if (this.f == null) {
            sb.append(" variants");
        }
        if ((this.a & 8) == 0) {
            sb.append(" inVariantsPopup");
        }
        if ((this.a & 16) == 0) {
            sb.append(" isSelected");
        }
        if ((this.a & 32) == 0) {
            sb.append(" isActivated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.drth
    public final void b(int i) {
        this.d = i;
        this.a = (byte) (this.a | 2);
    }

    @Override // defpackage.drth
    public final void c(int i) {
        this.e = i;
        this.a = (byte) (this.a | 4);
    }

    @Override // defpackage.drth
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null emoji");
        }
        this.b = str;
    }

    @Override // defpackage.drth
    public final void e(boolean z) {
        this.g = z;
        this.a = (byte) (this.a | 8);
    }

    @Override // defpackage.drth
    public final void f(boolean z) {
        this.h = z;
        this.a = (byte) (this.a | 16);
    }

    @Override // defpackage.drth
    public final void g(int i) {
        this.c = i;
        this.a = (byte) (this.a | 1);
    }

    @Override // defpackage.drth
    public final void h(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null variants");
        }
        this.f = ekgbVar;
    }

    public drst(drti drtiVar) {
        this.b = drtiVar.b;
        this.c = drtiVar.c;
        this.d = drtiVar.d;
        this.e = drtiVar.e;
        this.f = drtiVar.f;
        this.g = drtiVar.g;
        this.h = drtiVar.h;
        this.a = (byte) 63;
    }
}
