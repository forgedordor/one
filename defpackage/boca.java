package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boca extends dqws<bobl, bobz, boca, boar, bobk> {
    public boca(String[] strArr) {
        super("conversation_participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bobz b() {
        l();
        return new bobz(this.a.a());
    }

    public final void c(bobk... bobkVarArr) {
        int iIntValue = bocg.d().intValue();
        for (bobk bobkVar : bobkVarArr) {
            if (((Integer) bocg.b.getOrDefault(bobkVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bobkVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bocg.a;
        k(new boce((bocf) function.apply(new bocf())));
    }
}
