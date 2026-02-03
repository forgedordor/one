package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyg implements Closeable, dhyr {
    private final dhzn a;
    private final dhtx b = new dhtx(false);

    public dhyg(dhzn dhznVar) {
        this.a = dhznVar;
    }

    @Override // defpackage.dhyr
    public final dhtx a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:374:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a21  */
    @Override // defpackage.dhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dhyq b(defpackage.dhuu r33, java.util.List r34, java.util.List r35) throws defpackage.dhvf {
        /*
            Method dump skipped, instructions count: 2628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhyg.b(dhuu, java.util.List, java.util.List):dhyq");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
