package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvcs {
    public Optional a;
    private final cvcr b;

    public cvcs(Optional optional, cvcr cvcrVar) {
        this.a = optional;
        this.b = cvcrVar;
    }

    public static cvcs a(Optional optional) {
        return new cvcs(optional, new cvcr() { // from class: cvcq
            @Override // defpackage.cvcr
            public final void a(Optional optional2) {
            }
        });
    }

    public final void b(Optional optional) {
        this.a = optional;
        this.b.a(optional);
    }
}
