package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnn implements rez {
    private final rez a;
    private final Resources b;

    public rnn(Resources resources, rez rezVar) {
        rvi.f(resources);
        this.b = resources;
        rvi.f(rezVar);
        this.a = rezVar;
    }

    @Override // defpackage.rez
    public final rhy a(Object obj, int i, int i2, rex rexVar) {
        return rpd.f(this.b, this.a.a(obj, i, i2, rexVar));
    }

    @Override // defpackage.rez
    public final boolean b(Object obj, rex rexVar) {
        return this.a.b(obj, rexVar);
    }
}
