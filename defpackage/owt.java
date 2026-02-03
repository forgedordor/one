package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owt extends CancellationException {
    public final owz a;

    public owt(owz owzVar) {
        super("Cancelled isolated runner");
        this.a = owzVar;
    }
}
