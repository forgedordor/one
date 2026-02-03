package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajqm extends ajqy {
    public int g;
    private MessageIdType h;
    private boolean k;
    private embo l;
    private int m;
    private boolean o;
    private byte p;
    private Optional i = Optional.empty();
    private Optional j = Optional.empty();
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private Optional n = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();

    @Override // defpackage.ajqy
    public final ajrb a() {
        MessageIdType messageIdType;
        embo emboVar;
        if (this.p == 7 && (messageIdType = this.h) != null && (emboVar = this.l) != null && this.g != 0) {
            return new ajqn(messageIdType, this.i, this.j, this.a, this.b, this.c, this.k, emboVar, this.m, this.n, this.d, this.e, this.o, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" messageId");
        }
        if ((this.p & 1) == 0) {
            sb.append(" notified");
        }
        if (this.l == null) {
            sb.append(" reason");
        }
        if (this.g == 0) {
            sb.append(" canFallback");
        }
        if ((this.p & 2) == 0) {
            sb.append(" terminalStatus");
        }
        if ((this.p & 4) == 0) {
            sb.append(" logEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ajqy
    public final void b(boolean z) {
        this.o = z;
        this.p = (byte) (this.p | 4);
    }

    @Override // defpackage.ajqy
    public final void c(MessageIdType messageIdType) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.h = messageIdType;
    }

    @Override // defpackage.ajqy
    public final void d(boolean z) {
        this.k = z;
        this.p = (byte) (this.p | 1);
    }

    @Override // defpackage.ajqy
    public final void e(int i) {
        this.j = Optional.of(Integer.valueOf(i));
    }

    @Override // defpackage.ajqy
    public final void f(basd basdVar) {
        this.i = Optional.of(basdVar);
    }

    @Override // defpackage.ajqy
    public final void g(embo emboVar) {
        if (emboVar == null) {
            throw new NullPointerException("Null reason");
        }
        this.l = emboVar;
    }

    @Override // defpackage.ajqy
    public final void h(int i) {
        this.m = i;
        this.p = (byte) (this.p | 2);
    }

    @Override // defpackage.ajqy
    public final void i(Instant instant) {
        this.n = Optional.of(instant);
    }
}
