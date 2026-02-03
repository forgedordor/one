package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elvk implements evst {
    LINK_ENTITY_TYPE_UNSET(0),
    UNKNOWN(1),
    WEB_URL(2),
    PHONE_NUMBER(3),
    EMAIL_ADDRESS(4);

    public final int f;

    elvk(int i) {
        this.f = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
