package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzv extends dfzx {
    public String b;
    private ewfe d;
    private ebmr e;
    private int f;
    private String g;
    private ekhx h;
    private byte i;
    public Optional a = Optional.empty();
    public Optional c = Optional.empty();

    @Override // defpackage.dfzx
    public final dfzy a() {
        String str;
        ewfe ewfeVar;
        ebmr ebmrVar;
        String str2;
        ekhx ekhxVar;
        if (this.i == 1 && (str = this.b) != null && (ewfeVar = this.d) != null && (ebmrVar = this.e) != null && (str2 = this.g) != null && (ekhxVar = this.h) != null) {
            return new dfzw(this.a, str, ewfeVar, ebmrVar, this.f, str2, this.c, ekhxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" username");
        }
        if (this.d == null) {
            sb.append(" localIpAddress");
        }
        if (this.e == null) {
            sb.append(" proxyProtocol");
        }
        if (this.i == 0) {
            sb.append(" listeningPort");
        }
        if (this.g == null) {
            sb.append(" instance");
        }
        if (this.h == null) {
            sb.append(" registeredFeatureTags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dfzx
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null instance");
        }
        this.g = str;
    }

    @Override // defpackage.dfzx
    public final void c(int i) {
        this.f = i;
        this.i = (byte) 1;
    }

    @Override // defpackage.dfzx
    public final void d(ewfe ewfeVar) {
        if (ewfeVar == null) {
            throw new NullPointerException("Null localIpAddress");
        }
        this.d = ewfeVar;
    }

    @Override // defpackage.dfzx
    public final void e(ebmr ebmrVar) {
        if (ebmrVar == null) {
            throw new NullPointerException("Null proxyProtocol");
        }
        this.e = ebmrVar;
    }

    @Override // defpackage.dfzx
    public final void f(ekhx ekhxVar) {
        if (ekhxVar == null) {
            throw new NullPointerException("Null registeredFeatureTags");
        }
        this.h = ekhxVar;
    }
}
