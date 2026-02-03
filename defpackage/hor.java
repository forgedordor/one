package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hor implements fdap {
    final /* synthetic */ fdap a;

    public hor(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.a.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
    }
}
