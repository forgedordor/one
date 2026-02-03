package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecaj implements ebzv {
    private final String a;
    private final List b;

    public ecaj(String str, ebzu... ebzuVarArr) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(Arrays.asList(ebzuVarArr));
    }

    @Override // defpackage.ebzv
    public final String c() {
        return this.a;
    }

    @Override // defpackage.ebzv
    public final List d() {
        return this.b;
    }

    @Override // defpackage.ebzv
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
