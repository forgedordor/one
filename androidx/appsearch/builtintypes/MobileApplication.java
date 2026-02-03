package androidx.appsearch.builtintypes;

import android.net.Uri;
import defpackage.lcg;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MobileApplication extends Thing {
    public final String a;
    public final String b;
    public final List c;
    public final Uri d;
    public final byte[] e;
    public final long f;
    public final String g;

    public MobileApplication(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, String str7, String str8, Uri uri, byte[] bArr, long j3, String str9) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        lcg.i(str7);
        this.a = str7;
        this.b = str8;
        if (list == null) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(list);
        }
        this.d = uri;
        lcg.i(bArr);
        this.e = bArr;
        this.f = j3;
        this.g = str9;
    }

    @Override // androidx.appsearch.builtintypes.Thing
    public final List a() {
        return this.c;
    }
}
