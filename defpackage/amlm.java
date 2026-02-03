package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class amlm implements ajlh {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.ajlh
    public abstract aoer g();

    @Override // defpackage.ajlh
    public final aokl h() {
        return (aokl) this.a.get();
    }

    @Override // defpackage.ajlh
    public final boolean j() {
        anxd anxdVarQ = q();
        return anxdVarQ != null && anxdVarQ.l();
    }

    @Override // defpackage.ajlh
    public final boolean k() {
        anxd anxdVarQ = q();
        return anxdVarQ != null && anxdVarQ.f();
    }

    @Override // defpackage.ajlh
    public final boolean m() {
        anxd anxdVarQ = q();
        return anxdVarQ != null && anxdVarQ.k();
    }

    public abstract ajlj o();

    public abstract akgk p();

    public abstract anxd q();

    public abstract awjl r();

    public abstract ekgb s();

    public abstract elwq t();

    public abstract boolean u();

    public abstract int v();
}
