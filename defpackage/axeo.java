package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axeo extends dqye {
    public axeo() {
        super("subscriptions");
    }

    public final axcm a() {
        return axcn.a(this.a.getAsString("my_identity_token"));
    }

    @Override // defpackage.dqye
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final axen b() {
        ah();
        try {
            if (a() != null) {
                e(a());
            }
            return new axen(this.c, this.a, this.b, this.d.g(), this.e.g());
        } catch (Throwable th) {
            throw new dqod(th);
        }
    }

    public final void d(axcm axcmVar) {
        int iIntValue = axer.c().intValue();
        int iIntValue2 = axer.c().intValue();
        if (iIntValue2 < 59450) {
            dqru.x("my_identity_token", iIntValue2);
        }
        if (iIntValue >= 59450) {
            if (axcmVar == null) {
                this.a.putNull("my_identity_token");
            } else {
                this.a.put("my_identity_token", axcn.b(axcmVar));
            }
        }
    }

    public final void e(axcm axcmVar) {
        int iIntValue = axer.c().intValue();
        if (axer.c().intValue() >= 60160 && iIntValue >= 60160) {
            if (axcmVar == null || axcmVar.equals(null)) {
                this.a.putNull("my_identity_token_with_foreign_key");
            } else {
                this.a.put("my_identity_token_with_foreign_key", axcn.b(axcmVar));
            }
        }
    }

    public final void f(String str) {
        dqru.v(this.a, "telephony_phone_number", str);
    }
}
