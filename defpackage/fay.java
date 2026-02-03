package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class fay {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof fay) && this.a == ((fay) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "MenuItemsAvailability(value=" + this.a + ')';
    }
}
