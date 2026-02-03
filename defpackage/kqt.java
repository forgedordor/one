package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqt extends kqo implements Iterable {
    public kqt(char[] cArr) {
        super(cArr);
    }

    @Override // defpackage.kqo, defpackage.kqp
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final kqt clone() {
        return (kqt) super.clone();
    }

    @Override // java.lang.Iterable
    public final Iterator<kqq> iterator() {
        return new kqs(this);
    }
}
