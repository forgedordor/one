package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euzz extends evac {
    public byte a;
    private final Optional b = Optional.empty();

    @Override // defpackage.evac
    public final evad a() {
        if (this.a == 1) {
            return new evaa(this.b);
        }
        throw new IllegalStateException("Missing required properties: rotationDegrees");
    }
}
