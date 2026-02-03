package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggx extends cgkr {
    public IconCompat a;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();
    public Optional j = Optional.empty();
    public Optional k = Optional.empty();
    public Optional l = Optional.empty();
    public Optional m = Optional.empty();
    public Optional n = Optional.empty();
    public Optional o = Optional.empty();
    public Optional p = Optional.empty();
    private cgks q;
    private CharSequence r;
    private int s;
    private byte t;

    @Override // defpackage.cgkr
    public final cgkt a() {
        cgks cgksVar;
        CharSequence charSequence;
        IconCompat iconCompat;
        if (this.t == 1 && (cgksVar = this.q) != null && (charSequence = this.r) != null && (iconCompat = this.a) != null) {
            return new cggy(cgksVar, charSequence, this.s, iconCompat, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.q == null) {
            sb.append(" notificationStyle");
        }
        if (this.r == null) {
            sb.append(" titleText");
        }
        if (this.t == 0) {
            sb.append(" smallIconColor");
        }
        if (this.a == null) {
            sb.append(" smallIcon");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(cgks cgksVar) {
        if (cgksVar == null) {
            throw new NullPointerException("Null notificationStyle");
        }
        this.q = cgksVar;
    }

    @Override // defpackage.cgkr
    public final void c(int i) {
        this.s = i;
        this.t = (byte) 1;
    }

    @Override // defpackage.cgkr
    public final void d(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null titleText");
        }
        this.r = charSequence;
    }
}
