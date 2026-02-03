package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyu implements hyr {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdap b;

    public hyu(fdat fdatVar, fdap fdapVar) {
        this.a = fdatVar;
        this.b = fdapVar;
    }

    @Override // defpackage.hyr
    public final Object a(Object obj) {
        return this.b.invoke(obj);
    }

    @Override // defpackage.hyr
    public final Object b(hya hyaVar, Object obj) {
        return this.a.a(hyaVar, obj);
    }
}
