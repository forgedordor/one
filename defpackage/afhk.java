package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhk {
    public final crqx a;
    private final cqbm b;

    public afhk(crqx crqxVar, cqbm cqbmVar) {
        this.a = crqxVar;
        this.b = cqbmVar;
    }

    public final long a() {
        return this.a.a();
    }

    public final boolean b() throws Resources.NotFoundException {
        crqx crqxVar = this.a;
        Resources resources = crqxVar.b;
        return crqxVar.a.q(resources.getString(R.string.link_preview_tombstone_seen_pref_key), resources.getBoolean(R.bool.link_preview_tombstone_seen_pref_default)) && a() > 0;
    }

    public final boolean c() {
        return d() && b();
    }

    public final boolean d() {
        return e() && g() && f();
    }

    public final boolean e() {
        return this.a.h();
    }

    public final boolean f() {
        return !((cqey) this.b.a()).s();
    }

    public final boolean g() {
        if (this.a.k()) {
            return ((cqey) this.b.a()).w();
        }
        return true;
    }

    public final void h() {
        this.a.p();
    }
}
