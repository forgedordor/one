package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggl extends cgir {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    private cgit g;
    private Bundle h;
    private boolean i;
    private CharSequence j;
    private boolean k;
    private boolean l;
    private byte m;

    @Override // defpackage.cgir
    public final cgis a() {
        cgit cgitVar;
        Bundle bundle;
        CharSequence charSequence;
        if (this.m == 7 && (cgitVar = this.g) != null && (bundle = this.h) != null && (charSequence = this.j) != null) {
            return new cggm(cgitVar, bundle, this.i, charSequence, this.k, this.l, this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" actionType");
        }
        if (this.h == null) {
            sb.append(" callbackBundle");
        }
        if ((this.m & 1) == 0) {
            sb.append(" shouldAddParentStack");
        }
        if (this.j == null) {
            sb.append(" title");
        }
        if ((this.m & 2) == 0) {
            sb.append(" openActivityOnWear");
        }
        if ((this.m & 4) == 0) {
            sb.append(" isMainActivityWearAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    final void b(cgit cgitVar) {
        if (cgitVar == null) {
            throw new NullPointerException("Null actionType");
        }
        this.g = cgitVar;
    }

    @Override // defpackage.cgir
    public final void c(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("Null callbackBundle");
        }
        this.h = bundle;
    }

    @Override // defpackage.cgir
    public final void d(boolean z) {
        this.l = z;
        this.m = (byte) (this.m | 4);
    }

    @Override // defpackage.cgir
    public final void e(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.cgir
    public final void f(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.cgir
    public final void g(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null title");
        }
        this.j = charSequence;
    }
}
