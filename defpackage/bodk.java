package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bodk extends dqws {
    public bodk(String[] strArr) {
        super("conversation_pin", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bodj b() {
        l();
        return new bodj(this.a.a());
    }

    public final void c(bocy... bocyVarArr) {
        int iA = bodn.b().a();
        Integer.valueOf(iA).getClass();
        for (bocy bocyVar : bocyVarArr) {
            if (((Integer) bodn.b.getOrDefault(bocyVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bocyVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bodn.a;
        k(new bodl((bodm) function.apply(new bodm())));
    }
}
