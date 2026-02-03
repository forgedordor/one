package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eayg {
    private final Optional a;

    public eayg(Optional optional) {
        this.a = optional;
    }

    public static eayg a(long j) {
        ebav ebavVar = (ebav) ebaw.a.createBuilder();
        ebavVar.copyOnWrite();
        ebaw ebawVar = (ebaw) ebavVar.instance;
        ebawVar.b = 1;
        ebawVar.c = Long.valueOf(j);
        return new eayg(Optional.of((ebaw) ebavVar.build()));
    }

    public static eayg b() {
        return new eayg(Optional.empty());
    }

    public final ebaw c() {
        return (ebaw) this.a.get();
    }

    public final boolean d() {
        return this.a.isEmpty();
    }
}
