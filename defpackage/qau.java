package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qau extends qbt {
    public qau(Class cls) {
        super(cls);
    }

    @Override // defpackage.qbt
    public final /* bridge */ /* synthetic */ qbu a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new qav(this);
    }
}
