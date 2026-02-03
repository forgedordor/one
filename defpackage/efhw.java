package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Message;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhw extends efjr {
    public ekfw a;
    public ekgb b;
    private String c;
    private RcsDestinationId d;
    private ekfw e;
    private ekgb f;
    private Optional g = Optional.empty();
    private Optional h = Optional.empty();
    private Optional i = Optional.empty();
    private Optional j = Optional.empty();

    @Override // defpackage.efjr
    public final Message a() {
        RcsDestinationId rcsDestinationId;
        ekfw ekfwVar = this.e;
        if (ekfwVar != null) {
            this.f = ekfwVar.g();
        } else if (this.f == null) {
            int i = ekgb.d;
            this.f = ekoe.a;
        }
        ekfw ekfwVar2 = this.a;
        if (ekfwVar2 != null) {
            this.b = ekfwVar2.g();
        } else if (this.b == null) {
            int i2 = ekgb.d;
            this.b = ekoe.a;
        }
        String str = this.c;
        if (str != null && (rcsDestinationId = this.d) != null) {
            return new AutoValue_Message(str, rcsDestinationId, this.f, this.g, this.h, this.b, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" sender");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efjr
    public final ekfw b() {
        if (this.e == null) {
            if (this.f == null) {
                int i = ekgb.d;
                this.e = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.e = ekfwVar;
                ekfwVar.j(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.efjr
    public final void c(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null contents");
        }
        if (this.e != null) {
            throw new IllegalStateException("Cannot set contents after calling contentsBuilder()");
        }
        this.f = ekgbVar;
    }

    @Override // defpackage.efjr
    public final void d(ekhx ekhxVar) {
        this.j = Optional.of(ekhxVar);
    }

    @Override // defpackage.efjr
    public final void e(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null extensionHeaders");
        }
        if (this.a != null) {
            throw new IllegalStateException("Cannot set extensionHeaders after calling extensionHeadersBuilder()");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.efjr
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
    }

    @Override // defpackage.efjr
    public final void g(boolean z) {
        this.i = Optional.of(Boolean.valueOf(z));
    }

    @Override // defpackage.efjr
    public final void h(RcsDestinationId rcsDestinationId) {
        this.h = Optional.of(rcsDestinationId);
    }

    @Override // defpackage.efjr
    public final void i(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId == null) {
            throw new NullPointerException("Null sender");
        }
        this.d = rcsDestinationId;
    }

    @Override // defpackage.efjr
    public final void j(Instant instant) {
        this.g = Optional.of(instant);
    }
}
