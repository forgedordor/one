package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajqn extends ajrb {
    public final MessageIdType a;
    public final int b;
    private final Optional c;
    private final Optional d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final boolean h;
    private final embo i;
    private final Optional j;
    private final Optional k;
    private final Optional l;
    private final boolean m;
    private final Optional n;

    public ajqn(MessageIdType messageIdType, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, boolean z, embo emboVar, int i, Optional optional6, Optional optional7, Optional optional8, boolean z2, Optional optional9) {
        this.a = messageIdType;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
        this.g = optional5;
        this.h = z;
        this.i = emboVar;
        this.b = i;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = z2;
        this.n = optional9;
    }

    @Override // defpackage.ajrb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ajrb
    public final MessageIdType b() {
        return this.a;
    }

    @Override // defpackage.ajrb
    public final embo c() {
        return this.i;
    }

    @Override // defpackage.ajrb
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.ajrb
    public final Optional e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrb) {
            ajrb ajrbVar = (ajrb) obj;
            if (this.a.equals(ajrbVar.b()) && this.c.equals(ajrbVar.h()) && this.d.equals(ajrbVar.g()) && this.e.equals(ajrbVar.i()) && this.f.equals(ajrbVar.d()) && this.g.equals(ajrbVar.l()) && this.h == ajrbVar.n() && this.i.equals(ajrbVar.c())) {
                ajrbVar.o();
                if (this.b == ajrbVar.a() && this.j.equals(ajrbVar.k()) && this.k.equals(ajrbVar.e()) && this.l.equals(ajrbVar.j()) && this.m == ajrbVar.m() && this.n.equals(ajrbVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajrb
    public final Optional f() {
        return this.n;
    }

    @Override // defpackage.ajrb
    public final Optional g() {
        return this.d;
    }

    @Override // defpackage.ajrb
    public final Optional h() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 1) * 1000003) ^ this.b) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.n.hashCode();
    }

    @Override // defpackage.ajrb
    public final Optional i() {
        return this.e;
    }

    @Override // defpackage.ajrb
    public final Optional j() {
        return this.l;
    }

    @Override // defpackage.ajrb
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.ajrb
    public final Optional l() {
        return this.g;
    }

    @Override // defpackage.ajrb
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.ajrb
    public final boolean n() {
        return this.h;
    }

    public final String toString() {
        Optional optional = this.n;
        Optional optional2 = this.l;
        Optional optional3 = this.k;
        Optional optional4 = this.j;
        embo emboVar = this.i;
        Optional optional5 = this.g;
        Optional optional6 = this.f;
        Optional optional7 = this.e;
        Optional optional8 = this.d;
        Optional optional9 = this.c;
        return "MessageFailureContext{messageId=" + this.a.toString() + ", rcsMessageId=" + String.valueOf(optional9) + ", rawTelephonyStatus=" + String.valueOf(optional8) + ", resultCode=" + String.valueOf(optional7) + ", errorCode=" + String.valueOf(optional6) + ", xmsTransport=" + String.valueOf(optional5) + ", notified=" + this.h + ", reason=" + emboVar.toString() + ", canFallback=" + embm.a(1) + ", terminalStatus=" + this.b + ", timestamp=" + String.valueOf(optional4) + ", hidden=" + String.valueOf(optional3) + ", sendCount=" + String.valueOf(optional2) + ", logEnabled=" + this.m + ", logContent=" + String.valueOf(optional) + "}";
    }

    @Override // defpackage.ajrb
    public final void o() {
    }
}
