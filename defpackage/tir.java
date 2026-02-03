package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tir extends tiv {
    public String a;
    private ekgb e;
    private int f;
    private byte g;
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();
    public Optional b = Optional.empty();

    @Override // defpackage.tiv
    public final tiw a() {
        String str;
        ekgb ekgbVar;
        if (this.g == 1 && (str = this.a) != null && (ekgbVar = this.e) != null) {
            return new tis(str, this.c, this.d, this.b, ekgbVar, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" displayDestination");
        }
        if (this.e == null) {
            sb.append(" snackbarInteractions");
        }
        if (this.g == 0) {
            sb.append(" anchorViewId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.tiv
    public final void b(int i) {
        this.f = i;
        this.g = (byte) 1;
    }

    @Override // defpackage.tiv
    public final void c(boolean z) {
        this.c = Optional.of(Boolean.valueOf(z));
    }

    @Override // defpackage.tiv
    public final void d(boolean z) {
        this.d = Optional.of(Boolean.valueOf(z));
    }

    @Override // defpackage.tiv
    public final void e(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null snackbarInteractions");
        }
        this.e = ekgbVar;
    }
}
