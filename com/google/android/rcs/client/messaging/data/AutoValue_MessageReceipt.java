package com.google.android.rcs.client.messaging.data;

import defpackage.efkk;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_MessageReceipt extends MessageReceipt {
    public final efkk a;
    public final String b;
    public final String c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    private final Instant g;

    public AutoValue_MessageReceipt(efkk efkkVar, String str, Instant instant, String str2, Optional optional, Optional optional2, Optional optional3) {
        this.a = efkkVar;
        this.b = str;
        this.g = instant;
        this.c = str2;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final efkk a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final Instant b() {
        return this.g;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final Optional c() {
        return this.f;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final Optional d() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageReceipt) {
            MessageReceipt messageReceipt = (MessageReceipt) obj;
            if (this.a.equals(messageReceipt.a()) && this.b.equals(messageReceipt.f()) && this.g.equals(messageReceipt.b()) && this.c.equals(messageReceipt.g()) && this.d.equals(messageReceipt.e()) && this.e.equals(messageReceipt.d()) && this.f.equals(messageReceipt.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final String f() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Instant instant = this.g;
        return "MessageReceipt{type=" + this.a.toString() + ", messageId=" + this.b + ", timestamp=" + instant.toString() + ", status=" + this.c + ", encryptedData=" + String.valueOf(optional3) + ", deliveryFailedMlsServerFailureReason=" + String.valueOf(optional2) + ", deliveryFailedMlsClientFailureReason=" + String.valueOf(optional) + "}";
    }
}
