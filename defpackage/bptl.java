package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bptl extends dqye {
    public bptl() {
        super("lighter_conversations_table");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bptk b() {
        ah();
        return new bptk(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(boolean z) {
        int iIntValue = bpto.c().intValue();
        int iIntValue2 = bpto.c().intValue();
        if (iIntValue2 < 58810) {
            dqru.x("is_last_message_outgoing", iIntValue2);
        }
        if (iIntValue >= 58810) {
            this.a.put("is_last_message_outgoing", Boolean.valueOf(z));
        }
    }

    public final void d(String str) {
        dqru.v(this.a, "lighter_conversation_id_json", str);
    }

    public final void e(boolean z) {
        int iIntValue = bpto.c().intValue();
        int iIntValue2 = bpto.c().intValue();
        if (iIntValue2 < 58700) {
            dqru.x("read", iIntValue2);
        }
        if (iIntValue >= 58700) {
            this.a.put("read", Boolean.valueOf(z));
        }
    }

    public final void f(Function function) {
        String[] strArr = bpto.a;
        af(new bptm((bptn) function.apply(new bptn())));
    }
}
