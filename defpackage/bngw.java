package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngw extends dqye {
    public bngw() {
        super("conversation_classifications_table");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bngv b() {
        ah();
        return new bngv(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(aukd aukdVar) {
        int iIntValue = bngz.c().intValue();
        int iIntValue2 = bngz.c().intValue();
        if (iIntValue2 < 58690) {
            dqru.x("classification_state", iIntValue2);
        }
        if (iIntValue >= 58690) {
            if (aukdVar == null) {
                this.a.putNull("classification_state");
            } else {
                this.a.put("classification_state", Integer.valueOf(aukdVar.a()));
            }
        }
    }

    public final void d(aukf aukfVar) {
        if (aukfVar == null) {
            this.a.putNull("classification_type");
        } else {
            this.a.put("classification_type", Integer.valueOf(aukfVar.a()));
        }
    }

    public final void e(long j) {
        int iIntValue = bngz.c().intValue();
        int iIntValue2 = bngz.c().intValue();
        if (iIntValue2 < 58840) {
            dqru.x("impression_count", iIntValue2);
        }
        if (iIntValue >= 58840) {
            this.a.put("impression_count", Long.valueOf(j));
        }
    }

    public final void f(Function function) {
        String[] strArr = bngz.a;
        af(new bngx((bngy) function.apply(new bngy())));
    }
}
