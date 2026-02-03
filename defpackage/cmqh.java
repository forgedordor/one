package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqh {
    public final crqv a;

    public cmqh(crqv crqvVar) {
        this.a = crqvVar;
    }

    final long a() {
        return this.a.e("last_sync_time_millis", -1L);
    }

    public final boolean b() {
        return this.a.q("bugle_full_sync_in_progress", false);
    }
}
