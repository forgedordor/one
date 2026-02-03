package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyri {
    public abstract dxyj a();

    public abstract dyrj b();

    public final dyrj c() {
        boolean z = true;
        if (a() == null && d() == null) {
            z = false;
        }
        ejwl.m(z, "Either setAvatarRetriever or setAvatarImageLoader have to be called.");
        return b();
    }

    public abstract dyvi d();
}
