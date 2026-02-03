package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btok extends dqws {
    public btok(String[] strArr) {
        super("remote_user_id_to_registration_id", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btoj b() {
        l();
        return new btoj(this.a.a());
    }

    public final void c(btnz... btnzVarArr) {
        int iA = bton.b().a();
        Integer.valueOf(iA).getClass();
        if (((Integer) bton.b.getOrDefault(btnzVarArr[0].toString(), -1)).intValue() > iA) {
            dqru.x("columnReference.toString()", iA);
        }
        m(btnzVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bton.a;
        k(new btol((btom) function.apply(new btom())));
    }
}
