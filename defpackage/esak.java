package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esak {
    private boolean a;
    private final int b;
    private final String c;
    private final Bundle d;

    public esak() {
        eydv eydvVar = eydv.a;
        this.a = eydvVar.b;
        this.b = eydvVar.c;
        this.c = eydvVar.d;
        this.d = new Bundle();
    }

    public final esbu a() {
        return new esbu(this.a, this.b, this.c, this.d, null);
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        dclh.b(true, "The scope of this indexable is not valid, scope value is 1.");
        this.d.putLongArray("scope", new long[]{1});
    }
}
