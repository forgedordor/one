package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguy extends IllegalStateException {
    public fguy(String str) {
        super(str);
    }

    public fguy(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
