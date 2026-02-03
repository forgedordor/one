package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgn {
    public static final dzfh a = new dzfh("ScreenEffectSuggestionStoredOnSentMessage");
    public static final dzfh b = new dzfh("ScreenEffectSuggestionLoadedOnSentMessage");
    public static final dzfh c = new dzfh("ScreenEffectAppearedOnSentMessage");
    public static final dzfh d = new dzfh("ScreenEffectReadyButDiscardedOnSentMessage");
    public final dzuc e;
    public MessageIdType f;

    public awgn(dzuc dzucVar) {
        dzucVar.getClass();
        this.e = dzucVar;
    }

    public final void a() {
        dzuc dzucVar = this.e;
        dzucVar.c(a);
        dzucVar.c(b);
        dzucVar.c(d);
        dzucVar.c(c);
    }
}
