package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxe extends dqye {
    public awxe() {
        super("my_identities");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awxd b() {
        ah();
        return new awxd(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean c(axcm axcmVar) {
        String[] strArr = awxh.a;
        awxg awxgVar = new awxg();
        awxgVar.f(axcmVar);
        return aj(new awxf(awxgVar), "my_identities-buildAndUpdateForToken");
    }

    public final void d(String str) {
        dqru.v(this.a, "phone_number", str);
    }

    public final void e(boolean z) {
        int iIntValue = awxh.c().intValue();
        int iIntValue2 = awxh.c().intValue();
        if (iIntValue2 < 60810) {
            dqru.x("is_verified_v2", iIntValue2);
        }
        if (iIntValue >= 60810) {
            this.a.put("is_verified_v2", Boolean.valueOf(z));
        }
    }

    public final void f(Function function) {
        String[] strArr = awxh.a;
        af(new awxf((awxg) function.apply(new awxg())));
    }
}
