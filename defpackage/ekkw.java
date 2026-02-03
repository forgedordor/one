package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekkw extends ekkd implements ekli {
    public volatile eklj c;

    public ekkw(Object obj, int i) {
        super(obj, i);
        this.c = eklm.a;
    }

    @Override // defpackage.ekkj
    public final Object d() {
        return this.c.get();
    }

    @Override // defpackage.ekli
    public final eklj e() {
        return this.c;
    }
}
