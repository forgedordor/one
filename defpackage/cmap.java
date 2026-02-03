package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmap extends dqws {
    public cmap(String[] strArr) {
        super("scheduled_send INNER JOIN messages ON (messages._id=scheduled_send.message_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cman b() {
        l();
        return new cman(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = cmas.a;
        k(new cmaq((cmar) function.apply(new cmar())));
    }
}
