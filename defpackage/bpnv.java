package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpnv extends dqws {
    public bpnv(String[] strArr) {
        super("gemini_conversation_id_mappings", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpnu b() {
        l();
        return new bpnu(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bpoa.a;
        k(new bpny((bpnz) function.apply(new bpnz())));
    }
}
