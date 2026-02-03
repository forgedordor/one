package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhl extends efiw {
    private final String a;
    private final RcsDestinationId b;
    private final Optional c;
    private final efiv d;
    private final Optional e;
    private final Optional f;

    public efhl(String str, RcsDestinationId rcsDestinationId, Optional optional, efiv efivVar, Optional optional2, Optional optional3) {
        this.a = str;
        this.b = rcsDestinationId;
        this.c = optional;
        this.d = efivVar;
        this.e = optional2;
        this.f = optional3;
    }

    @Override // defpackage.efiw
    public final efiv a() {
        return this.d;
    }

    @Override // defpackage.efiw
    public final RcsDestinationId b() {
        return this.b;
    }

    @Override // defpackage.efiw
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.efiw
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.efiw
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efiw) {
            efiw efiwVar = (efiw) obj;
            if (this.a.equals(efiwVar.f()) && this.b.equals(efiwVar.b()) && this.c.equals(efiwVar.d()) && this.d.equals(efiwVar.a()) && this.e.equals(efiwVar.e()) && this.f.equals(efiwVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efiw
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
