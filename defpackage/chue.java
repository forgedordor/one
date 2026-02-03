package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chue extends chve {
    public int a;
    public int b;
    public Uri c;
    public enxu d;
    public byte e;
    public int f;
    private bvec g;
    private int h;
    private Optional i;

    public chue() {
        this.i = Optional.empty();
    }

    @Override // defpackage.chve
    public final chvf a() {
        if (this.e == 7 && this.g != null && this.f != 0) {
            return new chuf(this.a, this.b, this.g, this.c, this.h, this.d, this.f, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" status");
        }
        if ((this.e & 2) == 0) {
            sb.append(" rawStatus");
        }
        if (this.g == null) {
            sb.append(" xmsTransportType");
        }
        if ((this.e & 4) == 0) {
            sb.append(" resultCode");
        }
        if (this.f == 0) {
            sb.append(" mmsApi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.chve
    public final void b(int i) {
        this.h = i;
        this.e = (byte) (this.e | 4);
    }

    @Override // defpackage.chve
    public final void c(augm augmVar) {
        this.i = Optional.of(augmVar);
    }

    @Override // defpackage.chve
    public final void d(bvec bvecVar) {
        if (bvecVar == null) {
            throw new NullPointerException("Null xmsTransportType");
        }
        this.g = bvecVar;
    }

    public chue(chvf chvfVar) {
        this.i = Optional.empty();
        chuf chufVar = (chuf) chvfVar;
        this.a = chufVar.a;
        this.b = chufVar.b;
        this.g = chufVar.c;
        this.c = chufVar.d;
        this.h = chufVar.e;
        this.d = chufVar.f;
        this.f = chufVar.h;
        this.i = chufVar.g;
        this.e = (byte) 7;
    }
}
