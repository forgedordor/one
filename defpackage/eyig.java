package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyig implements eyif, eygg {
    public final Object a;

    private eyig(Object obj) {
        this.a = obj;
    }

    public static eyif a(Object obj) {
        obj.getClass();
        return new eyig(obj);
    }

    @Override // defpackage.fcsu
    public final Object b() {
        return this.a;
    }
}
