package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhs {
    public Uri a;
    public int b;
    public byte[] c;
    public Map d;
    public long e;
    public int f;

    public mhs(mht mhtVar) {
        this.a = mhtVar.a;
        this.b = mhtVar.b;
        this.c = mhtVar.c;
        this.d = mhtVar.d;
        this.e = mhtVar.e;
        this.f = mhtVar.g;
    }

    public final mht a() {
        mee.h(this.a, "The uri must be set.");
        return new mht(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }

    public mhs() {
        this.b = 1;
        this.d = Collections.EMPTY_MAP;
    }
}
