package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmnn extends IllegalArgumentException {
    public cmnn(String str) {
        super(String.format("Missing MessagingIdentity on direction: %s during %s", str, "sendChatMessageResponse"));
    }
}
