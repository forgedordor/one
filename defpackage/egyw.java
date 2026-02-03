package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyw extends RuntimeException {
    public egyw() {
        super("Infinite fetch cycle detected. This occurs when a fetch does not produce a cache hit on the next load from local storage.");
    }
}
