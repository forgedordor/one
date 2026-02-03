package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnp extends dwqk {
    public dwpk a;
    public dwqo b;
    public dwqt c;
    public ekgp d;
    public int e;
    private String f;
    private dwpx g;
    private long h;
    private ejwi i;
    private dwqq j;
    private ejwi k;
    private ekgp l;
    private int m;
    private int n;
    private int o;
    private evqs p;
    private ejwi q;
    private ekgb r;
    private byte s;

    public dwnp() {
        ejud ejudVar = ejud.a;
        this.i = ejudVar;
        this.k = ejudVar;
        this.q = ejudVar;
    }

    @Override // defpackage.dwqk
    public final dwqw a() {
        String str;
        int i;
        dwpk dwpkVar;
        dwpx dwpxVar;
        dwqo dwqoVar;
        dwqq dwqqVar;
        ekgp ekgpVar;
        dwqt dwqtVar;
        evqs evqsVar;
        ekgb ekgbVar;
        ekgp ekgpVar2;
        if (this.s == 15 && (str = this.f) != null && (i = this.e) != 0 && (dwpkVar = this.a) != null && (dwpxVar = this.g) != null && (dwqoVar = this.b) != null && (dwqqVar = this.j) != null && (ekgpVar = this.l) != null && (dwqtVar = this.c) != null && (evqsVar = this.p) != null && (ekgbVar = this.r) != null && (ekgpVar2 = this.d) != null) {
            return new dwnq(str, i, dwpkVar, dwpxVar, this.h, this.i, dwqoVar, dwqqVar, this.k, ekgpVar, this.m, dwqtVar, this.n, this.o, evqsVar, this.q, ekgbVar, ekgpVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" messageId");
        }
        if (this.e == 0) {
            sb.append(" messageType");
        }
        if (this.a == null) {
            sb.append(" sender");
        }
        if (this.g == null) {
            sb.append(" conversationId");
        }
        if ((this.s & 1) == 0) {
            sb.append(" serverTimestampUs");
        }
        if (this.b == null) {
            sb.append(" messageContent");
        }
        if (this.j == null) {
            sb.append(" messageStatus");
        }
        if (this.l == null) {
            sb.append(" metadata");
        }
        if ((this.s & 2) == 0) {
            sb.append(" capability");
        }
        if (this.c == null) {
            sb.append(" renderingDetails");
        }
        if ((this.s & 4) == 0) {
            sb.append(" intendedRenderingType");
        }
        if ((this.s & 8) == 0) {
            sb.append(" filterableFlags");
        }
        if (this.p == null) {
            sb.append(" conversationContext");
        }
        if (this.r == null) {
            sb.append(" activeDecorationIds");
        }
        if (this.d == null) {
            sb.append(" possibleDecorations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwqk
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null activeDecorationIds");
        }
        this.r = ekgbVar;
    }

    @Override // defpackage.dwqk
    public final void c(int i) {
        this.m = i;
        this.s = (byte) (this.s | 2);
    }

    @Override // defpackage.dwqk
    public final void d(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null conversationContext");
        }
        this.p = evqsVar;
    }

    @Override // defpackage.dwqk
    public final void e(dwpx dwpxVar) {
        if (dwpxVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.g = dwpxVar;
    }

    @Override // defpackage.dwqk
    public final void f(String str) {
        this.i = ejwi.j(str);
    }

    @Override // defpackage.dwqk
    public final void g(int i) {
        this.o = i;
        this.s = (byte) (this.s | 8);
    }

    @Override // defpackage.dwqk
    public final void h(int i) {
        this.n = i;
        this.s = (byte) (this.s | 4);
    }

    @Override // defpackage.dwqk
    public final void i(dwqo dwqoVar) {
        this.b = dwqoVar;
    }

    @Override // defpackage.dwqk
    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.f = str;
    }

    @Override // defpackage.dwqk
    public final void k(dwqq dwqqVar) {
        if (dwqqVar == null) {
            throw new NullPointerException("Null messageStatus");
        }
        this.j = dwqqVar;
    }

    @Override // defpackage.dwqk
    public final void l(Map map) {
        this.l = ekgp.j(map);
    }

    @Override // defpackage.dwqk
    public final void m(dwqt dwqtVar) {
        this.c = dwqtVar;
    }

    @Override // defpackage.dwqk
    public final void n(long j) {
        this.h = j;
        this.s = (byte) (this.s | 1);
    }

    @Override // defpackage.dwqk
    public final void o(String str) {
        this.k = ejwi.j(str);
    }

    public dwnp(dwqw dwqwVar) {
        ejud ejudVar = ejud.a;
        this.i = ejudVar;
        this.k = ejudVar;
        this.q = ejudVar;
        dwnq dwnqVar = (dwnq) dwqwVar;
        this.f = dwnqVar.a;
        this.e = dwnqVar.r;
        this.a = dwnqVar.b;
        this.g = dwnqVar.c;
        this.h = dwnqVar.d;
        this.i = dwnqVar.e;
        this.b = dwnqVar.f;
        this.j = dwnqVar.g;
        this.k = dwnqVar.h;
        this.l = dwnqVar.i;
        this.m = dwnqVar.j;
        this.c = dwnqVar.k;
        this.n = dwnqVar.l;
        this.o = dwnqVar.m;
        this.p = dwnqVar.n;
        this.q = dwnqVar.o;
        this.r = dwnqVar.p;
        this.d = dwnqVar.q;
        this.s = (byte) 15;
    }
}
