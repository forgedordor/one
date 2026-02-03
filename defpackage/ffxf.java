package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxf {
    public static final List a = DesugarCollections.unmodifiableList(new ArrayList());
    public final String b;
    public final List c;
    public final byte[] d;

    public ffxf(String str, List list, byte[] bArr) {
        this.b = str;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = bArr;
    }
}
