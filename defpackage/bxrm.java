package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxrm {
    final Set a = new HashSet();
    final Set b = new HashSet();
    final Set c = new HashSet();
    final Set d = new HashSet();
    final int e;

    public bxrm(int i) {
        this.e = i;
    }

    final String a() {
        int i = this.e;
        return i != 1 ? i != 2 ? "Participant" : "Conversation" : "Message";
    }
}
