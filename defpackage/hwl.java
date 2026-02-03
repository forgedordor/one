package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwl extends hwh {
    private final hvu c;

    public hwl(hvu hvuVar) {
        this.c = hvuVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new hvo(this.c, objArr[i], objArr[i + 1]);
    }
}
