package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvl extends ehvr {
    public String a;
    public ehvh b;
    public Executor c;
    public byte d;
    private final ejwi e;
    private evuh f;
    private ekfw g;
    private ekgb h;
    private ejwi i;
    private final ejwi j;

    public ehvl() {
        ejud ejudVar = ejud.a;
        this.e = ejudVar;
        this.i = ejudVar;
        this.j = ejudVar;
    }

    @Override // defpackage.ehvr
    public final ehvs a() {
        String str;
        evuh evuhVar;
        ehvh ehvhVar;
        ekfw ekfwVar = this.g;
        if (ekfwVar != null) {
            this.h = ekfwVar.g();
        } else if (this.h == null) {
            int i = ekgb.d;
            this.h = ekoe.a;
        }
        if (this.d == 1 && (str = this.a) != null && (evuhVar = this.f) != null && (ehvhVar = this.b) != null) {
            return new ehvm(str, this.e, evuhVar, ehvhVar, this.h, this.i, this.j, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ehvr
    public final ekfw b() {
        if (this.g == null) {
            int i = ekgb.d;
            this.g = new ekfw();
        }
        return this.g;
    }

    @Override // defpackage.ehvr
    public final void c(ecic ecicVar) {
        this.i = ejwi.j(ecicVar);
    }

    @Override // defpackage.ehvr
    public final void d(evuh evuhVar) {
        if (evuhVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = evuhVar;
    }
}
