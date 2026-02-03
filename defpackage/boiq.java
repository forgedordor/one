package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boiq extends dqws<boie, boip, boiq, bohm, boid> {
    public boiq(String[] strArr) {
        super("conversation_to_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boip b() {
        l();
        return new boip(this.a.a());
    }

    public final void c(boid... boidVarArr) {
        int iA = boiv.c().a();
        Integer.valueOf(iA).getClass();
        for (boid boidVar : boidVarArr) {
            if (((Integer) boiv.b.getOrDefault(boidVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(boidVarArr);
    }

    public final void d(Function function) {
        c((boid[]) function.apply(boiv.c));
    }

    public final void e(Function function) {
        c((boid) function.apply(boiv.c));
    }

    public final void f(Function function) {
        String[] strArr = boiv.a;
        k(new boit((boiu) function.apply(new boiu())));
    }
}
