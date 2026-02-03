package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum ciga {
    NAME_CHANGE(0),
    REMOVE_USER_BY_ALL(1),
    REMOVE_USER_BY_ADMIN(2),
    ICON_CHANGE(3),
    INVITE_LINK_CHANGE(4);

    final long f;

    ciga(int i) {
        ejwl.a(true);
        this.f = 1 << i;
    }
}
