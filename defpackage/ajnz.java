package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajnz implements ajnw {
    public final String a;
    private final crqv b;
    private final boolean c;
    private final Object d;
    private final Object e;

    public ajnz(crqv crqvVar, String str, boolean z, Object obj, Object obj2) {
        this.b = crqvVar;
        this.a = str;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.ajnw
    public final Object a() {
        return this.b.q(this.a, this.c) ? this.d : this.e;
    }

    @Override // defpackage.ajnw
    public final boolean b(Object obj) {
        if (Objects.equals(a(), obj)) {
            return false;
        }
        this.b.h(this.a, Objects.equals(obj, this.d));
        return true;
    }
}
