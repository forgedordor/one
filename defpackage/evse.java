package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evse implements evuf {
    public static final evse a = new evse();

    private evse() {
    }

    @Override // defpackage.evuf
    public final evue a(Class cls) {
        if (!evsn.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (evue) evsn.getDefaultInstance(cls.asSubclass(evsn.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // defpackage.evuf
    public final boolean b(Class cls) {
        return evsn.class.isAssignableFrom(cls);
    }
}
