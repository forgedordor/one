package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffda extends IOException {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffda(int i) {
        super("stream was reset: ".concat(ffbq.a(i)));
        Objects.toString(ffbq.a(i));
        this.a = i;
    }
}
