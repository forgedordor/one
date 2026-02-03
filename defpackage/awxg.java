package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxg extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new awxf(this);
    }

    public final void b(Function... functionArr) {
        awxg[] awxgVarArr = new awxg[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = awxh.a;
            awxgVarArr[i] = (awxg) function.apply(new awxg());
        }
        aq(awxgVarArr);
    }

    public final void c(String str) {
        ap(new dqpj("my_identities.phone_number", 1, String.valueOf(str)));
    }

    public final void d(boolean z) {
        int iIntValue = awxh.c().intValue();
        if (iIntValue < 60810) {
            dqru.x("is_verified_v2", iIntValue);
        }
        ap(new dqty("my_identities.is_verified_v2", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void e(String str) {
        int iIntValue = awxh.c().intValue();
        if (iIntValue < 60810) {
            dqru.x("provisioning_id_v2", iIntValue);
        }
        ap(new dqpj("my_identities.provisioning_id_v2", 1, str));
    }

    public final void f(axcm axcmVar) {
        ap(new dqpj("my_identities.token", 1, axcn.b(axcmVar)));
    }

    public final void g(axcm axcmVar) {
        ap(new dqpj("my_identities.token", 2, axcn.b(axcmVar)));
    }
}
