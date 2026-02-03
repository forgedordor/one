package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcj extends efey {
    public efez a;
    public String b;
    public Instant c;
    public String d;

    @Override // defpackage.efey
    public final efez a() {
        efez efezVar = this.a;
        if (efezVar != null) {
            return efezVar;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.efey
    public final Optional b() {
        String str = this.d;
        return str == null ? Optional.empty() : Optional.of(str);
    }

    @Override // defpackage.efey
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null status");
        }
        this.d = str;
    }

    @Override // defpackage.efey
    public final void d(efez efezVar) {
        if (efezVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = efezVar;
    }
}
