package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efia extends efkh {
    private efkk b;
    private String c;
    private Instant d;
    private String e;
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();
    private Optional h = Optional.empty();

    @Override // defpackage.efkh
    public final efkk a() {
        efkk efkkVar = this.b;
        if (efkkVar != null) {
            return efkkVar;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.efkh
    public final MessageReceipt b() {
        String str;
        Instant instant;
        String str2;
        efkk efkkVar = this.b;
        if (efkkVar != null && (str = this.c) != null && (instant = this.d) != null && (str2 = this.e) != null) {
            return new AutoValue_MessageReceipt(efkkVar, str, instant, str2, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" messageId");
        }
        if (this.d == null) {
            sb.append(" timestamp");
        }
        if (this.e == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efkh
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.efkh
    public final Optional d() {
        String str = this.e;
        return str == null ? Optional.empty() : Optional.of(str);
    }

    @Override // defpackage.efkh
    public final void e(efki efkiVar) {
        this.h = Optional.of(efkiVar);
    }

    @Override // defpackage.efkh
    public final void f(efkj efkjVar) {
        this.g = Optional.of(efkjVar);
    }

    @Override // defpackage.efkh
    public final void g(evqs evqsVar) {
        this.f = Optional.of(evqsVar);
    }

    @Override // defpackage.efkh
    public final void h(Optional optional) {
        this.f = optional;
    }

    @Override // defpackage.efkh
    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.c = str;
    }

    @Override // defpackage.efkh
    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null status");
        }
        this.e = str;
    }

    @Override // defpackage.efkh
    public final void k(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.d = instant;
    }

    @Override // defpackage.efkh
    public final void l(efkk efkkVar) {
        if (efkkVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = efkkVar;
    }
}
