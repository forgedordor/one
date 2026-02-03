package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmv extends dwpe {
    private dwpk a;
    private ejwi b;
    private ejwi c;
    private ejwi d;
    private ejwi e;
    private boolean f;
    private long g;
    private ekgb h;
    private ekgb i;
    private ejwi j;
    private ejwi k;
    private long l;
    private byte m;

    public dwmv() {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
        this.j = ejudVar;
        this.k = ejudVar;
    }

    @Override // defpackage.dwpe
    public final dwpf a() {
        dwpk dwpkVar;
        ekgb ekgbVar;
        ekgb ekgbVar2;
        if (this.m == 7 && (dwpkVar = this.a) != null && (ekgbVar = this.h) != null && (ekgbVar2 = this.i) != null) {
            return new dwmw(dwpkVar, this.b, this.c, this.d, this.e, this.f, this.g, ekgbVar, ekgbVar2, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contactId");
        }
        if ((this.m & 1) == 0) {
            sb.append(" isImageStale");
        }
        if ((this.m & 2) == 0) {
            sb.append(" expirationTimeMillis");
        }
        if (this.h == null) {
            sb.append(" menuItems");
        }
        if (this.i == null) {
            sb.append(" toolbarButtons");
        }
        if ((this.m & 4) == 0) {
            sb.append(" serverTimestampUs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwpe
    public final void b(String str) {
        this.c = ejwi.j(str);
    }

    @Override // defpackage.dwpe
    public final void c(dwpk dwpkVar) {
        if (dwpkVar == null) {
            throw new NullPointerException("Null contactId");
        }
        this.a = dwpkVar;
    }

    @Override // defpackage.dwpe
    public final void d(dwpy dwpyVar) {
        this.j = ejwi.j(dwpyVar);
    }

    @Override // defpackage.dwpe
    public final void e(long j) {
        this.g = j;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.dwpe
    public final void f(Bitmap bitmap) {
        this.e = ejwi.j(bitmap);
    }

    @Override // defpackage.dwpe
    public final void g(String str) {
        this.d = ejwi.j(str);
    }

    @Override // defpackage.dwpe
    public final void h(boolean z) {
        this.f = z;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.dwpe
    public final void i(dwqj dwqjVar) {
        this.k = ejwi.j(dwqjVar);
    }

    @Override // defpackage.dwpe
    public final void j(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null menuItems");
        }
        this.h = ekgbVar;
    }

    @Override // defpackage.dwpe
    public final void k(String str) {
        this.b = ejwi.j(str);
    }

    @Override // defpackage.dwpe
    public final void l(long j) {
        this.l = j;
        this.m = (byte) (this.m | 4);
    }

    @Override // defpackage.dwpe
    public final void m(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null toolbarButtons");
        }
        this.i = ekgbVar;
    }

    public dwmv(dwpf dwpfVar) {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
        this.j = ejudVar;
        this.k = ejudVar;
        dwmw dwmwVar = (dwmw) dwpfVar;
        this.a = dwmwVar.a;
        this.b = dwmwVar.b;
        this.c = dwmwVar.c;
        this.d = dwmwVar.d;
        this.e = dwmwVar.e;
        this.f = dwmwVar.f;
        this.g = dwmwVar.g;
        this.h = dwmwVar.h;
        this.i = dwmwVar.i;
        this.j = dwmwVar.j;
        this.k = dwmwVar.k;
        this.l = dwmwVar.l;
        this.m = (byte) 7;
    }
}
