package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzwd {
    protected final fehf a;

    public dzwd(fehf fehfVar) {
        this.a = fehfVar;
    }

    public abstract long a(String str);

    public abstract fehf b(Long l);

    public abstract fehf c(Long l);

    public abstract boolean d();

    public final fehf e() {
        fehc builder = b(null).toBuilder();
        builder.copyOnWrite();
        fehf fehfVar = (fehf) builder.instance;
        fehfVar.b |= 2;
        fehfVar.c = -1L;
        return builder.build();
    }
}
