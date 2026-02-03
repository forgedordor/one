package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmz extends dwpn {
    public ejwi a;
    private dwpx b;
    private ejwi c;
    private ejwi d;
    private ejwi e;
    private boolean f;
    private long g;
    private long h;
    private boolean i;
    private Map j;
    private ekgb k;
    private long l;
    private long m;
    private evqs n;
    private long o;
    private long p;
    private byte q;

    public dwmz() {
        ejud ejudVar = ejud.a;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
        this.a = ejudVar;
    }

    @Override // defpackage.dwpn
    public final dwpo a() {
        dwpx dwpxVar;
        Map map;
        ekgb ekgbVar;
        evqs evqsVar;
        if (this.q == -1 && (dwpxVar = this.b) != null && (map = this.j) != null && (ekgbVar = this.k) != null && (evqsVar = this.n) != null) {
            return new dwna(dwpxVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, map, this.a, ekgbVar, this.l, this.m, evqsVar, this.o, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if ((this.q & 1) == 0) {
            sb.append(" isImageStale");
        }
        if ((this.q & 2) == 0) {
            sb.append(" expirationTimeMillis");
        }
        if ((this.q & 4) == 0) {
            sb.append(" lastDeletedTimeMillis");
        }
        if ((this.q & 8) == 0) {
            sb.append(" blockable");
        }
        if (this.j == null) {
            sb.append(" appData");
        }
        if (this.k == null) {
            sb.append(" capabilities");
        }
        if ((this.q & 16) == 0) {
            sb.append(" propertiesExpirationTimeMillis");
        }
        if ((this.q & 32) == 0) {
            sb.append(" serverTimestampUs");
        }
        if (this.n == null) {
            sb.append(" conversationContext");
        }
        if ((this.q & 64) == 0) {
            sb.append(" createdTimestampMs");
        }
        if ((this.q & 128) == 0) {
            sb.append(" localUpdateTimestampMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwpn
    public final void b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null appData");
        }
        this.j = map;
    }

    @Override // defpackage.dwpn
    public final void c(boolean z) {
        this.i = z;
        this.q = (byte) (this.q | 8);
    }

    @Override // defpackage.dwpn
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null capabilities");
        }
        this.k = ekgbVar;
    }

    @Override // defpackage.dwpn
    public final void e(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null conversationContext");
        }
        this.n = evqsVar;
    }

    @Override // defpackage.dwpn
    public final void f(dwpx dwpxVar) {
        if (dwpxVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.b = dwpxVar;
    }

    @Override // defpackage.dwpn
    public final void g(long j) {
        this.o = j;
        this.q = (byte) (this.q | 64);
    }

    @Override // defpackage.dwpn
    public final void h(long j) {
        this.g = j;
        this.q = (byte) (this.q | 2);
    }

    @Override // defpackage.dwpn
    public final void i(Bitmap bitmap) {
        this.e = ejwi.j(bitmap);
    }

    @Override // defpackage.dwpn
    public final void j(String str) {
        this.d = ejwi.j(str);
    }

    @Override // defpackage.dwpn
    public final void k(boolean z) {
        this.f = z;
        this.q = (byte) (this.q | 1);
    }

    @Override // defpackage.dwpn
    public final void l(long j) {
        this.h = j;
        this.q = (byte) (this.q | 4);
    }

    @Override // defpackage.dwpn
    public final void m(long j) {
        this.p = j;
        this.q = (byte) (this.q | (-128));
    }

    @Override // defpackage.dwpn
    public final void n(long j) {
        this.l = j;
        this.q = (byte) (this.q | 16);
    }

    @Override // defpackage.dwpn
    public final void o(long j) {
        this.m = j;
        this.q = (byte) (this.q | 32);
    }

    @Override // defpackage.dwpn
    public final void p(String str) {
        this.c = ejwi.j(str);
    }

    public dwmz(dwpo dwpoVar) {
        ejud ejudVar = ejud.a;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
        this.a = ejudVar;
        dwna dwnaVar = (dwna) dwpoVar;
        this.b = dwnaVar.a;
        this.c = dwnaVar.b;
        this.d = dwnaVar.c;
        this.e = dwnaVar.d;
        this.f = dwnaVar.e;
        this.g = dwnaVar.f;
        this.h = dwnaVar.g;
        this.i = dwnaVar.h;
        this.j = dwnaVar.i;
        this.a = dwnaVar.j;
        this.k = dwnaVar.k;
        this.l = dwnaVar.l;
        this.m = dwnaVar.m;
        this.n = dwnaVar.n;
        this.o = dwnaVar.o;
        this.p = dwnaVar.p;
        this.q = (byte) -1;
    }
}
