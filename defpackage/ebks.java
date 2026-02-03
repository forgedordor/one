package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebks extends eblh {
    public String a;
    public String b;
    public ebln c;
    public ebkr d;
    private String e;
    private ebmr f;
    private dhip g;
    private ekgb h;

    @Override // defpackage.eblh
    public final ebli a() {
        if (this.a != null && this.b != null && this.e != null && this.f != null && this.c != null && this.g != null && this.h != null && this.d != null) {
            return new ebkt(this.a, this.b, this.e, this.f, this.c, this.g, this.h, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" user");
        }
        if (this.b == null) {
            sb.append(" domain");
        }
        if (this.e == null) {
            sb.append(" sipInstance");
        }
        if (this.f == null) {
            sb.append(" transportProtocol");
        }
        if (this.c == null) {
            sb.append(" sipTransactionLayer");
        }
        if (this.g == null) {
            sb.append(" logTag");
        }
        if (this.h == null) {
            sb.append(" messageFilters");
        }
        if (this.d == null) {
            sb.append(" addressFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.h = ekgb.n(list);
    }

    @Override // defpackage.eble
    public final /* bridge */ /* synthetic */ void c(dhip dhipVar) {
        if (dhipVar == null) {
            throw new NullPointerException("Null logTag");
        }
        this.g = dhipVar;
    }

    @Override // defpackage.eble
    public final /* bridge */ /* synthetic */ void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null sipInstance");
        }
        this.e = str;
    }

    @Override // defpackage.eble
    public final /* bridge */ /* synthetic */ void e(ebmr ebmrVar) {
        if (ebmrVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.f = ebmrVar;
    }
}
