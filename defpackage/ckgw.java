package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgw {
    public final cqbm a;
    private final dgrs b;

    public ckgw(dgrs dgrsVar, cqbm cqbmVar) {
        this.b = dgrsVar;
        this.a = cqbmVar;
    }

    public final dgid a(String str) {
        return new dgid(((chza) this.a.a()).e(str));
    }

    public final Optional b(String str) {
        return this.b.j(str);
    }
}
